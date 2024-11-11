package pilas;
import java.util.Random;
public class cPilas {

    final int Max = 50;

    private int V[];
    private int cima;

    cPilas() {
        V = new int[Max + 1];
        cima = -1;
    }
    
    public boolean vacia() {
        return (cima == -1);
    }

    public boolean llena() {
        return (cima == Max);
    }

    public void push(int x) {
        if (llena()) {
            System.out.println("La pila está llena");
            System.exit(1);
        }

        cima++;
        V[cima] = x;
    }
    
    public int pop() {
        if (vacia()) {
            throw new RuntimeException("Error: pila vacia");
        }
        int x = V[cima];
        cima--;
        return x;

    }

    public int tope() {
        if (vacia()) {
            throw new RuntimeException("Error: pila vacia");
        }

        return V[cima];
    }

    public int cant() {
        return cima + 1;
    }

    public void cargar(int n) {
        Random R = new Random();

        for (int i = 0; i < n; i++) {
            V[i] = R.nextInt(10);
        }
        cima = n - 1;
    }

    @Override
    public String toString() {
        String cad = "P=[";
        for (int i = 0; i <= cima; i++) {
            cad += V[i] + ",";

        }
        cad += "]";
        return cad;
    }
    }

