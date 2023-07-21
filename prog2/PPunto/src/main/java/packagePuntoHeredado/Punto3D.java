package packagePuntoHeredado;

import packagePunto.Punto;

public class Punto3D extends Punto {
    
    private int z;
    
    public Punto3D(){
        super();   /*llama al constructor de la clase padre (el que no tiene parámetros)*/
        this.z = 0;
    }
    
    public Punto3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    public String toString(){
        return "X ={" + getX()+ "} , Y ={" + getY() + "} , Z ={" + z + "}";
    }
            
    
    
    
    
    
}
