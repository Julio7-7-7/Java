package pfraccion;

public class PFraccion {
    
    public static void main(String[] args) {
        
        CFraccion F,F1;
        F = new CFraccion();
        F1 = new CFraccion(5, 7);
        
        F.setNum(25);        
        F.setDen(50);
        
        System.out.println("La fraccion es "+F);
        System.out.println("La fraccion es "+F1);
    }
    
}
