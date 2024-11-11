public class Nodo {

    public final static Nodo TIERRA = null; // declaramos constante valores tierra

    private int Data;
    private Nodo Link;

    public Nodo() {

        Data = 0;
        Link = TIERRA;

    }

    public void ponerData(int x) {
        Data = x;
    }

    public void ponerLink(Nodo p) {
        Link = p;
    }
    
    public int data() {
        return Data;
    }

    public Nodo Link() {
        return Link;
    }

    public boolean almacLleno() {
        Nodo aux = new Nodo();
        return (aux == TIERRA);

    }

}
