package clases;

import clases.GInsumo;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import odontofich.CConexion;

public class GInventario {
    private ArrayList<String> idsInsumos;
    private JComboBox<String> jcInsumoinve;
    private JComboBox<String> JcPersonal;
    private JComboBox<String> JcUnidadMedida;
    private JTextField idInventario;
    private JTextField fechaRegist;

    public GInventario(JComboBox<String> jcInsumoinve, JComboBox<String> JcPersonal,
                           JComboBox<String> JcUnidadMedida, JTextField idInventario,
                           JTextField fechaRegist) {
        this.idsInsumos = new ArrayList<>();
        this.jcInsumoinve = jcInsumoinve;
        this.JcPersonal = JcPersonal;
        this.JcUnidadMedida = JcUnidadMedida;
        this.idInventario = idInventario;
        this.fechaRegist = fechaRegist;
    }

    public ArrayList<String> getIdsInsumos() {
        return idsInsumos;
    }


    public void cargarPersonalEnComboBox() {
        String sql = "SELECT id_personal, nombre FROM personal";
        Connection conn = new CConexion().EstablecerConexion();

        if (conn != null) {
            try (PreparedStatement pstmt = conn.prepareStatement(sql);
                 ResultSet rs = pstmt.executeQuery()) {

                JcPersonal.removeAllItems();

                while (rs.next()) {
                    String idPersonal = rs.getString("id_personal");
                    String nombre = rs.getString("nombre");
                    JcPersonal.addItem(idPersonal + " - " + nombre);
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

    public void regresarAPanelInsumo(JPanel parentPanel) {
        CardLayout layout = (CardLayout) parentPanel.getLayout();
        layout.show(parentPanel, "insumo");
    }

    public void cambiarAPanelListaInventario(JPanel parentPanel) {
        CardLayout layout = (CardLayout) parentPanel.getLayout();
        layout.show(parentPanel, "ListaInventario");
    }
  
}
