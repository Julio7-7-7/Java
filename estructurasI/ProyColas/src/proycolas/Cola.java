package proycolas;

public class Cola {
    
    public final static int Max = 50;
    int V[];
    private int Frente;
    private int Atras;
    Cola(){
        V = new int[Max+1];
        Frente = Atras = -1;
    }
    
    boolean vacia(){
        return((Frente==-1)&&(Atras==-1));
    }
    
    void meter(int x){
        if(llena()){
            throw new RuntimeException("Error Cola llena");
        }
        
        if(vacia()) // 1er inserción
            Frente=Atras=0;        
        else
        {
            Atras++;
            if(Atras>Max)
                Atras = 0;            
        }
        V[Atras]=x;                        
    }
    int sacar(){
        if(vacia())
            throw new RuntimeException("Error: Cola vacía");
        
        int aux = V[Frente];
        if(Frente==Atras)            
            Atras=Frente=-1; // condición de vacía
        else{            
            Frente++;
            if(Frente > Max)
                Frente = 0;           
        }
        return aux;
    }
    
    boolean llena(){
        int aux = Atras;
        aux++;
        if (aux>Max)
            aux = 0;
        return(aux==Frente);
    }
    
    @Override
    public String toString(){
        String cad="[ ";
        int i = Frente;
        while(i!=Atras){
            cad += V[i]+" , ";
            i++;
            if(i>Max)
                i = 0;
        }
        cad += V[Atras]+" ]";
        return cad;
    }
    
    int cant(){
        if(vacia())
            return 0;
        else{
            if(Frente<=Atras)
                return(Atras-Frente+1);
            else
                return (Atras+1)+(Max-Frente+1);
        }
    }
}
