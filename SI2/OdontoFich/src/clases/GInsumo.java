package clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import odontofich.CConexion;


public class GInsumo {
    
    String Id_insumo ;
    String nombre_insumo ;
    Double precio_insumo;
    

    public String getId_insumo() {
        return Id_insumo;
    }

    public void setId_insumo(String Id_insumo) {
        this.Id_insumo = Id_insumo;
    }

    public String getNombre_insumo() {
        return nombre_insumo;
    }

    public void setNombre_insumo(String nombre_insumo) {
        this.nombre_insumo = nombre_insumo;
    }

    public Double getPrecio_insumo() {
        return precio_insumo;
    }

    public void setPrecio_insumo(Double precio_insumo) {
        this.precio_insumo = precio_insumo;
    }
    
    
    

 
    
    public void mostrarInsumo(JTable paramInsumo){
    
            CConexion objetoConexion = new CConexion();
           DefaultTableModel modelo =new DefaultTableModel();
           
           String sql ="";
           
           modelo.addColumn("ID");
           modelo.addColumn("NOMBRE"); 
           modelo.addColumn("PRECIO");
         
           paramInsumo.setModel(modelo);
           
           sql ="select * from insumo; ";
           
           String [] datos =new String[3];
           Statement st;
         
           try {
            st = objetoConexion.EstablecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
                    
               while (rs.next()) {
                   
                  datos[0]=rs.getString(1);
                  datos[1]=rs.getString(2);
                  datos[2]=rs.getString(3);
                  
                   modelo.addRow(datos);
               }
               paramInsumo.setModel(modelo);
               
        } catch (Exception e) {
        
               JOptionPane.showMessageDialog(null,"error"+ e.toString());
        }
}
    
 
    
    
       public void insertarInsumo (JTextField paramid,JTextField paramnombre, JTextField paramprecio){
    
        setId_insumo(paramid.getText());
        setNombre_insumo(paramnombre.getText());
        setPrecio_insumo(Double.parseDouble(paramprecio.getText()));

    
        CConexion objetoconexion =new CConexion();
        
        String consulta ="insert into insumo(id_insumo,nombre_insumo,precio_insumo)values (?,?,?);";
        
        try {
            
            PreparedStatement cs  =objetoconexion.EstablecerConexion().prepareCall(consulta);
            cs.setString(1, getId_insumo());
            cs.setString(2 ,getNombre_insumo());
            cs.setDouble(3, getPrecio_insumo());
            
            cs.execute();
            JOptionPane.showMessageDialog(null, "se inserto correctamente");
            
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null, "NO SE PUEDE COLOCAR DOS LLAVES PRIMARIAS");
        }
        
        
    }
    
     
   /*public void seleccionarInsumo(JTable paramtablatrabajo, JTextField paramid, JTextField paramnombre, JTextField paramprecio){
       
       try {
           
           int fila = paramtablatrabajo.getSelectedRow();
           if (fila >= 0) {
               paramid.setText(paramtablatrabajo.getValueAt(fila, 0).toString());
               paramnombre.setText(paramtablatrabajo.getValueAt(fila, 1).toString());
               paramprecio.setText(paramtablatrabajo.getValueAt(fila, 2).toString());
               
           }
           else
                JOptionPane.showMessageDialog(null,"fila no seleccionada");
           
       } catch (Exception e) {
           
            JOptionPane.showMessageDialog(null, "Error"+e.toString());
       }
   
   } */
       
       
       
       public void seleccionarInsumo(JTable paramtablatrabajo, JTextField paramid, JTextField paramnombre, JTextField paramprecio) {
    try {
        int fila = paramtablatrabajo.getSelectedRow();
        if (fila >= 0) {
            paramid.setText(paramtablatrabajo.getValueAt(fila, 0).toString());
            paramnombre.setText(paramtablatrabajo.getValueAt(fila, 1).toString());
            
            Object precioValue = paramtablatrabajo.getValueAt(fila, 2);
            if (precioValue != null && !precioValue.toString().isEmpty()) {
                paramprecio.setText(precioValue.toString());
            } else {
                paramprecio.setText(""); // Limpia el campo si no hay precio
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}

   
         public void modificarInsumo (JTextField paramid,JTextField paramnombre, JTextField paramprecio){
    
        setId_insumo(paramid.getText());
        setNombre_insumo(paramnombre.getText());
        setPrecio_insumo(Double.parseDouble(paramprecio.getText()));

    
        CConexion objetoconexion =new CConexion();
        
        String consulta ="UPDATE insumo SET nombre_insumo=?, precio_insumo=?  WHERE insumo.id_insumo=?;";
        
        try {
            
            PreparedStatement cs  =objetoconexion.EstablecerConexion().prepareCall(consulta);
             
             
            cs.setString(1 ,getNombre_insumo());
            cs.setDouble(2, getPrecio_insumo());
           cs.setString(3, getId_insumo());
         
            cs.execute();
            JOptionPane.showMessageDialog(null, "se modifico  correctamente");
            
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null, " Error "+e.toString());
        }
        
        
    }
    
         
          public void eliminarInsumo (JTextField paramid){
    
        setId_insumo(paramid.getText());
    
        CConexion objetoconexion =new CConexion();
        
        String consulta ="delete from insumo where insumo.id_insumo=?";
       
        try {
            
            PreparedStatement cs = objetoconexion.EstablecerConexion().prepareStatement(consulta);
           
            cs.setString(1, getId_insumo());
            
            cs.execute();
            JOptionPane.showMessageDialog(null, "se Elimino correctamente");
            
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null, "Error"+e.toString());
        }
        
        
    }
    
         
    
    
}
