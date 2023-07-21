/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pfigura;

/**
 *
 * @author Julius
 */
public class PFigura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo C = new Circulo(2, 3, 5);
        Elipse E = new Elipse(3, 4, 5, 7);
        System.out.println("El area es = "+C.calcularArea());
        C.dibujar();
        
        System.out.println("El area de la elipse es = "+ E.calcularArea());
        E.dibujar();
    }
    
}
