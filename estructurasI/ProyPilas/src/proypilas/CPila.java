/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proypilas;

import javax.swing.JOptionPane;

/**
 *
 * @author Franklin
 */
public class CPila {
    public static final int max=50;
    private int v[];
    private int cima;
    
    public CPila(){
        v= new int [max+1];
        cima = -1;
    }
    public boolean Vacia(){
        return (cima ==-1);
    }
     public boolean Llena(){
        return (cima == max);
    }
     public int Cant(){
         return cima+1;
     }
    public void Push(int x){
        if(this.Llena()){
            JOptionPane.showMessageDialog(null,"Error memoria llena");
            System.exit(0);
        }
        cima++;
        v[cima]=x;
    }
    public int Pop(){
        if(this.Vacia()){
           JOptionPane.showMessageDialog(null,"Error memoria vacia");
           System.exit(0);
        }
        int x = v[cima];
        cima--;
        return x;
    }
   
    public int Tope(){
        return v[cima]; 
    }
    
    @Override
    public String toString(){
        String cad = "P[ ";
       int i=0;
       while(i<=cima){
           cad = cad + v[i] +" , ";
           i++;
       }
       cad=cad+"]";
       return cad;
    }
    
    public void invertir(){
        if(this.Vacia()){
            System.out.println("Error Pila vacia");
            System.exit(0);
        }
       int temp;
       int tamaño = this.Cant();
        for(int i=0;i<tamaño/2;i++){
           temp = v[i];
           int incontrario = tamaño - i -1;
           v[i] = v[incontrario];
           v[incontrario]= temp;
       } 
    }
    
    public int suma(){
        int s=0;
        for(int i=0;i<=cima;i++){
            s=s+v[i];
        }
        return s;
    }
    public void eliminar(int posi){
        this.invertir();
        int i=posi;
        while(i<=this.Cant()-1){
            v[i]=v[i+1];
            i++;
        }
        cima--;
        this.invertir();
    }
    
    public void insertar(int posi,int val){
        this.invertir();
        int i= posi;
        int j=this.Cant();
        while(j>=posi){
            v[j+1]=v[j];
            j--;
        }
        v[posi]=val;
        cima++;
        this.invertir();
    }
    public boolean capicua(){
       int i=0;
       boolean bandera=true;
       while(i<cima && bandera){
           if(v[i]==v[cima]){
               i++;
               cima--;
           }
           else{
               bandera=false;
           }
       }
       return bandera;
    }
    public void exam1(CPila p,int m){
        int i=0;
        int s,x,z,y;
        s=x=z=y=0;
        if(m<this.Cant()){
            while(m>0){
                x=p.Pop();
                s=s+x;
                m--;
            }
            p.Push(s);
        }
        else{
            while(i<=cima){
                z=z+v[i];
                i++;
            }
            while(!p.Vacia()){
                p.Pop();
            }
            p.Push(z);
        }
    }
    public void sumar(){
        int i=0;
        int z=0;
        int s=0;
        while(!this.Vacia()){
            z=this.Pop();
            s=s+z;
        }
        this.Push(s);
    }
    
    public void sumarultimos(){
       int x,y;
       if (this.Cant()>2){
           x=this.Pop();
           y=this.Pop();
           x=x+y;
           this.Push(x);
       }
    }
    
    public int popprimero(){
        int val=v[0];
        int i=0;
        while(i<(this.Cant()-1)){
            v[0]=v[i+1];
            //cima--;
            
        } 
        
        
        return val;
        
    }

    
    
}
