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
public class ejercicio4practicoclase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Dada una cantidad de grados centígrados se debe mostrar su equivalente
        //en grados Fahrenheit. La fórmula correspondiente es: F = 32 + 
        //(9 * C / 5).
     Scanner leer= new Scanner (System.in);
             double C;
             double F;
             System.out.println("ingrese grados C");
             C= leer.nextDouble();
             F=32+(9 * C / 5); 
             System.out.println("su C es equivalente a"+F+ "Fahrenheit");
                     
         
             }
    
}
