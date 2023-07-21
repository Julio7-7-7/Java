package com.mycompany.pfigura;

public class cElipse extends cCirculo{
    
    protected int radio2;
    
    cElipse(){
        super();
        radio2 = 0;
    }
    
    cElipse(int x, int y, int radio, int radio2){
        super(x,y,radio);
        this.radio2 = radio2;
    }

    public int getRadio2() {
        return radio2;
    }

    public void setRadio2(int radio2) {
        this.radio2 = radio2;
    }
    
    @Override
    public double getArea(){
        return Math.PI*radio*radio2;
    }
    
    
    @Override
    public void dibujar(){
        System.out.println("Soy un dibujar de elipse");
    }
    
     @Override
    public double getPerimetro(){
        return Math.PI*radio*(radio/2);
    }
    
    
}
