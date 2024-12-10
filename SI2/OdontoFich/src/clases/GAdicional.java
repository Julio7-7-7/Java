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

   private int idRegistro;
    private String insumoSeleccionado;
    private int cantidad;
    private double costo;
    private Date fecha;

    // Getters y Setters
    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
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
        String sql = "SELECT id_insumo ,nombre_insumo FROM insumo";
        try (Connection conn = new CConexion().EstablecerConexion();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            comboBox.removeAllItems();

            while (rs.next()) {
              
            String displayText = rs.getString("id_insumo") + " - " + rs.getString("nombre_insumo");
            comboBox.addItem(displayText);
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
    try {
       
        setIdRegistro(Integer.parseInt(idRegist.getText()));
        setCantidad(Integer.parseInt(cantidadAdi.getText()));
        setCosto(Double.parseDouble(jtcosto.getText()));

        
        String insumoSeleccionado = comboBoxInsumo.getSelectedItem().toString();
        String[] insumoParts = insumoSeleccionado.split(" - "); 
        String idInsumo = insumoParts[0]; 
        setInsumoSeleccionado(idInsumo); 

       
        String fechaTexto = fechaAdi.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        if (!fechaTexto.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
            JOptionPane.showMessageDialog(null, "La fecha debe estar en el formato dd/MM/yyyy (por ejemplo, 12/06/2024).", "Error de Fecha", JOptionPane.ERROR_MESSAGE);
            return;
        }

        setFecha(fechaTexto);

       
        Object[] row = {getIdRegistro(), idInsumo, getCantidad(), getCosto(), fechaTexto};

        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.insertRow(0, row); 
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error: El ID, la cantidad y el costo deben ser números válidos.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida. Use el formato dd/MM/yyyy.", "Error de Fecha", JOptionPane.ERROR_MESSAGE);
    }
}


public void insertarDatosEnBaseDeDatos() {
    if (getFecha() == null) {
        JOptionPane.showMessageDialog(null, "La fecha no puede estar vacía.");
        return;
    }

    String sqlCheckStock = "SELECT stock FROM inventario WHERE id_insumo = ?";
    String sqlInsert = "INSERT INTO detalle_adicional (registro, id_insumo, cantidad, costo, fecha) VALUES (?, ?, ?, ?, ?)";
    String sqlUpdate = "UPDATE inventario SET stock = stock - ? WHERE id_insumo = ?";

    try (Connection conn = new CConexion().EstablecerConexion()) {
      
        PreparedStatement pstmtCheckStock = conn.prepareStatement(sqlCheckStock);
        pstmtCheckStock.setString(1, getInsumoSeleccionado());
        ResultSet rs = pstmtCheckStock.executeQuery();

        if (rs.next()) {
            int stockDisponible = rs.getInt("stock");

            
            if (stockDisponible < getCantidad()) {
                JOptionPane.showMessageDialog(null, "No se puede realizar la operación. Stock insuficiente (Disponible: " + stockDisponible + ").");
                return;
            }

           
            if (stockDisponible - getCantidad() < 5) {
                JOptionPane.showMessageDialog(null, "Advertencia: El stock quedará bajo (" + (stockDisponible - getCantidad()) + " unidades restantes).");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El insumo seleccionado no existe en el inventario.");
            return;
        }

      
        PreparedStatement pstmtInsert = conn.prepareStatement(sqlInsert);
        pstmtInsert.setInt(1, getIdRegistro());
        pstmtInsert.setString(2, getInsumoSeleccionado());
        pstmtInsert.setInt(3, getCantidad());
        pstmtInsert.setDouble(4, getCosto());
        pstmtInsert.setDate(5, new java.sql.Date(getFecha().getTime()));

        int rowsAffected = pstmtInsert.executeUpdate();

        if (rowsAffected > 0) {
           
            PreparedStatement pstmtUpdate = conn.prepareStatement(sqlUpdate);
            pstmtUpdate.setInt(1, getCantidad());
            pstmtUpdate.setString(2, getInsumoSeleccionado());

            int rowsUpdated = pstmtUpdate.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Datos insertados y cantidad actualizada en inventario.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la cantidad en el inventario.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se insertaron datos en la base de datos.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al insertar los datos: " + e.getMessage());
        e.printStackTrace();
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