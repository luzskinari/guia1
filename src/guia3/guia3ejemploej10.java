/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author dulce
 */
public class guia3ejemploej10 {

    //Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e 
    //imprima el número ingresado seguido de tantos asteriscos como indique su 
    //valor. Por ejemplo:
    //5 *****
    //3 ***
    //11 ***********
    //2 **
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 4 numeros entre el 1 y el 20");
        for (int i = 0; i <= 3; i++) {
            int numEntero = leer.nextInt();
            while (numEntero<1 || numEntero>20) {
                System.out.println("Ingrese un numero entre el 1 y el 20");
                numEntero = leer.nextInt();
            }
            System.out.print(numEntero+"|");
            for (int j = 1; j <= numEntero; j++) {
                System.out.print("*");
            }
            System.out.println("");
    }
    }
}
    

