/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
se encuentra el numero y si se encuentra repetido
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author dulce
 */
public class guia5ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n; 
        n = leer.nextInt();
        
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random() * 10);
            
        }
        System.out.println("Ingrese el valor que desea buscar: ");
        int num = leer.nextInt();
        int aux = 0;
         System.out.println("El numero" + num +" se encuentra en las posiciones: ");
        for (int i = 0; i < n; i++) {
            if (num == vector[i]) {
                aux ++; 
                System.out.print( i+" ,");
            }
        }
        System.out.println("se repite:" + aux + " veces");
    }
    
}
    
    

