package psparse;

public class Sparse {
    
    private Posicion Pos[];
    private float Valor[];
    private int n;
    private int NFilas, NCols;
    public static final int max=50;
    
    Sparse(){
        Pos = new Posicion[max+1];
        Valor = new float[max+1];
        n=-1;
    }
    void setDim(int m, int n){
        NFilas = m;
        NCols = n;
    }
    
    void set(int i, int j, float valor){
        if((i>NFilas)||(j>NCols)){
            System.out.println("Error Posicion no válida");
            System.exit(1);
        }        
        if(n==-1){//1era inserción 
            if(valor!=0){
                
                Pos[0]=new Posicion(i,j);                
                Valor[0]=valor;
                n++;
            }
        }
        else{
            Posicion P = new Posicion(i,j);
            int pos=0;
            while((pos<=n)&&(P.menor(Pos[pos], P)))
                pos++;
            if(pos>n){
                Pos[pos]=P;
                Valor[pos]=valor;
                n++;
            }else{
                if(P.igual(Pos[pos], P))
                    if(valor!=0)
                        Valor[pos]=valor;
                    else{
                        for(int k=pos;k<=n-1;k++){
                            Pos[k]=Pos[k+1];
                            Valor[k]=Valor[k+1];
                        }
                        n--;
                    }
                else{//las posiciones son distintas: Insertar si valor!=0
                    if(valor!=0){
                        for(int k=n+1;k>=pos+1;k--){
                            Pos[k]=Pos[k-1];
                            Valor[k]=Valor[k-1];
                        }
                        n++;
                        Pos[pos]=P;
                        Valor[pos]=valor;
                    }
                }
            }
            
        }
    }    
    double get(int i, int j){
        if((i>NFilas)||(j>NCols)){
            System.out.println("Error Posicion no válida");
            System.exit(1);
        }        
        Posicion P= new Posicion(i, j);
        int k=0;
        while((k<=n)&&(!P.igual(Pos[k],P)))
            k++;
        if(k>n)
            return 0;
        else
            return Valor[k];
    }
    
    int getFilas(){
        return NFilas;
    }
    int getCols(){
        return NCols;
    }
}
