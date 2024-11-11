/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proypilas;

import javax.swing.JOptionPane;

/**
 *
 * @author Franklin
 */
public class ProyPilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CPila P,Q,R;
        int x;
        P = new CPila();
        Q = new CPila();
        R = new CPila();
        
        P.Push(1);
        P.Push(2);
        P.Push(3);
        P.Push(4);
        P.Push(5);
        P.Push(6);
        //P.Push(3);
        //P.Push(1);
        //P.exam1(P, 8);
        //System.out.println(P.toString());
        //System.out.println(P.Cant());
        
        System.out.println(P.toString());
        //P.sumarultimos();
        x=P.popprimero();
        //P.eliminar(2);
        //System.out.println(P.toString());
        //System.out.println("La suma es =" + P.suma());
        //P.invertir();
        System.out.println(x);
        System.out.println(P.toString());
        //P.insertar(0, 7);
        //System.out.println(P.toString());
        //System.out.println(P.capicua());
        
    }
    
}
