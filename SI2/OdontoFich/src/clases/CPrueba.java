package clases;

import Interfaces.FPruebaDetalles;
import Interfaces.FReporteRapido;
import java.awt.FlowLayout;
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
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CPrueba{
    
    String nombreEstudiante;
    String nombreMateria;
    String sigla;
    String grupo;
    String gestion;
    int registro;

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
    
    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
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
        
    public void BuscarYLlenar(JTextField paramRegistro, JTextField paramNombre, JTextField paramGestion, JPanel panelMaterias) {
    CConexion objetoconexion = new CConexion();

    int registroBuscado;
    try {
        registroBuscado = Integer.parseInt(paramRegistro.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor, ingresa un número válido en el campo de registro.");
        return; 
    }

    String consulta = "SELECT nombre FROM estudiante WHERE registro = ?";
    String consulta2 = "SELECT gestion FROM registroacademico WHERE registro = ?";
    String consulta3 = "SELECT sigla FROM materia WHERE sigla IN (SELECT sigla FROM registroacademico WHERE registro = ?)";
    String consulta4 = "SELECT nombre_materia FROM materia WHERE sigla = ?";

    try {
        Connection conn = objetoconexion.EstablecerConexion();

        PreparedStatement ps = conn.prepareStatement(consulta);
        ps.setInt(1, registroBuscado);

        PreparedStatement ps2 = conn.prepareStatement(consulta2);
        ps2.setInt(1, registroBuscado);

        PreparedStatement ps3 = conn.prepareStatement(consulta3);
        ps3.setInt(1, registroBuscado);

        ResultSet rs = ps.executeQuery();
        ResultSet rs2 = ps2.executeQuery();
        ResultSet rs3 = ps3.executeQuery();

        if (rs.next()) {
            this.nombreEstudiante = rs.getString("nombre");
            paramNombre.setText(this.nombreEstudiante);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un estudiante con ese registro.");
            paramNombre.setText("");
        }

        if (rs2.next()) {
            this.gestion = rs2.getString("gestion"); 
            paramGestion.setText(this.gestion);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un registro académico con ese número.");
            paramGestion.setText("");
        }

        panelMaterias.removeAll();
        panelMaterias.setLayout(new BoxLayout(panelMaterias, BoxLayout.Y_AXIS));
        
     
             JButton btnReporte = new JButton("REPORTE RAPIDO"); 
                btnReporte.addActionListener(e -> {     
                FReporteRapido detallesFor = new FReporteRapido();
                detallesFor.setLocationRelativeTo(null);
                detallesFor.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
                detallesFor.setDatos(nombreEstudiante);
                detallesFor.setVisible(true);
                });
               


          
        while (rs3.next()) {
            String siglaMateria = rs3.getString("sigla");

            PreparedStatement ps4 = conn.prepareStatement(consulta4);
            ps4.setString(1, siglaMateria);
            ResultSet rs4 = ps4.executeQuery();

            String nombreMateria = "Materia no encontrada";
            if (rs4.next()) {
                nombreMateria = rs4.getString("nombre_materia");
            }
            
            JPanel materiaPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
            JLabel lblMateria = new JLabel(siglaMateria);
            JButton btnDetalle = new JButton("Detalle");
            
           
            String finalNombreMateria = nombreMateria; 
            btnDetalle.addActionListener(e -> {
               
                FPruebaDetalles detallesForm = new FPruebaDetalles();
                detallesForm.setLocationRelativeTo(null);
                detallesForm.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);

                detallesForm.setDatos(siglaMateria, finalNombreMateria, nombreEstudiante);

                detallesForm.setVisible(true);
                
            });
           
            materiaPanel.add(lblMateria);
            materiaPanel.add(btnDetalle);
            materiaPanel.add(btnReporte);

            panelMaterias.add(materiaPanel);
            
        }

        panelMaterias.revalidate();
        panelMaterias.repaint();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error SQL: " + e.getMessage());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error inesperado: " + e.toString());
    }
}

   
        
}