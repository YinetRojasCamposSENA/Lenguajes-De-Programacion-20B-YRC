/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6guia2bucles;

import java.util.Scanner;

/**
 *
 * @author rojas
 */
public class Ejercicio6Guia2Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /** 6) Leer los primeros 500 números partiendo del 0 y contar
        cuántos múltiplos de 3 hay, imprimir la cantidad.
        * 
        * Datos salida: cuántos múltiplos de tres hay
        * Datos entrada: primeros 500 números
        **/
        int contadorMultiplos3 = 0;
        for (int i = 0; i <= 500; i++) {
            if (i % 3 == 0) {
                contadorMultiplos3++;
            }
        }
        System.out.println("Hay en total "+contadorMultiplos3+" múltiplos de 3");
    }
    
}
