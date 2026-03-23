/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5guia2bucles;

import java.util.Scanner;

/**
 *
 * @author rojas
 */
public class Ejercicio5Guia2Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** 5) Leer 12 notas de estudiantes y determinar cuántas aprobó
        y cuantas reprobó, dado un rango 0 a 5, reprueba cuando
        la nota está entre 0 y 2.9
        * 
        * Datos salida: cuántas notas aprobó y reprobó el estudiante
        * Datos entrada: 12 notas del estudiante
        **/
        double nota;
        int contadorAprobadas = 0;
        int contadorReprobadas = 0;
        for (int i = 1; i <= 12; i++) {
            System.out.println("Ingrese la nota # "+i);
            Scanner read = new Scanner(System.in);
            nota = read.nextDouble();
            if ((nota < 0) || (nota > 5)) {
                System.out.println("El rango de notas debe ser mayor a 0 y menor que 5");
                i--;
            } else {
                if (nota < 3) {
                    contadorReprobadas++;
                } else {
                    contadorAprobadas++;
                }
            }
            
        }
        System.out.println("Usted aprobó un total de: "+contadorAprobadas);
        System.out.println("Usted reprobó un total de: "+contadorReprobadas);
        
    }
    
}
