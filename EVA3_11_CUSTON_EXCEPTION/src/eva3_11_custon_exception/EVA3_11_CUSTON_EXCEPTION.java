/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_custon_exception;

/**
 *
 * @author MAX
 */
public class EVA3_11_CUSTON_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            mensaje();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void mensaje() throws  MiExcepcion{
        System.out.println("mensaje");
        throw new MiExcepcion("falla de sistema");
    }
}
class MiExcepcion extends Exception{

    public MiExcepcion() {
    }
    public MiExcepcion(String message){
        super(message);
    }
}
