

package pparcialraiz;


public class CRaiz {

private int base,raiz;

public CRaiz()
{
base=0;
raiz=1;
}

public void SetBase(int x)
{
base=x;
}

public int GetBase()
{
return base;
}

public void SetRaiz(int y)
{
raiz=y;
}

public int GetRaiz()
{
return raiz;
}

public int Resolver()
{
    int resultado=0;
for(int i=0;i<=raiz;i++)
{
resultado=base/base;
}
return resultado;
}
























}
