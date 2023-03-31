/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author dulce
 */
public class ejercicio3practicoclase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida una frase y la muestre toda en 
        //mayúsculas y después toda en minúsculas. 
        //Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        Scanner leer= new Scanner (System.in);
        System.out.println("escriba una frase");
        String nombre; 
        nombre= leer.nextLine();
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        
       
        
        
    }
    
}
