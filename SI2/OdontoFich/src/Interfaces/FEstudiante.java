package Interfaces;

import clases.GEstudiante;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class FEstudiante extends javax.swing.JFrame {

    public FEstudiante() {
        initComponents();
     setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        registro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        GUARDAR = new javax.swing.JButton();
        ACTUALIZAR = new javax.swing.JButton();
        LISTA = new javax.swing.JButton();
        LIMPIAR = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblistaestudiante = new javax.swing.JTable();
        BUSCAR = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Bk", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ESTUDIANTE");
        jLabel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel2FocusGained(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 240, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

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
        jPanel2.add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 150, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 150, 10));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOMBRE");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        nombre.setBackground(new java.awt.Color(0, 102, 255));
        nombre.setForeground(new java.awt.Color(204, 204, 204));
        nombre.setText("JUAN PEREZ");
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
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 150, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 150, 10));

        GUARDAR.setBackground(new java.awt.Color(51, 51, 51));
        GUARDAR.setForeground(new java.awt.Color(255, 255, 255));
        GUARDAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/disk.png"))); // NOI18N
        GUARDAR.setText("GUARDAR");
        GUARDAR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GUARDAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUARDAR.setFocusPainted(false);
        GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDARActionPerformed(evt);
            }
        });
        jPanel2.add(GUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 120, 40));

        ACTUALIZAR.setBackground(new java.awt.Color(51, 51, 51));
        ACTUALIZAR.setForeground(new java.awt.Color(255, 255, 255));
        ACTUALIZAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/page_refresh.png"))); // NOI18N
        ACTUALIZAR.setText("ACTUALIZAR");
        ACTUALIZAR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ACTUALIZAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ACTUALIZAR.setFocusPainted(false);
        ACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTUALIZARActionPerformed(evt);
            }
        });
        jPanel2.add(ACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 120, 40));

        LISTA.setBackground(new java.awt.Color(51, 51, 51));
        LISTA.setForeground(new java.awt.Color(255, 255, 255));
        LISTA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/page_edit.png"))); // NOI18N
        LISTA.setText("LISTA");
        LISTA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LISTA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LISTA.setFocusPainted(false);
        LISTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LISTAActionPerformed(evt);
            }
        });
        jPanel2.add(LISTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 130, 40));

        LIMPIAR.setBackground(new java.awt.Color(51, 51, 51));
        LIMPIAR.setForeground(new java.awt.Color(255, 255, 255));
        LIMPIAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/page_delete.png"))); // NOI18N
        LIMPIAR.setText("LIMPIAR");
        LIMPIAR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LIMPIAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LIMPIAR.setFocusPainted(false);
        LIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARActionPerformed(evt);
            }
        });
        jPanel2.add(LIMPIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 120, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ODONTO_1.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 210, 180));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 560));

        tblistaestudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblistaestudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblistaestudianteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblistaestudiante);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 97, 470, 460));

        BUSCAR.setBackground(new java.awt.Color(255, 255, 255));
        BUSCAR.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        BUSCAR.setForeground(new java.awt.Color(0, 0, 0));
        BUSCAR.setText("BUSCAR");
        BUSCAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BUSCAR.setBorderPainted(false);
        BUSCAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BUSCAR.setFocusPainted(false);
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });
        jPanel1.add(BUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 110, 40));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 260, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registroActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUARDARActionPerformed
    GEstudiante objetoEstudiante = new GEstudiante();
    objetoEstudiante.insertarEstudiante(registro, nombre);
objetoEstudiante.mostrarEstudiantes(tblistaestudiante);    }//GEN-LAST:event_GUARDARActionPerformed

    private void registroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroMousePressed
        registro.setText("");
        registro.setForeground(Color.black);
    }//GEN-LAST:event_registroMousePressed

    private void nombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMousePressed
        nombre.setText("");
        nombre.setForeground(Color.black);
    }//GEN-LAST:event_nombreMousePressed

    private void jLabel2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2FocusGained

    private void LISTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LISTAActionPerformed
        GEstudiante objetoEstudiante = new GEstudiante();
        objetoEstudiante.mostrarEstudiantes(tblistaestudiante);
    }//GEN-LAST:event_LISTAActionPerformed

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed
        registro.setText("");
        nombre.setText("");
        DefaultTableModel modeloTabla = (DefaultTableModel) tblistaestudiante.getModel();
        modeloTabla.setRowCount(0);
    }//GEN-LAST:event_LIMPIARActionPerformed

    private void ACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTUALIZARActionPerformed
        GEstudiante objetoEstudiante = new GEstudiante();
        objetoEstudiante.modificarEstudiante(registro, nombre);
        objetoEstudiante.mostrarEstudiantes(tblistaestudiante);

    }//GEN-LAST:event_ACTUALIZARActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
        GEstudiante objetoEstudiante = new GEstudiante();
        objetoEstudiante.buscarEstudiante(registro, tblistaestudiante);

    }//GEN-LAST:event_BUSCARActionPerformed

    private void tblistaestudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblistaestudianteMouseClicked
        GEstudiante objetoEstudiante = new GEstudiante();
        objetoEstudiante.seleccionarEstudiante(tblistaestudiante, registro, nombre);
    }//GEN-LAST:event_tblistaestudianteMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACTUALIZAR;
    private javax.swing.JButton BUSCAR;
    private javax.swing.JButton GUARDAR;
    private javax.swing.JButton LIMPIAR;
    private javax.swing.JButton LISTA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField registro;
    private javax.swing.JTable tblistaestudiante;
    // End of variables declaration//GEN-END:variables
}
