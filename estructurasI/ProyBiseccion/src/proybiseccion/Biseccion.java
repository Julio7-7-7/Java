/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proybiseccion;

/**
 *
 * @author Usuario
 */
public class Biseccion {
    
    private double xl;
    private double xu;
    private double xr;
    private double Es;
    
    public Biseccion(){
        xl = 0.0;
        xu = 0.0;
        xr = 0.0;
        Es = 0.0;
    }
    
    public void setIntervalo(double a, double b){
        xl = a;
        xu = b;
    }
    
    public void setEs(double x){
        Es = x;
    }
    
    public double getRaiz(){
        return xr;
    }
    
    private double funcion(double x){
       // return (-0.6*Math.pow(x,2)+2.4*x+5.5);
       //return  Math.pow(x, 3)+4*Math.pow(x,2)-10;
       //return Math.log(Math.pow(x, 2)+1)-Math.exp(x/2)*Math.cos(Math.PI*x);
       return Math.exp(x)+Math.pow(2, -x)+2*Math.cos(x-6);
    }
    
    public void biseccion(int cantIter){
    
        int i = 1; // Contador de iteraciones
        double Ea=100.0;
        double xrant = 0.0;          
        
        System.out.println("iter \t   Xl \t      Xu \t  Xr \t     f(xr) \t    Ea");
        System.out.println("--------------------------------------------------------------");
        while((i<=cantIter)&&(Ea>Es)){
            
            xr = (xl+xu)/2;
            
            System.out.print(i+"      ");
            System.out.printf("%10.8f",xl);
            System.out.printf("%12.8f",xu);
            System.out.printf("%12.8f",xr);
            System.out.printf("%14.8f",funcion(xr));
            if(funcion(xl)*funcion(xr)<0)
                xu = xr;
            else
                xl = xr;
            
            Ea = Math.abs((xr-xrant)/xr)*100;            
            if (i>1)
                System.out.printf("%8.2f\n",Ea);
            else
                System.out.println("");            
          
            xrant = xr; 
            i++;
        }
        System.out.println("----------------------------------------------------------------");
    }
}
    
