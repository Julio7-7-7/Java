/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
 import  java.util.Date;

public class adicona extends javax.swing.JFrame {
 

    /**
     * Creates new form adicona
     */
    public adicona() {
        initComponents(); 
        cargarInsumosEnComboBox();  
    }
    
    private void cargarInsumosEnComboBox() {
        String sql = "SELECT id_insumo FROM insumo"; // Consulta SQL

       
        Connection conn = new CConexion().getConexion();

        if (conn != null) {
            try (PreparedStatement pstmt = conn.prepareStatement(sql);
                 ResultSet rs = pstmt.executeQuery()) {

                jcombox.removeAllItems(); 

                while (rs.next()) {
                    String idInsumo = rs.getString("id_insumo");
                    jcombox.addItem(idInsumo); 
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cargar insumos: " + e.getMessage());
                e.printStackTrace();
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
     
    DefaultTableModel model = (DefaultTableModel) tablaAdicional.getModel();
    model.setRowCount(0); 
    }
    
    private void limpiarCampos() {
        jtcosto.setText("");
        idRegist.setText("");
        cantidadAdi.setText("");
        fechaAdi.setText("");
    }
 private void agregarInsumoATabla() {
    // Obtener los valores de los JTextField
    String idRegistro = idRegist.getText();
    String cantidadadi = cantidadAdi.getText();
    String costoAdi = jtcosto.getText();
    String fechaAdis = fechaAdi.getText();

    // Validar la fecha
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    sdf.setLenient(false);
    java.util.Date fechaDate = null;
    try {
        fechaDate = sdf.parse(fechaAdis);  // Convertir el String a Date
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida. Use el formato dd/MM/yyyy.");
        return; 
    }

    // Convertir java.util.Date a java.sql.Date para insertar en la base de datos
    java.sql.Date fechaSql = new java.sql.Date(fechaDate.getTime());

    // Verificar si el insumo seleccionado es válido
    String insumoSeleccionado = (String) jcombox.getSelectedItem(); 
    if (insumoSeleccionado == null || insumoSeleccionado.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione un insumo.");
        return; 
    }

    // Validar y convertir cantidad a Integer
    int cantidad = 0;
    try {
        cantidad = Integer.parseInt(cantidadadi); // Intentar convertir a Integer
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "La cantidad ingresada no es un número válido.");
        return; 
    }

    // Validar y convertir costo a Double (tipo numérico)
    double costo = 0.0;
    try {
        costo = Double.parseDouble(costoAdi); // Intentar convertir a Double
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El costo ingresado no es un número válido.");
        return; 
    }

    // Agregar a la tabla de la interfaz gráfica
    Object[] row = {idRegistro, insumoSeleccionado, cantidad, costo, fechaAdis};
    DefaultTableModel model = (DefaultTableModel) tablaAdicional.getModel();
    model.insertRow(0, row); 

    // Insertar los datos en la base de datos
    String sqlInsert = "INSERT INTO detalle_adicional (id_registro, id_insumo, cantidad, costo, fecha) VALUES (?, ?, ?, ?, ?)";

    // Obtener la conexión a la base de datos
    try (Connection conn = new CConexion().getConexion(); 
         PreparedStatement pstmtInsert = conn.prepareStatement(sqlInsert)) {

        // Establecer los valores en la consulta SQL
        pstmtInsert.setString(1, idRegistro);
        pstmtInsert.setString(2, insumoSeleccionado);  // Aquí es posible que debas extraer solo el ID si insumoSeleccionado tiene más información
        pstmtInsert.setInt(3, cantidad); // Convertir cantidad a Integer para la base de datos
        pstmtInsert.setDouble(4, costo); // Convertir costo a Double para la base de datos
        pstmtInsert.setDate(5, fechaSql);

        // Ejecutar la inserción
        int rowsAffected = pstmtInsert.executeUpdate();  // Ejecuta la actualización
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Datos insertados correctamente en la base de datos.");
        } else {
            JOptionPane.showMessageDialog(null, "Error al insertar los datos en la base de datos.");
            return;
        }

        // Disminuir el stock después de la inserción
        String sqlStock = "UPDATE inventario SET stock = stock - ? WHERE id_insumo = ?";

        // Ejecutar la actualización de stock
        try (PreparedStatement pstmtStock = conn.prepareStatement(sqlStock)) {
            pstmtStock.setInt(1, cantidad);  // Establecer la cantidad a restar
            pstmtStock.setString(2, insumoSeleccionado); // El ID del insumo

            // Ejecutar la actualización del stock
            int rowsUpdated = pstmtStock.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Stock actualizado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el stock.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el stock: " + e.getMessage());
            e.printStackTrace();
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al insertar los datos: " + e.getMessage());
        e.printStackTrace();
    }
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
        cantidadAdi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fechaAdi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jtcosto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        idRegist = new javax.swing.JTextField();
        jcombox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAdicional = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("REGISTRAR ADICIONAL !");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("INSUMO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("COSTO");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("CANTIDAD");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        cantidadAdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadAdiActionPerformed(evt);
            }
        });
        jPanel2.add(cantidadAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 170, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("FECHA");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));
        jPanel2.add(fechaAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 170, -1));

        jButton1.setText("CANCELAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 110, 30));

        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 90, 30));

        jButton3.setText("REGISTRAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 580, 100, 30));

        jButton4.setText("ATRAS");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 580, 80, 30));

        jtcosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtcostoActionPerformed(evt);
            }
        });
        jPanel2.add(jtcosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 170, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("ID REGISTRO");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));
        jPanel2.add(idRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 170, 30));

        jcombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboxActionPerformed(evt);
            }
        });
        jPanel2.add(jcombox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 250, 30));

        tablaAdicional.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID REGISTRO", "ID INSUMO", "CANTIDAD ", "COSTO", "FECHA"
            }
        ));
        jScrollPane2.setViewportView(tablaAdicional);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 180));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 480, 660));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vector.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vector1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Component 2.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantidadAdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadAdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadAdiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cancelarRegistro();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtcostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtcostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtcostoActionPerformed

    private void jcomboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jcomboxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        agregarInsumoATabla();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adicona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adicona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adicona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adicona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adicona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidadAdi;
    private javax.swing.JTextField fechaAdi;
    private javax.swing.JTextField idRegist;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcombox;
    private javax.swing.JTextField jtcosto;
    private javax.swing.JTable tablaAdicional;
    // End of variables declaration//GEN-END:variables
}
