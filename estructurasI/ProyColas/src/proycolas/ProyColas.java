package proycolas;

public class ProyColas {

    public static void main(String[] args) {
        // TODO code application logic here
        Cola C,Q,R;
        C = new Cola();
        Q = new Cola();
        R = new Cola();
        
        /*for(int i=1;i<=5;i++)
            C.meter(i);
        
        for(int i=2;i<=10;i++)
            Q.meter(i);*/
        
        for(int i=10;i<=25;i++)
            R.meter(i);
        
        /*System.out.println(C);
        System.out.println(Q);*/
        System.out.println("Cola original: "+R);
        Pila P = new Pila();        
        while(!R.vacia())
            P.push(R.sacar());
        
        while(!P.vacia())
            R.meter(P.pop());
        
        System.out.println("Cola invertida: "+R); 
        System.out.println("La cantidad de elementos es: "+R.cant());
    }    
}
