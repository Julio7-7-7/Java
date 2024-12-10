package clases;

import clases.GInsumo;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import odontofich.CConexion;
import java.text.SimpleDateFormat;
import java.util.Date;


public class GInventario {
     private ArrayList<String> idsInsumos;
    private JComboBox<String> jcInsumoinve;
    private JComboBox<String> JcPersonal;
    private JComboBox<String> JcUnidadMedida;
    private JTextField idInventario;
    private JTextField fechaRegist;
     private JTextField stock;
    
     private JTable tablaInsumo;
   
     

    public GInventario(JComboBox<String> jcInsumoinve, JComboBox<String> JcPersonal,
                           JComboBox<String> JcUnidadMedida, JTextField idInventario,
                           JTextField fechaRegist,JTextField stock) {
        this.idsInsumos = new ArrayList<>();
        this.jcInsumoinve = jcInsumoinve;
        this.JcPersonal = JcPersonal;
        this.JcUnidadMedida = JcUnidadMedida;
        this.idInventario = idInventario;
        this.fechaRegist = fechaRegist;
        this.stock = stock;
        
    }

    public ArrayList<String> getIdsInsumos() {
        return idsInsumos;
    }


    public void cargarPersonalEnComboBox() {
        String sql = "SELECT id_personal FROM personal";
        Connection conn = new CConexion().EstablecerConexion();

        if (conn != null) {
            try (PreparedStatement pstmt = conn.prepareStatement(sql);
                 ResultSet rs = pstmt.executeQuery()) {

                JcPersonal.removeAllItems();

                while (rs.next()) {
                    String idPersonal = rs.getString("id_personal");
                    JcPersonal.addItem(idPersonal);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cargar personal: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
        }
    }


    public void cargarUnidadMedida() {
        JcUnidadMedida.removeAllItems();
        String[] unidades = {"Foco", "Unidad", "Kilo", "Kit", "Caja", "Sobres"};

        for (String unidad : unidades) {
            JcUnidadMedida.addItem(unidad);
        }
    }

    public String obtenerUnidadMedidaSeleccionada() {
        return (String) JcUnidadMedida.getSelectedItem();
    }

    public void limpiarCampos() {
        idInventario.setText("");
        fechaRegist.setText("");
    }

  
 
public void obtenerIdsDeInsumosYEnviarAlInventario(JComboBox<String> jcInsumoinve) {
    String sql = "SELECT id_insumo FROM insumo;";
    
    try (Connection conn = new CConexion().EstablecerConexion(); 
         PreparedStatement pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery()) {

        if (conn != null) {
         
            jcInsumoinve.removeAllItems();
            
           
            while (rs.next()) {
                String idInsumo = rs.getString("id_insumo");
                jcInsumoinve.addItem(idInsumo);  
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al obtener los insumos: " + e.getMessage());
    }
}

public void registrarInventarioEnBD() {
 
    String idInventari = idInventario.getText(); 
    String idInsumo = jcInsumoinve.getSelectedItem().toString();  
    String fechaRegistro = fechaRegist.getText();  
    String stocks = stock.getText();  
    String unidadMedida = JcUnidadMedida.getSelectedItem().toString();  
    String personal = JcPersonal.getSelectedItem().toString();  
    
   
    java.sql.Date sqlFechaRegistro = null;
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
        Date date = sdf.parse(fechaRegistro); 
        sqlFechaRegistro = new java.sql.Date(date.getTime()); 
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al convertir la fecha: " + e.getMessage());
    }

    float stockValor = 0;
    try {
        stockValor = Float.parseFloat(stocks); 
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El valor del stock debe ser un número válido.");
        return;  
    }

    String sqlprev = "SELECT stock FROM inventario where id_inventario = ?";
    String sqlInsert = "INSERT INTO inventario (id_inventario, id_insumo, fecha_registro, stock, unidad_medida, id_personal) VALUES (?, ?, ?, ?, ?, ?);";
    String sqlUpdate = "UPDATE inventario SET id_insumo = ?, fecha_registro = ?, stock = ?, unidad_medida = ?, id_personal = ? WHERE id_inventario = ?";
    try (Connection conn = new CConexion().EstablecerConexion()) {
          
        PreparedStatement pstmtprev = conn.prepareStatement(sqlprev);
        pstmtprev.setString(1, idInventari);
        ResultSet res = pstmtprev.executeQuery();
        PreparedStatement pstmt = null;
        if (res.next()) {
            System.out.println("actualizando");
            pstmt = conn.prepareStatement(sqlUpdate);
            pstmt.setString(1, idInsumo);
            pstmt.setDate(2, sqlFechaRegistro);
            pstmt.setFloat(3, stockValor+res.getFloat(1));
            pstmt.setString(4, unidadMedida);
            pstmt.setString(5, personal);
            pstmt.setString(6, idInventari);
            int filasAfectadas = pstmt.executeUpdate();
        
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Inventario existente actualizado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el inventario.");
            }
        } else {
            pstmt = conn.prepareStatement(sqlInsert);
            pstmt.setString(1, idInventari);  
            pstmt.setString(2, idInsumo); 
            pstmt.setDate(3, sqlFechaRegistro);  
            pstmt.setFloat(4, stockValor);  
            pstmt.setString(5, unidadMedida); 
            pstmt.setString(6, personal);
            int filasAfectadas = pstmt.executeUpdate();
        
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Inventario registrado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar el inventario.");
            }
        }
        
        
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al registrar inventario: " + e.getMessage());
    }
}

}

