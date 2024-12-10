/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
 import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.table.DefaultTableCellRenderer;
import odontofich.CConexion;


/**
 *
 * @author USUARIO
 */
public class GDetalleEstudiante {
   
    public void buscarPorIdTrabajo(String idTrabajo, JTable tabla) {
       
        CConexion objetoConexion = new CConexion();
        
      
        String query = "SELECT id_trabajo, id_insumo,nombre_insumo " +
                       "FROM det_insumo " +
                       "WHERE id_trabajo = ?";

        // Crear el modelo para la tabla
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Trabajo");
        model.addColumn("ID Insumo");
         model.addColumn("Nombre Insumo");
        

        
        try (Connection conn = objetoConexion.EstablecerConexion();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, idTrabajo);

            
            ResultSet rs = stmt.executeQuery();

          
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("id_trabajo"),
                    rs.getString("id_insumo"),
                    rs.getString("nombre_insumo")
                        
                });
            }
            
           
            tabla.setModel(model);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar los datos: " + e.getMessage());
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
             
            // Establecer el registro como parámetro en la consulta
            stmt.setInt(1, registro);

            // Ejecutar la consulta y obtener los resultados
            ResultSet rs = stmt.executeQuery();

            // Llenar el modelo de la tabla con los resultados
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
public void combinarDatosEnNuevaTabla(JTable tablaEstudiante, JTable tablaTrabajo, JTable tablaGeneral) {
    
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Registro");
    model.addColumn("Nombre");
    model.addColumn("ID Trabajo");
    model.addColumn("ID Insumo");
    model.addColumn("Nombre Insumo");
    model.addColumn("Estado");  

   
    for (int i = 0; i < tablaEstudiante.getRowCount(); i++) {
        for (int j = 0; j < tablaTrabajo.getRowCount(); j++) {
           
            String registro = tablaEstudiante.getValueAt(i, 0).toString();
            String nombre = tablaEstudiante.getValueAt(i, 1).toString();
            String idTrabajo = tablaTrabajo.getValueAt(j, 0).toString();
            String idInsumo = tablaTrabajo.getValueAt(j, 1).toString();
            String nombreInsumo = tablaTrabajo.getValueAt(j, 2).toString();

          
            model.addRow(new Object[]{registro, nombre, idTrabajo, idInsumo, nombreInsumo, "No"});
        }
    }

   
    tablaGeneral.setModel(model);

    
    tablaGeneral.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
           
            int row = tablaGeneral.rowAtPoint(e.getPoint());
            int col = tablaGeneral.columnAtPoint(e.getPoint());

            
            if (col == 5) {
                // Alternar entre "Si" y "No"
                String estadoActual = tablaGeneral.getValueAt(row, col).toString();
                if (estadoActual.equals("No")) {
                    tablaGeneral.setValueAt("Si", row, col);
                } else {
                    tablaGeneral.setValueAt("No", row, col);
                }

               
                if (row == 0 && tablaGeneral.getValueAt(row, col).toString().equals("Si")) {
                    for (int i = 1; i < tablaGeneral.getRowCount(); i++) {
                        tablaGeneral.setValueAt("Si", i, col);
                    }
                }
            }
        }
    });

    
    JOptionPane.showMessageDialog(null, "Datos combinados mostrados en la tabla general.");
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
            String estado = tablaGeneral.getValueAt(i, 5).toString().trim().toLowerCase(); // Validación de formato
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

public void limpiarTablas(JTable tablaRegistro, JTable tablaTrabajo) {
    DefaultTableModel modeloRegistro = (DefaultTableModel) tablaRegistro.getModel();
    DefaultTableModel modeloTrabajo = (DefaultTableModel) tablaTrabajo.getModel();
    
   
    modeloRegistro.setRowCount(0);  
    modeloTrabajo.setRowCount(0);  

   
    JOptionPane.showMessageDialog(null, "Las tablas han sido limpiadas.");
}
public void limpiarTablaGeneral(JTable tablaGeneral) {
    DefaultTableModel modeloGeneral = (DefaultTableModel) tablaGeneral.getModel();
    
   
    modeloGeneral.setRowCount(0);  

    
    JOptionPane.showMessageDialog(null, "La tabla general ha sido limpiada.");
}

    
  }
