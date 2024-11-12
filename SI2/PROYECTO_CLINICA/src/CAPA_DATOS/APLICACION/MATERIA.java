/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CAPA_DATOS.APLICACION;

import CAPA_DATOS.GMateria;
import java.awt.Color;

/**
 *
 * @author amc77
 */
public class MATERIA extends javax.swing.JFrame {

   
    public MATERIA() {
        initComponents();
        
          this.setLocationRelativeTo(null);
    
        GMateria objetomateria = new GMateria();
         objetomateria.mostrarMaterias(Tablamateria);
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sigla = new javax.swing.JTextField();
        periodo = new javax.swing.JTextField();
        nombre_materia = new javax.swing.JTextField();
        cr = new javax.swing.JTextField();
        ht = new javax.swing.JTextField();
        hp = new javax.swing.JTextField();
        pre_requisitos = new javax.swing.JTextField();
        BTguardar = new javax.swing.JButton();
        BTModificar = new javax.swing.JButton();
        BTeliminar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        BTNUEVO = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablamateria = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 789, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MATERIA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SIGLA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 196, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PERIODO");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOMBRE MATERIA");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 264, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CREDITOS");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 298, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("HORAS TEORICAS");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 332, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("HORAS PRACTICAS");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 366, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PRE REQUISITOS");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 400, -1, -1));

        sigla.setForeground(new java.awt.Color(0, 0, 0));
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
        jPanel2.add(sigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 189, 120, -1));

        periodo.setForeground(new java.awt.Color(0, 0, 0));
        periodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                periodoMousePressed(evt);
            }
        });
        periodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodoActionPerformed(evt);
            }
        });
        jPanel2.add(periodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 223, 120, -1));

        nombre_materia.setForeground(new java.awt.Color(0, 0, 0));
        nombre_materia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombre_materiaMousePressed(evt);
            }
        });
        nombre_materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_materiaActionPerformed(evt);
            }
        });
        jPanel2.add(nombre_materia, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 257, 120, -1));

        cr.setForeground(new java.awt.Color(0, 0, 0));
        cr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                crMousePressed(evt);
            }
        });
        cr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crActionPerformed(evt);
            }
        });
        jPanel2.add(cr, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 291, 120, -1));

        ht.setForeground(new java.awt.Color(0, 0, 0));
        ht.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                htMousePressed(evt);
            }
        });
        jPanel2.add(ht, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 325, 120, -1));

        hp.setForeground(new java.awt.Color(0, 0, 0));
        hp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hpMousePressed(evt);
            }
        });
        jPanel2.add(hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 359, 120, -1));

        pre_requisitos.setForeground(new java.awt.Color(0, 0, 0));
        pre_requisitos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre_requisitosMousePressed(evt);
            }
        });
        jPanel2.add(pre_requisitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 393, 120, -1));

        BTguardar.setBackground(new java.awt.Color(0, 0, 0));
        BTguardar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        BTguardar.setForeground(new java.awt.Color(255, 255, 255));
        BTguardar.setText("GUARDAR");
        BTguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTguardarActionPerformed(evt);
            }
        });
        jPanel2.add(BTguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 427, -1, 38));

        BTModificar.setBackground(new java.awt.Color(0, 0, 0));
        BTModificar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        BTModificar.setForeground(new java.awt.Color(255, 255, 255));
        BTModificar.setText("MODIFICAR");
        BTModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTModificarActionPerformed(evt);
            }
        });
        jPanel2.add(BTModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 471, -1, 38));

        BTeliminar.setBackground(new java.awt.Color(0, 0, 0));
        BTeliminar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        BTeliminar.setForeground(new java.awt.Color(255, 255, 255));
        BTeliminar.setText("ELIMINAR");
        BTeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTeliminarActionPerformed(evt);
            }
        });
        jPanel2.add(BTeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 471, -1, 38));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/pngegg (5).png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 55, 191, 128));

        BTNUEVO.setBackground(new java.awt.Color(0, 0, 0));
        BTNUEVO.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        BTNUEVO.setForeground(new java.awt.Color(255, 255, 255));
        BTNUEVO.setText("LIMPIAR");
        BTNUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNUEVOActionPerformed(evt);
            }
        });
        jPanel2.add(BTNUEVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 427, -1, 38));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 555));

        Tablamateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sigla", "Id_trabajo", "Cantidad_trabajo"
            }
        ));
        Tablamateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablamateriaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(Tablamateria);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 520, 430));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel11.setText("BUSCAR");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        buscar.setForeground(new java.awt.Color(204, 204, 204));
        buscar.setText("Ej: sigla de materia");
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
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 238, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 846, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void periodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_periodoActionPerformed

    private void BTguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTguardarActionPerformed
        GMateria objetomaMateria = new GMateria();
        objetomaMateria.insertarMateria(sigla, periodo, nombre_materia, cr, ht, hp, pre_requisitos);
        objetomaMateria.mostrarMaterias(Tablamateria);
    }//GEN-LAST:event_BTguardarActionPerformed

    private void siglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siglaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siglaActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void buscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMousePressed
       
    }//GEN-LAST:event_buscarMousePressed

    private void siglaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siglaMousePressed
    
    }//GEN-LAST:event_siglaMousePressed

    private void periodoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_periodoMousePressed
      
    }//GEN-LAST:event_periodoMousePressed

    private void nombre_materiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombre_materiaMousePressed
       
    }//GEN-LAST:event_nombre_materiaMousePressed

    private void crMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crMousePressed
     
    }//GEN-LAST:event_crMousePressed

    private void htMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htMousePressed
     
    }//GEN-LAST:event_htMousePressed

    private void hpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hpMousePressed
       
    }//GEN-LAST:event_hpMousePressed

    private void pre_requisitosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre_requisitosMousePressed
      
    }//GEN-LAST:event_pre_requisitosMousePressed

    private void nombre_materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_materiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_materiaActionPerformed

    private void crActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crActionPerformed

    private void TablamateriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablamateriaMousePressed
     GMateria objetomateria = new GMateria();
        objetomateria.seleccionarMateria(Tablamateria, sigla, periodo, nombre_materia, cr, ht, hp, pre_requisitos);
    }//GEN-LAST:event_TablamateriaMousePressed

    private void BTModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTModificarActionPerformed
          GMateria objetomateria = new GMateria();
        objetomateria.modificarMateria(sigla, periodo, nombre_materia, cr, ht, hp,pre_requisitos);
        objetomateria.mostrarMaterias(Tablamateria);
    }//GEN-LAST:event_BTModificarActionPerformed

    private void BTNUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNUEVOActionPerformed
     limpiardatos();
        
    }                                         
     public void limpiardatos()  {
    sigla.setText("");
    periodo.setText("");
    nombre_materia.setText("");
    cr.setText("");
    ht.setText("");
    hp.setText("");
    pre_requisitos.setText("");
        
        
    }//GEN-LAST:event_BTNUEVOActionPerformed

    private void BTeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTeliminarActionPerformed
  
    }//GEN-LAST:event_BTeliminarActionPerformed

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
            java.util.logging.Logger.getLogger(MATERIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MATERIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MATERIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MATERIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MATERIA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTModificar;
    private javax.swing.JButton BTNUEVO;
    private javax.swing.JButton BTeliminar;
    private javax.swing.JButton BTguardar;
    private javax.swing.JTable Tablamateria;
    private javax.swing.JTextField buscar;
    private javax.swing.JTextField cr;
    private javax.swing.JTextField hp;
    private javax.swing.JTextField ht;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre_materia;
    private javax.swing.JTextField periodo;
    private javax.swing.JTextField pre_requisitos;
    private javax.swing.JTextField sigla;
    // End of variables declaration//GEN-END:variables
}
