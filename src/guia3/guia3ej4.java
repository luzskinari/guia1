/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra 
de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá 
imprimi “INCORRECTO”. Nota: investigar la funcion Substring y equals() de Java.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author dulce
 */
public class guia3ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer= new Scanner (System.in);
        System.out.println("ingrese palabra");
        String palabra= leer.nextLine();
        String primerCaracter = palabra.substring(0,1);
        if(primerCaracter.equals("A")){
        System.out.println("es correcta");
        
    }
        else {System.out.println("es incorrecto");
        }
        }
}
