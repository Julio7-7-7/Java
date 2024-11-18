package Interfaces;

import clases.GInsumo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import clases.GPersonal;

public class FPeronsal extends javax.swing.JFrame {
 private GPersonal ClasePersonal;
    /**
     * Creates new form person
     */
    public FPeronsal() {
        initComponents();
        ClasePersonal= new GPersonal();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edadTexto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cargoTexto = new javax.swing.JTextField();
        idPersonal = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        nombreTexto = new javax.swing.JTextField();
        telTexto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPersonal = new javax.swing.JTable();
        guardarCam = new javax.swing.JButton();
        guardaBaseD = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("REGISTRAR PERSONAL");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("ID PERSONAL");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("EDAD");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("CARGO");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 30));

        edadTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadTextoActionPerformed(evt);
            }
        });
        jPanel2.add(edadTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 170, -1));

        jButton1.setText("CANCELAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 110, 30));

        jButton3.setText("MODIFICAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 100, 30));

        jButton4.setText("ATRAS");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 580, 80, 30));
        jPanel2.add(cargoTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 170, 30));
        jPanel2.add(idPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 170, -1));

        jButton6.setText("REGISTRAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 100, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("NOMBRE");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, 20));

        nombreTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextoActionPerformed(evt);
            }
        });
        jPanel2.add(nombreTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 170, -1));

        telTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telTextoActionPerformed(evt);
            }
        });
        jPanel2.add(telTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 170, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("TELEFONO");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, 20));

        jButton5.setText("LIMPIAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/get-a-job-promotion.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 220, 200));

        tablaPersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID PERSONAL", "NOMBRE", "CARGO", "TELEFONO", "EDAD"
            }
        ));
        jScrollPane2.setViewportView(tablaPersonal);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 210));

        guardarCam.setText("GUARDAR CAMBIOS");
        guardarCam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCamActionPerformed(evt);
            }
        });
        jPanel2.add(guardarCam, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 160, 30));

        guardaBaseD.setText("GUARDAR TODO ");
        guardaBaseD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardaBaseDActionPerformed(evt);
            }
        });
        jPanel2.add(guardaBaseD, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 620, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 480, 660));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/image44.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 120, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vector 4.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edadTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadTextoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      ClasePersonal.cancelarRegistro(tablaPersonal, idPersonal, nombreTexto, cargoTexto, telTexto, edadTexto);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         int filaSeleccionada = tablaPersonal.getSelectedRow(); 

    if (filaSeleccionada != -1) {
        ClasePersonal.mostrarDatosEnCampos(filaSeleccionada, tablaPersonal, idPersonal, nombreTexto, cargoTexto, telTexto, edadTexto);
      
    } else {
        JOptionPane.showMessageDialog(null, "Selecciona una fila para modificar.");
    }
        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        ClasePersonal.agregarPersonalATabla(tablaPersonal, idPersonal, nombreTexto, cargoTexto, telTexto, edadTexto);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void nombreTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextoActionPerformed

    private void telTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telTextoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       ClasePersonal.limpiarCampos(idPersonal, nombreTexto, cargoTexto, telTexto, edadTexto);
       ClasePersonal.limpiarTabla(tablaPersonal);      
    }//GEN-LAST:event_jButton5ActionPerformed

    private void guardarCamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCamActionPerformed
        // TODO add your handling code here:
              int filaSeleccionada = tablaPersonal.getSelectedRow(); 

    if (filaSeleccionada != -1) {
        ClasePersonal.modificarDatos(filaSeleccionada, tablaPersonal, idPersonal, nombreTexto, cargoTexto, telTexto, edadTexto);
      
    } 
    ClasePersonal.limpiarCampos(idPersonal, nombreTexto, cargoTexto, telTexto, edadTexto);
  
    }//GEN-LAST:event_guardarCamActionPerformed

    private void guardaBaseDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardaBaseDActionPerformed
        // TODO add your handling code here:
        ClasePersonal.insertarEnBaseDeDatos();
    }//GEN-LAST:event_guardaBaseDActionPerformed

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
            java.util.logging.Logger.getLogger(FAdicional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FAdicional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FAdicional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FAdicional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPeronsal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cargoTexto;
    private javax.swing.JTextField edadTexto;
    private javax.swing.JButton guardaBaseD;
    private javax.swing.JButton guardarCam;
    private javax.swing.JTextField idPersonal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombreTexto;
    private javax.swing.JTable tablaPersonal;
    private javax.swing.JTextField telTexto;
    // End of variables declaration//GEN-END:variables
}
