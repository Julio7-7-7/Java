package clases;

import javax.swing.JOptionPane;
import Interfaces.FPruebaDetalles;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CPruebaDetalle {
            
   public void mostrarTrabajos(String siglaMateria, JPanel panelTrabajos) {
    panelTrabajos.removeAll();

    CConexion conexion = new CConexion();
    try (Connection conn = conexion.EstablecerConexion()) { 
        
        String consulta = "SELECT pm.id_trabajo, t.nombre, t.precio_unidad, pm.cantidad_trabajo " +
                          "FROM plan_materia pm " +
                          "JOIN trabajo t ON pm.id_trabajo = t.id_trabajo " +
                          "WHERE pm.sigla = ?";
        PreparedStatement ps = conn.prepareStatement(consulta);
        ps.setString(1, siglaMateria);
        ResultSet rs = ps.executeQuery();
        
        panelTrabajos.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        while (rs.next()) {
            String idTrabajo = rs.getString("id_trabajo");
            String nombreTrabajo = rs.getString("nombre");
            double precioUnidad = rs.getDouble("precio_unidad");
            int cantidadTrabajo = rs.getInt("cantidad_trabajo");

            JPanel trabajoPanel = new JPanel();
            trabajoPanel.setPreferredSize(new Dimension(170, 100)); 
            trabajoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            trabajoPanel.setBackground(Color.LIGHT_GRAY);
            trabajoPanel.setLayout(new BorderLayout());

            String infoTrabajo = String.format(
                "<html><center>ID: %s<br>Nombre: %s<br>Precio: %.2f<br>Cantidad: %d</center></html>",
                idTrabajo, nombreTrabajo, precioUnidad, cantidadTrabajo
            );
            JLabel lblTrabajo = new JLabel(infoTrabajo);
            lblTrabajo.setHorizontalAlignment(SwingConstants.CENTER);
            lblTrabajo.setVerticalAlignment(SwingConstants.CENTER);

            trabajoPanel.add(lblTrabajo, BorderLayout.CENTER);

            panelTrabajos.add(trabajoPanel);
        }

        panelTrabajos.revalidate();
        panelTrabajos.repaint();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener los trabajos: " + e.getMessage());
    }
}




}
