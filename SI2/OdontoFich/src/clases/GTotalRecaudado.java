/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
   

    
    

