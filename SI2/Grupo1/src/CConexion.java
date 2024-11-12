/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author USUARIO
 */


public class CConexion {
    private final String host ="localhost";
    private final String puerto= "5432";
    private final String  db = "clinica";
    private final String  usuario = "postgres";
    private final String contraseña= "admin4";
    
     String cadena="jdbc:postgresql://"+host+":"+puerto+"/"+db;
  
   public Connection getConexion(){
       Connection conexion= null;
    
       try {
           Class.forName("org.postgresql.Driver");
           conexion = DriverManager.getConnection(cadena,usuario,contraseña);
           JOptionPane.showMessageDialog(null,"conexion exitosa");
       } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"no se pudo conectar a la base de datos"+e.toString());
       }   
       
       return conexion;
   }
}
