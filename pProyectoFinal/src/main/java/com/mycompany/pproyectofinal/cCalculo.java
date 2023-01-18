package com.mycompany.pproyectofinal;

public abstract class cCalculo {
    
    protected int peso;
    protected int estatura;
    protected int edad;
    
    cCalculo(){
        peso=0;
        estatura=0;
        edad=0;
    }
    
    cCalculo(int peso, int estatura, int edad){
        this.peso=peso;
        this.estatura=estatura;
        this.edad=edad;
    }
    
    public void setPeso(int peso){
        this.peso=peso;
    }
    
    public int getPeso(){
        return peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void calcular(){
        System.out.println("Edad "+getEdad()+" años Peso actual "+getPeso()+ "kg y altura "+getEstatura()+" cm");
    }
    
}
