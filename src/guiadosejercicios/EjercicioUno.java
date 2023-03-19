/*
 Escribir un programa que pida dos números enteros por teclado y calcule la
suma de los dos. El programa deberá después mostrar el resultado de la suma
 */
package guiadosejercicios;

import java.util.Scanner;

/**
 *
 * @author Virginia
 */
public class EjercicioUno {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2= leer.nextInt();
        int suma = num1 + num2;
           System.out.println("La suma de los números por usted ingresados es" + suma);
    
    }
}
