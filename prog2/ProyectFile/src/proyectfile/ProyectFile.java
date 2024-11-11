package proyectfile;

import java.io.IOException;

public class ProyectFile{


public static void main(String[] args) throws IOException {
        
       ClassArchivoTexto t= new ClassArchivoTexto();
       t.EscribirFile();
       t.LeerFile();
       t.CantLineas();
}
}