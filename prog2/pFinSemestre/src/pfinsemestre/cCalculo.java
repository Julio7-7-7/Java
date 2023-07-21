package pfinsemestre;


public abstract class cCalculo {
    protected int peso;
    protected int talla;
    protected int edad;
    
    cCalculo(){
        peso=0;
        talla=0;
        edad=0;
    }
    
    cCalculo(int peso, int talla, int edad){
        this.peso=peso;
        this.talla=talla;
        this.edad=edad;
    }
    
    public void setPeso(int peso){
        this.peso=peso;
    }
    
    public int getPeso(){
        return peso;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public abstract void mostrar();
    
    public abstract double metaBasal();
        

}
