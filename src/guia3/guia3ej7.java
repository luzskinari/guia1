/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben
llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo,
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar 
cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().

 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author dulce
 */
public class guia3ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String  cadena;
        int contadorIncorrectas = 0;
        int contadorCorrectas =0;
        
              
        do {
            
            System.out.println("Ingresar codigo:"); 
            cadena = teclado.next();
            if (cadena.length() <=5 && cadena.substring(0,1).equalsIgnoreCase("x") && cadena.substring(4).equalsIgnoreCase("o")) {
              contadorCorrectas ++;  
            }else{
                contadorIncorrectas ++;
         
                
            }
        } while (!cadena.equals("&&&&&"));
        
        System.out.println("Los codigos correctos son:" + contadorCorrectas);
        System.out.println("Los codigos incorrectos son:" + contadorIncorrectas );
        
       
        
        
    
    }}
    
    

