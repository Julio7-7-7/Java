package com.mycompany.preloj;

public abstract class cReloj {
    
    protected int hora;
    protected int minuto;
    protected int segundo;
    
    cReloj(){
        hora = 00;
        minuto = 00;
        segundo = 00;        
    }
    
    public void setHora(int hora, int minuto, boolean am){
        hora = this.hora;
        minuto = this.minuto;
        if(1<=hora){
            
        }
    }
    
}
