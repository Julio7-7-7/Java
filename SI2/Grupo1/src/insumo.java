

import com.sun.jdi.connect.spi.Connection;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import javax.lang.model.util.Types;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class insumo extends javax.swing.JPanel{
 
    // Constructor
   
    /**
     * Creates new form insumo
     */
    public insumo() {
        initComponents();
       
    }
  
private void obtenerIdsDeLaTablaYEnviarAlInventario() {
    DefaultTableModel model = (DefaultTableModel) tablaInsumo.getModel();
    int rowCount = model.getRowCount(); // Obtener la cantidad de filas en la tabla

    ArrayList<String> idsInsumos = new ArrayList<>(); // Lista para almacenar los IDs

    // Recorrer las filas de la tabla
    for (int i = 0; i < rowCount; i++) {
        // Obtener el valor de la celda en la primera columna (índice 0)
        Object value = model.getValueAt(i, 0);

        // Verificar que el valor no sea nulo, vacío o solo contenga espacios
        if (value != null && !value.toString().trim().isEmpty()) {
            String idInsumo = value.toString().trim(); // Eliminar espacios antes y después
            idsInsumos.add(idInsumo); // Agregar el ID a la lista
            System.out.println("ID en fila " + i + ": " + idInsumo); // Depuración
        } else {
            System.out.println("Valor nulo o vacío en fila " + i); // Depuración
        }
    }

    // Mostrar la lista de IDs por consola para ver qué se ha añadido
    System.out.println("Lista de IDs: " + idsInsumos);
 inventario inventariof =new inventario();
    // Actualizar el JComboBox solo si hay elementos en la lista
    if (!idsInsumos.isEmpty()) {
        inventariof.setJComboBoxInsumos(idsInsumos); // Llamar al método para actualizar el JComboBox
    } else {
        System.out.println("No hay IDs para mostrar.");
    }
}





   

private void registrarInsumo() {
  String sql = "SELECT public.registrar_insumo(?, ?, CAST(? AS DECIMAL(10, 2)), ?)"; 


java.sql.Connection conn = new CConexion().getConexion();

if (conn != null) { 
    try (var pstmt = conn.prepareStatement(sql)) {
       
        String idInsumo = txtIdInsumo.getText();
        pstmt.setString(1, idInsumo); // id_insumo

       
        String nombreInsumo = txtNombre.getText();
        pstmt.setString(2, nombreInsumo); // nombre

        double precioInsumo = 0;
        try {
            precioInsumo = Double.parseDouble(txtPrecio.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El precio debe ser un número válido.");
            return; 
        }
        pstmt.setString(3, precioInsumo+""); // precio

       
        String dosificacionInsumo = txtDosificacion.getText();
        pstmt.setString(4, dosificacionInsumo); // dosificacion
        
        // Ejecutar la función
        pstmt.execute();
        JOptionPane.showMessageDialog(null, "Insumo registrado exitosamente.");
    } catch (Exception e) {
        e.printStackTrace();
       // JOptionPane.showMessageDialog(null, "Error al registrar insumo: " + e.getMessage());
    }
} else {
    JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
}

}




  
  private void cancelarRegistro() {
        int opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea cancelar?", "Cancelar", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            limpiarCampos();
        }
    }
private void limpiarCampos() {
        txtIdInsumo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtDosificacion.setText("");
    }

// Método para agregar datos a la tabla
private void agregarInsumoATabla() {
    // Obtener los valores de los JTextField
    String idInsumo = txtIdInsumo.getText();
    String nombreInsumo = txtNombre.getText();
    String precioInsumoStr = txtPrecio.getText();
    String dosificacionInsumo = txtDosificacion.getText();

    // Validar que el precio sea un número válido
    double precioInsumo = 0;
    try {
        precioInsumo = Double.parseDouble(precioInsumoStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El precio debe ser un número válido.");
        return; // Salir si el precio no es válido
    }

    // Crear un arreglo con los valores
    Object[] row = {idInsumo, nombreInsumo, precioInsumo, dosificacionInsumo};

    // Agregar la fila al modelo de la tabla
    DefaultTableModel model = (DefaultTableModel) tablaInsumo.getModel();
    model.insertRow(0, row);

}
 private void cambiarAPanelInventario() {
        // Cambiar al panel "inventario" usando CardLayout
        CardLayout layout = (CardLayout) getParent().getLayout(); // Obtener el layout del padre
        layout.show(getParent(), "inventario");  // Cambiar al panel inventario
    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDosificacion = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        txtIdInsumo = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtPrecio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnCancelar1 = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaInsumo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("REGISTRAR INSUMO !");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("ID INSUMO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("NOMBRE");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("PRECIO");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 30));

        txtDosificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDosificacionActionPerformed(evt);
            }
        });
        jPanel2.add(txtDosificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 170, -1));

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, 100, 30));

        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel2.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 580, 80, 30));
        jPanel2.add(txtIdInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 170, -1));

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 100, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 170, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 170, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("DOSIFICACION");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, 20));

        btnCancelar1.setText("CANCELAR");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 110, 30));

        btnInventario.setText("INVENTARIO");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        jPanel2.add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        tablaInsumo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID INSUMO", "NOMBRE", "PRECIO", "DOSIFICACION"
            }
        ));
        jScrollPane2.setViewportView(tablaInsumo);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 200));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 480, 660));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vector.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vector1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tools.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/welcome image.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtDosificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDosificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDosificacionActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        registrarInsumo();
        agregarInsumoATabla();
        obtenerIdsDeLaTablaYEnviarAlInventario();
      
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        // TODO add your handling code here:
         cancelarRegistro();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
      cambiarAPanelInventario();       
        
    }//GEN-LAST:event_btnInventarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaInsumo;
    private javax.swing.JTextField txtDosificacion;
    private javax.swing.JTextField txtIdInsumo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables


        
}
