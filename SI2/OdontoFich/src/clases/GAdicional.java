package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import odontofich.CConexion;

public class GAdicional {

    private String idRegistro;
    private String insumoSeleccionado;
    private int cantidad;
    private double costo;
    private Date fecha;

    // Getters y Setters
    public String getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getInsumoSeleccionado() {
        return insumoSeleccionado;
    }

    public void setInsumoSeleccionado(String insumoSeleccionado) {
        this.insumoSeleccionado = insumoSeleccionado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(String fechaStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        this.fecha = sdf.parse(fechaStr);
    }

  
    public void cargarInsumosEnComboBox(JComboBox<String> comboBox) {
        String sql = "SELECT id_insumo FROM insumo";
        try (Connection conn = new CConexion().EstablecerConexion();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            comboBox.removeAllItems();

            while (rs.next()) {
                String idInsumo = rs.getString("id_insumo");
                comboBox.addItem(idInsumo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar insumos: " + e.getMessage());
        }
    }

   
   public void limpiarCampos(JTextField idRegist, JTextField jtcosto, JTextField cantidadAdi, JTextField fechaAdi) {
        idRegist.setText("");
        jtcosto.setText("");
        cantidadAdi.setText("");
        fechaAdi.setText("");
    }

    
    public void cancelarRegistro(JTable tabla, JTextField idRegist, JTextField cantidadAdi, JTextField jtcosto, JTextField fechaAdi) {
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar?", "Cancelar", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            limpiarCampos(idRegist, jtcosto,cantidadAdi, fechaAdi);
            ((DefaultTableModel) tabla.getModel()).setRowCount(0);
        }
    }

    
public void agregarDatosATabla(JTable tabla, JTextField idRegist, JComboBox<String> comboBoxInsumo, JTextField cantidadAdi, JTextField jtcosto, JTextField fechaAdi) {
   
    setIdRegistro(idRegist.getText()); 
    setCantidad(Integer.parseInt(cantidadAdi.getText())); 
    setCosto(Double.parseDouble(jtcosto.getText())); 
    
    
    String insumoSeleccionado = comboBoxInsumo.getSelectedItem().toString();
    String fechaTexto = fechaAdi.getText();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    sdf.setLenient(false);  
    
    if (!fechaTexto.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
        JOptionPane.showMessageDialog(null, "La fecha debe estar en el formato dd/MM/yyyy (por ejemplo, 12/06/2024).", "Error de Fecha", JOptionPane.ERROR_MESSAGE);
        return; 
    }

    try {
   
        java.util.Date fechaDate = sdf.parse(fechaTexto);
        Object[] row = {getIdRegistro(), insumoSeleccionado, getCantidad(), getCosto(), fechaTexto};

       
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.insertRow(0, row);
        
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida. Use el formato dd/MM/yyyy.", "Error de Fecha", JOptionPane.ERROR_MESSAGE);
        return; 
    }
}

   
    public void insertarDatosEnBaseDeDatos() {
        String sqlInsert = "INSERT INTO detalle_adicional (id_registro, id_insumo, cantidad, costo, fecha) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = new CConexion().EstablecerConexion();
             PreparedStatement pstmt = conn.prepareStatement(sqlInsert)) {
          if (conn != null) {
            pstmt.setString(1, getIdRegistro());
            pstmt.setString(2, getInsumoSeleccionado());
            pstmt.setInt(3, getCantidad());
            pstmt.setDouble(4, getCosto());
            pstmt.setDate(5, new java.sql.Date(getFecha().getTime()));

            pstmt.execute();
         
                JOptionPane.showMessageDialog(null, "Datos insertados correctamente en la base de datos.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al insertar los datos en la base de datos.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar los datos: " + e.getMessage());
        }
    }
    private void actualizarStock(int cantidad, String insumoSeleccionado, Connection conn) {
        String sqlStock = "UPDATE inventario SET stock = stock - ? WHERE id_insumo = ?";
        try (PreparedStatement pstmtStock = conn.prepareStatement(sqlStock)) {
            pstmtStock.setInt(1, cantidad);
            pstmtStock.setString(2, insumoSeleccionado);

            int rowsUpdated = pstmtStock.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Stock actualizado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el stock.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el stock: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public void limpiarTabla(JTable tabla) {
    DefaultTableModel model = (DefaultTableModel) tabla.getModel();
    model.setRowCount(0); 
}
}