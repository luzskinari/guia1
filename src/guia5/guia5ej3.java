/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author dulce
 */
public class guia5ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {
        Scanner SC = new Scanner(System.in).useDelimiter("\n");
        int p,uno = 0,dos = 0,tres = 0,cuatro = 0,cinco = 0;

        System.out.println("Ingrese el tamaño del vector");
        int[] vector = new int[p = SC.nextInt()];
        for (int i = 0; i < p; i++) {
            vector[i] = (int) (Math.random() * 100000);
        }
        for (int i = 0; i < p; i++) {
            System.out.println(vector[i] + " ");
        }
        for (int i : vector) {
            String digitos = String.valueOf(i);
            switch  (digitos.length()) {
                case 1: uno++;
                        break;
                case 2: dos++;
                        break;        
                case 3: tres++;
                        break;
                case 4: cuatro++;
                        break;
                case 5: cinco++;
                        break;        
            }  
        }
        
        System.out.println("La cantidad de numeros de un digito fueron: " + uno);
        System.out.println("La cantidad de numeros de dos digitos fueron: " + dos);
        System.out.println("La cantidad de numeros de tres digitos fueron: " + tres);
        System.out.println("La cantidad de numeros de cuatro digitos fueron: " + cuatro);
        System.out.println("La cantidad de numeros de cinco digitos fueron: " + cinco);
}
}    
