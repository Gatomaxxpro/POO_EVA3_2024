
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author MAX
 */
public class EVA3_5_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lee=new Scanner(System.in);
        try {
            
       
        System.out.println("introduce un numero");
        int nume=lee.nextInt();
          System.out.println("introduce un numero");
          int divi=lee.nextInt();
          int resu=0;
          resu=nume/divi;
            System.out.println("resultado="+resu);
            
          
       } catch (InputMismatchException e) {
           e.printStackTrace();
        }catch(ArithmeticException e) {
            
        }
    }
    
}
