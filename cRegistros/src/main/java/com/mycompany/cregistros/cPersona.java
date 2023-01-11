package com.mycompany.cregistros;

public abstract class cPersona {
    
    protected int id;
    protected String nombre;
    protected String apellido;
    protected int telefono;
    
    cPersona(){
        id = 0;
        nombre = "";
        apellido = "";
        telefono = 0;
    }
    
    cPersona(int id, String nombre, String apellido, int telefono){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public void mostrar(){
        
    }
    
}
