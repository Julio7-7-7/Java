package clases;

import com.sun.source.tree.TryTree;
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

    modelo.addColumn("ID TRABAJO");
    modelo.addColumn("ID INSUMO");
    modelo.addColumn("CANTIDAD");

    paramdetalleinsumo.setModel(modelo);

   
    String sql = "SELECT * from det_insumo"; //.id_trabajo, trabajo.nombre, det_insumo.id_insumo, det_insumo.cantidad " +
                // "FROM det_insumo " +
                 //"JOIN trabajo ON det_insumo.id_trabajo = trabajo.id_trabajo;";

    String[] datos = new String[4]; 
    Statement st;

    try {
        st = objetoConexion.EstablecerConexion().createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            datos[0] = rs.getString("id_trabajo");      
            datos[1] = rs.getString("id_insumo");      
            datos[2] = rs.getString("cantidad");        

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
      
       // trab.removeAllItems();
       CConexion objetoConexion = new CConexion();
            
    String sql  = "SELECT * from insumo"; //.id_insumo, insumo.nombre_insumo " +
                   //"FROM insumo "+
                  // "ORDER BY insumo.id_insumo";
    Statement st;
            
    try {
        st = objetoConexion.EstablecerConexion().createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        while (rs.next()) {
          String insumo = rs.getString("id_insumo");  //+"   --   "+rs.getString("nombre_insumo");
          paraminsumo.addItem(insumo);
           
        }
     

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}
  
   
    public void insertarDetInsumo(JTextField paraidtrabajo, JTextField paraidinsumo, JTextField paracantidad) {
        
        String idtrabajo = paraidtrabajo.getText();
        String idinsumo = paraidinsumo.getText();
        double Cantidad = Double.parseDouble(paracantidad.getText());
    
        CConexion objetoConexion = new CConexion();
    
        String consulta = "INSERT INTO det_insumo (id_trabajo,id_insumo,cantidad) VALUES (?, ?, ?);";
    
        try {
            CallableStatement cs = objetoConexion.EstablecerConexion().prepareCall(consulta);
        
           
            cs.setString(1, idtrabajo);
            cs.setString(2, idinsumo);
            cs.setDouble(3, Cantidad);
            
        
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se Inserto Correctamente");
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
    
    
    public void seleccionarDetInsumo(JTable paramTabladetinsumo, JTextField paraidtrabajo, JTextField paraidinsumo, JTextField paracantidad) {
    try {
        int fila = paramTabladetinsumo.getSelectedRow();
        if (fila >= 0) {
            paraidtrabajo.setText(paramTabladetinsumo.getValueAt(fila, 0).toString());
            paraidinsumo.setText(paramTabladetinsumo.getValueAt(fila, 1).toString());
            
            Object precioValue = paramTabladetinsumo.getValueAt(fila, 2);
            if (precioValue != null && !precioValue.toString().isEmpty()) {
                paracantidad.setText(precioValue.toString());
            } else {
                paracantidad.setText(""); // Limpia el campo si no hay precio
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}
    
    
     
    public void modificarDetInsumo (JTextField paraidtrabajo,JTextField paraidinsumo, JTextField paracantidad){
    
        setId_trabajo(paraidtrabajo.getText());
        setId_insumo(paraidinsumo.getText());
        setCantidad(Double.parseDouble(paracantidad.getText()));

    
        CConexion objetoconexion =new CConexion();
        
        String consulta ="UPDATE det_insumo SET cantidad = ? WHERE id_trabajo = ? AND id_insumo = ? ";
        
        try {
            
            PreparedStatement cs  =objetoconexion.EstablecerConexion().prepareCall(consulta);
             
              cs.setDouble(1, getCantidad());
            cs.setString(2 ,getId_trabajo());
           cs.setString(3, getId_insumo());
           
         
            cs.execute();
            JOptionPane.showMessageDialog(null, "se modifico  correctamente");
            
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null, " Error "+e.toString());
        }
        
    }
    
    
    
      public void eliminardetalleinsumo (JTextField paramidtrabajo,JTextField paramidinsumo){
    
        setId_trabajo(paramidtrabajo.getText());
         setId_insumo(paramidinsumo.getText());
    
        CConexion objetoconexion =new CConexion();
        
        String consulta ="delete from det_insumo where id_trabajo=? and id_insumo=?";
       
        try {
            
            PreparedStatement cs = objetoconexion.EstablecerConexion().prepareStatement(consulta);
           
            cs.setString(1, getId_trabajo());
            cs.setString(2, getId_insumo());
            
            cs.execute();
            JOptionPane.showMessageDialog(null, "se Elimino correctamente");
            
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null, "Error"+e.toString());
        }
              
    }
      
      
      
   
           
}
