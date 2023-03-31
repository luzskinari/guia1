/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos 
de las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona,
el programa debe preguntarle al usuario si quiere seguir mostrando personas y 
frenar cuando el usuario ingrese la palabra “No”.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author dulce
 */
public class guia4ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner leer= new Scanner(System.in);
        boolean entrada = true;
        do{
            
            System.out.println("Edad:");
            int edad =leer.nextInt();
            esMayor(edad);
            System.out.println("Desea ingresar otra persona?");
            String entra = leer.next();
            entrada = entra.equalsIgnoreCase("S");
            
            
        }while(entrada == true);
    }
    
    public static void esMayor(int edad){ 
        if(edad>18){
            System.out.println("Es Mayor de Edad");}else{
            System.out.println("Es Menor de Edad");}
    }
    }
    

