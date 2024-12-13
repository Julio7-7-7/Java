package Interfaces;
 
import clases.CPrueba;

public class FPrueba extends javax.swing.JFrame {
 
    public FPrueba() {
        initComponents();
        setLocationRelativeTo(null);
        
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtregistro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtestudiante = new javax.swing.JTextField();
        txtgestion = new javax.swing.JTextField();
        panelmaterias = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        TOTAL = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setText("TRABAJOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 120, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Registro:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        txtregistro.setBorder(null);
        jPanel1.add(txtregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 170, 20));

        jLabel3.setText("Estudiante:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel4.setText("Gestión");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel5.setText("MATERIAS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        txtestudiante.setBorder(null);
        jPanel1.add(txtestudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 240, -1));

        txtgestion.setBorder(null);
        jPanel1.add(txtgestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 200, 20));

        panelmaterias.setBackground(new java.awt.Color(255, 255, 255));
        panelmaterias.setOpaque(false);
        panelmaterias.setLayout(new javax.swing.BoxLayout(panelmaterias, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(panelmaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 320, 340));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 200, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 170, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 240, 10));

        TOTAL.setText("TOTAL RECAUDADO");
        TOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOTALActionPerformed(evt);
            }
        });
        jPanel1.add(TOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        BBuscar.setText("BUSCAR");
        BBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(351, Short.MAX_VALUE)
                .addComponent(BBuscar)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(BBuscar)
                .addGap(45, 45, 45))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, -1));

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

    private void BBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarActionPerformed
        CPrueba objetoprueba = new CPrueba();
        objetoprueba.BuscarYLlenar(txtregistro, txtestudiante, txtgestion, panelmaterias);
    }//GEN-LAST:event_BBuscarActionPerformed

    private void TOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOTALActionPerformed

  setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            FTotalRecaudado Total = new FTotalRecaudado();
            Total.setVisible(true);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            //this.dispose();

    }//GEN-LAST:event_TOTALActionPerformed
 
    public static void main(String args[]) {        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPrueba().setVisible(true);
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
