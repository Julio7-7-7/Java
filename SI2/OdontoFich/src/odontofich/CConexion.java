package odontofich;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CConexion {
    
    Connection conectar = null;
    
    private final String HOST = "localhost";
    private final String PUERTO = "5432";
    private final String DB = "clinicafich";
    private final String USER = "postgres";
    private final String PASSWORD = "1981Ardaya";
    
    String Cadena = "jdbc:postgresql://" + HOST + ":" + PUERTO + "/" + DB;

    public Connection EstablecerConexion() {
        try {
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(Cadena, USER, PASSWORD);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+ e.getMessage());
        }
        return conectar;
    }
}
