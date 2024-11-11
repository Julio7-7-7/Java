package com.chocolino.pcinta;

public class PCinta {

    public static boolean esVocal(char c) {
        switch (Character.toUpperCase(c)) {
            case 'A':
                return true;
            case 'E':
                return true;
            case 'I':
                return true;
            case 'O':
                return true;
            case 'U':
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {

        Cinta C = new Cinta();

        int contador = 0;

        while (!C.FinCinta()) {
            char c = C.CaracterCorriente();
            System.out.println(c);

            if (esVocal(c))
                contador++;

            C.avanzar();
        }
        System.out.println("La cantidad de vocales es: " + contador);

    }
}
