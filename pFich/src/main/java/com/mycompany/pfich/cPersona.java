package com.mycompany.pfich;

public class cPersona {
    
    protected int id;
    protected String nombre;
    protected String apellido;
    protected int telefono;
    protected int edad;

    
    cPersona(){
        id=0;
        nombre=" ";
        apellido=" ";
        telefono=0;
        edad=0;
    }
    
    cPersona(int id, String nombre, String apellido, int telefono, int edad){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.edad=edad;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    
    public int getTelefono(){
        return telefono;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void mostrar(){
        System.out.println(getNombre()+" "+getApellido()+" con id "+getId()+" y celular "+getTelefono()+" y "+getEdad()+" años");
    }
    
}
