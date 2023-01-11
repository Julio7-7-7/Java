package com.mycompany.pfigura;

public class PFigura {

    
    public static cFigura figuraMayor(cFigura V[]){
        double areaMayor= 0.0;
        cFigura fMayor = null;
        for(int i=0; i<V.length; i++){
            if(V[i].getArea()>areaMayor)
                areaMayor = V[i].getArea();
                fMayor = V[i];
        }
        return fMayor;
    }
    
    public static cFigura perimetroMayor(cFigura V[]){
        double perimetroMayor= 0.0;
        cFigura pMayor = null;
        for(int i=0; i<V.length; i++){
            if(V[i].getPerimetro()>perimetroMayor)
                perimetroMayor = V[i].getArea();
                pMayor = V[i];
        }
        return pMayor;
    }
    
    
    public static void main(String[] args) {

       /* cCirculo C;
        C = new cCirculo(5,5,5);
        System.out.println("El area del circulo es = " + C.getArea());
        
        cElipse E;
        E= new cElipse(2,3,5,6);
        System.out.println("El area de la elipse es = " + E.getArea());
        
        
        cCuadrado Cu;
        Cu = new cCuadrado(2, 3, 5);
        System.out.println("El area del cuadrado es =" + Cu.getArea());
        
        cRectangulo R;
        R = new cRectangulo(5, 5, 4, 8);
        R.dibujar();
        
        Cu = R;
        Cu.dibujar();*/
       
       //arreglo de figuras
       
       cFigura F[];
       
       F = new cFigura[10];
       F[0] = new cElipse(1,2,1,4);
       F[1] = new cCirculo(3,4,3);
       F[2] = new cElipse(9,2,1,4);
       F[3] = new cCuadrado(2,5,3);
       F[4] = new cCirculo(1,2,4);
       F[5] = new cRectangulo(10,15,20,12);
       F[6] = new cCirculo(6,5,3);
       F[7] = new cElipse(1,2,3,4);
       F[8] = new cCuadrado(1,9,3);
       F[9] = new cCuadrado(1,4,6);
       
       /*
       F[0].dibujar();
       F[1].dibujar();
       F[2].dibujar();
       F[3].dibujar();
       F[4].dibujar();
       */
       
       /*
       for(int i=0; i<F.length; i++){
           F[i].dibujar();
       }
        */
       
       /*
        for(int i=0; i<F.length; i++){
           System.out.println("El area de la figura es = " + F[i].getArea() + " y su perimetro es = " + F[i].getPerimetro());
       }
        */
       
       cFigura fMayor = figuraMayor(F);
       fMayor.dibujar();
       
       cFigura pMayor = perimetroMayor(F);
       pMayor.dibujar();
       
       
       
       
       
       
    }
}
