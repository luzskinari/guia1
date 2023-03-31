/*
Los profesores del curso de programación de Egg necesitan llevar un registro de 
las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de 
aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones
de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al 
final del programa los profesores necesitan obtener por pantalla la cantidad de 
aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con 
promedio mayor o igual al 7 de sus notas del curso.

 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author dulce
 */
public class guia5ej4extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        double[][] Alumno = new double[10][5];

        //10 posiciones para alumnos, 4 para notas y 1 para promedio
        Carga_de_datos(Alumno);
        Mostrar_aprobados(Alumno);
        
        
        
    }

    public static double[][] Carga_de_datos(double[][] Alumno) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        for (int i = 0; i < 10; i++) {
            System.out.println("Cargar los datos del alumno " + (i+1));

            for (int j = 0; j < 4; j++) {
                switch (j) {
                    case 0:
                        System.out.println("Ingrese nota Primer trabajo práctico evaluativo");
                        Alumno[i][j] = leer.nextInt();
                        Alumno[i][4] += (Alumno[i][j] * 0.1);
                        //Alumno[i][5] = Alumno[i][5] + Alumno[i][j];
                        break;
                    case 1:
                        System.out.println("Ingrese nota Segundo trabajo práctico evaluativo");
                        Alumno[i][j] = leer.nextInt();
                         Alumno[i][4] += (Alumno[i][j] * 0.15);
                        break;
                    case 2:
                        System.out.println("Ingrese nota Primer Integrador");
                        Alumno[i][j] = leer.nextInt();
                         Alumno[i][4] += (Alumno[i][j] * 0.25);
                        break;
                    case 3:
                        System.out.println("Ingrese nota Segundo integrador");
                        Alumno[i][j] = leer.nextInt();
                         Alumno[i][4] += (Alumno[i][j] * 0.5);
                        break;

                }

            }
        }
        
        return Alumno;
    }

    public static void Mostrar_aprobados(double[][] Alumno) {
       int k=0;
        for (int i = 0; i < 10; i++) {
            
            if (Alumno[i][4]>=7){
                
                System.out.println("El alumno " +(1+i)+" Esta Aprobado");
                System.out.println("Nota promedio " + Alumno[i][4]);
                k++;
            }else System.out.println("El alumno " +(1+i)+ " Esta Desaprobado");
        }
        System.out.println("La cantidad de alumnos Aprobados es de: "+k);
        System.out.println("La cantidad de alumnos Desaprobados es de: "+(10-k));
        
    }
    }
    

