package com.mycompany.cregistros;

public class cAdmin extends cPersona {
    
    protected int codAdm;
    protected String cargo;
    
    cAdmin(){
        super();
        codAdm = 0;
        cargo = "";
    }
    
    cAdmin(int id, String nombre, String apellido, int telefono, int codAdm, String cargo){
        super(id, nombre, apellido, telefono);
        this.codAdm = codAdm;
        this.cargo = cargo;
    }
    
    public void setCodAdm(int codAdm){
        this.codAdm = codAdm;
    }
    
    public int getCodAdm(){
        return codAdm;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public void mostrar(){
        
    }
}
