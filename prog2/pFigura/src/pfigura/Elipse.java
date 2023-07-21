/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pfigura;

/**
 *
 * @author Julius
 */
public class Elipse extends Circulo {
    private int radioY;
    
    Elipse(){
        super();
        radioY=0;
    }
    
    Elipse(int x, int y, int radioX, int radioY){
        super(x, y, radioX);
        this.radioY=radioY;
    }
    
    public int getRadioY(){
        return radioY;
    }
    
    public void setRadioY(int radioY){
        this.radioY = radioY;
    }
    
    @Override
    public double calcularArea(){
        return (Math.PI*getRadio()*getRadioY());
    }
    
    @Override
    public void dibujar(){
        System.out.println("Dinujar elipse");
    }
    
}
