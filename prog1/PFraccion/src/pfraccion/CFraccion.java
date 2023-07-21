/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pfraccion;

/**
 *
 * @author Julius
 */
public class CFraccion {
    int num;
    int den;
    
    private int mcd(int a, int b){
        if(b>a){
            int aux=a;
            a=b;
            b=aux;
        }
        int resto=0;
        do{
            int cociente = a/b;
            resto= a%b;
            a=b;
            b=resto;
        }while(resto!=0);
        return a;
    }
    
    private void simplificar(){
        //Eliminar los signos repetidos
        if(num*den>0){
            num = Math.abs(num);
            den = Math.abs(den);
        }
        else{
            num = -Math.abs(num);
            den = Math.abs(den);
        }
        
        int m = mcd(Math.abs(num), den);
        num = num/m;
        den = den/m;
    }
    
    CFraccion(){
        num = 0;
        den = 1;
    }
    CFraccion(int num, int den){
        if(den == 0){
            System.out.println("No se puede dividir entre 0");
            System.exit(0);
        }
        this.num = num;
        this.den = den;
        simplificar();
    }
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        simplificar();
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
        simplificar();
    }
    
    public String toString(){
        String cad= "";
        cad= num+"/"+den;
        return cad;
    }
}
