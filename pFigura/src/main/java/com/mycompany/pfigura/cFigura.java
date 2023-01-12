package com.mycompany.pfigura;

public abstract class cFigura {
    //el metodo abstracto es el que se define en la clase base pero no se programa hasta las clases heredadas
    
    protected int x;
    protected int y;
    
    cFigura(){
        x = 0; 
        y = 0;
    }
    
    cFigura(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public abstract void dibujar();
    
    public abstract double getArea();
        
    public abstract double getPerimetro();
    
}
