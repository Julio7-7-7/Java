/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package p5fraccion;

import javax.swing.JOptionPane;

/**
 *
 * @author Julius
 */
public class Main {
    private static int Elev;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Fraccionar f1,f2;
        
        f1= new Fraccionar();
        f2= new Fraccionar();
        
        String n= JOptionPane.showInputDialog("Introduzca numerador");
           int N= Integer.parseInt(n);
        String d= JOptionPane.showInputDialog("Introduzca denominador");
           int D= Integer.parseInt(d);
           
         
           
           
        f1.PonerNumerador(N);
        f1.PonerDenominador(D);
        
        int nUm= f1.SacarNumerador();
        int dEn= f1.SacarDenominador();

         JOptionPane.showMessageDialog(null, "La fraccion es ="+nUm+"/"+dEn);

        f1.simplificar();
        JOptionPane.showMessageDialog(null, "La fraccion simplificada es ="+f1.SacarNumerador()+"/"+f1.SacarDenominador());
    }

    }


