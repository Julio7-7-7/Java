/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialfinal;

/**
 *
 * @author Julius
 */
public class CExamen {
    
    public int Pregunta1()
{
int ac=0;
 for(int i=0; i<=nfil; i++)
 {
   for(int j=0; j<=ncol; j++)
   {
    if((M[i][j]%2==0)&&(M[i][j]%5==0))
    {
     ac=ac+M[i][j];  
    }
   }
 }
 return ac;
}
    
    
    
    public int Pregunta2()
{
int arr=0;
int aba=0;
int tt=0;
for(int i=0; i<=nfil; i++)
{
arr=arr+M[0][i];
}
for(int j=0; j<=nfil; j++)
{
aba=aba+M[nfil][j];
}
tt=arr+aba;
return tt;
}
    
    
    
    public int Pregunta3()
{
int ac=0;
 for(int i=0; i<=nfil; i++)
 {
   for(int j=0; j<=i; j++)
   {
    if(M[i][j]>0)
    {
    ac=ac+M[i][j];
    }
   }
 }
return ac;
}
   
    
    
  public int SumaDiagonalPrincipalPares()
{
int sd=0;
 for(int i=0; i<=ncol; i++)
 {
  if(M[i][i]%2==0)
  {
   sd=sd+M[i][i];
  }
 }
 return sd;
}

public int SumaDiagonalSecundariaPares()
{
int ds=0;
 for(int i=0; i<=ncol; i++)
 {
    if(M[i][ncol-i]%2==0){
    ds=ds+M[i][ncol-i];
     }
 }
return ds;
}

public int Pregunta4()
{
int dp=this.SumaDiagonalPrincipalPares();
int ds=this.SumaDiagonalSecundariaPares();
int st=dp+ds;
return st;
}  
    
}
