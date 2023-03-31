/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre 
los elementos)
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author dulce
 */
public class guia5ej2extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Ingrese un valor:");
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        int suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresar dos números: ");
             vector1[i] = leer.nextInt();
             vector2[i] = leer.nextInt();
        }
        boolean vector = true;
        int j = 0;
        do {
            if (vector1[j] != vector2[j]) {
                vector = false;
            }
            j++;

        } while (vector == true && j < n);
        if (vector) {
            System.out.println("Ambos vectores son iguales");
        } else {
            System.out.println(" ambos vectores son desiguales");
        }
    }
}
