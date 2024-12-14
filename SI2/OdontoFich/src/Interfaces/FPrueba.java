package Interfaces;
import clases.CPrueba;
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
import javax.swing.JComponent;

public class FPrueba extends javax.swing.JFrame {
     public FPrueba() {
     initComponents();
     setLocationRelativeTo(null);
     aplicarEfectoBotones();
}
 
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtestudiante = new javax.swing.JTextField();
        txtgestion = new javax.swing.JTextField();
        panelmaterias = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtregistro = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        BBuscar = new javax.swing.JButton();
        TOTAL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Estudiante:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Gestión:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 60, 30));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel5.setText("MATERIAS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        txtestudiante.setEditable(false);
        txtestudiante.setBackground(new java.awt.Color(255, 255, 255));
        txtestudiante.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtestudiante.setBorder(null);
        jPanel1.add(txtestudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 240, -1));

        txtgestion.setEditable(false);
        txtgestion.setBackground(new java.awt.Color(255, 255, 255));
        txtgestion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtgestion.setBorder(null);
        jPanel1.add(txtgestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 200, 20));

        panelmaterias.setBackground(new java.awt.Color(255, 255, 255));
        panelmaterias.setOpaque(false);
        panelmaterias.setLayout(new javax.swing.BoxLayout(panelmaterias, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(panelmaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 220, 380));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 40, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 240, 10));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 230, 230));
        jLabel1.setText("TRABAJOS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 30));

        jLabel2.setBackground(new java.awt.Color(214, 214, 214));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registro:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, 40));

        txtregistro.setBackground(new java.awt.Color(0, 153, 255));
        txtregistro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtregistro.setForeground(new java.awt.Color(255, 255, 255));
        txtregistro.setBorder(null);
        txtregistro.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtregistro.setOpaque(true);
        txtregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtregistroActionPerformed(evt);
            }
        });
        jPanel2.add(txtregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 170, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 70, 10));

        BBuscar.setText("BUSCAR");
        BBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(BBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        TOTAL.setText("TOTAL RECAUDADO");
        TOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOTALActionPerformed(evt);
            }
        });
        jPanel2.add(TOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPrueba().setVisible(true);
            }
        });
    }
    
    private void BBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarActionPerformed
        CPrueba objetoprueba = new CPrueba();
        objetoprueba.BuscarYLlenar(txtregistro, txtestudiante, txtgestion, panelmaterias);
    }//GEN-LAST:event_BBuscarActionPerformed

    private void TOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOTALActionPerformed
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        FTotalRecaudado Total = new FTotalRecaudado();
        Total.setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_TOTALActionPerformed

    private void txtregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtregistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtregistroActionPerformed
    
    private void aplicarEfectoBotones() {
        efectoBotones(BBuscar);
        efectoBotones(TOTAL);
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
    private javax.swing.JButton BBuscar;
    private javax.swing.JButton TOTAL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel panelmaterias;
    private javax.swing.JTextField txtestudiante;
    private javax.swing.JTextField txtgestion;
    private javax.swing.JTextField txtregistro;
    // End of variables declaration//GEN-END:variables
}
