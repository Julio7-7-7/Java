/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class ReportePago extends JFrame {

    // Componentes de la interfaz
    private JLabel lblFecha, lblHora, lblAño, lblTotalRecaudado;
    private JTextField txtNombre, txtTotalPagado, txtFaltaPagar;
    private JButton btnAgregar, btnGuardar, btnLimpiar;
    private JTable tabla;
    private DefaultTableModel modeloTabla;

    private double totalRecaudado = 0;

    public ReportePago() {
        // Título de la ventana
        setTitle("Reporte de Pagos");

        // Configuración básica de la ventana
        setLayout(new BorderLayout());
        setSize(600, 600); // Ajuste de tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear la fecha, hora y año
        crearEncabezado();

        // Crear la tabla para mostrar los pagos
        crearTabla();

        // Crear el formulario para ingresar datos
        crearFormulario();

        // Mostrar la ventana
        setVisible(true);
    }

    // Método para crear la parte superior con la fecha, hora y año
    private void crearEncabezado() {
        JPanel panelEncabezado = new JPanel();
        panelEncabezado.setLayout(new FlowLayout(FlowLayout.LEFT));

        // Fecha y hora
        SimpleDateFormat fechaFormato = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat horaFormato = new SimpleDateFormat("HH:mm");
        String fecha = fechaFormato.format(new Date());
        String hora = horaFormato.format(new Date());
        String año = String.valueOf(java.time.Year.now());

        lblFecha = new JLabel("Fecha: " + fecha);
        lblHora = new JLabel("Hora: " + hora);
        lblAño = new JLabel("Año: " + año);

        panelEncabezado.add(lblFecha);
        panelEncabezado.add(lblHora);
        panelEncabezado.add(lblAño);

        // Agregar el panel superior a la ventana
        add(panelEncabezado, BorderLayout.NORTH);
    }

    // Método para crear la tabla donde se mostrarán los registros
    private void crearTabla() {
        String[] columnas = {"Nombre Completo", "Total Pagado", "Falta Pagar"};
        modeloTabla = new DefaultTableModel(columnas, 0);
        tabla = new JTable(modeloTabla);

        JScrollPane scroll = new JScrollPane(tabla);
        add(scroll, BorderLayout.CENTER);
    }

    // Método para crear el formulario donde el usuario puede ingresar los datos
    private void crearFormulario() {
        JPanel panelFormulario = new JPanel();
        panelFormulario.setLayout(new GridLayout(5, 2)); // Cuatro filas y dos columnas

        JLabel lblNombre = new JLabel("Nombre Completo:");
        txtNombre = new JTextField();

        JLabel lblTotalPagado = new JLabel("Total Pagado:");
        txtTotalPagado = new JTextField();

        JLabel lblFaltaPagar = new JLabel("Falta Pagar:");
        txtFaltaPagar = new JTextField();

        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarRegistro();
            }
        });

        // Crear botones para guardar y limpiar
        btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarRegistro();
            }
        });

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarFormulario();
            }
        });

        // Agregar los componentes al panel
        panelFormulario.add(lblNombre);
        panelFormulario.add(txtNombre);
        panelFormulario.add(lblTotalPagado);
        panelFormulario.add(txtTotalPagado);
        panelFormulario.add(lblFaltaPagar);
        panelFormulario.add(txtFaltaPagar);
        panelFormulario.add(new JLabel()); // Espacio vacío
        panelFormulario.add(btnAgregar);
        panelFormulario.add(new JLabel()); // Espacio vacío
        panelFormulario.add(btnGuardar);
        panelFormulario.add(new JLabel()); // Espacio vacío
        panelFormulario.add(btnLimpiar);

        // Panel para el total recaudado
        lblTotalRecaudado = new JLabel("Total Recaudado: $0.00");
        panelFormulario.add(lblTotalRecaudado);

        // Agregar el panel formulario al borde sur (debajo de la tabla)
        add(panelFormulario, BorderLayout.SOUTH);
    }

    // Método para agregar un registro y calcular el total recaudado
    private void agregarRegistro() {
        String nombre = txtNombre.getText();
        double totalPagado = Double.parseDouble(txtTotalPagado.getText());
        double faltaPagar = Double.parseDouble(txtFaltaPagar.getText());

        // Agregar el registro a la tabla
        modeloTabla.addRow(new Object[]{nombre, "$" + totalPagado, "$" + faltaPagar});

        // Actualizar el total recaudado
        totalRecaudado += totalPagado;
        lblTotalRecaudado.setText("Total Recaudado: $" + totalRecaudado);

        // Limpiar los campos
        limpiarFormulario();
    }

    // Método para guardar el registro (en este caso, solo muestra un mensaje)
    private void guardarRegistro() {
        JOptionPane.showMessageDialog(this, "Registros guardados correctamente.");
        // Aquí puedes agregar la lógica para guardar los registros en un archivo o base de datos.
    }

    // Método para limpiar los campos del formulario
    private void limpiarFormulario() {
        txtNombre.setText("");
        txtTotalPagado.setText("");
        txtFaltaPagar.setText("");
    }

    public static void main(String[] args) {
        new ReportePago();
    }
}
