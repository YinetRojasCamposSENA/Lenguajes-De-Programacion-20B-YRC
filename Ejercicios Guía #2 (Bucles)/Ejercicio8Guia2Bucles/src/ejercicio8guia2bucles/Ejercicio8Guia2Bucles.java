/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8guia2bucles;

import java.util.Scanner;

/**
 *
 * @author rojas
 */
public class Ejercicio8Guia2Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /** 8) Leer N cantidad números y determinar el promedio de los
        números impares, imprimir el promedio
        * 
        * Datos salida: promedio números impares
        * Datos entrada: n cantidad números
        * 
        **/
        int sumaNumerosImpares = 0;
        int cantidadNumeros;
        int numero;
        double promedioImpares;
        int contadorImpares = 0;

        System.out.println("¿Cuántos números desea ingresar");
        Scanner read = new Scanner(System.in);
        cantidadNumeros = read.nextInt();
        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.println("Ingrese el número #"+i);
            numero = read.nextInt();
            if (numero % 2 != 0) {
                sumaNumerosImpares += numero;
                contadorImpares++;
            }
        }
        promedioImpares = sumaNumerosImpares/contadorImpares;
        System.out.println("El promedio de los números impares es: "+promedioImpares);
        
    }
    
}
