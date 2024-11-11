
package com.chocolino.pcinta;

public class Cinta {
    
    // para la implementacion utilizaremos un vextor de caracteres ademas de dos
    // variables enteras
    // para crear constantes se hace como abajo
    public static final int Max = 100;

    char V[];
    int dim;
    int i; // cabezal de lectura

    public Cinta() {

        V = new char[Max + 1];
        dim = (int) (Math.random() * (Max - (-1) + 1) + (-1));
        i = 0;

        for (int k = 0; k <= dim; k++)

            V[k] = (char) ((int) (Math.random() * (255 - 33 + 1)) + 3);
    }

    public char CaracterCorriente() {
        // pre condicion: EL cabezal no está en el fin de cinta
        if (i > dim) { // diverge con la precondición
            System.out.println("cc(): El cabezal está en el final de la Cinta");
            System.exit(1);
        }
        return V[i];
    }

    public void avanzar() {
        // Pre: El cabezal no está en el final de la cinta
        if (i > dim) {
            System.out.println("avanzar(): El cabezal está en el final de la Cinta");
            System.exit(1);
        }
        i++;
    }

    public boolean FinCinta() {

        if (i > dim)

            return true;
        else
            return false;
    }
}
