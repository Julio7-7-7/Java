package proyectfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class ClassArchivoTexto {
    
    public void EscribirFile() throws IOException
    {
    String dir= "E:\\FICH\\Informática\\Prac Archivos\\";
    String nombarchivo= "Julio2.txt";
    File f= new File(nombarchivo);
    FileWriter fw= new FileWriter(f);
    BufferedWriter bw;
        bw = null;
    
    try
    {
    fw= new FileWriter(dir+nombarchivo, false);
    }
    catch(Exception e)
    {
    e.printStackTrace();
        System.out.println("No se puede crear el archivo....!");
        System.exit(1);
    }
    bw= new BufferedWriter(fw);
    
    /*bw.write("1.- Julio Toledo \n");
    bw.write("2.- 124595 SC \n");
    bw.write("3.- Programacion I \n");
    */
    String cad= "";
    cad= JOptionPane.showInputDialog("Escriba algo");
    bw.write(cad);
    
    bw.close();
    fw.close();
    
    }
    
     public void LeerFile() throws IOException
     {
     String dir= "E:\\FICH\\Informática\\Prac Archivos\\";
             
     String nombarchivo="Julio2.txt";
     String s;
     FileReader fr= null;
     BufferedReader br= null;
     
     try
     {
     fr= new FileReader(dir+nombarchivo);
     }
     catch(Exception e)
     {
     e.printStackTrace();
     System.out.println("No se pudo abrir el archivo");
     System.exit(1);
     }
     
     br= new BufferedReader(fr);
     while((s=br.readLine())!=null)
     {
     System.out.println(s);
     }
     
     br.close();
     fr.close();
     }
    
public void CantLineas() throws IOException
{
String dir= "E:\\FICH\\Informática\\Prac Archivos\\";
             
     String nombarchivo="Julio2.txt";
     String s;
     FileReader f= null;
     BufferedReader br= null;
     
     try
     {
     f= new FileReader(dir+nombarchivo);
     }
     catch(Exception e)
     {
     e.printStackTrace();
     System.out.println("No se pudo abrir el archivo");
     System.exit(1);
     }
     
     int c=0;
     
     br= new BufferedReader(f);
     while((s=br.readLine())!=null)
     {
     System.out.println(s);
     c++;
     }
     
     br.close();
     f.close();
     System.out.println("Cantidad de lineas es = "+c);
     }
}
     
  JFileChooser seleccionar = new JFileChooser();
File Archivo
     
     
     
     
     
     

