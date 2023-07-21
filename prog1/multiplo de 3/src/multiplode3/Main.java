/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package multiplode3;

/**
 *
 * @author loren
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resto;
int numero1 = 21;
int numero2 = 3;

resto = numero1%numero2;

if (resto==0)
  System.out.println(numero1 + " es múltiplo de " + numero2);
else
  System.out.println(numero1 + " NO es múltiplo de " + numero2);

    }

}
