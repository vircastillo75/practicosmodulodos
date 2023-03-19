/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
por pantalla.
 */
package guiadosejercicios;

import java.util.Scanner;

/**
 *
 * @author Virginia
 */
public class EjercicioDos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre de pila");
        String nombre = leer.next();
          
        System.out.println("Ingrese su apellido");
        String apellido = leer.next();
        System.out.println("Su nombre completo es " + nombre + " " + apellido);
        
                
     
      
        
        
    }
 
}
