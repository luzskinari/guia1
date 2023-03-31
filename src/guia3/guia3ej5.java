// Escriba un programa en el cual se ingrese un valor límite positivo, y a 
//continuacion solicite numeros al usuario hasta que la suma de los numeros 
//introducidos supere el limite inicial.
//*/
package guia3;

import java.util.Scanner;

/**
 *
 * @author dulce
 */
public class guia3ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("escriba un valor a analizar");
        int valorL = leer.nextInt();
        int contador = 0;
        int suma = 0;
        while (suma <= valorL) {
            System.out.println("ingrese un número");
            int num = leer.nextInt();
            suma += num;
            contador++;
        }
        System.out.println("la suma de los números es" + suma);
        System.out.println("la cantidad de números ingresados es" + contador);
    }

}
