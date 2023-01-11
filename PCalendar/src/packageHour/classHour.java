/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageHour;

/**
 *
 * @author marcelo
 */
public class classHour {
    
    public int hora;
    public int minuto;
    public int segundo;

    public classHour(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public classHour(){
        hora = 1;
        minuto = 2;
        segundo = 2000;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    
    public String toString(){
        String cad = "";
        cad = Integer.toString(hora) + ":" + Integer.toString(minuto) + ":" + Integer.toString(segundo);
        /*
        cad = String.valueOf(hora)
        */
        return cad;
    }
}
