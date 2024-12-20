package Interfaces;
import clases.GRegistroAcademico;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
public class FRegistroAcademico extends javax.swing.JFrame {

    public FRegistroAcademico() {
        initComponents();
     setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        registro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        grupo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        sigla = new javax.swing.JTextField();
        gestion = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        GUARDAR = new javax.swing.JButton();
        ACTUALIZAR = new javax.swing.JButton();
        LIMPIAR = new javax.swing.JButton();
        LISTA = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        BUSCAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblistaregistroacad = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Bk", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Bk", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ACADEMICO");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        registro.setBackground(new java.awt.Color(0, 102, 255));
        registro.setForeground(new java.awt.Color(204, 204, 204));
        registro.setText("12345678");
        registro.setBorder(null);
        registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registroMousePressed(evt);
            }
        });
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });
        jPanel2.add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 150, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 150, 10));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SIGLA");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 150, 10));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("GRUPO");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        grupo.setBackground(new java.awt.Color(0, 102, 255));
        grupo.setForeground(new java.awt.Color(204, 204, 204));
        grupo.setText("OC");
        grupo.setBorder(null);
        grupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                grupoMousePressed(evt);
            }
        });
        grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupoActionPerformed(evt);
            }
        });
        jPanel2.add(grupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 150, -1));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 150, 10));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GESTION");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        sigla.setBackground(new java.awt.Color(0, 102, 255));
        sigla.setForeground(new java.awt.Color(204, 204, 204));
        sigla.setText("ABC-123");
        sigla.setBorder(null);
        sigla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                siglaMousePressed(evt);
            }
        });
        sigla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siglaActionPerformed(evt);
            }
        });
        jPanel2.add(sigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 150, -1));

        gestion.setBackground(new java.awt.Color(0, 102, 255));
        gestion.setForeground(new java.awt.Color(204, 204, 204));
        gestion.setText("1/2024");
        gestion.setBorder(null);
        gestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gestionMousePressed(evt);
            }
        });
        gestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionActionPerformed(evt);
            }
        });
        jPanel2.add(gestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 150, -1));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 150, 10));

        GUARDAR.setBackground(new java.awt.Color(0, 0, 0));
        GUARDAR.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        GUARDAR.setForeground(new java.awt.Color(255, 255, 255));
        GUARDAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/disk.png"))); // NOI18N
        GUARDAR.setText("GUARDAR");
        GUARDAR.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        GUARDAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUARDAR.setFocusPainted(false);
        GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDARActionPerformed(evt);
            }
        });
        jPanel2.add(GUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 130, 30));

        ACTUALIZAR.setBackground(new java.awt.Color(0, 0, 0));
        ACTUALIZAR.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ACTUALIZAR.setForeground(new java.awt.Color(255, 255, 255));
        ACTUALIZAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/page_refresh.png"))); // NOI18N
        ACTUALIZAR.setText("ACTUALIZAR");
        ACTUALIZAR.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ACTUALIZAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ACTUALIZAR.setFocusPainted(false);
        ACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTUALIZARActionPerformed(evt);
            }
        });
        jPanel2.add(ACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 140, 30));

        LIMPIAR.setBackground(new java.awt.Color(0, 0, 0));
        LIMPIAR.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        LIMPIAR.setForeground(new java.awt.Color(255, 255, 255));
        LIMPIAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/page_delete.png"))); // NOI18N
        LIMPIAR.setText("LIMPIAR");
        LIMPIAR.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        LIMPIAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LIMPIAR.setFocusPainted(false);
        LIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARActionPerformed(evt);
            }
        });
        jPanel2.add(LIMPIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 140, 30));

        LISTA.setBackground(new java.awt.Color(0, 0, 0));
        LISTA.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        LISTA.setForeground(new java.awt.Color(255, 255, 255));
        LISTA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/page_edit.png"))); // NOI18N
        LISTA.setText("LISTA");
        LISTA.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        LISTA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LISTA.setFocusPainted(false);
        LISTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LISTAActionPerformed(evt);
            }
        });
        jPanel2.add(LISTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 130, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ODONTO_1.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 220, 200));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FSL102", "MOR101", "MOR103", "MOR104", "SLP105", "EST208", "FSL203", "FST204", "MOR201", "PAT205", "PAT206", "PAT207", "SLP202", "EST301", "EST303", "EST305", "EST307", "PAT302", "PAT304", "PAT306", "PAT308", "EST401", "EST402", "EST403", "EST404", "EST405", "EST406", "EST407", "EST408", "EST501", "EST502", "EST503", "EST504", "EST505", "EST506", "EST507", "EST508", "GDI001", "GRL001" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 160, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 590));

        BUSCAR.setBackground(new java.awt.Color(255, 255, 255));
        BUSCAR.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        BUSCAR.setForeground(new java.awt.Color(0, 0, 0));
        BUSCAR.setText("BUSCAR");
        BUSCAR.setBorder(null);
        BUSCAR.setBorderPainted(false);
        BUSCAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BUSCAR.setFocusPainted(false);
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });
        jPanel1.add(BUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        tblistaregistroacad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblistaregistroacad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblistaregistroacadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblistaregistroacad);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 500, 510));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 250, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registroActionPerformed

    private void siglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siglaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siglaActionPerformed

    private void grupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grupoActionPerformed

    private void gestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionActionPerformed
         
    }//GEN-LAST:event_gestionActionPerformed

    private void GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUARDARActionPerformed
        GRegistroAcademico objetoAcademico = new GRegistroAcademico();
        objetoAcademico.insertarRegistroAcademico(registro, sigla, grupo, gestion);
        objetoAcademico.mostrarRegistroAcademico(tblistaregistroacad);   
    }//GEN-LAST:event_GUARDARActionPerformed

    private void registroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroMousePressed
        registro.setText("");
        registro.setForeground(Color.black);
    }//GEN-LAST:event_registroMousePressed

    private void siglaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siglaMousePressed
        sigla.setText("");
        sigla.setForeground(Color.black);
    }//GEN-LAST:event_siglaMousePressed

    private void grupoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grupoMousePressed
        grupo.setText("");
        grupo.setForeground(Color.black);
    }//GEN-LAST:event_grupoMousePressed

    private void gestionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionMousePressed
        gestion.setText("");
        gestion.setForeground(Color.black);
    }//GEN-LAST:event_gestionMousePressed

    private void LISTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LISTAActionPerformed
       GRegistroAcademico objetoAcademico = new GRegistroAcademico();
        objetoAcademico.mostrarRegistroAcademico(tblistaregistroacad);
    }//GEN-LAST:event_LISTAActionPerformed

    private void tblistaregistroacadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblistaregistroacadMouseClicked
        GRegistroAcademico objetoAcademico = new GRegistroAcademico();
        objetoAcademico.seleccionarRegistroAcademico(tblistaregistroacad, registro, sigla, grupo, gestion);

    }//GEN-LAST:event_tblistaregistroacadMouseClicked

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed
       registro.setText("");
        sigla.setText("");
        grupo.setText("");
        gestion.setText("");
        DefaultTableModel modeloTabla = (DefaultTableModel) tblistaregistroacad.getModel();
        modeloTabla.setRowCount(0);

    }//GEN-LAST:event_LIMPIARActionPerformed

    private void ACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTUALIZARActionPerformed
        GRegistroAcademico objetoRegistroAcademico = new GRegistroAcademico();
        objetoRegistroAcademico.modificarRegistroAcademico(registro, sigla, grupo, gestion);
        objetoRegistroAcademico.mostrarRegistroAcademico(tblistaregistroacad);

    }//GEN-LAST:event_ACTUALIZARActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
        GRegistroAcademico objetoRegistroAcademico = new GRegistroAcademico();
        objetoRegistroAcademico.buscarRegistroAcademico(registro, tblistaregistroacad);

    }//GEN-LAST:event_BUSCARActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        sigla.setText(jComboBox1.getItemAt(WIDTH));
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(FRegistroAcademico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRegistroAcademico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRegistroAcademico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRegistroAcademico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new FRegistroAcademico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACTUALIZAR;
    private javax.swing.JButton BUSCAR;
    private javax.swing.JButton GUARDAR;
    private javax.swing.JButton LIMPIAR;
    private javax.swing.JButton LISTA;
    private javax.swing.JTextField gestion;
    private javax.swing.JTextField grupo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField registro;
    private javax.swing.JTextField sigla;
    private javax.swing.JTable tblistaregistroacad;
    // End of variables declaration//GEN-END:variables
}
