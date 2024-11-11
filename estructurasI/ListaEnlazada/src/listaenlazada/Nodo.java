package listaenlazada;

import javax.swing.JOptionPane;

public class Nodo {
    
    public final static Nodo TIERRA = null;
    
    private int Data;
    private Nodo Link;
    
    public Nodo(){
        Data = 0;
        Link = TIERRA;
    }
    
    public void ponerData(int x){
        Data = x;
    }
    
    public void ponerLink(Nodo p){
        Link = p;
    }
    
    public int data(){
        return Data;
    }
    
    public Nodo link(){
        return Link;
    }
    
    public boolean almacLleno(){
        Nodo aux = new Nodo();
        return(aux==TIERRA);
    }  
    
    public void cargar(){
        int n;
        int val; 
        Nodo L = Nodo.TIERRA;
        Nodo aux;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingresar cantidad de elementos"));
        for(int i=1; i<=n; i++){
            val = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el valor"));
            aux= new Nodo();
            aux.ponerData(val);
            aux.ponerLink(L);
            L=aux;
        }
        Nodo R = L;
        while(R!=Nodo.TIERRA){
            System.out.print(R.data()+" , ");
            R = R.link();
        }
        System.out.println("");
    }
    
    public void invertir(Nodo L){
        Nodo P = L;
        Nodo aux, R;
        Nodo Q = TIERRA;
            while(P!= Nodo.TIERRA){
                aux = new Nodo();
                aux.ponerData(P.Data);
                aux.ponerLink(Q);
                Q = aux;
                P=P.link();
            }
        R=Q;
        while(R!=Nodo.TIERRA){
            System.out.print(R.data()+" ,");
            R = R.link();
        }
        System.out.println("");
    }
    
    public void addFinal (Nodo L, int x){       
        Nodo P = L;
        Nodo aux;
        while(P.link()!=Nodo.TIERRA){
            P= P.link();
        }
        aux= new Nodo();
        aux.ponerData(x);
        aux.ponerLink(TIERRA);
        P.ponerLink(aux);
    }
    
    
    
}
