
package proyectotienda;

public class Salados extends Producto {
    
    String Saborotipo2;
    String Saborotipo3;
    String Saborotipo4;
    String Saborotipo5;
    String Saborotipo6;
  

    public Salados() {
        Marca="Sofia Ltda.";
        CantidadStock=58;
        Precio=40.32;
        Nombre="Snacks";
        SaboroTipo="Pizza";
        Saborotipo2="Hawaiana";
        Saborotipo3="Bizcocho";
        Saborotipo4="Papas Fritas";
        Saborotipo5="Mortadela";
        Saborotipo6="Empanadas";       
    }

    public String getSaborotipo2() {
        return Saborotipo2;
    }

    public String getSaborotipo3() {
        return Saborotipo3;
    }

    public String getSaborotipo4() {
        return Saborotipo4;
    }

    public String getSaborotipo5() {
        return Saborotipo5;
    }

    public String getSaborotipo6() {
        return Saborotipo6;
    }

    
    

    
}
