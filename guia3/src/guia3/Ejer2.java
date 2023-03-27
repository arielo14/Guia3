/*
 *Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, 
sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
 */
package guia3;

import static java.util.Arrays.equals;
import static java.util.Objects.equals;
import java.util.Scanner;

/**
 *
 * @author Ariel
 */
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in); // Creamos el Scanner
        
        System.out.println("Ingrese una cadena: ");
        String cadena = leer.nextLine(); // Leer una cadena
    if (cadena.equals("eureka")){
        System.out.println("CORRECTO");
       }
        else{
        System.out.println("INCORRECTO");        
                }
         
            
    }    
    
}
