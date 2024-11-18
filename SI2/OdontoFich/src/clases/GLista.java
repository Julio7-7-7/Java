package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import odontofich.CConexion;

public class GLista {
    private DefaultTableModel model;
    private ArrayList<String[]> inventarioData = new ArrayList<>();
    

   
    public GLista(DefaultTableModel model) {
        this.model = model;
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

    public void borrarRegistro(String idInventario) {
        String sql = "DELETE FROM inventario WHERE id_inventario = ?";
        try (Connection conn = new CConexion().EstablecerConexion();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, idInventario);
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
                cargarInsumosEnTabla(); // Actualizar tabla después de borrar
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void actualizarRegistro(String idInventario, String nuevoStock) {
        String sql = "UPDATE inventario SET stock = ? WHERE id_inventario = ?";
        try (Connection conn = new CConexion().EstablecerConexion();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nuevoStock);
            pstmt.setString(2, idInventario);
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Registro actualizado correctamente.");
                cargarInsumosEnTabla(); 
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar el registro.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el registro: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public void modificarRegistro(String idInventario, String nuevoIdInsumo, String nuevaFechaRegistro, 
                              String nuevoStock, String nuevaUnidadMedida, String nuevoIdPersonal) {
    String sql = "UPDATE inventario SET id_insumo = ?, fecha_registro = ?, stock = ?, unidad_medida = ?, id_personal = ? WHERE id_inventario = ?";
    
    try (Connection conn = new CConexion().EstablecerConexion();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
        
        pstmt.setString(1, nuevoIdInsumo);
        pstmt.setString(2, nuevaFechaRegistro);
        pstmt.setString(3, nuevoStock);
        pstmt.setString(4, nuevaUnidadMedida);
        pstmt.setString(5, nuevoIdPersonal);
        pstmt.setString(6, idInventario);
        
       
        int rowsAffected = pstmt.executeUpdate();
        
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Registro modificado correctamente.");
            cargarInsumosEnTabla(); // Actualizar la tabla después de modificar el registro
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar el registro.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al modificar el registro: " + e.getMessage());
        e.printStackTrace();
    }
}

}

