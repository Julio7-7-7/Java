package com.mycompany.precursividadvector;

import javax.swing.JOptionPane;

public class cVector {
    
    int V[];
    int n;
    
    cVector(){
        V= new int[100];
        n = 0;
    }
    
    void setDim(int n){
        this.n = n;
    }
    
    int getDim(){
        return n;
    }
    
    void setElemento(int i, int val){
        V[i]=val;
    }
    
    int getElemento(int i){
        return V[i];
    }
    
    void cargar(){
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dialogo"));
        for(int i=1; i<=n; i++){
            int val = Integer.parseInt(JOptionPane.showInputDialog("ingrese el vector"));
                    V[i-1]=val;
                            }
    }
    
    public String toString(){
        String cad = "V[ ";
        for(int i=0; i<n; i++)
            cad = cad + Integer.toString(V[i]) + " , ";
        cad = cad + "]";
        return cad;
        
    }
    
    
    /*suma recursiva de los elementos*/
    int suma(int n){
        if(n==1)
            return V[0];
        else
        {
            int aux = suma(n-1);
            return aux+V[n-1];
        }
    }
    
    int sumaPar(int n){
        if (n==1)
            if(V[0]%2==0)
                return V[0];
            else 
                return 0;
        else
            {
                int aux= sumaPar(n-1);
                if(V[n-1]%2==0)
                    return aux + V[n-1];
                else
                    return aux;
            }
    }
    
    int contarNulos(int n){
        if(n==1)
            if(V[0]==0)
                return 1;
            else
                return 0;
        else
        {
            int aux= contarNulos(n-1);
            if(V[n-1]==0)
                return aux+ 1;
            else
                return aux;
        }
    }
    
    int buscar(int e, int n){
        if(n==1)
            if(V[n-1]==e)
                return 0;
            else
                return -1;
        else
        {
            int aux= buscar(e, n-1);
            if(aux==-1)
                if(V[-1]==e)
                    return n-1;
                else
                    return -1;
            else 
                return aux;
        }
    }
    
    double media(int n){
        if(n==1)
            return V[n-1];
        else
        {
            double aux= media(n-1);
            return ((aux*(n-1)) + V[n-1]) / n;
        }
    }
    
    int subSuma(int ini, int fin){
        int n = ini - fin + 1;
        if(n==1)
            return V[ini];
            else
                if(n==2)
                    return V[ini] + V[fin];
        else
                {
                    int aux = subSuma(ini+1 , fin-1);
                    return aux + V[ini] + V[fin];
                }
    }
    
    void subInvertir(int ini, int fin){
        int n= fin - ini + 1 ;
        if(n==1)
        {
        }       
        else
        {
            if(n==2)
            {
                int aux = V[ini];
                V[ini] = V[fin];
                V[fin] = aux;
            }
            else
            {
                subInvertir(ini+1, fin-1);
                int aux = V[ini];
                V[ini] = V[fin];
                V[fin] = aux;
            }
            
        }
    }
}
