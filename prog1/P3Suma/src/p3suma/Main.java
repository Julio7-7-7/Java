/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package p3suma;

import java.awt.JobAttributes;
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
        String A= JOptionPane.showInputDialog("Ingrese una cifra");
        int x= Integer.parseInt(A);

        String B= JOptionPane.showInputDialog("Ingrese otra cifra");
        int y= Integer.parseInt(B);

        int z= x+y;
        JOptionPane.showMessageDialog(null, "La suma total es = "+z);
    }

}
