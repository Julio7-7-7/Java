package clases;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import odontofich.CConexion;


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
    
    
    

    public void mostrarRepoteRapido(JTable paramreporte ){//String registro
    
   CConexion objetoConexion = new CConexion();
           DefaultTableModel modelo =new DefaultTableModel();
           
           String sql =" ";
           
           modelo.addColumn("SIGLA");
           modelo.addColumn("NOMBRE"); 
           modelo.addColumn("TRABAJOS");
           modelo.addColumn("TRAB_REALIZADOS");
           modelo.addColumn("TRAB_NO_REALIZADO"); 
           modelo.addColumn("PRECIO U");
           modelo.addColumn("MONTO PAGADO");
           modelo.addColumn("MONTO POR PAGAR"); 
          
           paramreporte.setModel(modelo);
           
   sql = """
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
       -- JOIN 
     --       registroacademico r ON r.sigla = m.sigla
     --   WHERE 
        --    r.registro = ?  
        ORDER BY 
            m.sigla, t.nombre
    """;


           
         String [] datos =new String[8];
           Statement st;
         
           try {
               
               
            st = objetoConexion.EstablecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
                    
               while (rs.next()) {
                   
                  datos[0]=rs.getString(1);
                  datos[1]=rs.getString(2);
                  datos[2]=rs.getString(3);
                  datos[3]=rs.getString(4);
                  datos[4]=rs.getString(5);
                  datos[5]=rs.getString(6);
                  datos[6]=rs.getString(7);
                  datos[7]=rs.getString(8);
                  
                  
                   modelo.addRow(datos);
               }
             paramreporte.setModel(modelo);
               
        } catch (Exception e) {
        
               JOptionPane.showMessageDialog(null,"error"+ e.toString());
        }
    }
     }
   




   


   
    