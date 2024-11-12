/* package CAPA_DATOS;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class PROYECTO_CLINICA {
    
     // Método principal donde se ejecuta todo
   public static void main(String[] args) {
        // Llamar al método que hace la consulta
        prueba_consulta();
    }
    

    // Método para conectar a la base de datos
    public static Connection conectar() {
        Connection conn = null;
        String url = "jdbc:postgresql://localhost:5432/clinica";
        String user = "postgres"; // Reemplaza con tu usuario de PostgreSQL
        String password = "yomellamo"; // Reemplaza con tu contraseña de PostgreSQL

        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos:");
            e.printStackTrace();
        }

        return conn;
    }

    
    public static void prueba_consulta() {  // creando mi metodo para hacer mis consultas
       
        Connection conn = conectar();

       
        if (conn != null) {
            try {
                // para acceder a las consultas selec,insert ,delete,etc
                Statement conec = conn.createStatement();   
                
                // mi consulta
                String sql = "SELECT * FROM trabajo"; 
                ResultSet tab = conec.executeQuery(sql);

                
                  System.out.println("PRECIO\t  ID\t\t NOMBRE");
                  System.out.println("-----------------------------------------");
                // mostrar los resultados de la consulta
                while (tab.next()) {
                    String id = tab.getString("id_trabajo");  
                    String nombre = tab.getString("nombre"); 
                    BigDecimal precio = tab.getBigDecimal("precio_unidad");
                    System.out.println(precio +     "\t" + id + "\t" + nombre); 
                }

                // Paso 6: Cerrar el ResultSet y el Statement
                tab.close();
               conec.close();
           
            } catch (SQLException e) {
                System.out.println("Error al realizar la consulta:");
                e.printStackTrace();
            }
            
        }
        
          else { // Bloque para manejar el caso de una conexión fallida
        System.out.println("No se pudo establecer la conexión con la base de datos.");
                    }
    }

   
}
*/
package CAPA_DATOS;

public class PROYECTO_CLINICA {
    public static void main(String[] args) {
        GconexionBD.conectar(); // Prueba de conexión
    }
}

