package clases;

import java.sql.CallableStatement;
import javax.swing.JComboBox;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import odontofich.CConexion;



public class GDetInsumo {

    String Id_trabajo;
    String nombretrabajo;
    String Id_insumo;
    String nombre_insumo;
    Double cantidad;

    // Getters y Setters
    public String getNombretrabajo() {
        return nombretrabajo;
    }

    public void setNombretrabajo(String nombretrabajo) {
        this.nombretrabajo = nombretrabajo;
    }

    public String getNombreinsumo() {
        return nombre_insumo;
    }

    public void setNombreinsumo(String nombre_insumo) {
        this.nombre_insumo = nombre_insumo;
    }

    public String getId_trabajo() {
        return Id_trabajo;
    }

    public void setId_trabajo(String Id_trabajo) {
        this.Id_trabajo = Id_trabajo;
    }

    public String getId_insumo() {
        return Id_insumo;
    }

    public void setId_insumo(String Id_insumo) {
        this.Id_insumo = Id_insumo;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }
  
    public void mostrarTrab(JComboBox paramtrabajo) {
      
       // trab.removeAllItems();
       CConexion objetoConexion = new CConexion();
            
    String sql  = "SELECT *from trabajo"; //.id_trabajo, trabajo.nombre " +
                //   "FROM trabajo "+
                //   "ORDER BY trabajo.id_trabajo";
    
    Statement st;
            
    try {
        st = objetoConexion.EstablecerConexion().createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        while (rs.next()) {
           String trabajo = rs.getString("id_trabajo");// +"   --   "+rs.getString("nombre");
          paramtrabajo.addItem(trabajo);
           
        }
     

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}
   
  public void mostraRinsum(JComboBox paraminsumo) {
    CConexion objetoConexion = new CConexion();
    String sql  = "SELECT id_insumo, nombre_insumo FROM insumo";
    Statement st;

    try {
        st = objetoConexion.EstablecerConexion().createStatement();
        ResultSet rs = st.executeQuery(sql);

        // Limpiar el ComboBox antes de agregar elementos
        paraminsumo.removeAllItems();

        // Agregar los elementos al ComboBox
        while (rs.next()) {
            // Concatenar el id_insumo y nombre_insumo para mostrarlo
            String displayText = rs.getString("id_insumo") + " - " + rs.getString("nombre_insumo");
            paraminsumo.addItem(displayText);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}

  
    // Método para mostrar los datos en JTable
    public void mostrarDetalleInsumo(JTable paramdetalleinsumo) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID TRABAJO");
        modelo.addColumn("ID INSUMO");
        modelo.addColumn("NOMBRE INSUMO");
        modelo.addColumn("CANTIDAD");

        paramdetalleinsumo.setModel(modelo);

        String sql = "SELECT id_trabajo, id_insumo, nombre_insumo, cantidad FROM det_insumo";

        String[] datos = new String[4];
        Statement st;

        try {
            st = objetoConexion.EstablecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString("id_trabajo");
                datos[1] = rs.getString("id_insumo");
                datos[2] = rs.getString("nombre_insumo");
                datos[3] = rs.getString("cantidad");

                modelo.addRow(datos);
            }
            paramdetalleinsumo.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }

    // Método para insertar datos en la tabla det_insumo
  public void insertarDetInsumo(JComboBox<String> paraidtrabajoComboBox, JComboBox<String> paraidinsumoComboBox, 
                               JTextField paracantidad) {
    // Obtener los valores de los campos
    String idtrabajo = (String) paraidtrabajoComboBox.getSelectedItem();  // Obtener el id_trabajo del JComboBox
    if (idtrabajo == null || idtrabajo.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe seleccionar un ID de trabajo.");
        return;  
    }

   
    String seleccionInsumo = (String) paraidinsumoComboBox.getSelectedItem();
    if (seleccionInsumo == null || seleccionInsumo.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe seleccionar un insumo.");
        return; 
    }
    
   
    String[] insumoParts = seleccionInsumo.split(" - ");  
    if (insumoParts.length != 2) {
        JOptionPane.showMessageDialog(null, "El formato del insumo seleccionado es incorrecto.");
        return; 
    }
    String idinsumo = insumoParts[0].trim();  
    String nombreinsumo = insumoParts[1].trim();  

    // Obtener la cantidad desde el JTextField
    double cantidad;
    try {
        cantidad = Double.parseDouble(paracantidad.getText().trim());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor ingrese una cantidad válida.");
        return;  
    }

    CConexion objetoConexion = new CConexion();

   
    String consulta = "INSERT INTO det_insumo (id_trabajo, id_insumo, nombre_insumo, cantidad) VALUES (?, ?, ?, ?);";

    try {
        // Preparar la consulta SQL
        PreparedStatement cs = objetoConexion.EstablecerConexion().prepareStatement(consulta);

        
        cs.setString(1, idtrabajo);  
        cs.setString(2, idinsumo);  
        cs.setString(3, nombreinsumo);  
        cs.setDouble(4, cantidad);  

       
        cs.execute();
        JOptionPane.showMessageDialog(null, "Se insertó correctamente");

        

    } catch (Exception e) {
      
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}

   
    public void seleccionarDetInsumo(JTable paramTabladetinsumo, JTextField paraidtrabajo, JTextField paraidinsumo, JTextField paranombreinsumo, JTextField paracantidad) {
        try {
            int fila = paramTabladetinsumo.getSelectedRow();
            if (fila >= 0) {
                paraidtrabajo.setText(paramTabladetinsumo.getValueAt(fila, 0).toString());
                paraidinsumo.setText(paramTabladetinsumo.getValueAt(fila, 1).toString());
                paranombreinsumo.setText(paramTabladetinsumo.getValueAt(fila, 2).toString());
                paracantidad.setText(paramTabladetinsumo.getValueAt(fila, 3).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }

   // Método para modificar datos en det_insumo
public void modificarDetInsumo(JTextField paraidtrabajo, JTextField paraidinsumo, 
                               JTextField paranombreinsumo, JTextField paracantidad) {
    // Obtener los valores de los campos de texto
    String idtrabajo = paraidtrabajo.getText().trim();
    String idinsumo = paraidinsumo.getText().trim(); 
    String nombreinsumo = paranombreinsumo.getText().trim();  
    double cantidad = 0;

    try {
      
        cantidad = Double.parseDouble(paracantidad.getText().trim());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor ingrese una cantidad válida.");
        return;  // Salir si la cantidad no es un número válido
    }

   
    if (idtrabajo.isEmpty() || idinsumo.isEmpty() || nombreinsumo.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
        return;
    }

    // Establecer conexión con la base de datos
    CConexion objetoconexion = new CConexion();

    // Verificar si los datos existen en la base de datos antes de intentar modificar
    String consultaExistencia = "SELECT COUNT(*) FROM det_insumo WHERE id_trabajo = ? AND id_insumo = ?";

    try {
        // Verificar si el registro existe
        PreparedStatement psExistencia = objetoconexion.EstablecerConexion().prepareStatement(consultaExistencia);
        psExistencia.setString(1, idtrabajo);
        psExistencia.setString(2, idinsumo);
        ResultSet rs = psExistencia.executeQuery();

        if (rs.next() && rs.getInt(1) > 0) {
         
            String consulta = "UPDATE det_insumo SET nombre_insumo = ?, cantidad = ? WHERE id_trabajo = ? AND id_insumo = ?";

            // Preparar y ejecutar la consulta de actualización
            PreparedStatement ps = objetoconexion.EstablecerConexion().prepareStatement(consulta);
            ps.setString(1, nombreinsumo);
            ps.setDouble(2, cantidad);
            ps.setString(3, idtrabajo);
            ps.setString(4, idinsumo);

            ps.execute();
            JOptionPane.showMessageDialog(null, "Se modificó correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el registro con los valores proporcionados");
        }

    } catch (Exception e) {
        // Si ocurre un error, mostrar un mensaje
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        e.printStackTrace();  // Esto ayuda a obtener más detalles sobre el error
    }
}



   // Método para eliminar datos desde una fila seleccionada en la JTable
public void eliminarDetalleInsumo(JTable paramTabladetinsumo) {
   
    int fila = paramTabladetinsumo.getSelectedRow();
    
 
    if (fila >= 0) {
        // Obtener los datos de la fila seleccionada (id_trabajo y id_insumo)
        String idtrabajo = paramTabladetinsumo.getValueAt(fila, 0).toString(); 
        String idinsumo = paramTabladetinsumo.getValueAt(fila, 1).toString(); 
        CConexion objetoconexion = new CConexion();
        
      
        String consulta = "DELETE FROM det_insumo WHERE id_trabajo = ? AND id_insumo = ?";

        try {
           
            PreparedStatement cs = objetoconexion.EstablecerConexion().prepareStatement(consulta);

            
            cs.setString(1, idtrabajo);
            cs.setString(2, idinsumo);

            
            cs.execute();

           
            ((DefaultTableModel) paramTabladetinsumo.getModel()).removeRow(fila);

            JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    } else {
        JOptionPane.showMessageDialog(null, "No se seleccionó ninguna fila.");
    }
}

}
