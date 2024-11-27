package clases;
import java.awt.CardLayout;
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import odontofich.CConexion;

public class GInsumo {
     // Atributos
    private String idInsumo;
    private String nombreInsumo;
    private double precioInsumo;
    private String dosificacionInsumo;
    private ArrayList<String> idsInsumos = new ArrayList<>();
    private JTable tablaInsumo;
    
    // Constructor vacío
    public GInsumo() {
    }

    // Getters y Setters
    public String getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(String idInsumo) {
        this.idInsumo = idInsumo;
    }

    public String getNombreInsumo() {
        return nombreInsumo;
    }

    public void setNombreInsumo(String nombreInsumo) {
        this.nombreInsumo = nombreInsumo;
    }

    public double getPrecioInsumo() {
        return precioInsumo;
    }

    public void setPrecioInsumo(double precioInsumo) {
        this.precioInsumo = precioInsumo;
    }

    public String getDosificacionInsumo() {
        return dosificacionInsumo;
    }

    public void setDosificacionInsumo(String dosificacionInsumo) {
        this.dosificacionInsumo = dosificacionInsumo;
    }

    public ArrayList<String> getIdsInsumos() {
        return idsInsumos;
    }

    public void setIdsInsumos(ArrayList<String> idsInsumos) {
        this.idsInsumos = idsInsumos;
    }



public void obtenerInsumosDeTablaYEnviarAComboBox(JTable tabla, JComboBox<String> comboBox) {
    DefaultTableModel model = (DefaultTableModel) tabla.getModel(); 
    int rowCount = model.getRowCount(); 
    
    comboBox.removeAllItems();
    
    for (int i = 0; i < rowCount; i++) {
        Object idInsumo = model.getValueAt(i, 0);  
        
      
        if (idInsumo != null) {
            comboBox.addItem(idInsumo.toString());  
        }
    }
}


    public void registrarInsumoEnBAD() {
        String sql = "INSERT INTO insumo (id_insumo,nombre_insumo,precio_insumo,dosificacion) VALUES (?, ?, ?, ?);";
        try (Connection conn = new CConexion().EstablecerConexion(); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            if (conn != null) {
                pstmt.setString(1, idInsumo); 
                pstmt.setString(2, nombreInsumo); 
                pstmt.setDouble(3, (precioInsumo)); 
                pstmt.setString(4, dosificacionInsumo); 

                pstmt.execute();
                JOptionPane.showMessageDialog(null, "Insumo registrado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al registrar insumo: " + e.getMessage());
        }
    }

    
    public void cancelarRegistro(JTable tabla,JTextField txtIdInsumo, JTextField txtNombre, JTextField txtPrecio, JTextField txtDosificacion) {
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar?", "Cancelar", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            limpiarCampos(txtIdInsumo, txtNombre, txtPrecio, txtDosificacion);
             ((DefaultTableModel) tabla.getModel()).setRowCount(0); 
        }
    }

   
    public void limpiarCampos(JTextField txtIdInsumo, JTextField txtNombre, JTextField txtPrecio, JTextField txtDosificacion) {
        txtIdInsumo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtDosificacion.setText("");

    }

   
    public void agregarInsumoATabla(JTable tabla, JTextField txtIdInsumo, JTextField txtNombre, JTextField txtPrecio, JTextField txtDosificacion) {
        setIdInsumo(txtIdInsumo.getText());
        setNombreInsumo(txtNombre.getText());
       
        try {
            setPrecioInsumo(Double.parseDouble(txtPrecio.getText())); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al poner el precio");
            return;
        }
        setDosificacionInsumo(txtDosificacion.getText());
        
        Object[] row = {getIdInsumo(), getNombreInsumo(), getPrecioInsumo(), getDosificacionInsumo()};
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.insertRow(0, row);
        limpiarCampos(txtIdInsumo, txtNombre, txtPrecio, txtDosificacion);
        
    }
    public void limpiarTabla(JTable tabla) {
    DefaultTableModel model = (DefaultTableModel) tabla.getModel();
    model.setRowCount(0); 
}
 
  

}

   


