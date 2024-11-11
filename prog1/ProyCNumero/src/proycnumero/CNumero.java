package proycnumero;
import javax.swing.JOptionPane;

public class CNumero {

    private int n;

    public CNumero(){
        n=0;
    }

    public void SetNumero(int val){
        n=val;
    }

    public int GetNumero(){
        return n;
    }

    public int CantidadDigitos(){
        int c=0;
        int aux= n;
            while (aux !=0){
                c=c+1;
                aux=aux/10;
            }
        return c;
    }

    public int SumarDigitos(){
        int aux= n;
        int s= 0;
        int res= 0;
            while(aux!=0){
                res=aux%10;
                s= s+res;
                aux=aux/10;
            }
        return s ;
    }

    public int ContarPares(){
        int c=0;
        int aux=n;
        int res=0;
            while(aux!=0){
                res=aux%10;
                if (res%2==0){
                    c=c+1;
                }
                aux=aux/10;
            }
        return c;
    }

    public int ContarImpares(){
        int c=0;
        int aux=n;
        int res=0;
            while(aux!=0){
                res=aux%10;
                if (res%2!=0){
                    c=c+1;
                }
                aux=aux/10;
            }
        return c;
    }

    public int SumaPares(){
        int c=0;
        int res=0;
        int aux=n;
            while(aux!=0){
                res=aux%10;
                if(aux%2==0){
                    c=c+res;
                }
                aux=aux/10;
            }
        return c;
    }

    public int SumaImpar(){
        int c=0;
        int res=0;
        int aux=n;
            while(aux!=0){
                res=aux%10;
                if(res%2!=0){
                    c=c+res;     
                }
                aux=aux/10;
            }
        return c;
    }

    public int Multipicacion(){
        int sp= this.SumaPares();
        int ci= this.ContarImpares();
        int m= sp*ci;
        return m;
    }

    public int PrimerDigito(){
        int res=0;
        int aux=n;
            while(aux!=0){
                res=aux%10;
                aux=aux/10;
            }
        return res;
    }

    public int UltimoDigito(){
        int aux=n;
        int res=aux%10;
        return res;
    }

    public void ReemplazarPorUltimoDigito(){
        int aux=n;
        int res=aux%10;
        n=res;
    }

    public void RInvertirNumero(){
        int res=0;
        int newnum=0;
        int aux=n;
            while(aux!=0){
                res=aux%10;
                newnum=newnum*10+res;
                aux=aux/10;
            }
        n=newnum;
    }

    public int InvertirNumero(){
        int res=0;
        int newnum=0;
        int aux=n;
            while(aux!=0){
                res=aux%10;
                newnum=newnum*10+res;
                aux=aux/10;
            }
        return newnum;
    }

    public void Capicua(){
        int aux=n;
        this.RInvertirNumero();
            if(aux==n)
                JOptionPane.showMessageDialog(null, "Es Capicua");
            else
                JOptionPane.showMessageDialog(null, "No es capicua");
        n=aux;
  }

    public void Insertar(int posi, int valor){
        this.RInvertirNumero();
        int aux=this.GetNumero();
        int NewNum=0;
        int res=0;
        int i=1;
            while(i<posi){
                res=aux%10;
                NewNum=NewNum*10+res;
                aux=aux/10;
                i++;
            }
            NewNum=NewNum*10+valor;
            while(aux!=0){
                res=aux%10;
                NewNum=NewNum*10+res;
                aux=aux/10;
            }
        n=NewNum;
    }

    public void Eliminar(int posi){
        this.InvertirNumero();
        int aux=this.GetNumero();
        int NewNum, res;
        NewNum=0;
        int i=1;
            while (i<posi){
                res = aux%10;
                NewNum=NewNum*10+res;
                aux=aux/10;
                i++;
            }
        aux=aux/10;
            while (aux !=0){
                res=aux%10;
                NewNum=NewNum*10+res;
                aux=aux/10;
            }
        n=NewNum;
    }

    public int Preguntar(){
        int aux=n;
        int newnum=0;
        int res=0;
        int s=0;
        int resultado=0;
            while(aux!=0){
                res=aux%10;
                s=s+res;
                newnum=newnum*10+res;
                aux=aux/10;
            }
        resultado=(s*100)+newnum;
        return resultado;
    }

}
