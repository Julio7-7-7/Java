package com.mycompany.pfich;

public class cDocente extends cPersona{
    protected int codDoc;
    protected String profesion;
    
    cDocente(){
        super();
        codDoc=0;
        profesion=" ";
    }
    
    cDocente(int id, String nombre, String apellido, int telefono,int edad, int codDoc, String profesion){
        super(id, nombre, apellido, telefono,edad);
        this.codDoc=codDoc;
        this.profesion=profesion;
    }

    public int getCodDoc() {
        return codDoc;
    }

    public void setCodDoc(int codDoc) {
        this.codDoc = codDoc;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public void mostrar(){
        System.out.println("El docente "+getNombre()+" "+getApellido()+" con registro "+getId()+" y profesion "+getProfesion()+"y edad "+getEdad());
    }
    
    
}
