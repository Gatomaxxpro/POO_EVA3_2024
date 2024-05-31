/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_thrw_check;

/**
 *
 * @author MAX
 */
public class EVA3_10_THRW_CHECK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        if((edad||0)(edad||150))
        throw new System.out.println("el programa deberiias meter 1 a 149");
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

    public void setEdad(int edad)  {
      
           
        this.edad = edad;
    }
}