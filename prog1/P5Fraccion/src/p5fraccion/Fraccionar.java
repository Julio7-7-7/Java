package p5fraccion;

public class Fraccionar {

    private int a;
    private int b;

    public Fraccionar(){
        a=0;
        b=1;
    }

    public void PonerNumerador(int x){
        a=x;
    }

    public void PonerDenominador(int y){
        b=y;
    }

    public int SacarNumerador(){
        return a;
    }
    public int SacarDenominador(){
        return b;
    }

    public void simplificar(){
        for (int i= 2; i<=SacarDenominador();i++){
            while ((SacarNumerador() % i == 0 ) & (SacarDenominador() % i ==0)){
                PonerNumerador(SacarNumerador() / i);
                PonerDenominador(SacarDenominador() / i);
            }
        }
    }

}
