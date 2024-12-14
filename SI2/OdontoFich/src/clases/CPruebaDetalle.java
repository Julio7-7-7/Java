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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class CPruebaDetalle {
            

public void mostrarTrabajosYPagos(String siglaMateria, JPanel paneldetalle) {
    // Limpiar el panel antes de agregar las pestañas
    paneldetalle.removeAll();

    // Crear un JTabbedPane para las pestañas
    JTabbedPane tabbedPane = new JTabbedPane();

    // Crear el panel para los trabajos
    JPanel panelTrabajos = new JPanel();
    panelTrabajos.setLayout(new BoxLayout(panelTrabajos, BoxLayout.Y_AXIS)); // Disposición vertical

    CConexion conexion = new CConexion();
    try (Connection conn = conexion.EstablecerConexion()) {
        // Consulta para obtener los trabajos
        String consultaTrabajos = "SELECT pm.id_trabajo, t.nombre, t.precio_unidad, pm.cantidad_trabajo " +
                                  "FROM plan_materia pm " +
                                  "JOIN trabajo t ON pm.id_trabajo = t.id_trabajo " +
                                  "WHERE pm.sigla = ?";
        PreparedStatement psTrabajos = conn.prepareStatement(consultaTrabajos);
        psTrabajos.setString(1, siglaMateria);
        ResultSet rsTrabajos = psTrabajos.executeQuery();

        // Llenar el panel de trabajos con los resultados
        while (rsTrabajos.next()) {
            String idTrabajo = rsTrabajos.getString("id_trabajo");
            String nombreTrabajo = rsTrabajos.getString("nombre");
            double precioUnidad = rsTrabajos.getDouble("precio_unidad");
            int cantidadTrabajo = rsTrabajos.getInt("cantidad_trabajo");

            // Consulta para obtener los trabajos realizados
            String consultaRealizados = "SELECT COUNT(DISTINCT fecha) AS trabajos_realizados " +
                                        "FROM detalle_estudiante " +
                                        "WHERE id_trabajo = ?";
            PreparedStatement psRealizados = conn.prepareStatement(consultaRealizados);
            psRealizados.setString(1, idTrabajo);
            ResultSet rsRealizados = psRealizados.executeQuery();

            int trabajosRealizados = 0;
            if (rsRealizados.next()) {
                trabajosRealizados = rsRealizados.getInt("trabajos_realizados");
            }

            JPanel trabajoPanel = new JPanel();
            trabajoPanel.setPreferredSize(new Dimension(550, 100)); // Panel ancho para disposición vertical
            trabajoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            trabajoPanel.setBackground(Color.LIGHT_GRAY);
            trabajoPanel.setLayout(new BorderLayout());

            String infoTrabajo = String.format(
                "<html><center>ID: %s<br>Nombre: %s<br>Precio: %.2f<br>Cantidad: %d/%d</center></html>",
                idTrabajo, nombreTrabajo, precioUnidad, trabajosRealizados, cantidadTrabajo
            );
            JLabel lblTrabajo = new JLabel(infoTrabajo);
            lblTrabajo.setHorizontalAlignment(SwingConstants.CENTER);
            lblTrabajo.setVerticalAlignment(SwingConstants.CENTER);

            trabajoPanel.add(lblTrabajo, BorderLayout.CENTER);
            panelTrabajos.add(trabajoPanel);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener los trabajos: " + e.getMessage());
    }

    // Crear el panel para los pagos
    JPanel panelPagos = new JPanel(new BorderLayout());

    // Crear el modelo de la tabla para los pagos
    DefaultTableModel modelPagos = new DefaultTableModel();
    modelPagos.addColumn("Nombre del Trabajo");
    modelPagos.addColumn("Fecha");
    modelPagos.addColumn("Monto");

    JTable tablaPagos = new JTable(modelPagos);

    try (Connection conn = conexion.EstablecerConexion()) {
        // Consulta para obtener los pagos
        String consultaPagos = "SELECT t.nombre AS nombre_trabajo, de.fecha AS fecha, t.precio_unidad AS monto " +
                               "FROM detalle_estudiante de " +
                               "JOIN trabajo t ON de.id_trabajo = t.id_trabajo " +
                               "GROUP BY t.nombre, de.fecha, t.precio_unidad " +
                               "ORDER BY de.fecha";
        PreparedStatement psPagos = conn.prepareStatement(consultaPagos);
        ResultSet rsPagos = psPagos.executeQuery();

        // Llenar el modelo de la tabla con los resultados
        while (rsPagos.next()) {
            String nombreTrabajo = rsPagos.getString("nombre_trabajo");
            String fecha = rsPagos.getString("fecha");
            double monto = rsPagos.getDouble("monto");

            modelPagos.addRow(new Object[]{nombreTrabajo, fecha, monto});
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al cargar los pagos: " + e.getMessage());
    }

    // Agregar la tabla de pagos al panel
    JScrollPane scrollPagos = new JScrollPane(tablaPagos);
    panelPagos.add(scrollPagos, BorderLayout.CENTER);

    // Agregar los paneles de trabajos y pagos al JTabbedPane
    tabbedPane.addTab("Trabajos", new JScrollPane(panelTrabajos));
    tabbedPane.addTab("Pagos", panelPagos);

    // Agregar el JTabbedPane al panel detalle
    paneldetalle.setLayout(new BorderLayout());
    paneldetalle.add(tabbedPane, BorderLayout.CENTER);

    // Refrescar el panel detalle para que se vean los cambios
    paneldetalle.revalidate();
    paneldetalle.repaint();
}


}
