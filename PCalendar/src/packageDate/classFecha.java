package packageDate;

public class classFecha {
   
    public int dia;
    public int mes;
    public int año;

    public classFecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    public classFecha(){
        dia = 1;
        mes = 2;
        año = 2000;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public String toString(){
        String cad = "";
        cad = Integer.toString(dia) + "/" + Integer.toString(mes) + "/" + Integer.toString(año);
        return cad;
    }
    
}
