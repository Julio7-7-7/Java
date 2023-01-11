package com.mycompany.pfigura;

public class cCuadrado extends cFigura{
    
    protected int lado;
    
    cCuadrado(){
        super();
        lado = 0;
    }
    
    cCuadrado(int x, int y, int lado){
        super(x,y);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    @Override
    public double getArea(){
        return lado * lado;
    }
    
    public void dibujar(){
        System.out.println("Soy un dibujar de cuadrado");
    }
    
     @Override
    public double getPerimetro(){
        return lado*4;
    }
    
    
}
