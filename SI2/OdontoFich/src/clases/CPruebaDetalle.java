package clases;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import odontofich.CConexion;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class CPruebaDetalle {
            

    public void mostrarTrabajos(String siglaMateria, int registroEstudiante, JPanel panelTrabajos) {
    panelTrabajos.setLayout(new BoxLayout(panelTrabajos, BoxLayout.Y_AXIS));
    CConexion conexion = new CConexion();

    try (Connection conn = conexion.EstablecerConexion()) {
        String consultaTrabajos = "SELECT pm.id_trabajo, t.nombre, t.precio_unidad, pm.cantidad_trabajo, " +
                                  "COUNT(DISTINCT de.fecha) AS trabajos_realizados " +
                                  "FROM plan_materia pm " +
                                  "JOIN trabajo t ON pm.id_trabajo = t.id_trabajo " +
                                  "LEFT JOIN detalle_estudiante de ON de.id_trabajo = pm.id_trabajo " +
                                  "AND de.registro = ? " + 
                                  "WHERE pm.sigla = ? " +
                                  "GROUP BY pm.id_trabajo, t.nombre, t.precio_unidad, pm.cantidad_trabajo";

        PreparedStatement psTrabajos = conn.prepareStatement(consultaTrabajos);
        psTrabajos.setInt(1, registroEstudiante);  
        psTrabajos.setString(2, siglaMateria);   

        ResultSet rsTrabajos = psTrabajos.executeQuery();

        panelTrabajos.removeAll(); 

        while (rsTrabajos.next()) {
            String idTrabajo = rsTrabajos.getString("id_trabajo");
            String nombreTrabajo = rsTrabajos.getString("nombre");
            double precioUnidad = rsTrabajos.getDouble("precio_unidad");
            int cantidadTrabajo = rsTrabajos.getInt("cantidad_trabajo");
            int trabajosRealizados = rsTrabajos.getInt("trabajos_realizados");

            JPanel trabajoPanel = new JPanel();
            trabajoPanel.setPreferredSize(new Dimension(550, 100));
            trabajoPanel.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 2));
            trabajoPanel.setLayout(new BorderLayout());

            
            if (trabajosRealizados == 0) {
                trabajoPanel.setBackground(new Color(255, 100, 100)); // Rojo
            } else if (trabajosRealizados < cantidadTrabajo) {
                trabajoPanel.setBackground(new Color(255, 255, 100)); // Amarillo
            } else {
                trabajoPanel.setBackground(new Color(100, 255, 100)); // Verde
            }

            // formatear los cmpos de la tabla
            String infoTrabajo = String.format(
                "<html><center>ID: %s<br>Nombre: %s<br>Precio: Bs. %.2f<br>Cantidad: %d/%d</center></html>",
                idTrabajo, nombreTrabajo, precioUnidad, trabajosRealizados, cantidadTrabajo
            );
            JLabel lblTrabajo = new JLabel(infoTrabajo);
            lblTrabajo.setHorizontalAlignment(SwingConstants.CENTER);
            lblTrabajo.setVerticalAlignment(SwingConstants.CENTER);
            lblTrabajo.setFont(new Font("SansSerif", Font.PLAIN, 14));

            trabajoPanel.add(lblTrabajo, BorderLayout.CENTER);
            panelTrabajos.add(trabajoPanel);
        }

        panelTrabajos.revalidate(); //actualiza el panel después de agregar cosas
        panelTrabajos.repaint();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener los trabajos: " + e.getMessage());
    }
}






public void mostrarPagos(DefaultTableModel modelPagos, JPanel panelPagos, int registroEstudiante) {
    CConexion conexion = new CConexion();
    double totalPagado = 0.0;

    try (Connection conn = conexion.EstablecerConexion()) {
        String consultaPagos = "SELECT t.nombre AS nombre_trabajo, de.fecha AS fecha, t.precio_unidad AS monto " +
                               "FROM detalle_estudiante de " +
                               "JOIN trabajo t ON de.id_trabajo = t.id_trabajo " +
                               "WHERE de.registro = ? " + 
                               "GROUP BY t.nombre, de.fecha, t.precio_unidad " +
                               "ORDER BY de.fecha";
                               
        PreparedStatement psPagos = conn.prepareStatement(consultaPagos);
        psPagos.setInt(1, registroEstudiante);
        ResultSet rsPagos = psPagos.executeQuery();
        
        modelPagos.setRowCount(0);
        
        while (rsPagos.next()) {
            String nombreTrabajo = rsPagos.getString("nombre_trabajo");
            String fecha = rsPagos.getString("fecha");
            double monto = rsPagos.getDouble("monto");

            totalPagado += monto;
            modelPagos.addRow(new Object[]{nombreTrabajo, fecha, monto});
        }

        
        String[] columnasResumen = {"Descripción", "Monto"};
        Object[][] datosResumen = {
            {"Subtotal Pagado", totalPagado}
        };
        DefaultTableModel modelResumen = new DefaultTableModel(datosResumen, columnasResumen);
        JTable tablaResumen = new JTable(modelResumen);

        
        JTable tablaPagos = new JTable(modelPagos);
        tablaPagos.setRowHeight(30);
        tablaPagos.setFont(new Font("SansSerif", Font.PLAIN, 14));
        tablaPagos.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 16));
        tablaPagos.getTableHeader().setBackground(new Color(173, 216, 230));
        tablaPagos.getTableHeader().setForeground(Color.BLACK);
        tablaPagos.setShowVerticalLines(false);
        tablaPagos.setShowHorizontalLines(true);
        tablaPagos.setGridColor(new Color(200, 200, 200));
        tablaPagos.setSelectionBackground(new Color(240, 248, 255));
        tablaPagos.setSelectionForeground(Color.BLACK);

        
        DefaultTableCellRenderer precioRenderer = new DefaultTableCellRenderer() {
            @Override
            protected void setValue(Object value) {
                if (value instanceof Number) {
                    setText("Bs. " + String.format("%.2f", value));
                } else {
                    setText("Bs. 0.00");
                }
            }
        };
        precioRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        tablaPagos.getColumnModel().getColumn(2).setCellRenderer(precioRenderer);

        
        tablaResumen.setRowHeight(30);
        tablaResumen.setFont(new Font("SansSerif", Font.PLAIN, 14));
        tablaResumen.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 16));
        tablaResumen.getTableHeader().setBackground(new Color(173, 216, 230));
        tablaResumen.getTableHeader().setForeground(Color.BLACK);
        tablaResumen.setShowVerticalLines(false);
        tablaResumen.setShowHorizontalLines(true);
        tablaResumen.setGridColor(new Color(200, 200, 200));
        tablaResumen.setSelectionBackground(new Color(240, 248, 255));
        tablaResumen.setSelectionForeground(Color.BLACK);

        DefaultTableCellRenderer rendererResumen = new DefaultTableCellRenderer();
        rendererResumen.setHorizontalAlignment(SwingConstants.CENTER);
        tablaResumen.getColumnModel().getColumn(1).setCellRenderer(rendererResumen);

        
        panelPagos.setLayout(new BorderLayout());
        JScrollPane scrollPagos = new JScrollPane(tablaPagos);
        panelPagos.add(scrollPagos, BorderLayout.CENTER);

        
        JPanel panelResumen = new JPanel(new BorderLayout());
        panelResumen.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        panelResumen.add(tablaResumen.getTableHeader(), BorderLayout.NORTH);
        panelResumen.add(tablaResumen, BorderLayout.CENTER);
        panelPagos.add(panelResumen, BorderLayout.SOUTH);

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al cargar los pagos: " + e.getMessage());
    }
}




public void mostrarTrabajosYPagos(String siglaMateria, JPanel paneldetalle, JTextField txtRegistro) {
    String registroEstudiante = txtRegistro.getText().trim(); 
    if (registroEstudiante.isEmpty()) {
        JOptionPane.showMessageDialog(null, "El registro del estudiante no puede estar vacío.");
        return;
    }

    paneldetalle.removeAll();
    JTabbedPane tabbedPane = new JTabbedPane();

    JPanel panelTrabajos = new JPanel();
    
    int registroEstudianteInt = Integer.parseInt(registroEstudiante);
    mostrarTrabajos(siglaMateria,registroEstudianteInt, panelTrabajos);
    tabbedPane.addTab("Trabajos", new JScrollPane(panelTrabajos));

    JPanel panelPagos = new JPanel(new BorderLayout());
    DefaultTableModel modelPagos = new DefaultTableModel();
    modelPagos.addColumn("Nombre del Trabajo");
    modelPagos.addColumn("Fecha");
    modelPagos.addColumn("Monto (Bs.)");

    mostrarPagos(modelPagos, panelPagos, registroEstudianteInt);

    tabbedPane.addTab("Pagos", panelPagos);

    paneldetalle.setLayout(new BorderLayout());
    paneldetalle.add(tabbedPane, BorderLayout.CENTER);

    paneldetalle.revalidate();
    paneldetalle.repaint();
}




}
