public class ListaEnlazada {
   
    public static void ContarEle (int x){
    Nodo L, R;

    L = new Nodo();
    L.ponerData(2);
    L.ponerLink(Nodo.TIERRA);
    int cantidad= 0;
    R = L;
        while (R != Nodo.TIERRA){
    
            if (x == L.data()){
                cantidad ++;
            }
               
            L= L.Link();
            
        }
        System.out.println(cantidad);
    }
    
    public static void main(String[] args) throws Exception {


    ContarEle(2);
    System.out.println();




    }}

        
        /*   Nodo L, P, Q;
          
          L = new Nodo();
          P = new Nodo();
          Q = new Nodo();
          
          L.ponerData(1);
          L.ponerLink(P);
          
          P.ponerData(2);
          P.ponerLink(Q);
          
          Q.ponerData(3);
          Q.ponerLink(Nodo.TIERRA);
          Nodo R = L;
          
          while (R != Nodo.TIERRA) {
         
         System.out.print(R.data() + ",");
          R = R.Link();
         
         int n;
         int val; */
/*   
         int n;
         int val;
         Nodo L = Nodo.TIERRA;
         Nodo Aux;
         
         n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese N:"));
         for (int i = 1; i <= n; i++) {
             val = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor:"));
             Aux = new Nodo();
             Aux.ponerData(val);
             Aux.ponerLink(L);
             L = Aux;
         }
         
         Nodo R = L;
         while (R != Nodo.TIERRA) {
             System.out.print(R.data() + ",");
             R = R.Link();
         }
         System.out.print(" ");
        }
 */
            
      /*  
         Nodo L, Aux, Ult;
        Ult = new Nodo();
        L = new Nodo();
        int n;
        int val;

        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese N:"));

        for (int i = 1; i <= n; i++) {

            val = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor:"));
            Aux = new Nodo();
            Aux.ponerData(val);

            if (i == 1)
                L = Aux;
            
            else
                Ult.ponerLink(Aux);

            Ult = Aux;
        }
        Nodo R = L;

        while (R != Nodo.TIERRA) {

            System.out.print(R.data() + ",");
            R = R.Link();
        }
        System.out.print("");
    } 
} */






