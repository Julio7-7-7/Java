package com.mycompany.cregistros;

public class cDocente extends cPersona{
    
    protected String profesion;
    protected int codDoc;
    
    cDocente(){
        super();
        codDoc = 0;
    }
    
    cDocente(int id, String nombre, String apellido, int telefono, String profesion, int codDoc){
        super(id, nombre, apellido, telefono);
        this.profesion = profesion;
        this.codDoc = codDoc;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getCodDoc() {
        return codDoc;
    }

    public void setCodDoc(int codDoc) {
        this.codDoc = codDoc;
    }
    
    @Override
    public String mostrar(){
        return super.mostrar();
    }
    
    
}
