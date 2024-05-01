/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_excepction;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author MAX
 */
public class EVA3_6_EXCEPCTION {

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
            e.printStackTrace();
            
        }
    }
    
}

    

