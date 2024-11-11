/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proybiseccion;

/**
 *
 * @author Usuario
 */
public class ProyBiseccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Biseccion B = new Biseccion();
        B.setIntervalo(1.0, 2.0);
        B.setEs(0.1);
        B.biseccion(20);        
        System.out.println("La raiz es: "+ B.getRaiz());
    }    
}
