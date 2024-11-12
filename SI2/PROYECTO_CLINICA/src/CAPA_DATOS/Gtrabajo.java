
package CAPA_DATOS;

import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.sql.ResultSet;
//import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class GTrabajo {
    
    String id_trabajo ;
    String nombre ;
    Double precio_unidad;

    public String getId_trabajo() {
        return id_trabajo;
    }

    public void setId_trabajo(String id_trabajo) {
        this.id_trabajo = id_trabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio_unidad() {
        return precio_unidad;
    }

    public void setPrecio_unidad(Double
            precio_unidad) {
        this.precio_unidad = precio_unidad;
    }
    
  
    public void mostrarTrabajo(JTable paramtablatrabajo){
    
           CConexion objetoConexion = new CConexion();
           DefaultTableModel modelo =new DefaultTableModel();
           
           String sql ="";
           
           modelo.addColumn("ID");
           modelo.addColumn("NOMBRE"); 
           modelo.addColumn("PRECIO U");
         
           paramtablatrabajo.setModel(modelo);
           
           sql ="select * from trabajo; ";
           
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
             paramtablatrabajo.setModel(modelo);
               
        } catch (Exception e) {
        
               JOptionPane.showMessageDialog(null,"error"+ e.toString());
        }
}
    public void insertarTrabajo (JTextField paramid,JTextField paramnombre, JTextField paramprecio){
    
        setId_trabajo(paramid.getText());
        setNombre(paramnombre.getText());
        setPrecio_unidad(Double.parseDouble(paramprecio.getText()));

    
        CConexion objetoconexion =new CConexion();
        
        String consulta ="insert into trabajo(id_trabajo,nombre,precio_unidad)values (?,?,?);";
        
        try {
            
            PreparedStatement cs  =objetoconexion.EstablecerConexion().prepareCall(consulta);
            cs.setString(1, getId_trabajo());
            cs.setString(2 ,getNombre());
            cs.setDouble(3, getPrecio_unidad());
            
            cs.execute();
            JOptionPane.showMessageDialog(null, "se inserto correctamente");
            
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null, "Error"+e.toString());
        }
        
        
    }
    
   public void seleccionarTrabajo(JTable paramtablatrabajo, JTextField paramid, JTextField paramnombre, JTextField paramprecio){
       
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
   
   }    
   
   
    public void modificarTrabajo (JTextField paramid,JTextField paramnombre, JTextField paramprecio){
    
        setId_trabajo(paramid.getText());
        setNombre(paramnombre.getText());
        setPrecio_unidad(Double.parseDouble(paramprecio.getText()));

    
        CConexion objetoconexion =new CConexion();
        
        String consulta ="UPDATE trabajo SET nombre=?, precio_unidad=?  WHERE trabajo.id_trabajo=?;";
        
        try {
            
            PreparedStatement cs  =objetoconexion.EstablecerConexion().prepareCall(consulta);
             
             
            cs.setString(1 ,getNombre());
            cs.setDouble(2, getPrecio_unidad());
           cs.setString(3, getId_trabajo());
         
            cs.execute();
            JOptionPane.showMessageDialog(null, "se modifico  correctamente");
            
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null, " Error "+e.toString());
        }
        
        
    }
   
   
       
    public void eliminarTrabajo (JTextField paramid){
    
        setId_trabajo(paramid.getText());
    
        CConexion objetoconexion =new CConexion();
        
        String consulta ="delete from trabajo where trabajo.id_trabajo=?";
       
        try {
            
            PreparedStatement cs = objetoconexion.EstablecerConexion().prepareStatement(consulta);
           
            cs.setString(1, getId_trabajo());
            
            cs.execute();
            JOptionPane.showMessageDialog(null, "se Elimino correctamente");
            
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null, "Error"+e.toString());
        }
        
        
    }
    
   
    
    
    
    
   
}






