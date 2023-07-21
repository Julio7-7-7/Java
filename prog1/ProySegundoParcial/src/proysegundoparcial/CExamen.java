
package proysegundoparcial;




public class CExamen {

private int V[]=new int [15];
private int dim;

public CExamen()
{
dim=-1;
}

public void SetDim(int CantidadElementos)
{
dim=CantidadElementos-1;
}

public void SetValor(int posi, int val)
{
V[posi]=val;
}

public int GetValor(int posi)
{
return V[posi];
}

public void OrdBurbuja()
{
 int aux;
 for(int j=dim; j>=1;j--)
 {
  for(int i=0; i<=j-1; i++)
  {
   if(V[i]>V[i+1])
   {
   aux=V[i];
   V[i]=V[i+1];
   V[i+1]=aux;
   }
  }
 }
}

public void OrdBurbujaInver()
{
 int aux;
 for(int j=dim; j>=1;j--)
 {
  for(int i=0; i<=j-1; i++)
  {
   if(V[i]<V[i+1])
   {
   aux=V[i+1];
   V[i+1]=V[i];
   V[i]=aux;
   }
  }
 }
}

public void OrdBurbujaMitadMitad()
{
int mit1=dim/2;
for(int i=0; i<=mit1; i++)
{
this.OrdBurbuja();
}
for(int mit2=mit1+1; mit2<=dim; mit2++)
{
this.OrdBurbujaInver();
}
}
}










