import java.util.Random;

public class Pila {

    final int Max = 50;

    private int V[];
    private int cima;

    Pila() {
        V = new int[Max + 1];
        cima = -1;
    }

    boolean vacia() {
        return (cima == -1);
    }

    boolean llena() {
        return (cima == Max);
    }

    void push(int x) {
        if (llena()) {
            System.out.println("La pila está llena");
            System.exit(1);
        }

        cima++;
        V[cima] = x;
    }

    int pop() {
        if (vacia()) {
            throw new RuntimeException("Error: pila vacia");
        }
        int x = V[cima];
        cima--;
        return x;

    }

    int tope() {
        if (vacia()) {
            throw new RuntimeException("Error: pila vacia");
        }

        return V[cima];
    }

    int cant() {
        return cima + 1;
    }

    void cargar(int n) {
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
