/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_throw;

/**
 *
 * @author MAX
 */
public class EVA3_10_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  try {
            
        
        Persona per=new Persona ("max", "bernal", -175);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("fin de programa");
*/   
      try {
         
        
      Persona per=new Persona();
      per.setApellido("bernal");
      per.setNombre("max");
      per.setEdad(21);
      System.out.print(per.getNombre()+" "+per.getApellido()+" "+per.getEdad()+" ");
}
      } catch (Exception e) {
          
          e.printStackTrace();
        } 
    } 
   

  

class Persona{
    private String Nombre;
    private String apellido;
    private int edad;
    public Persona(){
        this.Nombre="";
         this.apellido="";
          this.edad=0;
        
    }

    public Persona(String Nombre, String apellido, int edad) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if((edad<0)||(edad>150))
            throw new Exception("valor esta muy mal mo es cuerente de la edad no debe ser menor a cero o mayor a 150");
        this.edad = edad;
    }
}