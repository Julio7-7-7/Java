
package Interfaces;

//import clases.GDetInsumo;
import clases.GInsumo;
import clases.GTrabajo;
import java.awt.Color;


public class FInsumo extends javax.swing.JFrame {

   
    public FInsumo() {
        initComponents();
        
        
         
        this.setLocationRelativeTo(null);
    
        GInsumo objetoinsumo = new GInsumo();
         objetoinsumo.mostrarInsumo(tablainsumo);
         
   

        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid_insumo = new javax.swing.JTextField();
        txtnombre_insumo = new javax.swing.JTextField();
        txtprecio_insumo = new javax.swing.JTextField();
        btguardar = new javax.swing.JButton();
        btmodificar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btlimpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablainsumo = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INSUMOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 250, 33));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID DE INSUMO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE DE INSUMO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRECIO DE INSUMO ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        txtid_insumo.setBackground(new java.awt.Color(0, 102, 255));
        txtid_insumo.setForeground(new java.awt.Color(0, 0, 0));
        txtid_insumo.setBorder(null);
        txtid_insumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtid_insumoMousePressed(evt);
            }
        });
        txtid_insumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtid_insumoActionPerformed(evt);
            }
        });
        jPanel1.add(txtid_insumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 197, 20));

        txtnombre_insumo.setBackground(new java.awt.Color(0, 102, 255));
        txtnombre_insumo.setForeground(new java.awt.Color(0, 0, 0));
        txtnombre_insumo.setBorder(null);
        txtnombre_insumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtnombre_insumoMousePressed(evt);
            }
        });
        txtnombre_insumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre_insumoActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombre_insumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 197, -1));

        txtprecio_insumo.setBackground(new java.awt.Color(0, 102, 255));
        txtprecio_insumo.setForeground(new java.awt.Color(0, 0, 0));
        txtprecio_insumo.setBorder(null);
        txtprecio_insumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtprecio_insumoMousePressed(evt);
            }
        });
        txtprecio_insumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecio_insumoActionPerformed(evt);
            }
        });
        jPanel1.add(txtprecio_insumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 197, -1));

        btguardar.setBackground(new java.awt.Color(0, 0, 0));
        btguardar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btguardar.setForeground(new java.awt.Color(255, 255, 255));
        btguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/disk.png"))); // NOI18N
        btguardar.setText("GUARDAR");
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, 41));

        btmodificar.setBackground(new java.awt.Color(0, 0, 0));
        btmodificar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btmodificar.setForeground(new java.awt.Color(255, 255, 255));
        btmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/page_edit.png"))); // NOI18N
        btmodificar.setText("MODIFICAR");
        btmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodificarActionPerformed(evt);
            }
        });
        jPanel1.add(btmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, 41));

        bteliminar.setBackground(new java.awt.Color(0, 0, 0));
        bteliminar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        bteliminar.setForeground(new java.awt.Color(255, 255, 255));
        bteliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/delete.png"))); // NOI18N
        bteliminar.setText("ELIMINAR");
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });
        jPanel1.add(bteliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, -1, 41));

        btlimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btlimpiar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btlimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/page_delete.png"))); // NOI18N
        btlimpiar.setText("LIMPIAR");
        btlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 123, 41));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ODONTO_1.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 220, 230));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 180, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 170, -1));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 180, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 619));

        tablainsumo.setBackground(new java.awt.Color(204, 204, 204));
        tablainsumo.setForeground(new java.awt.Color(0, 0, 0));
        tablainsumo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tablainsumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablainsumoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablainsumo);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 470, 520));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("BUSCAR");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

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
        jPanel3.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 290, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablainsumoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablainsumoMouseClicked

        GInsumo objetoinsumo = new GInsumo();
        objetoinsumo.seleccionarInsumo(tablainsumo, txtid_insumo, txtnombre_insumo, txtprecio_insumo);

    }//GEN-LAST:event_tablainsumoMouseClicked

    private void btlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimpiarActionPerformed

        limpiardatos();
        }

        public void limpiardatos()  {
            txtid_insumo.setText("");
            txtnombre_insumo.setText("");
            txtprecio_insumo.setText("");

    }//GEN-LAST:event_btlimpiarActionPerformed

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed

        GInsumo objetoInsumo = new GInsumo();
        objetoInsumo.eliminarInsumo(txtid_insumo);
        objetoInsumo.mostrarInsumo(tablainsumo);

    }//GEN-LAST:event_bteliminarActionPerformed

    private void btmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodificarActionPerformed
        GInsumo objetoinsumo = new GInsumo();
        objetoinsumo.modificarInsumo(txtid_insumo,txtnombre_insumo, txtprecio_insumo);
        objetoinsumo.mostrarInsumo(tablainsumo);
    }//GEN-LAST:event_btmodificarActionPerformed

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
        GInsumo objetoinsumo = new GInsumo();
        objetoinsumo.insertarInsumo(txtid_insumo  , txtnombre_insumo, txtprecio_insumo);
        objetoinsumo.mostrarInsumo(tablainsumo);
    }//GEN-LAST:event_btguardarActionPerformed

    private void txtprecio_insumoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtprecio_insumoMousePressed

    }//GEN-LAST:event_txtprecio_insumoMousePressed

    private void txtnombre_insumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre_insumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre_insumoActionPerformed

    private void txtnombre_insumoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombre_insumoMousePressed

    }//GEN-LAST:event_txtnombre_insumoMousePressed

    private void txtid_insumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtid_insumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtid_insumoActionPerformed

    private void txtid_insumoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtid_insumoMousePressed

    }//GEN-LAST:event_txtid_insumoMousePressed

    private void txtprecio_insumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecio_insumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecio_insumoActionPerformed

    private void buscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMousePressed

    }//GEN-LAST:event_buscarMousePressed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed


     
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
   

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FInsumo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btguardar;
    private javax.swing.JButton btlimpiar;
    private javax.swing.JButton btmodificar;
    private javax.swing.JTextField buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tablainsumo;
    private javax.swing.JTextField txtid_insumo;
    private javax.swing.JTextField txtnombre_insumo;
    private javax.swing.JTextField txtprecio_insumo;
    // End of variables declaration//GEN-END:variables
}
