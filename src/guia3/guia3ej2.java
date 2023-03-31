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
public class guia3ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un programa que dado un número determine si es par o impar.
        System.out.println("ingreso un número");
        Scanner leer= new Scanner(System.in);
        int num1;
        num1= leer.nextInt();
        if (num1%2==0){
            System.out.println("es par");    
        }else {
            System.out.println("es impar");
            
           
        }
                
                
    }
    
}
