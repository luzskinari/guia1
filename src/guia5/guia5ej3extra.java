/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo
por parámetro. Después haremos otra función o procedimiento que imprima el vector.

 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author dulce
 */
public class guia5ej3extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer= new Scanner (System.in);
        System.out.println(" ingresar un número");
        int n= leer.nextInt();
        int[]i= new int[n];
        vector(i,n);
        mostrarV (i,n);
        
           }
    public static void vector (int arreglo[], int n) {
        for (int i = 0; i < n; i++) {
            arreglo [i]= (int)(Math.random()*10);
        }
            } 
    public static void mostrarV (int vector[], int n){
        for (int i = 0; i < n; i++) {
            System.out.println(" "+vector[i]); 
        }
     
    }
    
    
}
