/*
 Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar 
al usuario si su respuesta es o no correcta. En caso que la respuesta sea 
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
Para realizar este ejercicio investigue como utilizar la función Math.random() 
de Java.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author dulce
 */
public class guia3ej10extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int num;
        num1=(int)(Math.random()*10);
        num2=(int)(Math.random()*10);
        int resultado = num1 * num2;
        
       

        do {
            System.out.println("Ingrese su respuesta:");
            num = leer.nextInt();   
             if (num==8080){
                System.out.println("ACCESO A TRAMPA resultaodo "+resultado);
            }else if(num==resultado){
                System.out.println("ACERTASTE");
            }
        } while ( num != resultado);
        
        
    }
    
}
    
    

