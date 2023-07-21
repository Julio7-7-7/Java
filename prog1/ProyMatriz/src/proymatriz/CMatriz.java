package proymatriz;

import javax.swing.JOptionPane;

public class CMatriz {

    private int M[][]= new int[10][10];
    private int nfil,ncol;

    public CMatriz()
    {
    nfil=-1;
    ncol=-1;
    }

    public void SetElem(int val, int i, int j)
    {
    M[i][j]=val;
    }

    public int GetElem(int i, int j)
    {
    return (M[i][j]);
    }

    public void SetNcol(int nc)
    {
    ncol=nc-1;
    }

    public int GetNcol()
    {
    return ncol;
    }

    public void SetNfil(int nf)
    {
    nfil=nf-1;
    }

    public int GetNfil()
    {
    return nfil;
    }

    public int CantElemMatriz()
    {
    return ((nfil+1)*(ncol+1));
    }

    public void ColocarDimension()
    {
    String cad=" ";
    cad= JOptionPane.showInputDialog("Introduzca numero de filas");
    int numfil= Integer.parseInt(cad);

    cad=JOptionPane.showInputDialog("Introduzca numero de columnas");
    int numcol= Integer.parseInt(cad);

    this.SetNfil(numfil);
    this.SetNcol(numcol);
    }

public int SumaDiagonalPrincipal()
{
int sd=0;
 for(int i=0; i<=ncol; i++)
 {
 sd=sd+M[i][i];
 }
 return sd;
}

public int SumaDiagonalSecundaria()
{
int ds=0;
 for(int i=0; i<=ncol; i++)
 {
 ds=ds+M[i][ncol-i];
 }
return ds;
}

public int SumaTII()
{
int ac=0;
 for(int i=0; i<=nfil; i++)
 {
   for(int j=0; j<=i; j++)
   {
   ac=ac+M[i][j];
   }
 }
return ac;
}

public int SumaTID()
{
int ac=0;
for(int i=0; i<=nfil; i++)
{
  for(int j=(nfil-1);j<ncol;j++)
  {
  ac=ac+M[i][j];
  }
}
return ac;
}

public int SumaTSD()
{
int ac=0;
 for(int i=0; i<=nfil; i++)
 {
   for(int j=0; j<=ncol; j++)
   {
   ac=ac+M[i][j];
   }
 }
return ac;
}

public int SumaTSI()
{
int ac=0;
for(int i=0; i<=nfil; i++)
{
  for(int j=0; j<=nfil-1; j++)
  {
  ac=ac+M[i][j];
  }
}
return ac;
}

public int SumaCentral(){

int ac = 0;
 for(int i = 1; i <= nfil-1; i++)
 {
    for(int j = 1; j <=ncol-1; j++)
    {
    ac = ac + M[i][j];
    }
  }
return ac;
     }

public int SumaDeOrillas(){
    
         int ac = 0;
         for(int i = 1; i <=nfil-1; i++)
         {
             for(int j = 0 ; j <=ncol; j++)
             {
                 ac = ac + M[i][j];
             }
         }
         return ac;
     }

public int SumaVertical(){

         int ac = 0;
         for(int i = 0; i <=nfil; i++)
         {
             for(int j = 1 ; j <=ncol-1; j++)
             {
                 ac = ac + M[i][j];
             }
         }
         return ac;
     }

public int SumaDeEsquinas(){

        int ac=0;
        ac=M[0][0]+M[nfil][ncol];
        return ac;
         }

public int SumaDeElementosX3()
{
int ac=0;
  for(int i=0; i<=nfil; i++)
  {
     for(int j=0; j<=ncol; j++)
     {
      if(M[i][j]%3==0)
      {
      ac=ac+M[i][j];
      }
     }   
  }
  return ac;
}

public int ContarMult3()
{
int ac=0;
   for(int i=0; i<=nfil; i++)
   {
      for(int j=0; j<=ncol; j++)
      {
         if(M[i][j]%3==0)
         {
         ac=ac+1;
         }
      }
   }
   return ac;
}

public int SumaPar()
{
int ac=0;
  for(int i=0; i<=nfil; i++)
  {
     for(int j=0; j<=ncol; j++)
     {
      if(M[i][j]%2==0)
      {
      ac=ac+M[i][j];
      }
     }   
  }
  return ac;
}

public int SumaDeNegativos()
{
int ac=0;
  for(int i=0; i<=nfil; i++)
  {
     for(int j=0; j<=ncol; j++)
     {
      if(M[i][j]<0)
      {
      ac=ac+M[i][j];
      }
     }   
  }
  return ac;
}

public int SumaTotalParesYX5()
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


public int SumaTIIPositivos()
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


















}
