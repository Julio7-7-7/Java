package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import odontofich.CConexion;
import java.time.format.DateTimeParseException;


public class GLista {
    private DefaultTableModel model;
    private JTable tablaInventario;
    private ArrayList<String[]> inventarioData = new ArrayList<>();
    

   
    public GLista(DefaultTableModel model, JTable tablaInventario) {
        this.model = model;
        this.tablaInventario = tablaInventario; // Iniciamos la referencia de la tabla
        model.addColumn("ID INVENTARIO");
        model.addColumn("ID INSUMO");
        model.addColumn("FECHA REGISTRO");
        model.addColumn("STOCK");
        model.addColumn("UNIDAD DE MEDIDA");
        model.addColumn("ID PERSONAL");
    }

    public void cargarInsumosEnTabla() {
        String sql = "SELECT id_inventario, id_insumo, fecha_registro, stock, unidad_medida, id_personal FROM inventario";
        Connection conn = new CConexion().EstablecerConexion();

        if (conn != null) {
            try (PreparedStatement pstmt = conn.prepareStatement(sql);
                 ResultSet rs = pstmt.executeQuery()) {

                model.setRowCount(0); 
                inventarioData.clear(); 

                while (rs.next()) {
                    String idInventario = rs.getString("id_inventario");
                    String idInsumo = rs.getString("id_insumo");
                    String fechaRegistro = rs.getString("fecha_registro");
                    String stock = rs.getString("stock");
                    String unidadMedida = rs.getString("unidad_medida");
                    String idPersonal = rs.getString("id_personal");

                    model.addRow(new Object[]{idInventario, idInsumo, fechaRegistro, stock, unidadMedida, idPersonal});
                    inventarioData.add(new String[]{idInventario, idInsumo, fechaRegistro, stock, unidadMedida, idPersonal});
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cargar insumos: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
        }
    }

   public void borrarFilaSeleccionada() {
    // Obtener la fila seleccionada
    int selectedRow = tablaInventario.getSelectedRow();

    if (selectedRow != -1) {
        // Obtener el id_inventario de la fila seleccionada
        String idInventario = (String) tablaInventario.getValueAt(selectedRow, 0); // Columna 0 es id_inventario

        // Llamar al método para borrar el registro de la base de datos
        borrarRegistro(idInventario);

        // Eliminar la fila de la tabla
        model.removeRow(selectedRow);
    } else {
        JOptionPane.showMessageDialog(null, "Por favor seleccione una fila para eliminar.");
    }
}

public void borrarRegistro(String idInventario) {
    String sql = "DELETE FROM inventario WHERE id_inventario = ?";
    try (Connection conn = new CConexion().EstablecerConexion();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, idInventario);
        int rowsAffected = pstmt.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
            cargarInsumosEnTabla(); // Recargar la tabla después de eliminar
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + e.getMessage());
        e.printStackTrace();
    }
}

 

public void modificarRegistro(String idInventario, java.sql.Date nuevaFechaRegistro, double nuevoStock) {
    String sql = "UPDATE inventario SET fecha_registro = ?, stock = ? WHERE id_inventario = ?";
    try (Connection conn = new CConexion().EstablecerConexion();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setDate(1, nuevaFechaRegistro); 
        pstmt.setDouble(2, nuevoStock); 
        pstmt.setString(3, idInventario); 

        int rowsAffected = pstmt.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Registro modificado correctamente.");
            cargarInsumosEnTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar el registro.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al modificar el registro: " + e.getMessage());
        e.printStackTrace();
    }
}


public void modificarFilaSeleccionada() {
    
    int selectedRow = tablaInventario.getSelectedRow();

    if (selectedRow != -1) {
        
        String idInventario = (String) tablaInventario.getValueAt(selectedRow, 0); 

       
        String nuevaFechaRegistroStr = JOptionPane.showInputDialog(null, "Ingrese la nueva fecha de registro (YYYY-MM-DD):");
        String nuevoStockStr = JOptionPane.showInputDialog(null, "Ingrese el nuevo stock ");

        try {
            
            if (nuevaFechaRegistroStr != null && !nuevaFechaRegistroStr.isEmpty()) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate localDate = LocalDate.parse(nuevaFechaRegistroStr, formatter); 
                java.sql.Date nuevaFechaRegistro = java.sql.Date.valueOf(localDate); 

                if (nuevoStockStr != null && !nuevoStockStr.isEmpty()) {
                    double nuevoStock = Double.parseDouble(nuevoStockStr); 

                  
                    modificarRegistro(idInventario, nuevaFechaRegistro, nuevoStock);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un valor válido para el stock.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese una fecha válida.");
            }
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "La fecha ingresada no tiene un formato válido. Use YYYY-MM-DD.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El valor ingresado para el stock debe ser un número real.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor seleccione una fila para modificar.");
    }
}



}

