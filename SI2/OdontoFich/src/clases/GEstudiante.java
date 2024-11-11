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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class GEstudiante {
    
    int registro;
    String nombre;

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void mostrarEstudiantes(JTable paramTablaTotalEstudiante){
    CConexion objetoConexion = new CConexion();
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    modelo.addColumn("registro");
    modelo.addColumn("nombre");
    
    paramTablaTotalEstudiante.setModel(modelo);
    
    String sql = "SELECT * FROM estudiante;";
    
    String[] datos = new String[2];
    Statement st;
    
    try {
        st = (Statement) objetoConexion.EstablecerConexion().createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        while (rs.next()) {
            datos[0] = rs.getString(1); // Registro
            datos[1] = rs.getString(2); // Nombre
            
            modelo.addRow(datos);
        }
        
        paramTablaTotalEstudiante.setModel(modelo);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    } 
}

    public void insertarEstudiante(JTextField paraRegistro, JTextField paraNombre){
    setRegistro(Integer.parseInt(paraRegistro.getText()));
    setNombre(paraNombre.getText());
    
    CConexion objetoConexion = new CConexion();
    
    String consulta = "INSERT INTO estudiante (registro, nombre) VALUES (?, ?);";
    
    try {
        CallableStatement cs = objetoConexion.EstablecerConexion().prepareCall(consulta);
        
        cs.setInt(1, getRegistro());
        cs.setString(2, getNombre());
        
        cs.execute();
        JOptionPane.showMessageDialog(null, "Inserción Correcta");
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}

    public void seleccionarEstudiante(JTable paramTablaEstudiante, JTextField paraRegistro, JTextField paraNombre){
    try {
        int fila = paramTablaEstudiante.getSelectedRow();
        if (fila >= 0) {
            paraRegistro.setText(paramTablaEstudiante.getValueAt(fila, 0).toString());
            paraNombre.setText(paramTablaEstudiante.getValueAt(fila, 1).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}

    public void modificarEstudiante(JTextField paraRegistro, JTextField paraNombre){
    setRegistro(Integer.parseInt(paraRegistro.getText())); // Asegurarse de que 'registro' sea un entero
    setNombre(paraNombre.getText());
    
    CConexion objetoConexion = new CConexion();
    
    String consulta = "UPDATE estudiante SET nombre = ? WHERE registro = ?;";
    
    try {
        CallableStatement cs = objetoConexion.EstablecerConexion().prepareCall(consulta);
        
        cs.setString(1, getNombre());
        cs.setInt(2, getRegistro());
        
        cs.execute();
        JOptionPane.showMessageDialog(null, "Modificación Correcta");
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}
    
    public void buscarEstudiante(JTextField paraRegistro, JTable tablaResultados) {
    int registroBuscado = Integer.parseInt(paraRegistro.getText());
    CConexion objetoConexion = new CConexion();
    
    String consulta = "SELECT * FROM estudiante WHERE registro = ?;";
    
    try {
        PreparedStatement ps = objetoConexion.EstablecerConexion().prepareStatement(consulta);
        ps.setInt(1, registroBuscado);
        
        ResultSet rs = ps.executeQuery();
        
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaResultados.getModel();
        modeloTabla.setRowCount(0); 
        
        while (rs.next()) {
            Object[] fila = new Object[2];
            fila[0] = rs.getInt("registro");
            fila[1] = rs.getString("nombre");
            modeloTabla.addRow(fila);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}


    
}
