package eva3_8_fanaly;
import java.util.Scanner;
import java.util.InputMismatchException;

public class EVA3_8_FANALY {

    public static void main(String[] args) {
        try {

            Scanner lee = new Scanner(System.in);
            System.out.println("INTRODUZCA UN NUMERO ");
            int num = lee.nextInt();
            System.out.println("el numero entero " + num);
        } catch (InputMismatchException e) {
            //lo que queremos hacer con la excepcion
            System.out.println("el valor introducido no es un numero entero");
        } finally {
            //usar para ejecutar codigo critico para el programa 
            //terminar procesos cerrar archivos o conexiones 
            //liberar recursos etc,
            //nada evita que se pueda producir ina excepcion en este 
            //en este bloque de codigo 

            System.out.println("ESTE VALOR SIEMPRE SE VA EJECUTAR ");
        }
    }

}
