package pfinsemestre;

import javax.swing.JOptionPane;

public class cMujer extends cCalculo {
    protected double fPF;
    protected double fTF;
    protected double fEF;
    
    public cMujer(){
        super();
        fPF=9.6;
        fTF=1.8;
        fEF=4.7;
    }
    
    public cMujer(int peso, int talla, int edad){
        super(peso, talla, edad);
    }

    public double getfPF() {
        return 9.6;
    }

    public double getfTF() {
        return 1.8;
    }

    public double getfEF() {
        return 4.7;
    }
    
    @Override
    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Datos: "+getEdad()+" años; "+getTalla()+"cm; "+getPeso()+"kg");
        //System.out.println("Datos: "+getEdad()+" años; "+getTalla()+"cm; "+getPeso()+"kg");
    }

    @Override
    public double metaBasal() {
        return 655+(peso*getfPF())+(talla*getfTF())-(getfEF()*edad);
    }
}
