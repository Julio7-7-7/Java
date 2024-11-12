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

            
    public void seleccionarRegistroAcademico(JTable paramTablaRegistroAcademico, JTextField paraRegistro, JTextField paraSigla, JTextField paraGrupo, JTextField paraGestion) {
    try {
        int fila = paramTablaRegistroAcademico.getSelectedRow();
        if (fila >= 0) {
            paraRegistro.setText(paramTablaRegistroAcademico.getValueAt(fila, 0).toString());
            paraSigla.setText(paramTablaRegistroAcademico.getValueAt(fila, 1).toString());
            paraGrupo.setText(paramTablaRegistroAcademico.getValueAt(fila, 2).toString());
            paraGestion.setText(paramTablaRegistroAcademico.getValueAt(fila, 3).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}

    public void modificarRegistroAcademico(JTextField paraRegistro, JTextField paraSigla, JTextField paraGrupo, JTextField paraGestion) {
    int registro = Integer.parseInt(paraRegistro.getText()); // Convertir 'registro' a entero
    String sigla = paraSigla.getText();
    String grupo = paraGrupo.getText();
    String gestion = paraGestion.getText();
    
    CConexion objetoConexion = new CConexion();
    
    String consulta = "UPDATE registroacademico SET grupo = ?, gestion = ? WHERE registro = ? AND sigla = ?;";
    
    try {
        CallableStatement cs = objetoConexion.EstablecerConexion().prepareCall(consulta);
        
        cs.setString(1, grupo);
        cs.setString(2, gestion);
        cs.setInt(3, registro);
        cs.setString(4, sigla);
        
        cs.execute();
        JOptionPane.showMessageDialog(null, "Modificación Correcta en registroacademico");
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}

    public void buscarRegistroAcademico(JTextField paraRegistro, JTable tablaResultados) {
    int registroBuscado = Integer.parseInt(paraRegistro.getText());
    CConexion objetoConexion = new CConexion();
    
    String consulta = "SELECT * FROM registroacademico WHERE registro = ?;";
    
    try {
        PreparedStatement ps = objetoConexion.EstablecerConexion().prepareStatement(consulta);
        ps.setInt(1, registroBuscado);
        
        ResultSet rs = ps.executeQuery();
        
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaResultados.getModel();
        modeloTabla.setRowCount(0); 
        
        while (rs.next()) {
            Object[] fila = new Object[4];
            fila[0] = rs.getInt("registro");
            fila[1] = rs.getString("sigla");
            fila[2] = rs.getString("grupo");
            fila[3] = rs.getString("gestion");
            modeloTabla.addRow(fila);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}


   

       
    
    
    
    
    
    
    
    
    
    
    
    
    
}
