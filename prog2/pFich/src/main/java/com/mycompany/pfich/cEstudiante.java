package com.mycompany.pfich;

public class cEstudiante extends cPersona {
    protected int registro;
    protected String carrera;
    
    cEstudiante(){
        super();
        registro=0;
        carrera="";
    }
    
    cEstudiante(int id, String nombre, String apellido, int telefono,int edad, int registro, String carrera){
        super(id,nombre,apellido,telefono,edad);
        this.registro=registro;
        this.carrera=carrera;         
    }
    
    public void setRegistro(int registro){
        this.registro=registro;
    }
    
    public int getRegistro(){
        return registro;
    }
    
    public void setCarrera(String carrera){
        this.carrera=carrera;
    }
    
    public String getCarrera(){
        return carrera;
    }
    
    @Override
    public void mostrar(){
        System.out.println("El estudiante "+getNombre()+getApellido()+" de la carrera "+getCarrera()+" con numero de registro"+getRegistro()+" y edad"+getEdad());
    }
    
    
}
