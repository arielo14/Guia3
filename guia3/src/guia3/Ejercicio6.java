/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú:El usuario deberá elegir una opción y el programa deberá 
mostrar el resultado por pantalla y luego volver al menú. El programa deberá ejecutarse 
hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, 
en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Ariel
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in); // Creamos el Scanner

        System.out.println("Ingrese el primer numero: ");
        int num1 = leer.nextInt(); // Leer un entero
        System.out.println("Ingrese el segundo numero: ");
        int num2 = leer.nextInt(); // Leer un entero
        boolean ban = false;
        
        while (ban == false) {
        
            System.out.println("\nINGRESA una opcion(numero) para operar:"
                + "\n 1.SUMA "
                + "\n 2.RESTA"
                + "\n 3.MULTIPLICACION"
                + "\n 4.DIVISION"
                + "\n 5.SALIR \n");
        
            int opcion = leer.nextInt();
        
            switch (opcion) {
                case 1:
                    System.out.println("La suma entre "+ num1 + " y " + num2 + " es : " + (num1+num2) );
                    break;
                case 2:
                    System.out.println("La resta entre "+ num1 + " y " + num2 + " es : " + (num1-num2) );
                    break;
                case 3:
                    System.out.println("La multiplicación entre "+ num1 + " y " + num2 + " es : " + (num1*num2) );
                    break;
                case 4:
                    System.out.println("La división "+ num1 + " y " + num2 + " es : " + (num1/num2) );
                    break;
                case 5:
                    System.out.println("¿Desea Salir del programa?");
                    
                    String salida = leer.next();
                
                    if (salida.equals("S")){
                        ban = true;
                    }else{
                        System.out.println("Volves al menu");   
                    }
                     break;
                default:
                System.out.println("El numero ingresado no está todavia en nuestro programa");
        
            }    
        }
        
    }
    
}
