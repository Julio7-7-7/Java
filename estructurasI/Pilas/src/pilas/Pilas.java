package pilas;

public class Pilas {

    public static void main(String[] args) throws Exception {
        
        cPilas P = new cPilas();

        P.cargar(5);
        System.out.println(P);
        int suma = 0;
        while (!P.vacia()) {
            int a = P.pop();
            suma = suma + a;
        }
        System.out.println("La suma es: " + suma);
       
    }
    }
    
