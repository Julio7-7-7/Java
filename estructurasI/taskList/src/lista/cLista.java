package lista;

public class cLista<T> {
    
    private Nodo<T> cabeza;
    private int tamaño;

    public cLista() {
        cabeza = null;
        tamaño = 0;
    }

    //Agregar un elemento a la lista
    public void agregar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } 
        else {
            Nodo<T> actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
        tamaño++;
    }

    // Método para obtener el tamaño de la lista
    public int obtenerTamano() {
        return tamaño;
    }

    // Método para verificar si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Método para imprimir todos los elementos de la lista
    public void imprimirLista() {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getElemento());
            actual = actual.getSiguiente();
        }
    }
}
