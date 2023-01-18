package com.mycompany.pproyectofinal;

public class cHombre extends cCalculo{
    
    cHombre(){
        super();
    }
    
    cHombre(int peso, int estatura, int edad){
        super(peso,estatura,edad);
    }
    
    @Override
    public void calcular(){
        System.out.println("Tu metabolismo basal es: " + 66+(13.7));
    }
}
