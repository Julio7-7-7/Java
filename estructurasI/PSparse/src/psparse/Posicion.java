package psparse;

public class Posicion {

    int fila;
    int col;

    Posicion(int i, int j) {
        fila = i;
        col = j;
    }

    int getFila() {
        return fila;
    }

    int getCol() {
        return col;
    }

    void setFila(int i) {
        fila = i;
    }

    void setCol(int j) {
        col = j;
    }

    boolean menor(Posicion A, Posicion B) {
        // return true si y solo si A(i,j) < B(i,j)
        if (A.fila < B.fila) {
            return true;
        } else if (A.fila > B.fila) {
            return false;
        } else if (A.col < B.col) {
            return true;
        } else {
            return false;
        }
    }

    boolean mayor(Posicion A, Posicion B) {
        if (A.fila > B.fila) {
            return true;
        } else if (A.fila < B.fila) {
            return false;
        } else if (A.col > B.col) {
            return true;
        } else {
            return false;
        }
    }

    boolean igual(Posicion A, Posicion B) {
        return ((A.fila == B.fila) && (A.col == B.col));
    }
}
