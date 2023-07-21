package pfinsemestre;

import javax.swing.JOptionPane;

public class cHombre extends cCalculo{
    protected double fPM;
    protected double fTM;
    protected double fEM;
    
    public cHombre(){
        super();
        fPM=13.7;
        fTM=5;
        fEM=6.8;
    }
    
    public cHombre(int peso, int talla, int edad){
        super(peso,talla,edad);
    }

    public double getfPM() {
        return 13.7;
    }

    public double getfTM() {
        return 5;
    }

    public double getfEM() {
        return 6.8;
    }

    @Override
    public void mostrar(){
        JOptionPane.showMessageDialog(null, "Datos: "+getEdad()+" años; "+getTalla()+"cm; "+getPeso()+"kg");
        //System.out.println("Datos: "+getEdad()+" años; "+getTalla()+"cm; "+getPeso()+"kg");
    }
    
    @Override
    public double metaBasal(){
        return 66+(peso*getfPM())+(talla*getfTM())-(getfEM()*edad);
    }
}
