package Interfaces;
 
import clases.CPruebaDetalle;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class FPruebaDetalles extends javax.swing.JFrame {
 
    public FPruebaDetalles() {
        initComponents();
        aplicarEfectoBotones();
    }
    private CPruebaDetalle pruebaDetalle = new CPruebaDetalle();

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtsiglamateria = new javax.swing.JTextField();
        paneldetalle = new javax.swing.JPanel();
        binforme = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtnombremateria = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtestudiante = new javax.swing.JTextField();
        txtregistro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Estudiante:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Materia: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        txtsiglamateria.setEditable(false);
        txtsiglamateria.setBackground(new java.awt.Color(0, 102, 255));
        txtsiglamateria.setForeground(new java.awt.Color(255, 255, 255));
        txtsiglamateria.setBorder(null);
        txtsiglamateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsiglamateriaActionPerformed(evt);
            }
        });
        jPanel1.add(txtsiglamateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 60, -1));

        paneldetalle.setBackground(new java.awt.Color(153, 153, 153));
        paneldetalle.setOpaque(false);
        paneldetalle.setLayout(new javax.swing.BoxLayout(paneldetalle, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(paneldetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 560, 420));

        binforme.setText("INFORME");
        binforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binformeActionPerformed(evt);
            }
        });
        jPanel1.add(binforme, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 240, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 340, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registro:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 90, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TRABAJOS DETALLADOS POR MATERIA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 77, 70, 20));

        txtnombremateria.setEditable(false);
        txtnombremateria.setBackground(new java.awt.Color(0, 102, 255));
        txtnombremateria.setForeground(new java.awt.Color(255, 255, 255));
        txtnombremateria.setBorder(null);
        jPanel2.add(txtnombremateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 270, -1));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 77, 280, 20));

        txtestudiante.setEditable(false);
        txtestudiante.setBackground(new java.awt.Color(0, 102, 255));
        txtestudiante.setForeground(new java.awt.Color(255, 255, 255));
        txtestudiante.setBorder(null);
        txtestudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtestudianteActionPerformed(evt);
            }
        });
        jPanel2.add(txtestudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 330, -1));

        txtregistro.setEditable(false);
        txtregistro.setBackground(new java.awt.Color(0, 102, 255));
        txtregistro.setForeground(new java.awt.Color(255, 255, 255));
        txtregistro.setBorder(null);
        txtregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtregistroActionPerformed(evt);
            }
        });
        jPanel2.add(txtregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 90, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsiglamateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsiglamateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsiglamateriaActionPerformed

    private void txtestudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtestudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtestudianteActionPerformed

    private void binformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binformeActionPerformed
         String siglaMateria = txtsiglamateria.getText(); // Suponiendo que tienes un JTextField llamado txtSiglaMateria

    // Llamar al método mostrarTrabajosYPagos desde la instancia
    pruebaDetalle.mostrarTrabajosYPagos(siglaMateria, paneldetalle);
    }//GEN-LAST:event_binformeActionPerformed

    private void txtregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtregistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtregistroActionPerformed
 
   public void setDatos(String sigla, String nombre, String estudiante, String registro) {
    txtsiglamateria.setText(sigla);
    txtnombremateria.setText(nombre);
    txtestudiante.setText(estudiante);
    txtregistro.setText(registro);
}


    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPruebaDetalles().setVisible(true);
            }
        });
    }
    
    private void aplicarEfectoBotones() {
        efectoBotones(binforme);
    }

    private void efectoBotones(JButton button) {
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);

        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 14));

        button.setBorder(new javax.swing.border.AbstractBorder() {
            @Override
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                g2d.setColor(new Color(200, 200, 200)); 
                g2d.setStroke(new java.awt.BasicStroke(2)); 

                g2d.drawRoundRect(x, y, width - 1, height - 1, 30, 30); 
            }

            @Override
            public Insets getBorderInsets(Component c) {
                return new Insets(7, 7, 7, 7); 
            }

            @Override
            public boolean isBorderOpaque() {
                return false;
            }
        });

        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Color textColor = button.getForeground();

                button.setForeground(new Color(202, 207, 250)); 
                button.repaint();

                button.setBorder(new javax.swing.border.AbstractBorder() {
                    @Override
                    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                        Graphics2D g2d = (Graphics2D) g;
                        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                        g2d.setColor(button.getForeground()); 
                        g2d.setStroke(new java.awt.BasicStroke(2)); 

                        g2d.drawRoundRect(x, y, width - 1, height - 1, 30, 30); 
                    }

                    @Override
                    public Insets getBorderInsets(Component c) {
                        return new Insets(10, 10, 10, 10);
                    }

                    @Override
                    public boolean isBorderOpaque() {
                        return false;
                    }
                });
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setForeground(Color.WHITE);
                button.repaint();

                button.setBorder(new javax.swing.border.AbstractBorder() {
                    @Override
                    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                        Graphics2D g2d = (Graphics2D) g;
                        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                        g2d.setColor(new Color(200, 200, 200)); 
                        g2d.setStroke(new java.awt.BasicStroke(2)); 

                        g2d.drawRoundRect(x, y, width - 1, height - 1, 30, 30); 
                    }

                    @Override
                    public Insets getBorderInsets(Component c) {
                        return new Insets(7, 7, 7, 7);
                    }

                    @Override
                    public boolean isBorderOpaque() {
                        return false;
                    }
                });
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton binforme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel paneldetalle;
    private javax.swing.JTextField txtestudiante;
    private javax.swing.JTextField txtnombremateria;
    private javax.swing.JTextField txtregistro;
    private javax.swing.JTextField txtsiglamateria;
    // End of variables declaration//GEN-END:variables
}
