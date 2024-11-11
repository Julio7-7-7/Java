/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcola;

/**
 *
 * @author Usuario
 */
public class PCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola Q,R,S;        
        Q = new Cola();
        R = new Cola();
        S = new Cola();
        Pila P;
        P = new Pila();
        Q.adicionar(5);
        Q.adicionar(7);
        Q.adicionar(8);
        Q.adicionar(1);
        Q.adicionar(9);
        Q.adicionar(6);
        System.out.println(Q);
        while(!Q.vacia()){
            int x;
            x = Q.sacar();
            P.push(x);
        }            
        while(!P.vacia()){
            int x;
            x = P.pop();
            Q.adicionar(x);
        }
        System.out.println(Q);
    }    
}
