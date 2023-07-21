package com.mycompany.precursividadvector;

public class PRecursividadVector {

    
    
    public static void main(String[] args) {

        cVector V = new cVector();
        V.cargar();
        System.out.println(V);
        /*
        int s = V.suma(V.getDim());
        System.out.println("La suma de los elementos es " + s);
*/      /*
        int b = V.sumaPar(V.getDim());
        System.out.println("La suma de pares es = " + b);
        */
        /*
        int s = V.contarNulos(V.getDim());
        System.out.println("La cantidad de nulos es = " + s);
        */
        /*
        int s = V.buscar(5, V.getDim());
        System.out.println("El número está en la posición : " + s);
        */
        
        //double m = V.media(V.getDim());
        //System.out.println("La media del vector es = " + m);
        
        System.out.println("La suma de los elementos del subvextoe es " + V.subSuma(3, 9));
        
        
    }
}
