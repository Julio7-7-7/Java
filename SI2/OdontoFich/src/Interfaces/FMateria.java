package Interfaces;

import clases.GMateria;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import odontofich.CConexion;

public class FMateria extends javax.swing.JFrame {

    public FMateria() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sigla = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        periodo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        creditos = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        ht = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        hp = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        pr = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        GUARDAR = new javax.swing.JButton();
        ACTUALIZAR = new javax.swing.JButton();
        BUSCAR = new javax.swing.JButton();
        LIMPIAR = new javax.swing.JButton();
        LISTA = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblistamateria = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Bk", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MATERIA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 180, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centro-odontologico-fondo-oscuroRecurso-3-1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 350, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 570));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("SIGLA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        sigla.setBackground(new java.awt.Color(255, 255, 255));
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
        jPanel1.add(sigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 150, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 150, 10));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("PERIODO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        periodo.setBackground(new java.awt.Color(255, 255, 255));
        periodo.setForeground(new java.awt.Color(204, 204, 204));
        periodo.setText("1/2024");
        periodo.setBorder(null);
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
        jPanel1.add(periodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 150, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 150, 10));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("NOMBRE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setForeground(new java.awt.Color(204, 204, 204));
        nombre.setText("OPERATORIA 1");
        nombre.setBorder(null);
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreMousePressed(evt);
            }
        });
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 150, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 150, 10));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CREDITOS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        creditos.setBackground(new java.awt.Color(255, 255, 255));
        creditos.setForeground(new java.awt.Color(204, 204, 204));
        creditos.setText("5");
        creditos.setBorder(null);
        creditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                creditosMousePressed(evt);
            }
        });
        creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditosActionPerformed(evt);
            }
        });
        jPanel1.add(creditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 150, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 150, 10));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("HORAS TEORICAS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        ht.setBackground(new java.awt.Color(255, 255, 255));
        ht.setForeground(new java.awt.Color(204, 204, 204));
        ht.setText("10");
        ht.setBorder(null);
        ht.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                htMousePressed(evt);
            }
        });
        ht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                htActionPerformed(evt);
            }
        });
        jPanel1.add(ht, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 150, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 150, 10));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("HORAS PRACTICAS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

        hp.setBackground(new java.awt.Color(255, 255, 255));
        hp.setForeground(new java.awt.Color(204, 204, 204));
        hp.setText("18");
        hp.setBorder(null);
        hp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hpMousePressed(evt);
            }
        });
        hp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hpActionPerformed(evt);
            }
        });
        jPanel1.add(hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 150, -1));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 150, 10));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("PRE-REQUISITO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));

        pr.setBackground(new java.awt.Color(255, 255, 255));
        pr.setForeground(new java.awt.Color(204, 204, 204));
        pr.setText("DEF-456");
        pr.setBorder(null);
        pr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                prMousePressed(evt);
            }
        });
        pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prActionPerformed(evt);
            }
        });
        jPanel1.add(pr, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 150, -1));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 150, 10));

        GUARDAR.setBackground(new java.awt.Color(0, 102, 255));
        GUARDAR.setForeground(new java.awt.Color(255, 255, 255));
        GUARDAR.setText("GUARDAR");
        GUARDAR.setBorderPainted(false);
        GUARDAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUARDAR.setFocusPainted(false);
        GUARDAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GUARDARMousePressed(evt);
            }
        });
        GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDARActionPerformed(evt);
            }
        });
        jPanel1.add(GUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, -1, 30));

        ACTUALIZAR.setBackground(new java.awt.Color(0, 102, 255));
        ACTUALIZAR.setForeground(new java.awt.Color(255, 255, 255));
        ACTUALIZAR.setText("ACTUALIZAR");
        ACTUALIZAR.setBorderPainted(false);
        ACTUALIZAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ACTUALIZAR.setFocusPainted(false);
        ACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTUALIZARActionPerformed(evt);
            }
        });
        jPanel1.add(ACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, -1, 30));

        BUSCAR.setBackground(new java.awt.Color(0, 102, 255));
        BUSCAR.setForeground(new java.awt.Color(255, 255, 255));
        BUSCAR.setText("BUSCAR");
        BUSCAR.setBorderPainted(false);
        BUSCAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BUSCAR.setFocusPainted(false);
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });
        jPanel1.add(BUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 250, -1, 30));

        LIMPIAR.setBackground(new java.awt.Color(0, 102, 255));
        LIMPIAR.setForeground(new java.awt.Color(255, 255, 255));
        LIMPIAR.setText("LIMPIAR");
        LIMPIAR.setBorderPainted(false);
        LIMPIAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LIMPIAR.setFocusPainted(false);
        LIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARActionPerformed(evt);
            }
        });
        jPanel1.add(LIMPIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, -1, 30));

        LISTA.setBackground(new java.awt.Color(0, 102, 255));
        LISTA.setForeground(new java.awt.Color(255, 255, 255));
        LISTA.setText("LISTA");
        LISTA.setBorderPainted(false);
        LISTA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LISTA.setFocusPainted(false);
        LISTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LISTAActionPerformed(evt);
            }
        });
        jPanel1.add(LISTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, -1, 30));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista Materias"));

        tblistamateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblistamateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblistamateriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblistamateria);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 630, 250));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siglaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siglaActionPerformed

    private void periodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_periodoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void creditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditosActionPerformed

    private void htActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_htActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_htActionPerformed

    private void hpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hpActionPerformed

    private void prActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prActionPerformed

    private void GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUARDARActionPerformed
        GMateria objetoMateria = new GMateria();
        objetoMateria.insertarMateria(sigla, periodo, nombre, creditos, ht, hp, pr);
        objetoMateria.mostrarMateria(tblistamateria);
    }//GEN-LAST:event_GUARDARActionPerformed

    private void GUARDARMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GUARDARMousePressed
      
    }//GEN-LAST:event_GUARDARMousePressed

    private void siglaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siglaMousePressed
        sigla.setText("");
        sigla.setForeground(Color.black);
    }//GEN-LAST:event_siglaMousePressed

    private void periodoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_periodoMousePressed
        periodo.setText("");
        periodo.setForeground(Color.black);
    }//GEN-LAST:event_periodoMousePressed

    private void nombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMousePressed
        nombre.setText("");
        nombre.setForeground(Color.black);
    }//GEN-LAST:event_nombreMousePressed

    private void creditosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditosMousePressed
        creditos.setText("");
        creditos.setForeground(Color.black);
    }//GEN-LAST:event_creditosMousePressed

    private void htMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htMousePressed
        ht.setText("");
        ht.setForeground(Color.black);
    }//GEN-LAST:event_htMousePressed

    private void hpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hpMousePressed
        hp.setText("");
        hp.setForeground(Color.black);
    }//GEN-LAST:event_hpMousePressed

    private void prMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prMousePressed
        pr.setText("");
        pr.setForeground(Color.black);
    }//GEN-LAST:event_prMousePressed

    private void LISTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LISTAActionPerformed
        
        GMateria objetoMateria = new GMateria();
        objetoMateria.mostrarMateria(tblistamateria);
    }//GEN-LAST:event_LISTAActionPerformed

    private void tblistamateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblistamateriaMouseClicked
        GMateria objetoMateria = new GMateria();
        objetoMateria.seleccionarMateria(tblistamateria, sigla, periodo, nombre, creditos, ht, hp, pr);
    }//GEN-LAST:event_tblistamateriaMouseClicked

    private void ACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTUALIZARActionPerformed
        GMateria objetoMateria = new GMateria();
        objetoMateria.modificarMateria(sigla, periodo, nombre, creditos, ht, hp, pr);
        objetoMateria.mostrarMateria(tblistamateria);
    }//GEN-LAST:event_ACTUALIZARActionPerformed

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed
        sigla.setText("");
        periodo.setText("");
        nombre.setText("");
        creditos.setText("");
        ht.setText("");
        hp.setText("");
        pr.setText("");
        DefaultTableModel modeloTabla = (DefaultTableModel) tblistamateria.getModel();
        modeloTabla.setRowCount(0);
    }//GEN-LAST:event_LIMPIARActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
        GMateria objetoMateria = new GMateria();
        objetoMateria.buscarMateria(sigla, tblistamateria);
    }//GEN-LAST:event_BUSCARActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMateria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACTUALIZAR;
    private javax.swing.JButton BUSCAR;
    private javax.swing.JButton GUARDAR;
    private javax.swing.JButton LIMPIAR;
    private javax.swing.JButton LISTA;
    private javax.swing.JTextField creditos;
    private javax.swing.JTextField hp;
    private javax.swing.JTextField ht;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField periodo;
    private javax.swing.JTextField pr;
    private javax.swing.JTextField sigla;
    private javax.swing.JTable tblistamateria;
    // End of variables declaration//GEN-END:variables
}
