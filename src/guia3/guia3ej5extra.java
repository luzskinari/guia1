/*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para 
los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un 
valor real que represente el costo del tratamiento (previo al descuento) y determine 
el importe en efectivo a pagar por dicho socio.

 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author dulce
 */
public class guia3ej5extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
        String tipo_socio;
        double costo, importe;
        System.out.print("Ingrese tipo de socio A, B o C: ");
        tipo_socio = read.next();
        System.out.print("Ingrese costo de tratamiento: ");
        costo = read.nextDouble();
        switch (tipo_socio) {
            case "A":
                importe=costo*0.5;
                System.out.println("El importe a pagar es: "+importe);
                break;
            case "B":
                importe=costo*0.35;
                System.out.println("El importe a pagar es: "+importe);
                break;
            case "C":
                System.out.println("El importe a pagar es: "+costo);
                break;
            default:
                System.out.println("No ingreso un tipo válido");
        }
    }
    
}
