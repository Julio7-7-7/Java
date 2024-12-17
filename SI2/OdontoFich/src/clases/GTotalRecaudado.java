package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import odontofich.CConexion;

public class GTotalRecaudado {

    public void mostrarTotalRecaudado(JTable paramReporte,JTextField TotalRecaudadoF) {
        CConexion conexionBD = new CConexion();
        DefaultTableModel modeloTabla = new DefaultTableModel();

        // Configurar columnas del modelo de la tabla
        modeloTabla.addColumn("REGISTRO");
        modeloTabla.addColumn("NOMBRE COMPLETO");
        modeloTabla.addColumn("TOTAL RECAUDADO");

        paramReporte.setModel(modeloTabla);

        String consultaSQL = """
        WITH TrabajosRealizados AS (
            SELECT 
                registro, 
                id_trabajo, 
                cast(COUNT(DISTINCT fecha) as numeric(10,2)) AS Total_Realizados
            FROM 
                detalle_estudiante
            GROUP BY 
                registro, id_trabajo
        )
        SELECT 
            e.registro,
            e.nombre AS Nombre_Estudiante,
            SUM(t.precio_unidad * COALESCE(tr.Total_Realizados, 0)) AS Total_Recaudado
        FROM 
            estudiante e
        inner JOIN 
            TrabajosRealizados tr ON e.registro = tr.registro
        inner JOIN 
            trabajo t ON tr.id_trabajo = t.id_trabajo
        GROUP BY 
            e.registro, e.nombre
        ORDER BY 
            e.registro;
        """;

        try {
            Connection conexion = conexionBD.EstablecerConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);
            ResultSet resultado = preparedStatement.executeQuery();
            String[] filaDatos = new String[3];
            double totalRecaudado=0;
            // Procesar los resultados
            while (resultado.next()) {
                filaDatos[0] = resultado.getString("registro");
                filaDatos[1] = resultado.getString("Nombre_Estudiante");
                filaDatos[2] = String.format("%.2f", resultado.getDouble("Total_Recaudado"));

                modeloTabla.addRow(filaDatos);
                totalRecaudado+=resultado.getDouble("Total_Recaudado");
            }

            TotalRecaudadoF.setText(String.format("%.2f", totalRecaudado));
            paramReporte.setModel(modeloTabla);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al generar el reporte: " + ex.getMessage());
        }
    }
}


/*

package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import odontofich.CConexion;


public class GTotalRecaudado {
    
    
    public void mostrarTotalRecaudado(JTable paramReporte) {
    
    CConexion conexionBD = new CConexion();
    DefaultTableModel modeloTabla = new DefaultTableModel();

    // Configurar columnas del modelo de la tabla
    modeloTabla.addColumn("REGISTRO");
    modeloTabla.addColumn("NOMBRE COMPLETO");
    modeloTabla.addColumn("TOTAL PAGADO ");
    modeloTabla.addColumn("TOTAL NO PAGADO ");

    paramReporte.setModel(modeloTabla);
    
    String consultaSQL = "SELECT *, '' , '' FROM ESTUDIANTE;";

    try {
        Connection conexion = conexionBD.EstablecerConexion();
        PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);

        ResultSet resultado = preparedStatement.executeQuery();
        String[] filaDatos = new String[8];


        while (resultado.next()) {
            filaDatos[0] = resultado.getString(1); 
            filaDatos[1] = resultado.getString(2); 
            filaDatos[2] = resultado.getString(3); 
            filaDatos[3] = resultado.getString(4); 
       

         
            modeloTabla.addRow(filaDatos);
        }

        paramReporte.setModel(modeloTabla);

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error al generar el reporte: " + ex.getMessage());
    }
}

     }
   */

    
    

