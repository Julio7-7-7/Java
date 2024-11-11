package proymetodos;

public class fPosicion {
    
    private double xl;
    private double xu;
    private double xr;
    private double Ea;
    private double Es; 

    public fPosicion() {
        xl= 0.0;
        xu= 0.0;
        xr= 0.0;
        Ea= 100.0;
        Es= 0.0;
    }

    public void setIntervalo(double xl, double xu) {
        this.xl = xl;
        this.xu = xu;
    }

    public void setEs(double Es) {
        this.Es = Es;
    }

    public double getRaiz() {
        return xr;
    }
    
    double funcion(double x){
      //return Math.pow(x, 3)-Math.pow(x, 2)+10*x-5;
        return -0.6 * Math.pow(x, 2) + 2.4 * x + 5.5;
    }
    void MFalsaPosicion(int iter){
    
        int i = 1;
        double xrant=0.0;
        System.out.println("iter \t Xl \t\t f(Xl) \t\t Xu \t\t f(Xu) \t\t Xr \t\t f(Xr)\t\t Ea");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        
        while((i<=iter)&&(Ea>Es)){
            xr = xu-((funcion(xu)*(xl-xu))/(funcion(xl)-funcion(xu)));
            System.out.print(i+"\t");
            System.out.printf("%10.7f",xl);
	    System.out.printf("%13.6f",funcion(xl));
            System.out.printf("%13.7f",xu);
	    System.out.printf("%16.6f",funcion(xu));
            System.out.printf("%16.7f",xr);
	    System.out.printf("%19.6f",funcion(xr));
            Ea = Math.abs((xr-xrant)/xr)*100;
            System.out.printf("%10.2f",Ea); 
            System.out.println("");
            if (funcion(xl)*funcion(xr)<0)
                xu = xr;
            else
                xl = xr;
                        
            xrant = xr;
            i++;
        }
        
    }
}
    
    
    

