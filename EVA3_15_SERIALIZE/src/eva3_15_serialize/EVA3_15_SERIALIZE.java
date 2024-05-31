/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_15_serialize;

import java.beans.beancontext.BeanContextMembershipEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author MAX
 */
public class EVA3_15_SERIALIZE {


    public static void main(String[] args) {
// ARCHIVOS BINARIOS : NO SON TANTO
//GURARDAN LA IMGO COMO 1 Y 0 
//GUARDAN OBJETOS
 //PARA GUARDAR 
 
        try {
      
        Persona perso=new Persona("max", "bernal", 21);
        GuardarObjeto(perso);
        Persona perso2=leerObjeto();
            System.out.println(perso2);
       } catch (Exception e) {
           e.printStackTrace();
        }  
    }

    public static Persona leerObjeto(Persona obj)throws IOException{
        Persona perso = null;
        
            String ruta = "D:\\archivo\\personas.per";
            FileInputStream abrir = new FileInputStream(ruta);
            
           ObjectInputStream leerArch= new ObjectInputStream(abrir);
           perso= (Persona)leerArch.readObject();
                    
      return perso;
    
    }
     public static void GuardarObjeto(Persona obj)throws FileNotFoundException{
          String ruta = "D:\\archivo\\personas.per";
          FileOutputStream abrir= new FileOutputStream(ruta);
          ObjectOutputStream guardarDatos = new ObjectOutputStream(abrir);
          
          guardarDatos.writeObject(obj);
    }
    class Persona implements Serializable{
  private String nombre;
  private String apellido;
  private int edad;
    
        public Persona() {
            
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
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

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public Persona(String nombre, String apellido, int edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
        }
        
    }
   @Override
   public String toStringo(){
       return "Nombre:"+nombre+""+"apellido"+apellido+"\n"+"edad:"+edad;
   }
}
