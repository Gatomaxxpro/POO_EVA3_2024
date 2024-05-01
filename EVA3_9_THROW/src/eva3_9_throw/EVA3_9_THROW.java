
package eva3_9_throw;

import java.util.logging.Level;
import java.util.logging.Logger;


public class EVA3_9_THROW {

    public static void main(String[] args) {
        try {
            Problematico();
        } catch (Exception ex) {
            Logger.getLogger(EVA3_9_THROW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void Problematico() throws Exception{
        System.out.println("hello");
        
        throw new Exception("hola diablo buuuuu");
        
       // System.out.println("heello kitty");
       
    }
}
