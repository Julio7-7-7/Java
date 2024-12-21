package Interfaces;

import clases.GMateria;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import odontofich.CConexion;

public class FMateria extends javax.swing.JFrame {

    public FMateria() {
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
        sigla = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
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
        LISTA = new javax.swing.JButton();
        GUARDAR = new javax.swing.JButton();
        ACTUALIZAR = new javax.swing.JButton();
        LIMPIAR = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        comboperiodo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblistamateria = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        periodo = new javax.swing.JTextField();
        BUSCAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Bk", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MATERIAS");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 230, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SIGLA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

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
        jPanel2.add(sigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 150, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 120, 10));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PERIODO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 120, 10));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOMBRE");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        nombre.setBackground(new java.awt.Color(0, 102, 255));
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
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 150, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 120, 10));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CREDITOS");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        creditos.setBackground(new java.awt.Color(0, 102, 255));
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
        jPanel2.add(creditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 150, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 120, 10));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("HORAS TEORICAS");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        ht.setBackground(new java.awt.Color(0, 102, 255));
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
        jPanel2.add(ht, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 150, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 120, 10));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("HORAS PRACTICAS");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        hp.setBackground(new java.awt.Color(0, 102, 255));
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
        jPanel2.add(hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 150, -1));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 120, 10));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PRE-REQUISITO");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        pr.setBackground(new java.awt.Color(0, 102, 255));
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
        jPanel2.add(pr, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 150, -1));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 120, 10));

        LISTA.setBackground(new java.awt.Color(51, 51, 51));
        LISTA.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
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
        jPanel2.add(LISTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 120, 30));

        GUARDAR.setBackground(new java.awt.Color(51, 51, 51));
        GUARDAR.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        GUARDAR.setForeground(new java.awt.Color(255, 255, 255));
        GUARDAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/disk.png"))); // NOI18N
        GUARDAR.setText("GUARDAR");
        GUARDAR.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
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
        jPanel2.add(GUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 110, 30));

        ACTUALIZAR.setBackground(new java.awt.Color(51, 51, 51));
        ACTUALIZAR.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
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
        jPanel2.add(ACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 120, 30));

        LIMPIAR.setBackground(new java.awt.Color(51, 51, 51));
        LIMPIAR.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
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
        jPanel2.add(LIMPIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 110, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ODONTO_1.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 260, 180));

        comboperiodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1er Año", "2do Año", "3er Año", "4to Año", "5to Año" }));
        comboperiodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboperiodoMouseClicked(evt);
            }
        });
        comboperiodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboperiodoActionPerformed(evt);
            }
        });
        jPanel2.add(comboperiodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 120, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 610));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 560, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 300, 30));

        periodo.setBackground(new java.awt.Color(0, 102, 255));
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
        jPanel1.add(periodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 150, -1));

        BUSCAR.setBackground(new java.awt.Color(255, 255, 255));
        BUSCAR.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        BUSCAR.setForeground(new java.awt.Color(0, 0, 0));
        BUSCAR.setText("BUSCAR");
        BUSCAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BUSCAR.setFocusPainted(false);
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });
        jPanel1.add(BUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
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
        objetoMateria.buscarMateria(jTextField1, tblistamateria);
    }//GEN-LAST:event_BUSCARActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void comboperiodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboperiodoMouseClicked
        periodo.setText(comboperiodo.getItemAt(WIDTH));
    }//GEN-LAST:event_comboperiodoMouseClicked

    private void comboperiodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboperiodoActionPerformed
        periodo.setText(comboperiodo.getItemAt(WIDTH));
    }//GEN-LAST:event_comboperiodoActionPerformed

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
    private javax.swing.JComboBox<String> comboperiodo;
    private javax.swing.JTextField creditos;
    private javax.swing.JTextField hp;
    private javax.swing.JTextField ht;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField periodo;
    private javax.swing.JTextField pr;
    private javax.swing.JTextField sigla;
    private javax.swing.JTable tblistamateria;
    // End of variables declaration//GEN-END:variables
}
