package com.mycompany.pcadenarecursiva;

public class PCadenaRecursiva {
    
    public static int longitud(String cad){
        if(cad.length()==0)
            return 0;
        else
        {
            int aux= longitud(cad.substring(0, cad.length()-1));
            return aux + 1;
        }
    }
    
    public static String invertir(String cad){
        if(cad.length()==1)
            return cad;
        else
        {
            String aux= invertir(cad.substring(0, cad.length()-1));
            return (cad.charAt(cad.length()-1))+aux;
        }
    }
    
    public static void main(String[] args) {
        /*
        String cad= "Hola mundo";
        
        int n= cad.length();
        for(int i=0; i<=n-1;i++){
            System.out.println(cad.charAt(i));
        }
        char c= cad.charAt(n-1);
        System.out.println(c);
        
        
        String subcadena= cad.substring(3);
        System.out.println(subcadena);
        
        String subcadena1= cad.substring(0, 3);
        System.out.println(subcadena1);
        
        String subcadena2= cad.substring(0, cad.length()-1);
        System.out.println(subcadena2);
        
        System.out.println(cad.substring(0, cad.length()-1));
        System.out.println(cad.charAt(cad.length()-1));
        */
        System.out.println(longitud("Hola mungo"));
        System.out.println(invertir("sumar"));
        
        
        
        
    }
}
