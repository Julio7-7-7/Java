package proyvector;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class CVector {

    private int V[]=new int [15];
    private int dim;

    public CVector(){
        dim= -1;
    }

    public void SetDim(int CantElemen){
        dim=CantElemen-1;
    }

    public void SetValor(int posi, int valor){
        V[posi]=valor;
    }

    public int GetValor(int posi){
        return V[posi];
    }

    public void CargarVector(){
        String cad="";
        int valor;
            for(int i=0; i<=dim ; i++){
                cad=JOptionPane.showInputDialog("Valor para la posicion"+i );
                valor=Integer.parseInt(cad);
                V[i]=valor;
            }
    }

    public void MostrarVector(JTable JTVector){
        int valor;
            for(int i=0; i<=dim; i++){
                JTVector.setValueAt(V[i], i, 0);
            }
    }

    public int Cantidad(){
        return dim+1;
    }

    public int Suma(){
        int s=0;
            for(int i=0; i<=dim; i++ ){
                s= s+V[i];
            }
        return s;
    }

    public int SumaPar(){
        int s=0;
            for(int i=0; i<=dim; i++){
                if(V[i]%2==0)
                    s=s+V[i];
            } 
        return s;
    }

    public int CantPares(){
        int cp=0;
            for(int i=0; i<=dim; i++){
                if(V[i]%2==0)
                    cp=cp+1;
            }
        return cp;
    }

    public int SumarImpares(){
        int s=0;
            for(int i=0; i<=dim; i++){
                if(V[i]%2!=0)
                    s=s+V[i];
            }
        return s;
}

    public void IntercambiarValores(int PosA, int PosB){
        int aux;
        aux = V[PosA];
        V[PosA] = V[PosB];
        V[PosB] = aux;
    }

    public int BusquedaSecuencial(int ele){
        int i=0;
            while((i <= dim) && (ele != V[i])){
                i++;
            }
        if(i <= dim)
            return 1;
        else
            return 0;
    }

    public int BusquedaBinaria(int ele){
        int ini, m, fin;
        fin = dim;
        ini = 0;
            while(ini <= fin){
                m = (ini + fin) / 2;
                if(ele == V[m])
                    return 1;
                else{
                    if(ele < V[m])
                        fin = m - 1;
                    else 
                        ini = m + 1;
                }
            }
        if(ini > fin)
            return 0;
        else
            return 1;
}

    public void OrdIntercambio(){
        int aux;
        for(int p=0; p<=(dim - 1); p++) {
            for (int p1 = p + 1; p1 <= dim; p1++) {
                if (V[p1] < V[p]) {
                    aux = V[p1];
                    V[p1] = V[p];
                    V[p] = aux;
                }
            }
        }
    }

    public void OrdBurbuja() {
        int aux;
        for (int j = dim; j >= 1; j--) {
            for (int i = 0; i <= j - 1; i++) {
                if (V[i] > V[i + 1]) {
                    aux = V[i];
                    V[i] = V[i + 1];
                    V[i + 1] = aux;
                }
            }
        }
    }

    public void OrdIntercambioDesc() {
        int aux;
        for (int p = 0; p <= (dim - 1); p++) {
            for (int p1 = p + 1; p1 <= dim; p1++) {
                if (V[p1] > V[p]) {
                    aux = V[p];
                    V[p1] = V[p];
                    V[p] = aux;
                }
            }
        }
    }

    public void Purga() {
        int i, A, j, c;
        i = 0;
        j = -1;
        int n = dim;
            while ((i <= n)) {
                A = V[i];
                    while ((i <= n) && (A == V[i])) {
                        i++;
                    }
                j++;
                V[j] = A;
            }
        dim = j;
    }

    public void OrdSeleccion() {
        int aux, k;
            for (int i = 0; i <= (dim - 1); i++) {
                k = i;
                    for (int j = k + 1; j <= dim; j++) {
                        if (V[j] < V[k])
                            k = j;
                    }
            }
    }

    public int SumarX2yX3() {
        int s = 0;
            for (int i = 0; i <= dim; i++) {
                if((V[i]) % 2 == 0 && (V[i] % 3 == 0))
                    s = s + V[i];
            }
        return s;
    }

    public void OrdenDesc_Asc_Des() {
        int aux;
        int fin1 = dim / 3;
        int ini2 = fin1 + 1;
        int fin2 = fin1 * 2;
        int ini3 = fin2 + 1;
            for (int i = 0; i <= fin1 - 1; i++) {
                for (int j = i + 1; j <= fin1; j++) {
                    if (V[j] > V[i]) {
                        aux = V[j];
                        V[j] = V[i];
                        V[i] = aux;
                    }
                }
            }
            for (int l = ini2; l <= fin2 - 1; l++) {
                for (int k = l + 1; l <= fin2; k++) {
                    if (V[k] < V[l]) {
                        aux = V[k];
                        V[k] = V[l];
                        V[l] = aux;
                    }
                }
            }
            for (int p = ini3; p <= dim - 1; p++) {
                for (int p1 = p + 1; p1 <= dim; p1++) {
                    if (V[p1] > V[p]) {
                        aux = V[p1];
                        V[p1] = V[p];
                        V[p] = aux;
                    }
                }
            }
    }

    public void eliminarUnValorCualquiera(int posi) {
        int i = posi;
            while (i <= dim) {
                V[i] = V[i + 1];
                i++;
            }   
    }

    public void CambiarDigito(int posi, int valor) {
        int i = posi;
            while (i <= (dim + 1)) {
                V[i - 1] = valor;
                i++;
            }
    }

    public int Moda() {
        int i, j, aux, c, cmayor, elemmoda;
        i = 0;
        cmayor = -9999;
        elemmoda = -9999;
            while (i <= dim) {
                aux = V[i];
                c = 0;
                    while ((i <= dim) && (aux == V[i])) {
                        c++;
                        i++;
                    }
                if (c > cmayor) {
                    cmayor = c;
                    elemmoda = aux;
                }
            }
        return elemmoda;
    }

    public void OrdBurbujaInver() {
        int aux;
        for (int j = dim; j >= 1; j--) {
            for (int i = 0; i <= j - 1; i++) {
                if (V[i] < V[i + 1]) {
                    aux = V[i + 1];
                    V[i + 1] = V[i];
                    V[i] = aux;
                }
            }
        }
    }

    public void Purga_Negativa() {
        int i, A, j, c;
        i = 0;
        j = -1;
        int aux = 0;
        int n = dim;
            while (i <= n) {
                A = V[i];
                    while ((i <= n) && (A == V[i])) {
                        i++;
                    }
                if (A > 0) {
                    j++;
                    V[j] = A;
                }
            }
        dim = j;
    }

    public void OrdBurbujaMitadMitad() {
        int mit1 = dim / 2;
            for (int i = 0; i <= mit1; i++) {
                this.OrdBurbuja();
            }
            for (int mit2 = mit1 + 1; mit2 <= dim; mit2++) {
                this.OrdBurbujaInver();
            }
    }

    public void CorteControlx3() {
        int i = 0;
        int aux;
        int s = 0;
            while (i <= dim) {
                aux = V[i];
                    while ((i <= dim) && (aux > 0)) {
                        if (aux % 3 == 0) 
                            s = s + aux;
                        i++;
                    }
                JOptionPane.showMessageDialog(null, "La suma de elementos positivos y mult de 3 es = " + s);
            }
    }

    public int CantNegat() {
        int cn = 0;
            for (int i = 0; i <= dim; i++) {
                if (V[i] < 0) 
                    cn = cn + 1;
            }
        return cn;
    }

    public void Reemplazodecantnegat() {
        int cantneg = this.CantNegat();
            for (int i = 0; i <= dim; i++) {
                V[i] = cantneg;
        }
    }

    public void ReemplazarPorNegativos() {
        int cn = 0;
            for (int i = 0; i <= dim; i++) {
                if (V[i] < 0) 
                    cn = cn + 1;
            }
            for (int i = 0; i <= dim; i++) {
                V[i] = cn;
            }
    }

    public void CorteControlElemDistintos() {
        int i = 0;
        int d = 0;
        int aux, c;
            while (i <= dim) {
                aux = V[i];
                c = 0;
                    while ((i <= dim) && (aux == V[i])) {
                        c++;
                        i++;
                    }
                d++;
            }
        JOptionPane.showMessageDialog(null, "Hay " + d + " elementos diferentes");
    }
    
}





