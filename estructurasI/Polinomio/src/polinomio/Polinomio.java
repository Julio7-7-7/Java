package polinomio;

public class Polinomio {

    public static void main(String[] args) {
        
        CPolinomio p,q;
        p = new CPolinomio();
        q = new CPolinomio();
        //q.insertar(5, 1);
        //q.insertar(5, 2);
        //q.insertar(5, 3);
        //q.insertar(5, 4);
        p.insertar(5, 4);
        p.insertar(2, 2);
        p.insertar(1, 1);
        //p.insertar(5, 0);
        //System.out.println(p.getexp(3));
        //System.out.println(p.getcoef(3));
        //System.out.println(q.getexp(3));
        //System.out.println(q.getcoef(3));
        //System.out.println(q.cant());
        System.out.println(p.cant());
        //System.out.println(p.grado());
        System.out.println(p.mostrar());
        //System.out.println(q.mostrar());
        //p.suma(p);
        //System.out.println(p.mostrar());
        //System.out.println(p.cant());
        //p.multiplicar(p);
        //System.out.println(p.equis(2));
        p.exam(4, 2);
        System.out.println(p.mostrar());
    }
    
}
