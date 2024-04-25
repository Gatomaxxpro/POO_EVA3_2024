/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_try_catch;

/**
 *
 * @author MAX
 */
public class EVA3_4_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int x=10,y=0;
        int resu;
        try{//aqui va el codigo que puede llevar
            resu=x/y;
        
        System.out.println("resultado:"+resu);
        }catch(ArithmeticException ex){//aqui va la solucion 
            //que queremos hacer 
            System.out.println("upps carnal pon bien numeros y que sean validos aritmeticamente");
            ex.printStackTrace();
        }
    }
    
}
