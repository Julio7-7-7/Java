package Interfaces;

import clases.GDetInsumo;
import javax.swing.table.DefaultTableModel;

public class FDetalleInsumo extends javax.swing.JFrame {

   
    public FDetalleInsumo() {
        initComponents();
     
         
       this.setLocationRelativeTo(null);
    
       GDetInsumo objetodetalleinsumo = new GDetInsumo();
      objetodetalleinsumo.mostrarDetalleInsumo(tabladetalle);
    
       objetodetalleinsumo.mostrarTrab(CBidtrabajo);        
       
        objetodetalleinsumo.mostraRinsum(CBidinsumo);
        
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CBidtrabajo = new javax.swing.JComboBox<>();
        CBidinsumo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        BTguardar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladetalle = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        idtrabajo = new javax.swing.JTextField();
        idinsumo = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("IDTRABAJO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        CBidtrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBidtrabajoActionPerformed(evt);
            }
        });
        jPanel1.add(CBidtrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 167, -1));

        CBidinsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBidinsumoActionPerformed(evt);
            }
        });
        jPanel1.add(CBidinsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 167, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("IDINSUMO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CANTIDAD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        Cantidad.setBackground(new java.awt.Color(0, 102, 255));
        Cantidad.setBorder(null);
        Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadActionPerformed(evt);
            }
        });
        jPanel1.add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 164, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/page_delete.png"))); // NOI18N
        jButton1.setText("LIMPIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 40));

        BTguardar.setBackground(new java.awt.Color(0, 0, 0));
        BTguardar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        BTguardar.setForeground(new java.awt.Color(255, 255, 255));
        BTguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/disk.png"))); // NOI18N
        BTguardar.setText("GUARDAR");
        BTguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTguardarActionPerformed(evt);
            }
        });
        jPanel1.add(BTguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, 40));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/delete.png"))); // NOI18N
        jButton3.setText("ELIMINAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, 40));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/page_delete.png"))); // NOI18N
        jButton4.setText("MODIFICAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, 40));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 160, 20));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DETALLE DE INSUMO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ODONTO_1.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 220, 190));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 330, 540));

        tabladetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDTRABAJO", "IDINSUMO", "CANTIDAD"
            }
        ));
        tabladetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabladetalleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabladetalle);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 460, 450));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel4.setText("BUSCAR");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 110, -1));

        idtrabajo.setText("jTextField2");
        jPanel2.add(idtrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 160, -1));

        idinsumo.setText("jTextField3");
        jPanel2.add(idinsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 160, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 230, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        limpiardatos();
        
    }                                         
     public void limpiardatos()  {
    idtrabajo.setText("");
    idinsumo.setText("");
    Cantidad.setText("");
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CBidtrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBidtrabajoActionPerformed
          CBidtrabajo.addActionListener(e -> idtrabajo.setText((String) CBidtrabajo.getSelectedItem()));
           
    }//GEN-LAST:event_CBidtrabajoActionPerformed

    private void BTguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTguardarActionPerformed
   GDetInsumo objetodetalleinsumo = new GDetInsumo();
       objetodetalleinsumo.insertarDetInsumo(idtrabajo, idinsumo, Cantidad);
        objetodetalleinsumo.mostrarDetalleInsumo(tabladetalle);        
    }//GEN-LAST:event_BTguardarActionPerformed

    private void CBidinsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBidinsumoActionPerformed
        CBidinsumo.addActionListener(e -> idinsumo.setText((String) CBidinsumo.getSelectedItem()));
    }//GEN-LAST:event_CBidinsumoActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tabladetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabladetalleMouseClicked
          GDetInsumo objetodetalleinsumo = new GDetInsumo();
        objetodetalleinsumo.seleccionarDetInsumo(tabladetalle, idtrabajo, idinsumo, Cantidad);
    }//GEN-LAST:event_tabladetalleMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        GDetInsumo objetodetalleinsumo = new GDetInsumo();
        objetodetalleinsumo.modificarDetInsumo(idtrabajo,idinsumo, Cantidad);
        objetodetalleinsumo.mostrarDetalleInsumo(tabladetalle);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            GDetInsumo objetodetalleinsumo = new GDetInsumo();
        objetodetalleinsumo.eliminardetalleinsumo(idtrabajo,idinsumo);
        objetodetalleinsumo.mostrarDetalleInsumo(tabladetalle);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(FDetalleInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FDetalleInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FDetalleInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FDetalleInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FDetalleInsumo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTguardar;
    private javax.swing.JComboBox<String> CBidinsumo;
    private javax.swing.JComboBox<String> CBidtrabajo;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextField idinsumo;
    private javax.swing.JTextField idtrabajo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabladetalle;
    // End of variables declaration//GEN-END:variables
}
