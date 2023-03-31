
 //Realizar un programa que pida dos números enteros positivos por teclado y
//muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y 
//el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
//El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta 
//que, si el usuario selecciona la opción 5, en vez de salir del programa 
//directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro
//que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se
//sale del programa, caso contrario se vuelve a mostrar el menú.
//Menú: 1)sumar; 2)restar; 3) multiplicar; 4) dividir; 5)salir; elija opción:

 //*/
package guia3;

import java.util.Scanner;

/**
 *
 * @author dulce
 */
public class guia3ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      

        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Ingrese un numero entero positivo");
        n1 = sc.nextInt();
        System.out.println("Ingrese otro numero entero positivo");
        n2 = sc.nextInt();
        boolean salir = false;
        int opcion; //guardamos la opcion de usuario
        String sino;

        while (!salir) { //while para formar bucle-menu
            System.out.println("1. sumar");
            System.out.println("2. restar");
            System.out.println("3. multiplicar");
            System.out.println("4. dividir");
            System.out.println("5. salir");

            System.out.println("Escribe una de las opciones");
            opcion = sc.nextInt();

            switch (opcion) { //switch opciones-respuestas.
                case 1:
                    System.out.println("la suma de los numeros es: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("la resta de los numeros es: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("la multiplicacion de los numeros es: " + (n1 * n2));
                    break;
                case 4:
                    System.out.println("la division de los numeros es: " + (n1 / n2));
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir del programa? (S/N) ");
                    sino = sc.next();
                    if (sino.substring(0, 1).equalsIgnoreCase("s")) {
                        salir = true;
                    }
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }

    }


    }
    

