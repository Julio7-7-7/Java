package com.mycompany.pfich;

public class cAdmin extends cPersona{
    
    protected int codAdm;
    protected String cargo;
    
    cAdmin(){
        super();
        codAdm=0;
        cargo=" ";
    }
    
    cAdmin(int id, String nombre, String apellido, int telefono,int edad, int codAdm, String cargo){
        super(id, nombre, apellido, telefono,edad);
        this.codAdm=codAdm;
        this.cargo=cargo;
    }
    
    public void setCodAdm(int codAdm){
        this.codAdm=codAdm;
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
        System.out.println("El admin "+getNombre() +" "+getApellido()+" con cargo de "+getCargo()+" y edad"+getEdad());
    }
}
