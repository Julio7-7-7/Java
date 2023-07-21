package com.mycompany.pfigura;

public class cRectangulo extends cCuadrado{

    protected int base;
    
    cRectangulo(){
        super();
        base = 0;
    }
    
    cRectangulo(int x, int y, int lado, int base){
        super(x,y,lado);
        this.base = base;
    }

    int getBase() {
        return base;
    }

    void setBase(int base) {
        this.base = base;
    }
    
    @Override
    public double getArea(){
        return base * lado;
    }
    
    
    @Override
    public void dibujar(){
        System.out.println("Soy un dibujar de rectangulo");
    }
    
     @Override
    public double getPerimetro(){
        return 2*(base+lado);
    }
    
  
}
