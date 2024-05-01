/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_practica_eception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author MAX
 */
public class EVA3_7_PRACTICA_ECEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 // TODO code application logic here
         Scanner lee=new Scanner(System.in);
        try {
       if(true)
       System.out.println("introduce un numero");
       int nume=lee.nextInt();
       System.out.println("introduce un numero");
       int divi=lee.nextInt();
          int resu=0;
          resu=nume/divi;
            System.out.println("resultado="+resu);
  
       } catch (InputMismatchException e) {
            System.out.println("INTRODUCE UN NUMERO WEY NMMS ");
           e.printStackTrace();
        }catch(ArithmeticException e) {
            System.out.println("introduce lo que se pide we");
            e.printStackTrace();
                } 
        
        }
    }
    

