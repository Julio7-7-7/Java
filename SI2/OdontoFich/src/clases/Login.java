package clases;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import odontofich.CConexion;

/**
 *
 * @author meli
 */
public class Login {
    public static boolean sesion= false;
    Connection con = new CConexion().EstablecerConexion();
    public boolean iniciarSesion(String usuario, String contraseña){
        String query = "Select contraseña from usuario where nombre_usuario = ?";
         PreparedStatement pstmtprev;
        try {
            pstmtprev = con.prepareStatement(query);
            pstmtprev.setString(1, usuario);
            ResultSet res = pstmtprev.executeQuery();
            if(res.next()){
                String contraseñaDb= res.getString(1);
                String MD5= getMD5(contraseña);
                if(MD5.equals(contraseñaDb)){
                    sesion=true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sesion;
    }
    
    public static String getMD5(String input) {
        try {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] messageDigest = md.digest(input.getBytes());
        BigInteger number = new BigInteger(1, messageDigest);
        String hashtext = number.toString(16);

        while (hashtext.length() < 32) {
        hashtext = "0" + hashtext;
        }
        return hashtext;
        }
        catch (NoSuchAlgorithmException e) {
        throw new RuntimeException(e);
        }
        }
}
