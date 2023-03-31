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
public class ejercicio5practicoclase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que lea un número entero por teclado y muestre 
        //por pantalla el doble, el triple y la raíz cuadrada de ese número. 
        //Nota: investigar la función Math.sqrt().
      Scanner leer= new Scanner (System.in);
      int num, doble, triple;
      double raiz;
        System.out.println("ingrese numero");
      num= leer.nextInt();
      doble= num*2;
      triple= num*3;
      raiz= Math.sqrt(num);
        System.out.println("el num ingresado es" +num);
        System.out.println("el doble del num ingresado es " +doble);
        System.out.println("el triple del num ingresado es " +triple);
        System.out.println("la raiz cuadrada del num ingresado es "+raiz);
      
      
      
    }
    
}
