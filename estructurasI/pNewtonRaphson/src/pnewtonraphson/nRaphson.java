package pnewtonraphson;

public class nRaphson {
   
    private double xi;
    private double xr;
    private double Et;
    private double Es;

    public nRaphson() {
        xi = 0.0;
        Et = 100.0;
        Es =0.0;
        xr = 0.0;
    }
        
    void setIntervalo(double xi){
        this.xi = xi;        
    }
    
    void setEs(double Es){
        this.Es = Es;
    }

    public void setXr(double xr) {
        this.xr = xr;
    }
    
    double getRaiz(){
        return xi;
    }
    
    double funcion(double x){
        //return Math.exp(-x)-x;
        return Math.exp(x) + Math.pow(x, 3) + 2 * Math.pow(x, 2) + 10 * x - 20;
    }
    
    double funcionDerivada(){
        double x = xi;
        //return -Math.exp(-x)-1;
        return Math.exp(x) + 3 * Math.pow(x, 2) + 4 * x + 10;
    }
    
    void MNewton_Raphson(int iter){
        int i = 1;
        double xrant=0.0;
        System.out.println("iter \t Xi \t\t Et");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        
        while((i<=iter)&&(Et>Es)){
            xi = xi-(funcion(xi)/funcionDerivada());
            System.out.print(i+"\t");
            System.out.printf("%10.7f",xi);
            Et = Math.abs((xr-xi)/xr)*100;
            System.out.printf("%10.2f",Et); 
            System.out.println("");  
            xrant = xi;
            i++;
        }
    }
}

