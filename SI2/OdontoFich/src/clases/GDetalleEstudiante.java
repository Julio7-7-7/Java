
package clases;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
 import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import odontofich.CConexion;


public class GDetalleEstudiante {
    
public void cargarTrabajosEnComboBox(JComboBox<String> comboBox) {
    CConexion objetoConexion = new CConexion();

    String query = "SELECT DISTINCT t.id_trabajo, t.nombre " +
                   "FROM trabajo t " +
                   "INNER JOIN det_insumo di ON t.id_trabajo = di.id_trabajo";

    try (Connection conn = objetoConexion.EstablecerConexion();
         PreparedStatement stmt = conn.prepareStatement(query);
         ResultSet rs = stmt.executeQuery()) {

        comboBox.removeAllItems(); 

        while (rs.next()) {
           
            String item = rs.getString("id_trabajo") + " - " + rs.getString("nombre");
            comboBox.addItem(item);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al cargar los trabajos: " + e.getMessage());
    }
}


    public void buscarPorRegistro(int registro, JTable tabla) {
     
        CConexion objetoConexion = new CConexion();
        
        
        String query = "SELECT registro, nombre " + 
                       "FROM estudiante " +
                       "WHERE registro = ?";

        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Registro");
        model.addColumn("Nombre");

        
        try (Connection conn = objetoConexion.EstablecerConexion();
             PreparedStatement stmt = conn.prepareStatement(query)) {
             
           
            stmt.setInt(1, registro);
            ResultSet rs = stmt.executeQuery();

            
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("registro"),
                    rs.getString("nombre")
                });
            }
            
          
            tabla.setModel(model);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar los datos: " + e.getMessage());
        }
    }
    

    
    public void combinarDatosEnNuevaTabla(JTable tablaEstudiante, JComboBox<String> comboBoxTrabajo, JTable tablaGeneral) {
 
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Registro");
    model.addColumn("Nombre");
    model.addColumn("ID Trabajo");
    model.addColumn("ID Insumo");
    model.addColumn("Nombre Insumo");
    model.addColumn("Estado");


    String seleccionComboBox = (String) comboBoxTrabajo.getSelectedItem();
    if (seleccionComboBox == null || seleccionComboBox.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe seleccionar un trabajo válido en el comboBox.");
        return;
    }

    String idTrabajoSeleccionado = seleccionComboBox.split(" - ")[0]; 
    String query = "SELECT di.id_trabajo, di.id_insumo, di.nombre_insumo " +
                   "FROM det_insumo di " +
                   "INNER JOIN trabajo t ON di.id_trabajo = t.id_trabajo " +
                   "WHERE di.id_trabajo = ?";

    try (Connection conn = new CConexion().EstablecerConexion();
         PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setString(1, idTrabajoSeleccionado);
        ResultSet rs = stmt.executeQuery();

       
        if (tablaEstudiante.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No hay estudiantes registrados");
            return;
        }
        while (rs.next()) {
            String idTrabajo = rs.getString("id_trabajo");
            String idInsumo = rs.getString("id_insumo");
            String nombreInsumo = rs.getString("nombre_insumo");
            
            for (int i = 0; i < tablaEstudiante.getRowCount(); i++) {
                String registroEstudiante = tablaEstudiante.getValueAt(i, 0).toString(); 
                String nombreEstudiante = tablaEstudiante.getValueAt(i, 1).toString(); 

               
                model.addRow(new Object[]{
                    registroEstudiante,
                    nombreEstudiante,
                    idTrabajo,
                    idInsumo,
                    nombreInsumo,
                    "Si" // Estado inicial
                });
            }
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al cargar datos en la tabla: " + e.getMessage());
    }

    
    tablaGeneral.setModel(model);

    
    tablaGeneral.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            int row = tablaGeneral.rowAtPoint(e.getPoint());
            int col = tablaGeneral.columnAtPoint(e.getPoint());

            if (col == 5) { // Columna de estado
                String estadoActual = tablaGeneral.getValueAt(row, col).toString();
                tablaGeneral.setValueAt(estadoActual.equals("No") ? "Si" : "No", row, col);

                // Si el primer registro se marca como "Si", marca todas las demás filas
                if (row == 0 && tablaGeneral.getValueAt(row, col).toString().equals("Si")) {
                    for (int i = 1; i < tablaGeneral.getRowCount(); i++) {
                        tablaGeneral.setValueAt("Si", i, col);
                    }
                }
            }
        }
    });

    // Mensaje de confirmación
    JOptionPane.showMessageDialog(null, "Exito al cargar el trabajo y el estudiante");
}



public void agregarFechaRegistro(JTable tablaGeneral, JTextField txtFechaRegistro) {
    String fechaRegistro = txtFechaRegistro.getText();
    if (fechaRegistro.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, ingresa una fecha en el campo correspondiente.");
        return;
    }

    try {
        
        java.sql.Date fechaValida = java.sql.Date.valueOf(fechaRegistro);
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(null, "Formato de fecha inválido. Utiliza el formato yyyy-MM-dd.");
        return;
    }

  
    DefaultTableModel model = (DefaultTableModel) tablaGeneral.getModel();

   
    if (model.getColumnCount() <= 6) {
        model.addColumn("Fecha Registro"); 
    }

  
    for (int i = 0; i < model.getRowCount(); i++) {
        model.setValueAt(fechaRegistro, i, model.getColumnCount() - 1);
    }

    JOptionPane.showMessageDialog(null, "Fecha registrada en todas las filas de la tabla general.");
}

 public void guardarTablaGeneralEnBaseDatos(JTable tablaGeneral) {
    CConexion objetoConexion = new CConexion();
    Connection conexion = objetoConexion.EstablecerConexion();

    String sql = "INSERT INTO detalle_estudiante (registro, nombre, id_trabajo, id_insumo, nombre_insumo, estado, fecha) " +
                 "VALUES (?, ?, ?, ?, ?, ?, ?)";

    try (PreparedStatement pst = conexion.prepareStatement(sql)) {
        for (int i = 0; i < tablaGeneral.getRowCount(); i++) {
            int registro = Integer.parseInt(tablaGeneral.getValueAt(i, 0).toString());
            String nombre = tablaGeneral.getValueAt(i, 1).toString();
            String idTrabajo = tablaGeneral.getValueAt(i, 2).toString();
            String idInsumo = tablaGeneral.getValueAt(i, 3).toString();
            String nombreInsumo = tablaGeneral.getValueAt(i, 4).toString();
            String estado = tablaGeneral.getValueAt(i, 5).toString().trim().toLowerCase();
            java.sql.Date fecha = java.sql.Date.valueOf(tablaGeneral.getValueAt(i, 6).toString());

            
            if (!estado.equals("si") && !estado.equals("no")) { 
                JOptionPane.showMessageDialog(null, "Error: Estado inválido en la fila " + (i + 1));
                return;
            }

            pst.setInt(1, registro);
            pst.setString(2, nombre);
            pst.setString(3, idTrabajo);
            pst.setString(4, idInsumo);
            pst.setString(5, nombreInsumo);
            pst.setString(6, estado);
            pst.setDate(7, fecha);

            pst.addBatch(); 
        }

        pst.executeBatch();
        JOptionPane.showMessageDialog(null, "Datos guardados en la base de datos correctamente.");

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar en la base de datos: " + e.getMessage());
    }
}

public void limpiarTablas(JTable tablaRegistro) {
    DefaultTableModel modeloRegistro = (DefaultTableModel) tablaRegistro.getModel(); 
   
    modeloRegistro.setRowCount(0); 

   
    JOptionPane.showMessageDialog(null, "la tabla estudiante ha sido limpiada");
}
public void limpiarTablaGeneral(JTable tablaGeneral) {
    DefaultTableModel modeloGeneral = (DefaultTableModel) tablaGeneral.getModel();
    
   
    modeloGeneral.setRowCount(0); 

    
    JOptionPane.showMessageDialog(null, "La tabla general ha sido limpiada.");
}

    
  }
