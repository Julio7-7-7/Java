package cpotencia;
import Formulario.FormularioPotencia;
import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {

        FormularioPotencia Invoc = new FormularioPotencia();
        Invoc.setVisible(true);
        
        CPotencia p1;

        p1= new CPotencia();

        String b= JOptionPane.showInputDialog("Introduzca la base");
        int B= Integer.parseInt(b);
        String e= JOptionPane.showInputDialog("Introduzca el exponente");
        int E= Integer.parseInt(e);

        p1.PonerBase(B);
        p1.PonerExponente(E);

        int bAse= p1.SacarBase();
        int eXpo= p1.SacarExponente();

        JOptionPane.showMessageDialog(null, "La potencia es = " + bAse + "*" + eXpo);
        JOptionPane.showMessageDialog(null, "La potencia elevada es = " + " " + p1.resolver());
    }

}
