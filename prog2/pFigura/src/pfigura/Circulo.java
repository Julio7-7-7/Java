/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pfigura;

/**
 *
 * @author Julius
 */
public class Circulo extends Figura{

    private int radio; 

    Circulo(){
        radio=0;
    }
    
    Circulo(int x, int y, int radio){
        setX(x);
        setY(y);
        this.radio=radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    
    
    @Override
    public double calcularArea() {
        return (2*Math.PI*radio);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujar círculo");
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
