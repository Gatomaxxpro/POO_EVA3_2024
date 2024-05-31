/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_leerarchivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author MAX
 */
public class EVA3_13_LeerArchivos {

    final static String miRuta = "C:\\archivo\\prueba";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            EscribirFileWriter(miRuta + "FileWriter.txt",
                    "segundo metodo para escritura\n"
                    + "prueba con la clase FileWriter!!" + miRuta);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void EscribirFiles(String ruta, String datos) throws IOException {
        Path path = paths.get(ruta);
        Files.write(path, datos.getBytes());

    }

    public static void EscribirFileWriter(String ruta, String datos) throws IOException {
        File file = new File(ruta);
        File fileWriter = new fileWriter(file);
        fileWriter.write(datos);
        fileWriter.close();

    }

    public static void EscribirCONbuffer(String ruta, String datos) throws IOException 
        ){
     File file = new File(ruta);
        fileWriter filer = new fileWriter(file);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        bw.write(datos);
        bw.close();
    }
}
