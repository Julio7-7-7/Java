package intro_pilas;

public class Pila {
    
    int vectorPila[];
    int cima;
    
    public Pila(int tamaño){
        vectorPila = new int[tamaño];
        cima=0;
    }
    
    public void insertar(int dato){
        vectorPila[cima] = dato;
        cima++;
    }
    
    public int eliminar(){
        int eliminar = 0;
        if(cima==0){
            System.out.println("la pila esta vacia");
        }
        else{
            eliminar = vectorPila[cima];
            cima--;
        }
        return eliminar;
    }
    
    public boolean vacio(){
        if(cima==0){
            return true;
        }
        else{
            return false;
        }
    }
    public int tamaño(){
        return vectorPila.length -1;
    }
}
