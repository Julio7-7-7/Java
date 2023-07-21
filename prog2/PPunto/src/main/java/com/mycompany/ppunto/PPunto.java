/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ppunto;

import packagePuntoHeredado.Punto3D;
import packagePunto.Punto;

/**
 *
 * @author marcelo
 */
public class PPunto {

    public static void main(String[] args) {
        
       Punto P1,P2;
       P1 = new Punto();
       P2 = new Punto(5,3);
       
       /*
       System.out.println(P1);
       System.out.println(P2);
       System.out.println("----------------");
       */
       
       Punto3D P3, P4;
       
       P3 = new Punto3D();
       P4 = new Punto3D();
       
       P3.setX(5);
       P3.setY(4);
       P3.setZ(8);
       
        System.out.println("Las coordenadas son : " + P3);
       


    }
}
