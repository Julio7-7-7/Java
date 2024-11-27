
package Interfaces;

import clases.GPlanMateria;


public class FPlanMateria extends javax.swing.JFrame {

    
    public FPlanMateria() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    
        GPlanMateria objetoplanmateria = new GPlanMateria();
      objetoplanmateria.mostrarPlanMateria(tablaplanmateria);
      
      objetoplanmateria.mostrarsigla(CBSigla);
      objetoplanmateria.mostraridtrabajo(CBidtrabajo); 
        
        
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
        CBidtrabajo = new javax.swing.JComboBox<>();
        CBSigla = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        BTguardar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Cantidad_trabajo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaplanmateria = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        IdTrabajo = new javax.swing.JTextField();
        Sigla = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("PLAN DE MATERIA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 260, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ODONTO_1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 210, 210));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SIGLA");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("IDTRABAJO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        CBidtrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBidtrabajoActionPerformed(evt);
            }
        });
        jPanel2.add(CBidtrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 167, -1));

        CBSigla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBSiglaActionPerformed(evt);
            }
        });
        jPanel2.add(CBSigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 167, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CANTIDADTRABAJO");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 120, 20));

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
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 40));

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
        jPanel2.add(BTguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, 40));

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
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, 40));

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
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, 40));

        Cantidad_trabajo.setBackground(new java.awt.Color(0, 102, 255));
        Cantidad_trabajo.setForeground(new java.awt.Color(255, 255, 255));
        Cantidad_trabajo.setBorder(null);
        jPanel2.add(Cantidad_trabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 110, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 350, 550));

        tablaplanmateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaplanmateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaplanmateriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaplanmateria);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 450, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setText("BUSCAR");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 90, 40));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 220, 30));

        IdTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTrabajoActionPerformed(evt);
            }
        });
        jPanel1.add(IdTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 170, -1));
        jPanel1.add(Sigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBidtrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBidtrabajoActionPerformed
    CBidtrabajo.addActionListener(e -> IdTrabajo.setText((String) CBidtrabajo.getSelectedItem()));
    }//GEN-LAST:event_CBidtrabajoActionPerformed

    private void CBSiglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBSiglaActionPerformed

    CBSigla.addActionListener(e -> Sigla.setText((String) CBSigla.getSelectedItem()));
    

    }//GEN-LAST:event_CBSiglaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       limpiardatos();

        }
        public void limpiardatos()  {
            Sigla.setText("");
            IdTrabajo.setText("");
            Cantidad_trabajo.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void BTguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTguardarActionPerformed
       GPlanMateria objetoplanmateria = new GPlanMateria();
       objetoplanmateria.insertarplanmateria(Sigla, IdTrabajo, Cantidad_trabajo);
       objetoplanmateria.mostrarPlanMateria(tablaplanmateria);
    }//GEN-LAST:event_BTguardarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       GPlanMateria objetoplanmateria = new GPlanMateria();
       objetoplanmateria.eliminarplanmateria(Sigla,IdTrabajo);
       objetoplanmateria.mostrarPlanMateria(tablaplanmateria);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        GPlanMateria objetoplanmateria = new GPlanMateria();
        objetoplanmateria.modificarplanmateria(Sigla,IdTrabajo, Cantidad_trabajo);
        objetoplanmateria.mostrarPlanMateria(tablaplanmateria);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void IdTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdTrabajoActionPerformed

    private void tablaplanmateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaplanmateriaMouseClicked
        GPlanMateria objetoplanmateria = new GPlanMateria();
        objetoplanmateria.seleccionarplanmateria(tablaplanmateria, Sigla, IdTrabajo, Cantidad_trabajo);
    }//GEN-LAST:event_tablaplanmateriaMouseClicked

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
            java.util.logging.Logger.getLogger(FPlanMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPlanMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPlanMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPlanMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPlanMateria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTguardar;
    private javax.swing.JComboBox<String> CBSigla;
    private javax.swing.JComboBox<String> CBidtrabajo;
    private javax.swing.JTextField Cantidad_trabajo;
    private javax.swing.JTextField IdTrabajo;
    private javax.swing.JTextField Sigla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tablaplanmateria;
    // End of variables declaration//GEN-END:variables
}
