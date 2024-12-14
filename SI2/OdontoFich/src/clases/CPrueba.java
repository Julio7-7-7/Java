package clases;

import Interfaces.FPruebaDetalles;
import Interfaces.FReporteRapido;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import odontofich.CConexion;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

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

        // Limpiar el panel de materias
        panelMaterias.removeAll();
        panelMaterias.setLayout(new BoxLayout(panelMaterias, BoxLayout.Y_AXIS));
        panelMaterias.setBackground(Color.WHITE); // Cambiar el fondo del panelMaterias a blanco

        // Llenar el panel con las materias
        while (rs3.next()) {
            String siglaMateria = rs3.getString("sigla");

            PreparedStatement ps4 = conn.prepareStatement(consulta4);
            ps4.setString(1, siglaMateria);
            ResultSet rs4 = ps4.executeQuery();

            String nombreMateria = "Materia no encontrada";
            if (rs4.next()) {
                nombreMateria = rs4.getString("nombre_materia");
            }

            // Crear el panel de la materia
            JPanel materiaPanel = new JPanel(); // Espaciado horizontal entre componentes
            materiaPanel.setBackground(Color.WHITE); // Fondo blanco

            JLabel lblMateria = new JLabel(siglaMateria);
            JButton btnDetalle = new JButton("Detalle");

            // Aplicar estilo al botón
            efectoBotones(btnDetalle);

            String finalNombreMateria = nombreMateria;
            btnDetalle.addActionListener(e -> {
                FPruebaDetalles detallesForm = new FPruebaDetalles();
                detallesForm.setLocationRelativeTo(null);
                detallesForm.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
                detallesForm.setDatos(siglaMateria, finalNombreMateria, nombreEstudiante, String.valueOf(registroBuscado));
                detallesForm.setVisible(true);
            });

            // Añadir los componentes al panel con separación
            materiaPanel.add(lblMateria, BorderLayout.WEST); // Nombre de la materia alineado a la izquierda
            materiaPanel.add(btnDetalle, BorderLayout.EAST); // Botón alineado a la derecha
            panelMaterias.add(materiaPanel);
        }

        // Crear el botón "Reporte Rápido" en su propio panel
        JPanel panelReporte = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelReporte.setBackground(Color.WHITE); // Fondo blanco
        JButton btnReporte = new JButton("REPORTE RÁPIDO");

        // Aplicar estilo al botón
        efectoBotones(btnReporte);

        btnReporte.addActionListener(e -> {
            FReporteRapido detallesFor = new FReporteRapido();
            detallesFor.setLocationRelativeTo(null);
            detallesFor.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
            detallesFor.setDatos(nombreEstudiante);
            detallesFor.setVisible(true);
        });
        panelReporte.add(btnReporte);

        // Agregar el panel del botón al panel de materias
        panelMaterias.add(panelReporte);

        panelMaterias.revalidate();
        panelMaterias.repaint();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error SQL: " + e.getMessage());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error inesperado: " + e.toString());
    }
}


    private void efectoBotones(JButton button) {
    // Asegurar transparencia total
    button.setOpaque(false);
    button.setContentAreaFilled(false);
    button.setFocusPainted(false);

    // Personalizar texto
    button.setForeground(new Color(200, 200, 200));
    button.setFont(new Font("Arial", Font.BOLD, 14));

    // Crear un borde redondeado visible
    Border originalBorder = new javax.swing.border.AbstractBorder() {
        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // Color y grosor del borde
            g2d.setColor(new Color(200, 200, 200)); // Gris claro
            g2d.setStroke(new java.awt.BasicStroke(2)); // Grosor del borde

            // Dibujar el borde redondeado
            g2d.drawRoundRect(x, y, width - 1, height - 1, 30, 30); // Radio de 30 para bordes redondeados
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(7, 7, 7, 7); // Ajuste interno entre texto y borde
        }

        @Override
        public boolean isBorderOpaque() {
            return false; // Garantiza que el fondo sea transparente
        }
    };

    button.setBorder(originalBorder);

    // Cambiar cursor al pasar sobre el botón
    button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    // Agregar efectos visuales al pasar el mouse
    button.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            // Cambiar el color del texto y el borde al pasar el mouse
            button.setForeground(new Color(202, 207, 250)); // Gris claro para texto

            // Actualizar el borde al color del texto
            button.setBorder(new javax.swing.border.AbstractBorder() {
                @Override
                public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                    // Usar el mismo color que el texto para el borde
                    g2d.setColor(button.getForeground()); // Usar el color de texto
                    g2d.setStroke(new java.awt.BasicStroke(2)); // Grosor del borde

                    // Dibujar el borde redondeado
                    g2d.drawRoundRect(x, y, width - 1, height - 1, 30, 30); // Radio de 30 para bordes redondeados
                }

                @Override
                public Insets getBorderInsets(Component c) {
                    return new Insets(10, 10, 10, 10); // Ajuste interno entre texto y borde
                }

                @Override
                public boolean isBorderOpaque() {
                    return false; // Garantiza que el fondo sea transparente
                }
            });
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // Revertir el texto y el borde a sus valores originales
            button.setForeground(new Color(200, 200, 200)); // Revertir el texto a gris claro
            button.setBorder(originalBorder); // Restaurar el borde original
        }
    });
}


   
        
}