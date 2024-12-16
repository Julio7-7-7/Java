/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;


import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import odontofich.CConexion;

public class GreciboInsumo {

  
   public void llenarComboBoxOpciones(JComboBox comboBox) {
       
         comboBox.removeAllItems();
        comboBox.addItem("Fecha");
        comboBox.addItem("Registro");
    }

  
      
 public void buscarPorFechaORegistro(JComboBox comboBox, JTextField textFieldRegistro, JTextField textFieldInicio, JTextField textFieldFin, JTable tablaResultado) {
    CConexion objetoConexion = new CConexion();
    String sql = "";
    
   
    if (comboBox.getSelectedItem().equals("Fecha")) {
        sql = "SELECT * FROM detalle_estudiante WHERE fecha BETWEEN ? AND ?";
    } else {
        sql = "SELECT * FROM detalle_estudiante WHERE registro = ?";
    }

    try {
        PreparedStatement pst = objetoConexion.EstablecerConexion().prepareStatement(sql);
        
        if (comboBox.getSelectedItem().equals("Fecha")) {
            
            String busquedaInicio = textFieldInicio.getText().trim();
            String busquedaFin = textFieldFin.getText().trim();
            
              if (busquedaInicio.isEmpty() || busquedaFin.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese ambas fechas para buscar por rango.");
                return;
            }
          
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.sql.Date fechaInicioSQL = new java.sql.Date(sdf.parse(busquedaInicio).getTime());
            java.sql.Date fechaFinSQL = new java.sql.Date(sdf.parse(busquedaFin).getTime());

         
            pst.setDate(1, fechaInicioSQL);
            pst.setDate(2, fechaFinSQL);
        } else {
            
            String busquedaRegistro = textFieldRegistro.getText().trim();
            pst.setInt(1, Integer.parseInt(busquedaRegistro));
        }

        ResultSet rs = pst.executeQuery();

       
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Registro");
        model.addColumn("Nombre");
        model.addColumn("ID Trabajo");
        model.addColumn("ID Insumo");
        model.addColumn("Nombre Insumo");
        model.addColumn("Estado");
        model.addColumn("Fecha");

        if (!rs.isBeforeFirst()) {
            JOptionPane.showMessageDialog(null, "No se encontraron resultados para la búsqueda.");
        } else {
           
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("registro"),
                    rs.getString("nombre"),
                    rs.getString("id_trabajo"),
                    rs.getString("id_insumo"),
                    rs.getString("nombre_insumo"),
                    rs.getString("estado"),
                    rs.getDate("fecha")
                });
            }

           
            tablaResultado.setModel(model);
        }
    } catch (SQLException | java.text.ParseException e) {
        JOptionPane.showMessageDialog(null, "Error al buscar los datos: " + e.getMessage());
    }
}
 public void imprimirTabla(JTable tabla) {
    try {
        
        boolean completado = tabla.print(JTable.PrintMode.FIT_WIDTH, 
                new java.text.MessageFormat("Lista de Detalles Adicionales"), 
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

