/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de 
tamaño N, con los valores ingresados por el usuario
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author dulce
 */
public class guia5ej1extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de numeros a sumar:");
        int n = leer.nextInt();
        int[]vector = new int[n];
        int suma=0;
        for(int i=0 ; i<n ; i++){
            System.out.print("Ingrese valor numero: " + (i+1) + " - ");
            suma += leer.nextInt();
        }
        System.out.println("La suma es:" + suma);
    }
    }
    

