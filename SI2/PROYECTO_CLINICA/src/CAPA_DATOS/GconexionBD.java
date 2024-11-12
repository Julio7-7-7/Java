package CAPA_DATOS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class GconexionBD {
    // Variables de conexión
    private static final String URL = "jdbc:postgresql://localhost:5432/clinica";
    private static final String USER = "postgres";
    private static final String PASSWORD = "yomellamo";
    private static Connection conexion = null;


public static Connection conectar() {
    if (conexion == null) {
        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            JOptionPane.showMessageDialog(null,"Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al conectar a la base de datos: " + e.toString());
        }
    }
    return conexion;
}

// Método para cerrar la conexión
    public static void cerrarConexion() {
        if (conexion != null) {
            try {
                conexion.close();
                conexion = null;
                System.out.println("Conexión cerrada");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }



}