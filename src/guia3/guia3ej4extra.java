/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre 
su equivalente en romano.

 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author dulce
 */
public class guia3ej4extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
        int n;
        System.out.print("Ingrese número entre 1 y 10: ");
        n = read.nextInt();
        for (int i = 0; i < n; i++) {
            if (n <= 3) {
                System.out.print("I");
            }
            if (n == 4 || n == 9) {
                System.out.print("I");
                switch (n) {
                    case 4:
                        System.out.print("V");
                        break;
                    case 9:
                        System.out.print("X");
                        break;
                }
                break;
            }
            if (i == 4) {
                System.out.print("V");
            } else if (i > 4) {
                System.out.print("I");
            }
            if (n == 10) {
                System.out.print("X");
                break;
            }
        }
        System.out.println("");
    }
    
}
