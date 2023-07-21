
package proyectotienda;

public class Producto {
    int CantidadStock;
    double Precio;
    String Nombre;
    String Marca;
    String SaboroTipo;

    public Producto() {
    }
    
    public Producto(int CantidadStock, int Precio, String Nombre, String Marca, String SaboroTipo) {
        this.CantidadStock = CantidadStock;
        this.Precio = Precio;
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.SaboroTipo = SaboroTipo;
    }

    public int getCantidadStock() {
        return CantidadStock;
    }

    public void setCantidadStock(int CantidadStock) {
        this.CantidadStock = CantidadStock;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getSaboroTipo() {
        return SaboroTipo;
    }

    public void setSaboroTipo(String SaboroTipo) {
        this.SaboroTipo = SaboroTipo;
    }

}
