package polinomio;

public class CPolinomio {
    
    
    int Coef[];
    int Exp[];
    int n;
    
    CPolinomio(){
        Coef=new int [50];
        Exp=new int [50];
        n=-1;
    }
    public void insertar(int co,int ex){
        if(co!=0){
            if(n==-1){
                Coef[0]=co;
                Exp[0]=ex;
                n++;
            }
            else{
                int p=0;
                while((p<=n)&&(Exp[p]>ex)){
                    p++;
                }
                if(p>n){
                    Coef[p]=co;
                    Exp[p]=ex;
                    n++;
                }
                else{
                    if(Exp[p]==ex){
                        int suma = (Coef[p]+co);
                        if(suma!=0){
                            Coef[p]=suma;
                        }
                        else{
                            for(int i=p;i<=(n-1);i++){
                                Coef[i]=Coef[i+1];
                                Exp[i]=Exp[i+1];
                            }
                            n--;
                        }     
                    }
                    else{
                        for(int i=n;i>=p;i--){
                            Coef[i+1]=Coef[i];
                            Exp[i+1]=Exp[i];
                            }
                            Coef[p]=co;
                            Exp[p]=ex;
                            n++;
                    }
                    
                }            
            }
        }
    }
    public int grado(){
        if(n==-1){
            return 0;
        }
        else{
            return Exp[0];
        }        
    }
    public String mostrar(){
        String cad= " [ ";
        int i=0;
        while(i<=n){
            cad = cad + Integer.toString(Coef[i])+"x^"+Integer.toString(Exp[i])+" , ";
            i++;
        }
        cad = cad + " ]";
        return cad;
    }
    public int getexp(int posi){
        int i=0;
        int ac=0;
        while(i<=posi){
            ac=Exp[i];
            i++;
        }
        return ac;
    }
    public int getcoef(int posi){
        int i=0;
        int ac=0;
        while(i<=posi){
            ac=Coef[i];
            i++;
        }
        return ac;
    }
    public int cant(){
        return n+1;
    }
    public void suma(CPolinomio p){
        int i=0;
        while(i<=p.cant()){
            
                //int suma=Coef[i]+p.getcoef(i);
                this.insertar(p.getcoef(i), p.getexp(i));
                i++;
            
           
        }
    }
     public void multiplicar(CPolinomio p){
        int i=0;
        while(i<=p.cant()){
            //if(Exp[i]==p.getexp(i)){
                int mul=Exp[i]+p.getexp(i);
                this.insertarparamul(p.getcoef(i), mul);
                i++;
            //}
            /*else{
                this.insertar(p.getcoef(i), this.getexp(i));
                i++;
            }*/
        }
    }
      public void insertarparamul(int co,int ex){
        if(co!=0){
            if(n==-1){
                Coef[0]=co;
                Exp[0]=ex;
                n++;
            }
            else{
                int p=0;
                while((p<=n)&&(Exp[p]>ex)){
                    p++;
                }
                if(p>n){
                    Coef[p]=co;
                    Exp[p]=ex;
                    n++;
                }
                else{
                    if(Exp[p]==ex){
                        int suma = (Coef[p]*co);
                        if(suma!=0){
                            Coef[p]=suma;
                            int sumamul=Exp[p]*p;
                        }
                        else{
                            for(int i=p;i<=(n-1);i++){
                                Coef[i]=Coef[i+1];
                                Exp[i]=Exp[i+1];
                            }
                            n--;
                        }     
                    }
                    else{
                        for(int i=n;i>=p;i--){
                            Coef[i+1]=Coef[i];
                            Exp[i+1]=Exp[i];
                            }
                            Coef[p]=co;
                            Exp[p]=ex;
                            n++;
                    }
                    
                }            
            }
        }
    }
      public double equis(int x){
          int i=0;
          double mul1;
          double mul2;
          double suma=0.0;
          double e;
          while(i<=n){
              e=Exp[i];
              mul1=Math.pow(e, x);
              mul2=Coef[i]*mul1;
              suma= suma+(mul1+mul2);
              i++;
          }
          return suma;
      }
      public void exam(int monto,int k){
          int i=0;
          while(i<=n){
              if(Exp[i]==k){
                  this.insertar(monto, k);
              }
              i++;
          }
      }
}
