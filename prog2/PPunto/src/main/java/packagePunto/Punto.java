package packagePunto;

public class Punto {
    
    public int x;
    public int y;
    
    public Punto(){
        x=y=0;
    }

    public Punto(int x, int y) {
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
    
    public String toString(){
        return "El punto x es ={" + x + "} y el punto y= {" + y + "}";
    }
    
}
