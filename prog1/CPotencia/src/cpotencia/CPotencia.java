package cpotencia;

public class CPotencia{

    private int base;
    private int expo;

    public CPotencia(){
        base=0;
        expo=1;
    }

    public void PonerBase(int x){
        base=x;
    }
    
    public void PonerExponente(int y){
        expo=y;
    }
 
    public int SacarBase(){
        return base;
    }
 
    public int SacarExponente(){
        return expo;
    }

    public int resolver(){
        int i=0;
        int resultado=1;
        while (i<expo){
            resultado=resultado*base;
            i++;
        }
        return resultado;
    }

}
