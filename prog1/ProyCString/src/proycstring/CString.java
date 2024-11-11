package proycstring;

public class CString {

    private String texto;

    public CString(){
        texto=" ";
    }

    public void SetPalabra(String p){
        texto=p;
    }

    public String GetPalabra(){
        return texto;
    }

    public void PonerMayuscula(){
        texto=texto.toUpperCase();
    }

    public void PonerMinuscula(){
        texto= texto.toLowerCase();
    }

    public void EliminarEspacio(){
        texto= texto.replace(" ", "");
    }

    public int LongitudTexto(){
        return texto.length();
    }

    public char GetCaracter(int posi){
        return texto.charAt(posi-1);
    }

    public int ContarVocales(){
        int cv=0;
        int n=this.LongitudTexto();
        char car;
            for (int i=0 ; i<n ; i++ ){
                car=this.GetCaracter(i+1);
                if(car=='a' || car=='e' || car=='i' || car=='o' || car== 'u' || car=='A' || car=='E' || car=='I' || car=='O' || car== 'U')
                    cv++;
            }
        return cv;
    }

    public int ContarConsonantes(){
        int cc=0;
        char car;
        int n=this.LongitudTexto();
            for(int i=0 ; i<n ; i++){
                car=this.GetCaracter(i+1);
                if(car!='a' && car!='e' && car!='i' && car!='o' && car!='u' && car!=' ')
                    cc++;
            }
        return cc;
    }

    public int ContarVocalesMayus(){
        int cm=0;
        char car;
        int n=this.LongitudTexto();
            for(int i=0 ; i<n ; i++){
                car=this.GetCaracter(i+1);
                if(car!='a' && car!='e' && car!='i' && car!='o' && car!='u' && car=='A' || car=='E' || car=='I' || car=='O' || car== 'U')
                    cm++;
            }
        return cm;
    }

    public int ContarVocalesMinus(){
        int cm=0;
        char car;
        int n=this.LongitudTexto();
            for(int i=0 ; i<n ; i++){
                car=this.GetCaracter(i+1);
                if(car=='a' || car=='e' || car=='i' || car=='o' || car=='u' || car!='A' && car!='E' && car!='I' && car!='O' && car!= 'U')
                    cm++;
            }
        return cm;
    }

    public int ContarSignos(){
        int cs=0;
        int n=this.LongitudTexto();
        char car;
            for(int i=0 ; i<n ; i++){
                car=this.GetCaracter(i+1);
                if(car==',' || car==';' || car=='.' || car==':')
                    cs++;
            }
        return cs;
    }

    public int ContarSignosAdmi(){
        int cs=0;
        int n=this.LongitudTexto();
        char car;
            for(int i=0 ; i<n ; i++){
                car=this.GetCaracter(i+1);
                if(car=='¿' || car=='?' || car=='¡' || car=='!')
                    cs++;
            }
        return cs;
    }
    
}
