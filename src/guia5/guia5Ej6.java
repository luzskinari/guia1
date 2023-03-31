/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear 
un programa que permita introducir un cuadrado por teclado y determine si este 
cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.

 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author dulce
 */
public class guia5Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][]matriz = new int[3][3];
        llenarMatriz(matriz,leer);
        int fila1=0,fila2=0,fila3=0,columna1=0,columna2=0,columna3=0,diag1=0,diag2=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
             if (i==j){
              diag1=matriz[i][j];     
             }   
              if((i==0 && j==2) || (i==2 && j==0)||(i==1 && j==1)){
              diag2+=matriz[i][j];   
              }
              if (i==0){
              fila1+=matriz[i][j];  
              }   
              if (i==1){
              fila2+=matriz[i][j];  
              } 
              if (i==2){
              fila3+=matriz[i][j];  
              } 
              if (j==0){
              columna1+=matriz[i][j];  
              } 
              if (j==1){
              columna2+=matriz[i][j];  
              } 
              if (j==2){
              columna3+=matriz[i][j];  
              } 
            }  
        }      
       if (columna1==columna2 && columna2==columna3 && columna3==fila1 && fila1==fila2 && 
               fila2==fila3 && fila3==diag1 && diag1==diag2){
           System.out.println("El cuadrado es magico.");
       }else System.out.println("El cuadrado no es magico:");
    }
    public static int[][] llenarMatriz(int [][]matriz,Scanner leer){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese valor:");
                matriz[i][j]= leer.nextInt();
                while(matriz[i][j]> 9 || matriz[i][j]<1) {
                    System.out.println("Ingrese otro valor");
                    matriz[i][j]= leer.nextInt();
                }
            }  
        }
        return matriz;
    }
    }
    

