/*
Crear un programa que dado un número determine si es par o impar.
 */
package guia3;

import static java.lang.Math.sqrt;
import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Ariel
 */
public class EJER1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner(System.in); // Creamos el Scanner
        
        System.out.println("Ingrese un numero entero: ");
        int numEntero = leer.nextInt(); // Leer un entero
        if ((numEntero%2) == 0){
           System.out.println("El numero " + numEntero + " es PAR");
        }else{
           System.out.println("El numero " + numEntero + " es IMPAR");
           }     
    }
    
}
