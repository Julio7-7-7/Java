package clases;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import odontofich.CConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JTextField;

public class GReporteRapido {
         String SIGLA ;
    String NOMBRE ;
    String TRABAJOS;
    Double TRAB_REALIZADOS;
    Double TRAB_NO_REALIZADOS;
    Double PRECIO_U;
    Double MONTO_PAGADO;
    Double MONTO_NO_PAGADO;
        String registro ;

    public String getREGISTRO() {
        return registro;
    }

    public void setREGISTRO(String REGISTRO) {
        this.registro = REGISTRO;
    }


    public String getSIGLA() {
        return SIGLA;
    }

    public void setSIGLA(String SIGLA) {
        this.SIGLA = SIGLA;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getTRABAJOS() {
        return TRABAJOS;
    }

    public void setTRABAJOS(String TRABAJOS) {
        this.TRABAJOS = TRABAJOS;
    }

    public Double getTRAB_REALIZADOS() {
        return TRAB_REALIZADOS;
    }

    public void setTRAB_REALIZADOS(Double TRAB_REALIZADOS) {
        this.TRAB_REALIZADOS = TRAB_REALIZADOS;
    }

    public Double getTRAB_NO_REALIZADOS() {
        return TRAB_NO_REALIZADOS;
    }

    public void setTRAB_NO_REALIZADOS(Double TRAB_NO_REALIZADOS) {
        this.TRAB_NO_REALIZADOS = TRAB_NO_REALIZADOS;
    }

    public Double getPRECIO_U() {
        return PRECIO_U;
    }

    public void setPRECIO_U(Double PRECIO_U) {
        this.PRECIO_U = PRECIO_U;
    }

    public Double getMONTO_PAGADO() {
        return MONTO_PAGADO;
    }

    public void setMONTO_PAGADO(Double MONTO_PAGADO) {
        this.MONTO_PAGADO = MONTO_PAGADO;
    }

    public Double getMONTO_NO_PAGADO() {
        return MONTO_NO_PAGADO;
    }

    public void setMONTO_NO_PAGADO(Double MONTO_NO_PAGADO) {
        this.MONTO_NO_PAGADO = MONTO_NO_PAGADO;
    }
    
    
    
        public void mostrarReporteRapido(JTable paramReporte, JTextField txtNombreEstudiante) {
    
    CConexion conexionBD = new CConexion();
    DefaultTableModel modeloTabla = new DefaultTableModel();

    // Configurar columnas del modelo de la tabla
    modeloTabla.addColumn("SIGLA");
    modeloTabla.addColumn("NOMBRE");
    modeloTabla.addColumn("TRABAJOS");
    modeloTabla.addColumn("TRAB_REALIZADOS");
    modeloTabla.addColumn("TRAB_NO_REALIZADO");
    modeloTabla.addColumn("PRECIO U");
    modeloTabla.addColumn("MONTO PAGADO");
    modeloTabla.addColumn("MONTO POR PAGAR");

    paramReporte.setModel(modeloTabla);

    // estoy agarrando el balo que ingrese en el jtextfiel
    String textoIngresado = txtNombreEstudiante.getText().trim();
    
    String consultaSQL = """
        SELECT 
            CASE WHEN ROW_NUMBER() OVER (PARTITION BY m.sigla ORDER BY t.nombre) = 1 THEN m.sigla ELSE '' END AS Sigla,
            CASE WHEN ROW_NUMBER() OVER (PARTITION BY m.sigla ORDER BY t.nombre) = 1 THEN m.nombre_materia ELSE '' END AS Nombre_de_Materia,
            t.nombre AS Nombre_del_Trabajo,
            '' AS columna_1,
            '' AS columna_2,
            t.precio_unidad AS Precio_por_Unidad,
            '' AS columna_3,
            '' AS columna_4
        FROM 
            materia m
        JOIN 
            plan_materia pm ON pm.sigla = m.sigla
        JOIN 
            trabajo t ON pm.id_trabajo = t.id_trabajo
        JOIN 
            registroacademico r ON r.sigla = m.sigla
        JOIN
            estudiante e ON e.registro = r.registro
        WHERE 
            e.nombre LIKE ?
        ORDER BY 
            m.sigla, t.nombre
    """;

    try {
        Connection conexion = conexionBD.EstablecerConexion();
        PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);


        preparedStatement.setString(1, "%" + textoIngresado + "%");

        ResultSet resultado = preparedStatement.executeQuery();
        String[] filaDatos = new String[8];


        while (resultado.next()) {
            filaDatos[0] = resultado.getString(1); 
            filaDatos[1] = resultado.getString(2); 
            filaDatos[2] = resultado.getString(3); 
            filaDatos[3] = resultado.getString(4); 
            filaDatos[4] = resultado.getString(5); 
            filaDatos[5] = resultado.getString(6); 
            filaDatos[6] = resultado.getString(7); 
            filaDatos[7] = resultado.getString(8); 

         
            modeloTabla.addRow(filaDatos);
        }

        paramReporte.setModel(modeloTabla);

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error al generar el reporte: " + ex.getMessage());
    }
}

     }
   




   


   
    