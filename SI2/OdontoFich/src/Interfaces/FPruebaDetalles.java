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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtsiglamateria = new javax.swing.JTextField();
        txtnombremateria = new javax.swing.JTextField();
        txtestudiante = new javax.swing.JTextField();
        paneldetalle = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtregistro = new javax.swing.JTextField();
        binforme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("TRABAJOS DETALLADOS POR MATERIA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Estudiante:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Materia: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        txtsiglamateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsiglamateriaActionPerformed(evt);
            }
        });
        jPanel1.add(txtsiglamateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 110, -1));
        jPanel1.add(txtnombremateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 210, -1));

        txtestudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtestudianteActionPerformed(evt);
            }
        });
        jPanel1.add(txtestudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 330, -1));

        paneldetalle.setBackground(new java.awt.Color(153, 153, 153));
        paneldetalle.setOpaque(false);
        paneldetalle.setLayout(new javax.swing.BoxLayout(paneldetalle, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(paneldetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 800, 440));

        jLabel2.setText("Registro:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));
        jPanel1.add(txtregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 150, 30));

        binforme.setText("INFORME");
        binforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binformeActionPerformed(evt);
            }
        });
        jPanel1.add(binforme, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, Short.MAX_VALUE)
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
 
   public void setDatos(String sigla, String nombre, String estudiante, String registro) {
    txtsiglamateria.setText(sigla);
    txtnombremateria.setText(nombre);
    txtestudiante.setText(estudiante);
    txtregistro.setText(registro); // Actualizar el JTextField con el registro
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
    // Asegurar transparencia total
    button.setOpaque(false);
    button.setContentAreaFilled(false);
    button.setFocusPainted(false);

    // Personalizar texto
    button.setForeground(Color.WHITE);
    button.setFont(new Font("Arial", Font.BOLD, 14));

    // Crear un borde redondeado visible
    button.setBorder(new javax.swing.border.AbstractBorder() {
        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // Color y grosor del borde
            g2d.setColor(new Color(200, 200, 200)); // Gris claro
            g2d.setStroke(new java.awt.BasicStroke(2)); // Grosor del borde

            // Dibujar el borde redondeado
            g2d.drawRoundRect(x, y, width - 1, height - 1, 30, 30); // Radio de 30 para bordes redondeados
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(7, 7, 7, 7); // Ajuste interno entre texto y borde
        }

        @Override
        public boolean isBorderOpaque() {
            return false; // Garantiza que el fondo sea transparente
        }
    });

    // Cambiar cursor al pasar sobre el botón
    button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    // Agregar efectos visuales al pasar el mouse
    button.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            // Obtener el color del texto actual
            Color textColor = button.getForeground();

            // Cambiar el color del texto y del borde al pasar el mouse
            button.setForeground(new Color(202, 207, 250)); // Blanco con transparencia ajustada
            button.repaint();

            // Cambiar el color del borde para que coincida con el color del texto
            button.setBorder(new javax.swing.border.AbstractBorder() {
                @Override
                public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                    // Usar el mismo color que el texto para el borde
                    g2d.setColor(button.getForeground()); // Usar el color de texto
                    g2d.setStroke(new java.awt.BasicStroke(2)); // Grosor del borde

                    // Dibujar el borde redondeado
                    g2d.drawRoundRect(x, y, width - 1, height - 1, 30, 30); // Radio de 30 para bordes redondeados
                }

                @Override
                public Insets getBorderInsets(Component c) {
                    return new Insets(10, 10, 10, 10); // Ajuste interno entre texto y borde
                }

                @Override
                public boolean isBorderOpaque() {
                    return false; // Garantiza que el fondo sea transparente
                }
            });
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // Revertir el texto y el borde a sus valores originales
            button.setForeground(Color.WHITE); // Revertir el texto a blanco
            button.repaint();

            // Revertir el borde al color original
            button.setBorder(new javax.swing.border.AbstractBorder() {
                @Override
                public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                    // Color y grosor del borde original
                    g2d.setColor(new Color(200, 200, 200)); // Gris claro
                    g2d.setStroke(new java.awt.BasicStroke(2)); // Grosor del borde

                    // Dibujar el borde redondeado
                    g2d.drawRoundRect(x, y, width - 1, height - 1, 30, 30); // Radio de 30 para bordes redondeados
                }

                @Override
                public Insets getBorderInsets(Component c) {
                    return new Insets(7, 7, 7, 7); // Ajuste interno entre texto y borde
                }

                @Override
                public boolean isBorderOpaque() {
                    return false; // Garantiza que el fondo sea transparente
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
    private javax.swing.JPanel paneldetalle;
    private javax.swing.JTextField txtestudiante;
    private javax.swing.JTextField txtnombremateria;
    private javax.swing.JTextField txtregistro;
    private javax.swing.JTextField txtsiglamateria;
    // End of variables declaration//GEN-END:variables
}
