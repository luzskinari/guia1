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
public class ejerciciospracticos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida dos números enteros por teclado y 
        //calcule
        //la suma de los dos. El programa deberá después mostrar el resultado de 
        //la suma
        Scanner leer= new Scanner (System.in);
        int num1;
        int num2;
        System.out.println("ingrese los dos valores");
        num1=leer.nextInt();
        num2=leer.nextInt();
        int total=num1+num2;
        System.out.println("la suma de los nùmeros es"+ total);
    }
    
}
