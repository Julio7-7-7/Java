package clases;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import odontofich.CConexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.concurrent.Callable;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class GRegistroAcademico {
    
    
    int Registro;
    String sigla;
    String grupo;
    String gestion;

    public int getRegistro() {
        return Registro;
    }

    public void setRegistro(int Registro) {
        this.Registro = Registro;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }
    
    public void mostrarRegistroAcademico(JTable paramTablaRegistroAcademico) {
        CConexion objetoConexion = new CConexion();
    
        DefaultTableModel modelo = new DefaultTableModel();
    
        modelo.addColumn("registro");
        modelo.addColumn("sigla");
        modelo.addColumn("grupo");
        modelo.addColumn("gestion");
    
        paramTablaRegistroAcademico.setModel(modelo);
    
        String sql = "SELECT * FROM registroacademico;";
    
        String[] datos = new String[4];
        Statement st;
    
        try {
            st = (Statement) objetoConexion.EstablecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
        
            while (rs.next()) {
                datos[0] = rs.getString(1); // Registro
                datos[1] = rs.getString(2); // Sigla
                datos[2] = rs.getString(3); // Grupo
                datos[3] = rs.getString(4); // Gestión
            
                modelo.addRow(datos);
            }
        
            paramTablaRegistroAcademico.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
    
        public void insertarRegistroAcademico(JTextField paraRegistro, JTextField paraSigla, JTextField paraGrupo, JTextField paraGestion) {
        int registro = Integer.parseInt(paraRegistro.getText());
        String sigla = paraSigla.getText();
        String grupo = paraGrupo.getText();
        String gestion = paraGestion.getText();
    
        CConexion objetoConexion = new CConexion();
    
        String consulta = "INSERT INTO registroacademico (registro, sigla, grupo, gestion) VALUES (?, ?, ?, ?);";
    
        try {
            CallableStatement cs = objetoConexion.EstablecerConexion().prepareCall(consulta);
        
            cs.setInt(1, registro);
            cs.setString(2, sigla);
            cs.setString(3, grupo);
            cs.setString(4, gestion);
        
            cs.execute();
            JOptionPane.showMessageDialog(null, "Inserción Correcta en registroacademico");
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }


   

       
    
    
    
    
    
    
    
    
    
    
    
    
    
}
