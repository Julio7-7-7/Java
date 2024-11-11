package proymetodos;

public class Secante {
    private double xi;
    private double xi1;
    private double xi2;
    private double Et;
    private double Ea;
    private double Es; 

    public Secante() {
        xi = 0.0;
        xi1 = 0.0;
        xi2 = 0.0;
        Et = 100.0;
        Ea = 100.0;
        Es =0.0;
    }
       
    void setIntervalo(double xi1, double xi){
        this.xi1 = xi1;
        this.xi = xi;
    }
    
    void setEs(double Es){
        this.Es = Es;
    }
    double getRaiz(){
        return xi2;
    }

    public void setXi2(double xi2) {
        this.xi2 = xi2;
    }
    
    double funcion(double x){
        return Math.exp(-x)-x;
    }
    
    void MSecante(int iter){
    
        int i = 1;
        double xrant=0.0;
        System.out.println("iter \t Xi1 \t\t f(Xi1) \t\t Xi \t\t f(Xi) \t\t Xi2 \t\t f(Xi2)\t\t Ea");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        
        while((i<=iter)&&(Ea>Es)){
            xi2 = xi-((funcion(xi)*(xi1-xi))/(funcion(xi1)-funcion(xi))); 
            System.out.print(i+"\t");
            System.out.printf("%10.7f",xi1);
	    System.out.printf("%13.6f",funcion(xi1));
            System.out.printf("%13.7f",xi);
	    System.out.printf("%16.6f",funcion(xi));
            System.out.printf("%16.7f",xi2);
	    System.out.printf("%19.6f",funcion(xi2));
            Ea = Math.abs((xi2-xrant)/xi2)*100;
            System.out.printf("%10.2f",Ea); 
            System.out.println("");
            xi1 = xi;
            xi = xi2;             
            xrant = xi2;
            i++;
        }   
    }
}
