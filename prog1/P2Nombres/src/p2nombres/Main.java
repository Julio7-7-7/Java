/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package p2nombres;

import javax.swing.JOptionPane;

/**
 *
 * @author Julius
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String PN= JOptionPane.showInputDialog("Por favor ingrese nombre(s)");
       String AP= JOptionPane.showInputDialog("Ingrese Apellido(s)");
       JOptionPane.showMessageDialog(null, "Hola "+PN+" "+AP);
    }

}
