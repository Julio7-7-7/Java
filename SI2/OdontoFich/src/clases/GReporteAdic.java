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
/**
 *
 * @author USUARIO
 */
public class GReporteAdic {
    
    
     public void llenarComboBoxOpciones(JComboBox comboBox) {
        // Agregamos las opciones "Fecha" y "Registro" al comboBox
         comboBox.removeAllItems();
        comboBox.addItem("Fecha");
        comboBox.addItem("Registro");
    }
public void buscarPorFechaORegistro(JComboBox<String> comboBox, JTextField textFieldRegistro, JTextField textFieldInicio, JTextField textFieldFin, JTable tablaResultado) {
    CConexion objetoConexion = new CConexion();
    String sql = "";
    
    // Determinar la consulta según la opción seleccionada
    if (comboBox.getSelectedItem().equals("Fecha")) {
        sql = "SELECT * FROM detalle_adicional WHERE fecha BETWEEN ? AND ?";
    } else {
        sql = "SELECT * FROM detalle_adicional WHERE registro = ?";
    }

    try (Connection conn = objetoConexion.EstablecerConexion();
         PreparedStatement pst = conn.prepareStatement(sql)) {

        if (comboBox.getSelectedItem().equals("Fecha")) {
            // Obtener las fechas de los JTextField
            String busquedaInicio = textFieldInicio.getText().trim();
            String busquedaFin = textFieldFin.getText().trim();

            if (busquedaInicio.isEmpty() || busquedaFin.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese ambas fechas para buscar por rango.");
                return;
            }

            // Validar y convertir las fechas a formato SQL
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setLenient(false); // Asegurar formato estricto
            java.sql.Date fechaInicioSQL;
            java.sql.Date fechaFinSQL;

            try {
                fechaInicioSQL = new java.sql.Date(sdf.parse(busquedaInicio).getTime());
                fechaFinSQL = new java.sql.Date(sdf.parse(busquedaFin).getTime());
            } catch (java.text.ParseException e) {
                JOptionPane.showMessageDialog(null, "Las fechas deben estar en el formato AAAA-MM-DD.");
                return;
            }

            // Establecer los parámetros de la consulta
            pst.setDate(1, fechaInicioSQL);
            pst.setDate(2, fechaFinSQL);
        } else {
            // Obtener el número de registro del JTextField
            String busquedaRegistro = textFieldRegistro.getText().trim();

            if (busquedaRegistro.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un registro para buscar.");
                return;
            }

            try {
                pst.setInt(1, Integer.parseInt(busquedaRegistro));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El registro debe ser un número válido.");
                return;
            }
        }

        ResultSet rs = pst.executeQuery();

        // Configurar el modelo de la tabla
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Registro");
        model.addColumn("ID Insumo");
        model.addColumn("Cantidad");
        model.addColumn("Costo");
        model.addColumn("Fecha");

        if (!rs.isBeforeFirst()) {
            JOptionPane.showMessageDialog(null, "No se encontraron resultados para la búsqueda.");
        } else {
            // Llenar la tabla con los resultados
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("registro"),
                    rs.getString("id_insumo"),
                    rs.getInt("cantidad"),
                    rs.getBigDecimal("costo"),
                    rs.getDate("fecha").toString() // Mostrar como texto "AAAA-MM-DD"
                });
            }

            // Asignar el modelo a la tabla de resultados
            tablaResultado.setModel(model);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al buscar los datos: " + e.getMessage());
    }
}
public void imprimirTabla(JTable tabla) {
    try {
        // Imprimir la tabla con encabezado y pie de página
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
