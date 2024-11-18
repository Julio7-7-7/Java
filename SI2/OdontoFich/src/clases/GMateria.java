package clases;

import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import odontofich.CConexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.concurrent.Callable;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class GMateria {
    
    String sigla;
    String periodo;
    String nombre_materia;
    int cr;
    int ht;
    int hp;
    String pre_requisito;

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getNombre_materia() {
        return nombre_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }

    public int getCr() {
        return cr;
    }

    public void setCr(int cr) {
        this.cr = cr;
    }

    public int getHt() {
        return ht;
    }

    public void setHt(int ht) {
        this.ht = ht;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getPre_requisito() {
        return pre_requisito;
    }

    public void setPre_requisito(String pre_requisito) {
        this.pre_requisito = pre_requisito;
    }
    
    public void mostrarMateria(JTable paramTablaTotalMateria){
        CConexion objetoConexion = new CConexion();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String sql="";
        modelo.addColumn("sigla");
        modelo.addColumn("periodo");
        modelo.addColumn("nombre_materia");
        modelo.addColumn("cr");
        modelo.addColumn("ht");
        modelo.addColumn("hp");
        modelo.addColumn("pre_requisito");
        
        paramTablaTotalMateria.setModel(modelo);
        sql = "select * from materia;";
        
        String [] datos = new String[7];
        Statement st;
        
        try {
            st = (Statement) objetoConexion.EstablecerConexion().createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                
                modelo.addRow(datos);
            }
            
            paramTablaTotalMateria.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+ e.toString());
        } 
    }
   
    public void insertarMateria(JTextField paraSigla, JTextField paraPeriodo, JTextField paraNombreMateria, JTextField paraCr,
            JTextField paraHt, JTextField paraHp, JTextField paraPreRe){
        
        setSigla(paraSigla.getText());
        setPeriodo(paraPeriodo.getText());
        setNombre_materia(paraNombreMateria.getText());
        setCr(Integer.parseInt(paraCr.getText()));
        setHt(Integer.parseInt(paraHt.getText()));
        setHp(Integer.parseInt(paraHp.getText()));
        setPre_requisito(paraPreRe.getText());
        
        CConexion objetoConexion = new CConexion();
        
        String consulta = "INSERT INTO materia (sigla, periodo, nombre_materia, cr, ht, hp, pre_requisito) VALUES (?, ?, ?, ?, ?, ?, ?);";
        
        try {
            CallableStatement cs = objetoConexion.EstablecerConexion().prepareCall(consulta);
            
            cs.setString(1, getSigla());
            cs.setString(2, getPeriodo());
            cs.setString(3, getNombre_materia());
            cs.setInt(4, getCr());
            cs.setInt(5, getHt()); 
            cs.setInt(6, getHp()); 
            cs.setString(7, getPre_requisito());
            
            cs.execute();
            JOptionPane.showMessageDialog(null, "Inserción Correcta");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+e.toString());
        }
    }
    
    
    public void seleccionarMateria(JTable paramTablaMateria,JTextField paraSigla, JTextField paraPeriodo, JTextField paraNombreMateria, JTextField paraCr,
            JTextField paraHt, JTextField paraHp, JTextField paraPreRe){
        
        try {
            int fila = paramTablaMateria.getSelectedRow();
            if (fila >= 0){
                paraSigla.setText(paramTablaMateria.getValueAt(fila, 0).toString());
                paraPeriodo.setText(paramTablaMateria.getValueAt(fila, 1).toString());
                paraNombreMateria.setText(paramTablaMateria.getValueAt(fila, 2).toString());
                paraCr.setText(paramTablaMateria.getValueAt(fila, 3).toString());
                paraHt.setText(paramTablaMateria.getValueAt(fila, 4).toString());
                paraHp.setText(paramTablaMateria.getValueAt(fila, 5).toString());
                paraPreRe.setText(paramTablaMateria.getValueAt(fila, 6).toString());
            }
            else{
                JOptionPane.showMessageDialog(null, "FIla no select ");
            }
                    
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    }
    
    public void modificarMateria(JTextField paraSigla, JTextField paraPeriodo, JTextField paraNombreMateria, JTextField paraCr,
            JTextField paraHt, JTextField paraHp, JTextField paraPreRe){
        
        setSigla(paraSigla.getText());
        setPeriodo(paraPeriodo.getText());
        setNombre_materia(paraNombreMateria.getText());
        setCr(Integer.parseInt(paraCr.getText()));
        setHt(Integer.parseInt(paraHt.getText()));
        setHp(Integer.parseInt(paraHp.getText()));
        setPre_requisito(paraPreRe.getText());
        
        CConexion objetoConexion = new CConexion();
        
        String consulta = "UPDATE materia SET sigla = ?, periodo= ?, nombre_materia= ?, cr= ?, ht= ?, hp= ?, pre_requisito= ? WHERE materia.sigla = ?;";
        
        try {
            CallableStatement cs = objetoConexion.EstablecerConexion().prepareCall(consulta);
            
            cs.setString(1, getSigla());
            cs.setString(2, getPeriodo());
            cs.setString(3, getNombre_materia());
            cs.setInt(4, getCr());
            cs.setInt(5, getHt()); 
            cs.setInt(6, getHp()); 
            cs.setString(7, getPre_requisito());
            cs.setString(8, getSigla());
            
            cs.execute();
            JOptionPane.showMessageDialog(null, "Modificación Correcta");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+e.toString());
        }
    }
    
    public void buscarMateria(JTextField paraSigla, JTable tablaResultados) {
    String siglaBuscada = paraSigla.getText();
    CConexion objetoConexion = new CConexion();
    
    String consulta = "SELECT * FROM materia WHERE sigla = ?;";
    
    try {
        PreparedStatement ps = objetoConexion.EstablecerConexion().prepareStatement(consulta);
        ps.setString(1, siglaBuscada);
        
        ResultSet rs = ps.executeQuery();
        
        // Obtener el modelo de la tabla
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaResultados.getModel();
        modeloTabla.setRowCount(0); // Limpiar la tabla antes de agregar nuevos datos
        
        // Agregar los datos al modelo de la tabla
        while (rs.next()) {
            Object[] fila = new Object[7]; // Ajusta el tamaño del arreglo según tus columnas
            fila[0] = rs.getString("sigla");
            fila[1] = rs.getString("periodo");
            fila[2] = rs.getString("nombre_materia");
            fila[3] = rs.getInt("cr");
            fila[4] = rs.getInt("ht");
            fila[5] = rs.getInt("hp");
            fila[6] = rs.getString("pre_requisito");
            modeloTabla.addRow(fila);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}   
    
}
