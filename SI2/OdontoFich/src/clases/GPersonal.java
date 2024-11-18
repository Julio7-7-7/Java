package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import odontofich.CConexion;

public class GPersonal {
    
    // Atributos
    private String idPersonal;
    private String nombre;
    private String cargo;
    private int telefono; 
    private int edad; 
    
    
    public String getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(String idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarDatosEnCampos(int fila, JTable tabla, JTextField idField, JTextField nombreField, JTextField cargoField, JTextField telField, JTextField edadField) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        setIdPersonal(model.getValueAt(fila, 0).toString());
        setNombre(model.getValueAt(fila, 1).toString());
        setCargo(model.getValueAt(fila, 2).toString());
        setTelefono(Integer.parseInt(model.getValueAt(fila, 3).toString())); 
        setEdad(Integer.parseInt(model.getValueAt(fila, 4).toString())); 

        
        idField.setText(getIdPersonal());
        nombreField.setText(getNombre());
        cargoField.setText(getCargo());
        telField.setText(String.valueOf(getTelefono())); 
        edadField.setText(String.valueOf(getEdad())); 
    }

    
    public void limpiarCampos(JTextField idField, JTextField nombreField, JTextField cargoField, JTextField telField, JTextField edadField) {
        setIdPersonal("");
        setNombre("");
        setCargo("");
        setTelefono(0); 
        setEdad(0); 

        idField.setText(getIdPersonal());
        nombreField.setText(getNombre());
        cargoField.setText(getCargo());
        telField.setText(String.valueOf(getTelefono())); 
        edadField.setText(String.valueOf(getEdad())); 
    }

   
    public void cancelarRegistro(JTable tabla, JTextField idField, JTextField nombreField, JTextField cargoField, JTextField telField, JTextField edadField) {
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar?", "Cancelar", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            limpiarCampos(idField, nombreField, cargoField, telField, edadField);
            ((DefaultTableModel) tabla.getModel()).setRowCount(0); // Vaciar la tabla
        }
    }

    
    public void agregarPersonalATabla(JTable tabla, JTextField idField, JTextField nombreField, JTextField cargoField, JTextField telField, JTextField edadField) {
        setIdPersonal(idField.getText());
        setNombre(nombreField.getText());
        setCargo(cargoField.getText());
        
       
        try {
            setTelefono(Integer.parseInt(telField.getText())); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Teléfono no válido.");
            return;
        }

        
        try {
            setEdad(Integer.parseInt(edadField.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Edad no válida.");
            return;
        }

        
        Object[] row = {getIdPersonal(), getNombre(), getCargo(), getTelefono(), getEdad()};
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.insertRow(0, row);
        limpiarCampos(idField, nombreField, cargoField, telField, edadField);
        
    }
    
    public void modificarDatos(int fila, JTable tabla, JTextField idField, JTextField nombreField, JTextField cargoField, JTextField telField, JTextField edadField) {
    DefaultTableModel model = (DefaultTableModel) tabla.getModel();

    
    String nuevoId = idField.getText();
    String nuevoNombre = nombreField.getText();
    String nuevoCargo = cargoField.getText();
    
    int nuevoTelefono;
    int nuevaEdad;
    
    try {
        nuevoTelefono = Integer.parseInt(telField.getText());
        nuevaEdad = Integer.parseInt(edadField.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Teléfono y edad deben ser números válidos.");
        return;
    }

   
    if (String.valueOf(nuevoTelefono).length() > 9) {
        JOptionPane.showMessageDialog(null, "Teléfono no válido.");
        return;
    }

   
    model.setValueAt(nuevoId, fila, 0);
    model.setValueAt(nuevoNombre, fila, 1);
    model.setValueAt(nuevoCargo, fila, 2);
    model.setValueAt(nuevoTelefono, fila, 3);
    model.setValueAt(nuevaEdad, fila, 4);

    JOptionPane.showMessageDialog(null, "Datos modificados correctamente.");
}
 public void insertarEnBaseDeDatos() {
        String sqlInsert = "INSERT INTO personal (id_personal, nombre, cargo, telefono, edad) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = new CConexion().EstablecerConexion();
             PreparedStatement pstmt = conn.prepareStatement(sqlInsert)) {
        if (conn != null) {
            pstmt.setString(1,getIdPersonal());
            pstmt.setString(2,getNombre());
            pstmt.setString(3, getCargo());
            pstmt.setInt(4, getTelefono());
            pstmt.setInt(5, getEdad());
            
            pstmt.execute();
            
                JOptionPane.showMessageDialog(null, "Datos insertados correctamente.....");
            } else {
                JOptionPane.showMessageDialog(null, "Error no se pudo conectar");
            }
        } catch (SQLException e) {
             e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar los datos: " + e.getMessage());
        }
    }
 public void limpiarTabla(JTable tabla) {
    DefaultTableModel model = (DefaultTableModel) tabla.getModel();
    model.setRowCount(0); 
}

 }   
