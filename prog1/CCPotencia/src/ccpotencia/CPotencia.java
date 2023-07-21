package ccpotencia;

public class CPotencia {
  int base;
  int exponente;

public CPotencia(){
  base=0;
  exponente=0;
}

public void ponerBase(int bas){
  base=bas;
}
public int sacarBase(){
  return base;
}

public void ponerEponente(int expo){
  exponente=expo;
}
public int sacarExponente(){
  return exponente;
}

public int resolver(){
    int i=0;
    int resultado=1;
      while(i<exponente){
         resultado=resultado*base;
         i++;
      }
   return resultado;
 }


}
