/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcola;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Pila {
    
    public static final int Max = 50; // constante Max
    
    private int V[];
    private int cima;
    
    Pila(){
        V = new int[Max+1];
        cima = -1;
    }
    
    boolean vacia(){
        return (cima==-1);
    }
    
    boolean llena(){
        return (cima==Max);
    }
    
    void push(int x){
        if ( llena() ){
            JOptionPane.showMessageDialog(null,"Error: Pila llena");
            System.exit(0);
        }
        cima++;
        V[cima]=x;
    }    
    int pop(){
        if(vacia()){
            JOptionPane.showMessageDialog(null,"Error: Pila Vacia");
            System.exit(0);
        }
        int x = V[cima];
        cima--;
        return x;
    }
    int tope(){
        if(vacia()){
            JOptionPane.showMessageDialog(null,"Error: Pila Vacia");
            System.exit(0);
        }
        return V[cima];
    }    
    int cant(){
        return cima+1;
    }  
    
    @Override
    public String toString(){
        String cad = "P[ ";
        int i=0;
        while(i<=cima){
            cad = cad + V[i] + " , ";
            i++;
        }
        cad = cad + " ]";
        return cad;
    }
}
