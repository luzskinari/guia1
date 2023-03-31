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
public class guia3ejercicio9 {

  public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int numero=0;
        int suma=0;
        for (int i=0; i<=19;i++){
            System.out.println("ingrese un numero");
            numero=num.nextInt();
            if (numero>0){
                suma = numero + suma;
            }
            else if (numero==0){
                System.out.println("se capturo el 0");
                break;
            }
                
        }
        System.out.println("la suma de todos los numeros positivos es "+suma);
        
    }
    
    
}
