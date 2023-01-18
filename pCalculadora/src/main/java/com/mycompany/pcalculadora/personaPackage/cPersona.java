package com.mycompany.pcalculadora.personaPackage;

public abstract class cPersona {
    protected int edad;
    protected int peso;
    protected int estatura;
    protected int factorActividad;
    
    cPersona(){
        int edad=0;
        int peso=0;
        int estatura=0;
        int factorActividad=0;
    }
    
    cPersona(int edad, int peso, int estatura, int factorActividad){
        this.edad=edad;
        this.peso=peso;
        this.estatura=estatura;
        this.factorActividad=factorActividad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getFactorActividad() {
        return factorActividad;
    }

    public void setFactorActividad(int factorActividad) {
        this.factorActividad = factorActividad;
    }
    
    
}
