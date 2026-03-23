/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9guia2bucles;

import java.util.Scanner;

/**
 *
 * @author rojas
 */
public class Ejercicio9Guia2Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** 9) Leer N cantidad de sueldos de empleados y determinar el
        sueldo más bajo y el sueldo más alto e imprimir
        * 
        * Datos salida: sueldo más bajo y sueldo más alto
        * Datos entrada: n cantidad sueldos
        * 
        **/
        int cantidadSueldos;
        double sueldo;
        double mayor = 10000;
        double menor = 5000;

        System.out.println("¿Cuántos sueldos desea ingresar");
        Scanner read = new Scanner(System.in);
        cantidadSueldos = read.nextInt();
        for (int i = 1; i <= cantidadSueldos; i++) {
            System.out.println("Ingrese el sueldo #"+i);
            sueldo = read.nextDouble();
            if (mayor < sueldo) {
                mayor = sueldo;
            }
            if (menor > sueldo) {
                menor = sueldo;
            }
        }
        System.out.println("Sueldo mayor: "+mayor);
        System.out.println("Sueldo menor: "+menor);
    }
    
}
