
package com.mycompany.precursividad;

public class PRecursividad {

    
    public static int factorial(int n){
        if((n==0) || (n==1))
            return 1;
        else 
            return n * factorial(n-1);
    }
        
    public static int factorialIterativo(int n){
        int fact = 1;
            for(int i=1; i<=n; i++)
                fact = fact*i;
            return fact;
    }
        
    public static int sumatoria(int n){
        if (n == 0) /*caso base*/
            return 0;
        else{
            int aux = sumatoria(n-1); /*llamada recursiva*/
            return aux + n;
        }
    }
        
    /*Calcular la cantidad de dígitos que tiene un número
    En una variable se calcula la cantidad de dígitos int cant= cantidadDIgitos(n)
    */
        
    public static int cantidadDigitos(int n){
        if (n<10)
            return 1;
        else 
        {
            int aux = cantidadDigitos(n/10);
            return aux +1;
        }
    }
        
    public static int sumatoriaDigitos(int n){
        if (n<10)
            return n;
        else{
            int aux = sumatoriaDigitos(n/10);
            int aux2 = n%10;
            return aux + aux2;
        }
    }
        
    public static int contadorNulo (int n){
        if (n<10)
            if (n==0)
                return 1;
            else{
                return 0;
            }
        else{
            int aux = contadorNulo(n/10);
            int aux2 = n%10;
                if(aux2==0)
                    return aux + 1;
                else{
                    return aux;
                }
            }
    }
        
    public static int contadorPar (int n){
        if (n<10)
            if(n%2==0)
                return 1;
            else{
                return 0;
            }
        else{
            int aux = contadorPar(n/10);
            int r = n%10;
                if(r%2==0)
                    return aux + 1;
                else{
                    return aux;
                }
            }
    }
             
    public static void escribirNumero(int n){
        if(n<10)
            System.out.println(n);
        else
        {
            escribirNumero(n/10);
            System.out.println(n%10);
        }
    }
    
    public static void escribirAlRevés( int n){
        if(n<10)
            System.out.println("n");
        else
        {
            System.out.println(n%10);
            escribirAlRevés(n/10);
        }
    }
    
    public static int potencia(int a, int n){
        if(n==0)
            return 1;
        else
        {
            int aux= potencia(a, n-1);
            return aux*a;
        }
    }
    
    public static int potencia2 (int b, int e){
        if(e==0)
            return 1;
        else
            return potencia2(b, e-1)*b;
    }
    
    /*Cuando envíes más de 2 variables considera la variable de inducción o sea la que
    contiene el incremento o decremento*/
    
    public static int fibonacci(int n){
        if((n==1) || (n==2))
            return 1;
        else
                {
                    return fibonacci(n-1) + fibonacci(n-2);
                }
    }

    public static void main(String[] args) {

        System.out.println("El factorial de 5 es = " + factorial(5));
        System.out.println("El factorial iterativo de 5 es = " + factorialIterativo(5));
        System.out.println("La sumatoria de 3 es = " + sumatoria(3));
        System.out.println("La cantidad de dígitos de 124945 es " + cantidadDigitos(124945));
        System.out.println("La sumatoria de dígitos de 5 es " + sumatoriaDigitos(5));
        System.out.println("La sumatoria de dígitos de 566 es " + sumatoriaDigitos(566));
        System.out.println("La cantidad de 0 en 0040 es = " + contadorNulo(4000));
        System.out.println("La cantidad de pares en 465 es = " + contadorPar(465));
    }
}
