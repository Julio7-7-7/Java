package com.mycompany.pfich;

public class PFich {
     
    public static cPersona edadMayor(cPersona V[]){
        int edad=0;
        int mayor=0;
        for(int i=0; i<V[].length; i++){
            if(V[i].getEdad()>mayor)
                mayor=V[i].getEdad();
            
        }
    }
    
    public static void main(String[] args) {

        cPersona p = new cPersona(78854, "Julio", "Toledo", 1122587,19);
        p.mostrar();
        
        cEstudiante e = new cEstudiante(64, "Julio", "toledo", 265465464, 19, 32123115, "Sistemas");
        e.mostrar();
        
        cDocente d = new cDocente(2456546, "Jose", "Colque", 78854112,43, 5245, "Ing informatico");
        d.mostrar();
        
        cAdmin a = new cAdmin(13224, "Elio", "Pez", 75521322,60, 122234, "Recursos humanos");
        a.mostrar();
        
        
        cPersona F[];
        F = new cPersona[9];
        F[0] = new cEstudiante(122, "Julio", "Toledo", 68942185,19, 221097848, "Ing de sistemas");
        F[1] = new cEstudiante(564, "Franklin", "Flores", 75012332,19, 221097856, "Ing de sistemas");
        F[2] = new cEstudiante(24156, "Diego", "Aguilera", 78955412,22, 221097785, "Ing de sistemas");
        F[3] = new cEstudiante(454, "Carlos", "Cabrita", 63222115,19, 221098564, "Ing de sistemas");
        F[4] = new cEstudiante(354, "Anthony", "Leaños", 7554632,20, 221092223, "Ing de sistemas");
        F[5] = new cDocente(46, "Jose", "Colque", 65542115,45, 5544112, "Ing informatico");
        F[6] = new cDocente(46546, "Iveth", "Robles", 3465651,42, 23434, "Ing informatico");
        F[7] = new cDocente(64645, "Omar", "Contreras", 7884460,43, 54, "Ing informatico");
        F[8] = new cDocente(221645621, "Julio", "Romero", 66542115,50, 552331, "Ingeniero");
        
        for(int i=0; i<F.length; i++){
            F[i].mostrar();
        }
        
        
        
        
        
        
    }
}
