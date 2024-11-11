package psparse;

public class PSparse {

    public static void main(String[] args) {
        Sparse S,T;
        
        S = new Sparse();
        T = new Sparse();
        
        S.setDim(5,4);
        T.setDim(2,3);
        
        S.set(1, 2, 3);
        S.set(3,1,9.5f);
        S.set(4,1,12.33f);
        S.set(5,4,67);        
        S.set(2, 2, 15);
        S.set(2,2,33);
        
        for(int i=1; i<=S.getFilas();i++){
            for(int j=1;j<=S.getCols();j++){
                System.out.print(S.get(i, j)+ "   ");
            }
            System.out.println("");
        }         
    }    
}
