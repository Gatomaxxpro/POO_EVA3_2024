
package eva3_12_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class EVA3_12_ARCHIVOS {
    
    final static String miRuta="C:\\archivo\\prueba.txt"; 
  
    public static void main(String[] args) {
        try {
            leerArchivosFiles(miRuta);
            leerArchivosFileReader(miRuta);
            leerArchivoBuffer(miRuta);
            LeerConScanner(miRuta);
        } catch (Exception ex) {
            
            ex.printStackTrace();
            
        }
    
    }
    /*
    CLASE FILE 
    LECTURA DE ARCHIVOS USANDO LA CALSE FILES 
    SE LEE TODO EL ARCHIVO Y SE CARGA EN MEMORIA 
    POR TANTO, ES UTIL PARA ARCHIVOS PEQUEÑOS .
    */
    public static void leerArchivosFiles(String ruta) throws IOException{
        System.out.println("LECTURA DE UN ARCHIVO DE TEXTO  CON CLASE "); 
        Path path =Paths.get(ruta);// creaa la ruta de tipo Path
        byte [] datos=Files.readAllBytes(path);//Genera un IOException
                          //new String -->convierte el arreglo cadena de texto
        System.out.println(new String (datos));
    }
    /*
    es adecuado para leer archivos grandes.
    nos permite procesar archivos de texto linea por linea 
    es adecuado para leer archivos 
    */
    public static void leerArchivoBuffer(String ruta) throws FileNotFoundException, IOException{
        System.out.println("lectur de archivo de texto con clase");
        //1: abrir 
        //2:el archivo como imformacion binaria 
        //3:convertir la imformacion binRIA a texto
        File file=new File(ruta);
        FileInputStream in =new FileInputStream(file);
        InputStreamReader reader=new InputStreamReader(in);
        BufferedReader br=new BufferedReader(reader);
       String cade;
       /*
       asignamos la linea ala variable cade 
       si cade es diferente de null estamos 
       leyendo texto, si leemos NULL, LLEGAMOS 
       AL FINAL DEL archivo
       */
               
       while ((cade=br.readLine())!=null){
           System.out.println(cade);
           
       }
    }
    public static void leerArchivosFileReader(String ruta) throws FileNotFoundException, IOException{
        
        File file=new File(ruta);
        FileReader reader=new FileReader(file);        
        BufferedReader br=new BufferedReader(reader);
       String cade;
       /*
       asignamos la linea ala variable cade 
       si cade es diferente de null estamos 
       leyendo texto, si leemos NULL, LLEGAMOS 
       AL FINAL DEL archivo
       */
               
       while ((cade = br.readLine()) != null){
           System.out.println(cade);
           
       }
       br.close();
       
    }
    public static void LeerConScanner(String ruta) throws IOException{
        System.out.println("lectura de archivos con Scanner");
        Path path =Paths.get(ruta);// creaa la ruta de tipo Path
        Scanner leer=new Scanner(ruta);
        while(leer.hasNextLine()){
            String cade =leer.nextLine();
            System.out.println(cade);
        }
        leer.close();
               
        
    }
    
    
    }

