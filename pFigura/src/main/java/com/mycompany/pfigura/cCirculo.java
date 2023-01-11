package com.mycompany.pfigura;

public class cCirculo extends cFigura{
    
    protected int radio;
    
    cCirculo(){
        super(); //aqui estas llamando al constructor sin parametros}
        radio=0;
    }
    
    cCirculo(int x, int y, int radio){
        super(x,y);
        this.radio = radio;
    }
    
    public void setRadio(int radio){
        this.radio = radio;
    }
    
    public int getRadio(){
        return radio;
    }
    
    @Override
    public double getArea(){
        return Math.PI*radio*radio;
        
    }
    
    
    public void dibujar(){
        System.out.println("Soy un dibujar de circulo");
    }
    
    @Override
    public double getPerimetro(){
        return 2*Math.PI*radio;
    }
    
}
