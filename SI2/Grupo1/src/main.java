 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.CardLayout;
import javax.swing.*;
/**
 *
 * @author USUARIO
 */

public class main {
    public static void main(String[] args) {
  
        CConexion conexion = new CConexion();
        conexion.getConexion();
        

         // Crear los paneles insumo e inventario
        insumo panelInsumo = new insumo();  // Panel insumo
        inventario panelInventario = new inventario();  // Panel inventario
        
        // Crear el JFrame y configurar el layout
        JFrame frame = new JFrame("Registro de Insumo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 662);
        
        // Usar un CardLayout para mostrar y ocultar los paneles
        frame.setLayout(new CardLayout());
        
        // Agregar los paneles al JFrame
        frame.add(panelInsumo, "insumo");      // Agrega el panel insumo
        frame.add(panelInventario, "inventario");  // Agrega el panel inventario

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}
