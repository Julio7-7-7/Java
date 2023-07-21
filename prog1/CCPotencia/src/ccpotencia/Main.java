package ccpotencia;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
    CPotencia p1= new CPotencia();
         
      String b= JOptionPane.showInputDialog("Introduzca la base");
         int B= Integer.parseInt(b);
      String e= JOptionPane.showInputDialog("introduzca exponente");
         int E= Integer.parseInt(e);
         
      p1.ponerBase(B);
      p1.ponerEponente(E);
      
      int baSe= p1.sacarBase();
      int eXpo= p1.sacarExponente();
      
      JOptionPane.showMessageDialog(null, "La potencia es ="+baSe+"/"+eXpo);
      JOptionPane.showMessageDialog(null, "Resultado"+" "+p1.resolver());
    }

}
