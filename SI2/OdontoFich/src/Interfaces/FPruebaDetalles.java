package Interfaces;
 
import clases.CPruebaDetalle;
import javax.swing.JOptionPane;

public class FPruebaDetalles extends javax.swing.JFrame {
 
    public FPruebaDetalles() {
        initComponents();
    }
 
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
        BMostrar = new javax.swing.JButton();

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
        jPanel1.add(txtestudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 330, -1));

        paneldetalle.setBackground(new java.awt.Color(153, 153, 153));
        paneldetalle.setOpaque(false);
        paneldetalle.setLayout(new javax.swing.BoxLayout(paneldetalle, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(paneldetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 600, 440));

        BMostrar.setText("TRABAJOS");
        BMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(BMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
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

    private void BMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMostrarActionPerformed
        CPruebaDetalle objetoprueba = new CPruebaDetalle();
        String siglaMateria = txtsiglamateria.getText(); // Obtener la sigla de la materia desde el campo de texto
    if (siglaMateria.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, ingresa una sigla de materia válida.");
        return;
    }

    objetoprueba.mostrarTrabajos(siglaMateria, paneldetalle); // Llama al método y pasa el panel donde se mostrarán los trabajos
    ;
    }//GEN-LAST:event_BMostrarActionPerformed
 
    public void setDatos(String sigla, String nombre, String estudiante) {
    txtsiglamateria.setText(sigla);
    txtnombremateria.setText(nombre);
    txtestudiante.setText(estudiante);
    }

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPruebaDetalles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel paneldetalle;
    private javax.swing.JTextField txtestudiante;
    private javax.swing.JTextField txtnombremateria;
    private javax.swing.JTextField txtsiglamateria;
    // End of variables declaration//GEN-END:variables
}
