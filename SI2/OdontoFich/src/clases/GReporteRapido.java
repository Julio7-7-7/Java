
package clases;

import java.awt.*;
import java.awt.print.*;
import javax.swing.*;
import javax.swing.table.*;




import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.awt.print.Printable;




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import odontofich.CConexion;

public class GReporteRapido {

    public void mostrarReporteRapido(JTable paramReporte, JTextField txtNombreEstudiante, JTextField txtRegistro, JTextField txtTotalMontoPagado, JTextField txtTotalMontoNoPagado) {
        CConexion conexionBD = new CConexion();
        DefaultTableModel modeloTabla = new DefaultTableModel();

        
        modeloTabla.addColumn("SIGLA");
        modeloTabla.addColumn("NOMBRE DE MATERIA");
        modeloTabla.addColumn("NOMBRE DEL TRABAJO");
        modeloTabla.addColumn("TOTAL TRABAJOS");
        modeloTabla.addColumn("TRABAJOS REALIZADOS");
        modeloTabla.addColumn("TRABAJOS NO REALIZADOS");
        modeloTabla.addColumn("PRECIO UNIDAD");
        modeloTabla.addColumn("MONTO PAGADO");
        modeloTabla.addColumn("MONTO NO PAGADO");

        paramReporte.setModel(modeloTabla);

        String registroEstudiante = txtRegistro.getText().trim();
        String nombreEstudiante = txtNombreEstudiante.getText().trim();

       
        String consultaSQL = """
            WITH TrabajosRealizados AS (
                SELECT 
                    de.registro, 
                    de.id_trabajo, 
                    COUNT(DISTINCT de.fecha) AS Total_Realizados
                FROM 
                    detalle_estudiante de
                GROUP BY 
                    de.registro, de.id_trabajo
            )
            SELECT 
                m.sigla AS Sigla,
                m.nombre_materia AS Nombre_Materia,
                t.nombre AS Nombre_Trabajo,
                pm.cantidad_trabajo AS Total_Trabajos,
                COALESCE(tr.Total_Realizados, 0) AS Trabajos_Realizados,
                pm.cantidad_trabajo - COALESCE(tr.Total_Realizados, 0) AS Trabajos_No_Realizados,
                t.precio_unidad AS Precio_Unidad,
                COALESCE(tr.Total_Realizados, 0) * t.precio_unidad AS Monto_Pagado,
                (pm.cantidad_trabajo - COALESCE(tr.Total_Realizados, 0)) * t.precio_unidad AS Monto_No_Pagado
            FROM 
                estudiante e
            JOIN 
                registroacademico r ON e.registro = r.registro
            JOIN 
                materia m ON r.sigla = m.sigla
            JOIN 
                plan_materia pm ON m.sigla = pm.sigla
            JOIN 
                trabajo t ON pm.id_trabajo = t.id_trabajo
            LEFT JOIN 
                TrabajosRealizados tr ON e.registro = tr.registro AND t.id_trabajo = tr.id_trabajo
            WHERE 
                e.registro = ? AND e.nombre LIKE ?
            GROUP BY 
                m.sigla, m.nombre_materia, t.nombre, pm.cantidad_trabajo, t.precio_unidad, tr.Total_Realizados
            ORDER BY 
                m.sigla, t.nombre;
        """;

        try {
            Connection conexion = conexionBD.EstablecerConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);

           
            preparedStatement.setInt(1, Integer.parseInt(registroEstudiante)); 
            preparedStatement.setString(2, "%" + nombreEstudiante + "%");    

            ResultSet resultado = preparedStatement.executeQuery();

            
            double totalMontoPagado = 0;
            double totalMontoNoPagado = 0;

            
            while (resultado.next()) {
                Object[] filaDatos = new Object[9];

                filaDatos[0] = resultado.getString("Sigla");
                filaDatos[1] = resultado.getString("Nombre_Materia");
                filaDatos[2] = resultado.getString("Nombre_Trabajo");
                filaDatos[3] = resultado.getInt("Total_Trabajos");
                filaDatos[4] = resultado.getInt("Trabajos_Realizados");
                filaDatos[5] = resultado.getInt("Trabajos_No_Realizados");
                filaDatos[6] = String.format("%.2f", resultado.getDouble("Precio_Unidad"));
                filaDatos[7] = String.format("%.2f", resultado.getDouble("Monto_Pagado"));
                filaDatos[8] = String.format("%.2f", resultado.getDouble("Monto_No_Pagado"));

                totalMontoPagado += resultado.getDouble("Monto_Pagado");
                totalMontoNoPagado += resultado.getDouble("Monto_No_Pagado");

                modeloTabla.addRow(filaDatos);
            }

           
            txtTotalMontoPagado.setText(String.format("%.2f", totalMontoPagado));
            txtTotalMontoNoPagado.setText(String.format("%.2f", totalMontoNoPagado));

            paramReporte.setModel(modeloTabla);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al generar el reporte: " + ex.getMessage());
        }
    }
    
  

 public void imprimirTabla(JTable tabla) {
    try {
        
        boolean completado = tabla.print(JTable.PrintMode.FIT_WIDTH, 
      
                new java.text.MessageFormat("pagos de estudiante por materia"), 
                new java.text.MessageFormat("Página - {0}"));
        
        if (completado) {
            JOptionPane.showMessageDialog(null, "Impresión completada correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Impresión cancelada.");
        }
    } catch (java.awt.print.PrinterException e) {
        JOptionPane.showMessageDialog(null, "Error al imprimir: " + e.getMessage());
    }
}


}






