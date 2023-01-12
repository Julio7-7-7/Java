package com.mycompany.cregistros;

public class cEstudiante extends cPersona {
    
    protected int registro;
    protected String carrera;
    
    cEstudiante(){
        super();
        registro= 0;
        carrera = "";
    }
    
    cEstudiante(int id, String nombre, String apellido, int telefono, int registro, String carrera){
        super(id, nombre, apellido, telefono);
        this.registro = registro;
        this.carrera = carrera; 
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    @Override
    public String mostrar(){
        return super.mostrar();
    }
    
    
    
}
