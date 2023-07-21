
package proyectotienda;

public class Dulce extends Producto{
    String Sabor;
    String Sabor2;
    String Sabor3;
    String Sabor4;
    String Sabor5;

    public Dulce() {
        super();
        Nombre="Chupetes";
        CantidadStock=300;
        Precio=50.12;
        Marca="Sabonis";
        SaboroTipo="Piña";
        Sabor="Piña";
        Sabor2="Coco";
        Sabor3="Sandia";
        Sabor4="Manzana";
        Sabor5="Naranja";
    }

    public String getSabor() {
        return Sabor;
    }

    public String getSabor2() {
        return Sabor2;
    }

    public String getSabor3() {
        return Sabor3;
    }

    public String getSabor4() {
        return Sabor4;
    }

    public String getSabor5() {
        return Sabor5;
    }

}
