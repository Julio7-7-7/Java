package Interfaces;

import clases.GLogin;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.border.Border;

public class FLogin extends javax.swing.JFrame {

    public FLogin() {
        initComponents();
        setLocationRelativeTo(null);
        aplicarEfectoBotones();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAGENES/ODONTO_1.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Iniciar_sesion = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre_usuario = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INICIO DE SESION");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Iniciar_sesion.setBackground(new java.awt.Color(0, 102, 255));
        Iniciar_sesion.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Iniciar_sesion.setForeground(new java.awt.Color(230, 230, 230));
        Iniciar_sesion.setText("Iniciar sesion");
        Iniciar_sesion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Iniciar_sesion.setBorderPainted(false);
        Iniciar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Iniciar_sesionActionPerformed(evt);
            }
        });
        jPanel1.add(Iniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 120, 40));

        error.setForeground(new java.awt.Color(204, 51, 0));
        jPanel1.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 131, 23));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setLabelFor(nombre_usuario);
        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 60, 27));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setLabelFor(contraseña);
        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 90, 38));

        nombre_usuario.setBackground(new java.awt.Color(255, 255, 255));
        nombre_usuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nombre_usuario.setBorder(null);
        nombre_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(nombre_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 240, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 240, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 240, 10));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(230, 230, 230));
        jLabel4.setText("INICIO DE SESION");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 190, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 100));

        contraseña.setBackground(new java.awt.Color(255, 255, 255));
        contraseña.setBorder(null);
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 182, 220, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Iniciar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Iniciar_sesionActionPerformed
        GLogin lg= new GLogin();
        boolean sesion=lg.iniciarSesion(nombre_usuario.getText(), contraseña.getText());
        if(sesion){
            new FDetalleEstut().setVisible(true);
            this.dispose();
            error.setText("");
        }else{
            error.setText("Acceso denegado");
        }
    }//GEN-LAST:event_Iniciar_sesionActionPerformed

    private void nombre_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_usuarioActionPerformed

     private void aplicarEfectoBotones() {
        efectoBotones(Iniciar_sesion);
    }

    private void efectoBotones(JButton button) {
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);

        button.setForeground(new Color(200, 210, 200));
        button.setFont(new Font("Arial", Font.BOLD, 14));

        Border originalBorder = new javax.swing.border.AbstractBorder() {
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
        };

        button.setBorder(originalBorder);

        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setForeground(new Color(202, 207, 250)); 

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
                button.setForeground(new Color(200, 200, 200));
                button.setBorder(originalBorder);
            }
        });
    }
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FLogin().setVisible(true);
            }
        });
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Iniciar_sesion;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField nombre_usuario;
    // End of variables declaration//GEN-END:variables
}
