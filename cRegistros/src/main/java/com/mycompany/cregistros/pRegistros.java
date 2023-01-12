package com.mycompany.cregistros;

public class pRegistros {

    public static void main(String[] args) {
        
        
        cPersona p;
        p = new cDocente(5568446, "Jose", "Colque", 78546445, "Ing De Sistemas", 455);
        System.out.println("Info de la persona es " + p.getNombre());
    }
}
