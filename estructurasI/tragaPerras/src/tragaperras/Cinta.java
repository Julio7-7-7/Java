package tragaperras;

import java.util.Random;

public class Cinta {
    
   public static final int Max = 9; // Limitar la cinta a 10 caracteres

    char V[];
    int dim;
    int i; // cabezal de lectura
    private char caracterSolitario;

    public Cinta() {
        V = new char[Max + 1];
        dim = -1; // Inicializar la cinta vacía
        i = 0;
    }

    private char generarCaracterPermitido() {
        Random random = new Random();
        String caracteresPermitidos = "0123456789AEIOUaeiou";
        return caracteresPermitidos.charAt(random.nextInt(caracteresPermitidos.length()));
    }

    public void inicializarCinta() {
        for (int k = 0; k <= Max; k++)
            V[k] = generarCaracterPermitido();
        dim = Max;
        i = 0;

        caracterSolitario = V[0]; // Almacenar el carácter solitario una vez generado
    }

    public String ultimos5Caracteres() {
        StringBuilder cr = new StringBuilder();
        int start = Math.max(0, dim - 4);
        for (int j = start; j <= dim; j++) {
            cr.append(V[j]);
        }
        return cr.toString();
    }

    public char caracterSolitario() {
        return caracterSolitario;
    }

    public void girarCinta() {
        if (i > dim) {
            reiniciarCinta();
        }
        caracterSolitario = V[i]; // Actualizar el carácter solitario antes del giro

        for (int k = 0; k < dim; k++) {
            V[k] = V[k + 1];
        }

        V[dim] = generarCaracterPermitido();

        i++;
    }

   public boolean haGanado() {
    for (int j = Math.max(0, dim - 4); j <= dim; j++) {
        char caracterActual = V[j];
        if (caracterActual == caracterSolitario) {
            return true;
        }
    }
    return false;
    }

   
    public void reiniciarCinta() {
        for (int k = 0; k <= dim; k++)
            V[k] = generarCaracterPermitido();
        i = 0;
    }
    

    public boolean FinCinta() {
        return i > dim;
    }

    public void imprimirCaracterSolitario() {
        System.out.println("Su caracter al azar es: " + caracterSolitario);
    }
}

