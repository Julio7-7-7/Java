/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
public class lista extends javax.swing.JFrame {

    /**
     * Creates new form lista
     */
    public lista() {
        initComponents();
        
        DefaultTableModel model = new DefaultTableModel();
tablaInventario.setModel(model);
model.addColumn("ID INVENTARIO");
model.addColumn("ID INSUMO");
model.addColumn("FECHA REGISTRO");
model.addColumn("STOCK");
model.addColumn("UNIDAD DE MEDIDA");
model.addColumn("ID PERSONAL ");
cargarInsumosEnTabla();
    }
    private void cargarInsumosEnTabla() {
    String sql = "SELECT id_inventario, id_insumo, fecha_registro , stock, unidad_medida, id_personal FROM inventario"; // Consulta SQL

    
    Connection conn = new CConexion().getConexion();

    if (conn != null) {
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            DefaultTableModel model = (DefaultTableModel) tablaInventario.getModel(); // Obtener el modelo de la tabla
            model.setRowCount(0); 

          
            while (rs.next()) {
                String idInventario = rs.getString("id_inventario");
                String idInsumo = rs.getString("id_insumo");
                String fecharegistro = rs.getString("fecha_registro");
                 String stock = rs.getString("stock");
                String unidadmedida = rs.getString("unidad_medida");
                 String idPersonal = rs.getString("id_personal");
               
                
                model.addRow(new Object[]{idInventario,idInsumo,fecharegistro,stock,unidadmedida,idPersonal});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar insumos: " + e.getMessage());
            e.printStackTrace();
        }
    } else {
        JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
    }
}
    
private void borrarRegistro() {
    int selectedRow = tablaInventario.getSelectedRow(); 

    if (selectedRow != -1) { 
        String idInventario = tablaInventario.getValueAt(selectedRow, 0).toString();  

        // Confirmar si realmente desea borrar el registro
        int confirm = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar este registro?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM inventario WHERE id_inventario = ?"; 

           
            try (Connection conn = new CConexion().getConexion(); 
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                
                pstmt.setString(1, idInventario);  
                int rowsAffected = pstmt.executeUpdate();  

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
                    cargarInsumosEnTabla();  
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el registro.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + e.getMessage());
                e.printStackTrace();
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar.");
    }
}
private void actualizarRegistro() {
    int selectedRow = tablaInventario.getSelectedRow();  

    if (selectedRow != -1) { 
        String idInventario = tablaInventario.getValueAt(selectedRow, 0).toString(); 
        String stock = tablaInventario.getValueAt(selectedRow, 3).toString();  

        String nuevoStock = JOptionPane.showInputDialog(null, "Ingrese el nuevo stock:", stock);

        if (nuevoStock != null && !nuevoStock.trim().isEmpty()) {
            String sql = "UPDATE inventario SET stock = ? WHERE id_inventario = ?";  

            try (Connection conn = new CConexion().getConexion(); 
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                
                pstmt.setString(1, nuevoStock);  
                pstmt.setString(2, idInventario);  
                int rowsAffected = pstmt.executeUpdate();  

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Registro actualizado correctamente.");
                    cargarInsumosEnTabla();  
                } else {
                    JOptionPane.showMessageDialog(null, "Error al actualizar el registro.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al actualizar el registro: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "El stock no puede estar vacío.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Selecciona una fila para actualizar.");
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaInventario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText(" LISTA INVENTARIO ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 30));

        jButton4.setText("ATRAS");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 580, 80, 30));

        jButton1.setText("BORRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, -1, 30));

        jButton2.setText("ACTUALIZAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, -1, 30));

        jButton3.setText("MODIFICAR");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, 30));

        tablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaInventario);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 460, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        borrarRegistro();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        actualizarRegistro();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaInventario;
    // End of variables declaration//GEN-END:variables
}
