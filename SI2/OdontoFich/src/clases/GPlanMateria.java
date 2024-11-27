
package clases;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import odontofich.CConexion;


public class GPlanMateria {
    
     String sigla;
   String id_trabajo;
   double cantidad_trabajo;

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getId_trabajo() {
        return id_trabajo;
    }

    public void setId_trabajo(String id_trabajo) {
        this.id_trabajo = id_trabajo;
    }

    public double getCantidad_trabajo() {
        return cantidad_trabajo;
    }

    public void setCantidad_trabajo(double cantidad_trabajo) {
        this.cantidad_trabajo = cantidad_trabajo;
    }
    
    
         
   public void mostrarPlanMateria(JTable paramplanmateria) {
    CConexion objetoConexion = new CConexion();
    DefaultTableModel modelo = new DefaultTableModel();

    modelo.addColumn("SIGLA");
    modelo.addColumn("ID TRABAJO");
    modelo.addColumn("CANTIDAD TRABAJOS");

    paramplanmateria.setModel(modelo);

   
    String sql = "SELECT * from plan_materia"; //.id_trabajo, trabajo.nombre, det_insumo.id_insumo, det_insumo.cantidad " +
                // "FROM det_insumo " +
                 //"JOIN trabajo ON det_insumo.id_trabajo = trabajo.id_trabajo;";

    String[] datos = new String[4]; 
    Statement st;

    try {
        st = objetoConexion.EstablecerConexion().createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            datos[0] = rs.getString("sigla");      
            datos[1] = rs.getString("id_trabajo");      
            datos[2] = rs.getString("cantidad_trabajo");        

            modelo.addRow(datos);
        }
        paramplanmateria.setModel(modelo);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}
    
    
   public void mostrarsigla(JComboBox paramsigla) {
      
       // trab.removeAllItems();
       CConexion objetoConexion = new CConexion();
            
    String sql  = "SELECT * from materia"; //.id_trabajo, trabajo.nombre " +
                //   "FROM trabajo "+
                //   "ORDER BY trabajo.id_trabajo";
     
    Statement st;
            
    try {
        st = objetoConexion.EstablecerConexion().createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        while (rs.next()) {
           String materia = rs.getString("sigla");// +"   --   "+rs.getString("nombre");
          paramsigla.addItem(materia);
           
        }
     

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}
   
   
   public void mostraridtrabajo(JComboBox paramidtrabajo) {
      
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
          paramidtrabajo.addItem(trabajo);
           
        }
     

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}
   
   
     public void insertarplanmateria(JTextField parasigla, JTextField paraidtrabajo, JTextField paracantidadtrabajo) {
        
        String sigla = parasigla.getText();
        String idtrabajo = paraidtrabajo.getText();
        double Cantidaddetrabajos = Double.parseDouble(paracantidadtrabajo.getText());
    
        CConexion objetoConexion = new CConexion();
    
        String consulta = "INSERT INTO plan_materia (sigla,id_trabajo,cantidad_trabajo) VALUES (?, ?, ?);";
    
        try {
            CallableStatement cs = objetoConexion.EstablecerConexion().prepareCall(consulta);
        
           
            cs.setString(1, sigla);
            cs.setString(2, idtrabajo);
            cs.setDouble(3, Cantidaddetrabajos);
            
        
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se Inserto Correctamente ");
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
    
   public void seleccionarplanmateria(JTable paramTablaplanmateria, JTextField parasigla, JTextField paraidtrabajo, JTextField paracantidadtrabajos) {
    try {
        int fila = paramTablaplanmateria.getSelectedRow();
        if (fila >= 0) {
            parasigla.setText(paramTablaplanmateria.getValueAt(fila, 0).toString());
            paraidtrabajo.setText(paramTablaplanmateria.getValueAt(fila, 1).toString());
            
            Object precioValue = paramTablaplanmateria.getValueAt(fila, 2);
            if (precioValue != null && !precioValue.toString().isEmpty()) {
                paracantidadtrabajos.setText(precioValue.toString());
            } else {
                paracantidadtrabajos.setText(""); //limpia
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}
   
       
    public void modificarplanmateria (JTextField parasigla,JTextField paraidtrabajo, JTextField paracantidadtrabajos){
    
        setSigla(parasigla.getText());
        setId_trabajo(paraidtrabajo.getText());
        setCantidad_trabajo(Double.parseDouble(paracantidadtrabajos.getText()));

    
        CConexion objetoconexion =new CConexion();
        
        String consulta ="UPDATE plan_materia SET cantidad_trabajo = ? WHERE sigla = ? AND id_trabajo = ? ";
        
        try {
            
            PreparedStatement cs  =objetoconexion.EstablecerConexion().prepareCall(consulta);
             
              cs.setDouble(1, getCantidad_trabajo());
            cs.setString(2 ,getSigla());
           cs.setString(3, getId_trabajo());
           
         
            cs.execute();
            JOptionPane.showMessageDialog(null, "se modifico  correctamente");
            
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null, " Error "+e.toString());
        }
        
    }
   
    
    
      public void eliminarplanmateria (JTextField paramsigla,JTextField paramidtrabajo){
    
        setSigla(paramsigla.getText());
         setId_trabajo(paramidtrabajo.getText());
    
        CConexion objetoconexion =new CConexion();
        
        String consulta ="delete from plan_materia where sigla=? and id_trabajo=?";
       
        try {
            
            PreparedStatement cs = objetoconexion.EstablecerConexion().prepareStatement(consulta);
           
            cs.setString(1, getSigla());
            cs.setString(2, getId_trabajo());
            
            cs.execute();
            JOptionPane.showMessageDialog(null, "se Elimino correctamente");
            
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null, "Error"+e.toString());
        }
              
    }
      
      
      
   
   
}
