
package eva3_2_excepciones__main;
import java.util.Scanner;
public class EVA3_2_EXCEPCIONES__MAIN {

    
    public static void main(String[] args) {
       Scanner lee=new Scanner(System.in);
        System.out.println("introduce un numero");
        double numero=lee.nextDouble();
        System.out.println("introduce otro");
        double num2=lee.nextDouble();
        double x=numero/num2;
        System.out.println("el resultado es :"+x);
    }
    
}
