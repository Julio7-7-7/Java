
package clases;

import com.sun.source.tree.TryTree;
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
    String Id_insumo ;
    Double cantidad;
    
    
    public String getNombretrabajo() {
        return nombretrabajo;
    }

    public void setNombretrabajo(String nombretrabajo) {
        this.nombretrabajo = nombretrabajo;
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
 
    
  
        
   public void mostrarDetalleInsumo(JTable paramdetalleinsumo) {
    CConexion objetoConexion = new CConexion();
    DefaultTableModel modelo = new DefaultTableModel();

    // Configurar columnas del modelo de tabla
    modelo.addColumn("ID TRABAJO");
    modelo.addColumn("NOM TRABAJO");
    modelo.addColumn("ID INSUMO");
    modelo.addColumn("CANTIDAD");

    paramdetalleinsumo.setModel(modelo);

   
    String sql = "SELECT det_insumo.id_trabajo, trabajo.nombre, det_insumo.id_insumo, det_insumo.cantidad " +
                 "FROM det_insumo " +
                 "JOIN trabajo ON det_insumo.id_trabajo = trabajo.id_trabajo;";

    String[] datos = new String[4]; 
    Statement st;

    try {
        st = objetoConexion.EstablecerConexion().createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            datos[0] = rs.getString("id_trabajo");     
            datos[1] = rs.getString("nombre");  
            datos[2] = rs.getString("id_insumo");      
            datos[3] = rs.getString("cantidad");        

            modelo.addRow(datos);
        }
        paramdetalleinsumo.setModel(modelo);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}
   
   
   
   public void mostrarTrab(JComboBox paramtrabajo) {
      
       // trab.removeAllItems();
       CConexion objetoConexion = new CConexion();
            
    String sql  = "SELECT trabajo.id_trabajo, trabajo.nombre " +
                   "FROM trabajo "+
                   "ORDER BY trabajo.id_trabajo";
    
    //"SELECT DISTINCT trabajo.id_trabajo, trabajo.nombre " +
        //      "FROM trabajo " +
      //        "LEFT JOIN DET_INSUMO ON trabajo.id_trabajo = DET_INSUMO.id_trabajo " +
    //          "ORDER BY trabajo.id_trabajo";
    
      String[] datos = new String[4]; 
    Statement st;
            
    try {
        st = objetoConexion.EstablecerConexion().createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        while (rs.next()) {
           String trabajo = rs.getString("id_trabajo")+"   --   "+rs.getString("nombre");
          paramtrabajo.addItem(trabajo);
           
        }
     

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}
   
   public void mostraRinsum(JComboBox paraminsumo) {
      
       // trab.removeAllItems();
       CConexion objetoConexion = new CConexion();
            
    String sql  = "SELECT insumo.id_insumo, insumo.nombre_insumo " +
                   "FROM insumo "+
                   "ORDER BY insumo.id_insumo";
    Statement st;
            
    try {
        st = objetoConexion.EstablecerConexion().createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        while (rs.next()) {
           String insumo = rs.getString("nombre_insumo");
         paraminsumo.addItem(insumo);
           
        }
     

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}
  
   
 
   
   public void insertarDetInsumo(JComboBox paramtrabajo, JComboBox paraminsumo, JTextField paramcantidad) {

    String id_trabajo= paramtrabajo.getSelectedItem().toString().split("   --   ")[0];  
    String id_insumo = paraminsumo.getSelectedItem().toString().split("   --   ")[0];  
    double cantidad = Double.parseDouble(paramcantidad.getText());  

    CConexion objetoconexion = new CConexion();

    String consulta = "INSERT INTO det_insumo (id_trabajo, id_insumo, cantidad) VALUES (?, ?, ?);";

    try {
      
        PreparedStatement cs = objetoconexion.EstablecerConexion().prepareStatement(consulta);
        cs.setString(1, id_trabajo);  
        cs.setString(2, id_insumo);  
        cs.setDouble(3, cantidad);              


        cs.executeUpdate();

        JOptionPane.showMessageDialog(null, "Se insertó correctamente");

    } catch (Exception e) {
 
        JOptionPane.showMessageDialog(null, "Error al insertar: " + e.toString());
    }
}
       
           
}
