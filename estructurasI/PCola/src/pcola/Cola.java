/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcola;

/**
 *
 * @author Usuario
 */
public class Cola {
    
    private final int Max = 50;
    private int V[];
    private int Frente;
    private int Atras;
    
    Cola(){
        V = new int[Max+1];
        Frente=Atras=-1;
    }
    
    boolean vacia(){
        return ((Frente==-1)&&(Atras==-1));
    }
    
    void adicionar(int x){
        if(llena()){
            System.out.println("Error: Cola llena");
            System.exit(1);
        }        
        if((Frente == -1)&&(Atras==-1)){ //1er inserción
            Frente = Atras = 0;
            V[Atras] = x;
        }
        else{
            Atras++;
            if (Atras > Max)
                Atras = 0;
            V[Atras] = x;
        }
    }
    
    int sacar(){
        if (vacia()){
            System.out.println("Error: Cola Vacía");
            System.exit(1);
        }
        int x=0;
        x = V[Frente];
        
        if(Frente==Atras)
            Frente=Atras=-1;
        else{
            Frente++;
            if(Frente>Max)
                Frente = 0;
        }        
        return x;
    }
    
    boolean llena(){
        int atrasAux = Atras;
        atrasAux++;
        if(atrasAux>Max)
            atrasAux = 0;
        if(atrasAux==Frente)
            return true;
        else
            return false;
        
    }

    int cant(){
        if (vacia())
            return 0;
        else
            if(Atras>=Frente)
                return (Atras-Frente+1);
            else
                return (Atras-0+1)+(Max-Frente+1);
    }
    
    @Override
    public String toString(){
        int pos=Frente;
        String cad ="[ ";
        while(pos!=Atras){
            cad = cad + Integer.toString(V[pos])+" , ";
            pos++;
            if(pos>Max)
                pos=0;
        }
        cad = cad + Integer.toString(V[Atras])+"]";
        return cad;
    }
}
