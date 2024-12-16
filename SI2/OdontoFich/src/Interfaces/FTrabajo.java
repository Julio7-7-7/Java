package Interfaces;

import clases.GTrabajo;
import java.awt.Color;

public class FTrabajo extends javax.swing.JFrame {

    /**
     * Creates new form TRABAJO
     */
    public FTrabajo() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    
        GTrabajo objetotrabajo = new GTrabajo();
         objetotrabajo.mostrarTrabajo(tblistaTrabajo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid_trabajo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtprecio_unidad = new javax.swing.JTextField();
        btGuardar = new javax.swing.JButton();
        BtModificar = new javax.swing.JButton();
        BtEliminar = new javax.swing.JButton();
        BtLimpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblistaTrabajo = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TRABAJOS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID DE TRABAJO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRECIO UNIDAD");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        txtid_trabajo.setBackground(new java.awt.Color(0, 102, 255));
        txtid_trabajo.setBorder(null);
        txtid_trabajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtid_trabajoMousePressed(evt);
            }
        });
        txtid_trabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtid_trabajoActionPerformed(evt);
            }
        });
        jPanel2.add(txtid_trabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 189, 20));

        txtnombre.setBackground(new java.awt.Color(0, 102, 255));
        txtnombre.setBorder(null);
        txtnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtnombreMousePressed(evt);
            }
        });
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        jPanel2.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 189, 20));

        txtprecio_unidad.setBackground(new java.awt.Color(0, 102, 255));
        txtprecio_unidad.setBorder(null);
        txtprecio_unidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtprecio_unidadMousePressed(evt);
            }
        });
        txtprecio_unidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecio_unidadActionPerformed(evt);
            }
        });
        jPanel2.add(txtprecio_unidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 188, 20));

        btGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btGuardar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/disk.png"))); // NOI18N
        btGuardar.setText("GUARDAR");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 139, 50));

        BtModificar.setBackground(new java.awt.Color(0, 0, 0));
        BtModificar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        BtModificar.setForeground(new java.awt.Color(255, 255, 255));
        BtModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/page_edit.png"))); // NOI18N
        BtModificar.setText("MODIFICAR");
        BtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtModificarActionPerformed(evt);
            }
        });
        jPanel2.add(BtModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, 50));

        BtEliminar.setBackground(new java.awt.Color(0, 0, 0));
        BtEliminar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        BtEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BtEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/delete.png"))); // NOI18N
        BtEliminar.setText("ALIMINAR");
        BtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(BtEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, 50));

        BtLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        BtLimpiar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        BtLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        BtLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/page_delete.png"))); // NOI18N
        BtLimpiar.setText("LIMPIAR");
        BtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(BtLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 139, 50));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 170, 10));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 160, 10));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 150, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ODONTO_1.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 210, 190));

        tblistaTrabajo.setBackground(new java.awt.Color(204, 204, 204));
        tblistaTrabajo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "PRECIO UNIDAD"
            }
        ));
        tblistaTrabajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblistaTrabajoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblistaTrabajo);
        if (tblistaTrabajo.getColumnModel().getColumnCount() > 0) {
            tblistaTrabajo.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblistaTrabajo.getColumnModel().getColumn(1).setPreferredWidth(80);
            tblistaTrabajo.getColumnModel().getColumn(2).setPreferredWidth(80);
        }

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("BUSCAR");

        buscar.setForeground(new java.awt.Color(204, 204, 204));
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buscarMousePressed(evt);
            }
        });
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6)
                        .addGap(30, 30, 30)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed

        GTrabajo objetotrabajo = new GTrabajo();
        objetotrabajo.insertarTrabajo(txtid_trabajo, txtnombre, txtprecio_unidad);
        objetotrabajo.mostrarTrabajo(tblistaTrabajo);
        
    }//GEN-LAST:event_btGuardarActionPerformed

    private void BtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEliminarActionPerformed
         GTrabajo objetotrabajo = new GTrabajo();
        objetotrabajo.eliminarTrabajo(txtid_trabajo);
        objetotrabajo.mostrarTrabajo(tblistaTrabajo);
        
        
    }//GEN-LAST:event_BtEliminarActionPerformed

    private void txtid_trabajoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtid_trabajoMousePressed
      
       
    }//GEN-LAST:event_txtid_trabajoMousePressed

    private void txtid_trabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtid_trabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtid_trabajoActionPerformed

    private void txtnombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombreMousePressed
       
    }//GEN-LAST:event_txtnombreMousePressed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtprecio_unidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecio_unidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecio_unidadActionPerformed

    private void txtprecio_unidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtprecio_unidadMousePressed
      
    }//GEN-LAST:event_txtprecio_unidadMousePressed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void buscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMousePressed
        
    }//GEN-LAST:event_buscarMousePressed

    private void tblistaTrabajoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblistaTrabajoMouseClicked
      
         GTrabajo objetotrabajo = new GTrabajo();
        objetotrabajo.seleccionarTrabajo(tblistaTrabajo, txtid_trabajo, txtnombre, txtprecio_unidad);
        
    }//GEN-LAST:event_tblistaTrabajoMouseClicked

    private void BtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtModificarActionPerformed
        GTrabajo objetotrabajo = new GTrabajo();
        objetotrabajo.modificarTrabajo(txtid_trabajo,txtnombre, txtprecio_unidad);
        objetotrabajo.mostrarTrabajo(tblistaTrabajo);
    }//GEN-LAST:event_BtModificarActionPerformed

    private void BtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimpiarActionPerformed
     
        limpiardatos();
        
    }//GEN-LAST:event_BtLimpiarActionPerformed
     public void limpiardatos()  {
    txtid_trabajo.setText("");
    txtnombre.setText("");
    txtprecio_unidad.setText("");
    }
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
            java.util.logging.Logger.getLogger(FTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FTrabajo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtEliminar;
    private javax.swing.JButton BtLimpiar;
    private javax.swing.JButton BtModificar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JTextField buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tblistaTrabajo;
    private javax.swing.JTextField txtid_trabajo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio_unidad;
    // End of variables declaration//GEN-END:variables
}
