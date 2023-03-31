/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad
de hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad 
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author dulce
 */
public class guia3ej14extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       Scanner read = new Scanner(System.in);
        int familia, hijos, edad, acum=0, cont=0;
        
        do {
            System.out.print("Ingrese la cantidad de familias:  ");
            familia = read.nextInt();
        } while (familia < 1);
        
        for (int i = 0; i < familia; i++) {
    }
    }

}