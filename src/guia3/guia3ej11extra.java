/*
Escribir un programa que lea un número entero y devuelva el número de dígitos 
que componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división.Nota: recordar que las variables de tipo entero truncan los
números o resultados.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author dulce
 */
public class guia3ej11extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int num1;
        int contador = 0;
        System.out.println("Ingrese un Numer entero;");
        num1 = leer.nextInt();
        do {
           num1=Math.round(num1/10); 
           contador ++ ;
           
        } while ( num1 != 0);
        
        
        System.out.println("El numero tiene: " + contador + " digitos");
    }
    
} 
    
    

