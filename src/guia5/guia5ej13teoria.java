/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de 
equipo y define su tipo de dato de tal manera que te permita alojar sus nombres 
más adelante.

 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author dulce
 */
public class guia5ej13teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        String[] vector = new String[6];
        System.out.println("Ingrese el numbre de tus compañeros:");
        for (int i = 0; i < vector.length; i++) {
            
            
             vector[i]= leer.next();
            
        }
        System.out.println("Los numbres de mi compañeros son:");
        for (int i = 0; i < 6 ; i++) {
        	   System.out.print( vector[i]+",");
    	}

    }
    
}
