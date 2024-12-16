package clases; // EL CÓDIGO PERTENECE AL PAQUETE CLASES

// IMPORTACIONES INCLUYE CLASES NECESARIAS PARA TRABAJAR CON:
import java.sql.Connection; //BASE DE DATOS
import java.sql.PreparedStatement; //BASE DE DATOS
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat; //MANEJO DE FECHAS
import java.util.Date;
import javax.swing.JComboBox; //ELEMENTOS GRÁFICOS
import javax.swing.JOptionPane;
import javax.swing.JTable; //ELEMENTOS GRÁFICOS
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import odontofich.CConexion; //CONEXIÓN

public class GAdicional { //DECLARACIÓN DE LA CLASE QUE GESTIONARÁ INSUMOS Y REGISTROS ADICIONALES

   private int idRegistro; //ATRIBUTOS
    private String insumoSeleccionado;
    private int cantidad;
    private double costo;
    private Date fecha;

    // Getters y Setters
    public int getIdRegistro() { //GETTER: RETORNA EL VALOR DEL ATRIBUTO
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) { //SETER ASINGA UN NUEVO VALOR AL ATRIBUTO
        this.idRegistro = idRegistro;
    }

    public String getInsumoSeleccionado() {
        return insumoSeleccionado;
    }

    public void setInsumoSeleccionado(String insumoSeleccionado) {
        this.insumoSeleccionado = insumoSeleccionado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(String fechaStr) throws ParseException { // VALIDA QUE LA FECHA ESTÁ EN EL FORMATO DD/MM/YY
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //SI NO LO ESTÁ LANZA UN ERROR
        
        sdf.setLenient(false);
        this.fecha = sdf.parse(fechaStr);
    }

    public void cargarInsumosEnComboBox(JComboBox<String> comboBox) { 
        String sql = "SELECT id_insumo ,nombre_insumo FROM insumo"; //SE OBTIENE IDINSUMO Y NOMBRE INSUMO DE LA TABLA INSUMO
        try (Connection conn = new CConexion().EstablecerConexion(); //ABRE LA CONEXIÓN A LA BASE DE DATOS
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            comboBox.removeAllItems();

            while (rs.next()) {
              
            String displayText = rs.getString("id_insumo") + " - " + rs.getString("nombre_insumo"); //POR CADA INSUMO ENCONTRADO CREA UN TEXTO EN EL FORMATO IDNOMBRE
            comboBox.addItem(displayText); //AGREGA ESE TEXTIO AL JCOMBOX
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar insumos: " + e.getMessage());//SI ALGO FALLA MUESTRA UN MENSAJE CON ERROR
        }
    }

   
   public void limpiarCampos(JTextField idRegist, JTextField jtcosto, JTextField cantidadAdi, JTextField fechaAdi) {
        idRegist.setText(""); //LIMPIA LOS TEXTOS DE LOS CAMPOS DE ENTRADA PARA REINICIAR EL FORMULARIO
        jtcosto.setText("");
        cantidadAdi.setText("");
        fechaAdi.setText("");
    }

    
    public void cancelarRegistro(JTable tabla, JTextField idRegist, JTextField cantidadAdi, JTextField jtcosto, JTextField fechaAdi) {
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar?", "Cancelar", JOptionPane.YES_NO_OPTION); //MUESTRA UN MENSAJE DE CONFIORMACIÓN AL USUARIO
        if (opcion == JOptionPane.YES_OPTION) {//SI EL USUARIO ACEPTA LIMPIA LOS CAMPOS DEL FORMULARIO
            limpiarCampos(idRegist, jtcosto,cantidadAdi, fechaAdi);
            ((DefaultTableModel) tabla.getModel()).setRowCount(0); //BORRA LAS FILAS DE LA TABLA ASOCIADA
        }
    }

    
public void agregarDatosATabla(JTable tabla, JTextField idRegist, JComboBox<String> comboBoxInsumo, JTextField cantidadAdi, JTextField jtcosto, JTextField fechaAdi) {
    try {
       
        setIdRegistro(Integer.parseInt(idRegist.getText())); //LEE Y VALIDA LOS CAMPOS DE ENTRADA 
        setCantidad(Integer.parseInt(cantidadAdi.getText()));
        setCosto(Double.parseDouble(jtcosto.getText()));

        
        String insumoSeleccionado = comboBoxInsumo.getSelectedItem().toString();//OBTIENE EL ID DEL INSUMO SELECCIONADO DEL JCOMBOX
        String[] insumoParts = insumoSeleccionado.split(" - "); 
        String idInsumo = insumoParts[0]; 
        setInsumoSeleccionado(idInsumo); 

       
        String fechaTexto = fechaAdi.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //VERIFICA EL FORMATO DE LA FECHA
        sdf.setLenient(false);

        if (!fechaTexto.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
            JOptionPane.showMessageDialog(null, "La fecha debe estar en el formato dd/MM/yyyy (por ejemplo, 12/06/2024).", "Error de Fecha", JOptionPane.ERROR_MESSAGE);
            return;
        }

        setFecha(fechaTexto);

       
        Object[] row = {getIdRegistro(), idInsumo, getCantidad(), getCosto(), fechaTexto};

        DefaultTableModel model = (DefaultTableModel) tabla.getModel();//INSERTA UNA NUEVA FILA CON LOS DATOS EN LA TABLA
        model.insertRow(0, row); 
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error: El ID, la cantidad y el costo deben ser números válidos.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida. Use el formato dd/MM/yyyy.", "Error de Fecha", JOptionPane.ERROR_MESSAGE);
    }
}


public void insertarDatosEnBaseDeDatos() {// INDICA QUE SE VA INSERTAR DATOS EN LA BASE DE DATOS
    if (getFecha() == null) { //VERIFICA QUE LA FECHA NO SEA NULA
        JOptionPane.showMessageDialog(null, "La fecha no puede estar vacía.");
        return;
    }

    String sqlCheckStock = "SELECT stock FROM inventario WHERE id_insumo = ?"; //CONSULTA EL STOCK DIS´PONIBLE DE LA TABLA INVENTARIO
    String sqlInsert = "INSERT INTO detalle_adicional (registro, id_insumo, cantidad, costo, fecha) VALUES (?, ?, ?, ?, ?)";//INSERTA LOS DATOS DE UN REGISTRO ADICIONAL EN LA TABLA DETALLEADICIONAL
    String sqlUpdate = "UPDATE inventario SET stock = stock - ? WHERE id_insumo = ?"; // ACTULIZA EL STOCK DEL INSUMOR EN LA TABLA INVENTARIO RSTANDO LA CANTIDAD UTILIZA

    try (Connection conn = new CConexion().EstablecerConexion()) { //SE ESTABLECE UNA CONEXION A LA BD
      
       PreparedStatement pstmtCheckStock = conn.prepareStatement(sqlCheckStock); //CREA UN PREPA....PARA LA CONSULTA SQL
        pstmtCheckStock.setString(1, getInsumoSeleccionado()); //ASOCIA EL IDINSUMO QUE SE OBTIENE CON GETINSUMO SELECCIONADO
        ResultSet rs = pstmtCheckStock.executeQuery(); //ALMACENA EL RESULTADO EN RS

        if (rs.next()) { //SI SE ENCUENTRA UN INSUMO MEDIANTE RS.NEXT
            int stockDisponible = rs.getInt("stock"); //OBTIENE EL VALOR DE STOCK Y LO ASIGNA A STOCK DISPONIBLE

            
            if (stockDisponible < getCantidad()) {//SI EL STOCKD ES MENOR QUE LA CANTIDAD MUESTRA UB MENSAJE DE ERROR
                JOptionPane.showMessageDialog(null, "No se puede realizar la operación. Stock insuficiente (Disponible: " + stockDisponible + ").");
                return; //Y SALE DEL MÉTODO
            }

           
            if (stockDisponible - getCantidad() < 5) {//SI EL STOCK RESTANTE DESPUES DE LA OPER ES MENOR QUE 5 UNIDADES 
                JOptionPane.showMessageDialog(null, "Advertencia: El stock quedará bajo (" + (stockDisponible - getCantidad()) + " unidades restantes).");//MUESTRA UNA ADVERTENCIA DE ERROR
            }
        } else {//SI EL INSUMO NO SE ENCUENTRA EN EL INVENTARIO DEVUELVE FALSE 
            JOptionPane.showMessageDialog(null, "El insumo seleccionado no existe en el inventario.");//MUESTRA UN MENSAJE DE EEROR
            return;// Y SALE DEL METODO
        }

      
        PreparedStatement pstmtInsert = conn.prepareStatement(sqlInsert);// CREA UN PREPAR...PARA LA CONSULTA DE INSERCCIÓN SQL
        pstmtInsert.setInt(1, getIdRegistro());//ASINGANDO LOS VALORES DE LOS CAMPOS DEL FORMULARIO
        pstmtInsert.setString(2, getInsumoSeleccionado());
        pstmtInsert.setInt(3, getCantidad());
        pstmtInsert.setDouble(4, getCosto());
        pstmtInsert.setDate(5, new java.sql.Date(getFecha().getTime()));

        int rowsAffected = pstmtInsert.executeUpdate(); //EJECUTA LA INSERCCIÓN

        if (rowsAffected > 0) { //SI rowsAffected > 0 PROCEDE A ACTULIZAR EL STOCK
           
            PreparedStatement pstmtUpdate = conn.prepareStatement(sqlUpdate); //PREPARA LA CONSULTA DE ACTUAÑIZACIÓN DEL STOCK
            pstmtUpdate.setInt(1, getCantidad());
            pstmtUpdate.setString(2, getInsumoSeleccionado());

            int rowsUpdated = pstmtUpdate.executeUpdate();//EJECUTA LA ACTUALIZACIÓN DEL STOCK

            if (rowsUpdated > 0) {//SI LA ACTUALIZACIÓN DEL STOC FUE EXITOSA 
                JOptionPane.showMessageDialog(null, "Datos insertados y cantidad actualizada en inventario."); //MUESTRA UN MENSAJE QUE LOS DATOS FUERON INSERTADOS Y EL INVENTARIO ACTUALIZADO
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la cantidad en el inventario.");// SI NO SE PUDO ACTUALIZAR EL STOCK MUESTRA UN MENSAJE DE ERROR
            }
        } else {//SI NO SE INSERTARON REGISTROS EN LA TABLA
            JOptionPane.showMessageDialog(null, "No se insertaron datos en la base de datos.");//MUESTRA UN MENSAJE DE ERROR
        }
    } catch (SQLException e) {// SI OCURRE UN ERROR DURANTE LAS CONSULTAS A LA BD 
        JOptionPane.showMessageDialog(null, "Error al insertar los datos: " + e.getMessage());//MUESTRA UN MENSSAJE DE ERROR
        e.printStackTrace();
    }
}



    private void actualizarStock(int cantidad, String insumoSeleccionado, Connection conn) {
        String sqlStock = "UPDATE inventario SET stock = stock - ? WHERE id_insumo = ?";//REDUCE LA CANTIDAD DISPONIBLE DEL INSUMO EN LA BD INVENTARIO BASADO EN SU IDINSUMO
        try (PreparedStatement pstmtStock = conn.prepareStatement(sqlStock)) {//PREPARA LA CONSULTA
            pstmtStock.setInt(1, cantidad);
            pstmtStock.setString(2, insumoSeleccionado);

            int rowsUpdated = pstmtStock.executeUpdate();
            if (rowsUpdated > 0) {// SI rowsUpdated > 0 
                JOptionPane.showMessageDialog(null, "Stock actualizado correctamente."); //SIGNIFICA QUE EL STOCK FUE MODIFICADO CORRECTAMENTE
            } else {//DE LO CONTRARIO 
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el stock.");//NO EXISTE EN LA BASE DE DATOS
            }

        } catch (Exception e) {//CAPTURA CUALQUIER ERROR DURANTE LA EJECUCIÓN 
            JOptionPane.showMessageDialog(null, "Error al actualizar el stock: " + e.getMessage());//Y MUESTRA UN MENSAJE CON LOS DETALLES DEL ERROR
            e.printStackTrace();
        }
    }
    public void limpiarTabla(JTable tabla) {// TABLA QUE CONTIENE LOS DATOS A LIMPIAR
    DefaultTableModel model = (DefaultTableModel) tabla.getModel();//SE OBTIENE EL MODELO DE LA TABLA , ESTE MODELO ES DONDE SE ALMACENAN FILAS Y COLUMNAS VISIBLES EN LA INTErfaz
    model.setRowCount(0); //y limpia las filas
}
}