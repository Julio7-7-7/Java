/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ppunto;

/**
 *
 * @author Julius
 */
public class PPunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Punto P1, P2;
        P1 = new Punto();
        P2 = new Punto(5, 3);
        System.out.println("El punto 1 es = "+P1);
        System.out.println("El punto 2 es = "+P2);
        System.out.println("-------------------------");
        Punto3D P3, P4;
        P3 = new Punto3D();
        P4 = new Punto3D(3, 4, 5);
        System.out.println("El punto P3 es = "+P3);
        System.out.println("El punto P4 es = "+P4);
    }
    
}
