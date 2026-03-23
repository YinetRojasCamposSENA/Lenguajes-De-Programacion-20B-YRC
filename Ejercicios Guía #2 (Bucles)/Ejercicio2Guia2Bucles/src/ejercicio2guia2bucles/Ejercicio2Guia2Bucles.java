/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2guia2bucles;

/**
 *
 * @author rojas
 */
public class Ejercicio2Guia2Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         2) Realizar un pseudocódigo que permita generar 100 números
         e imprimir solo los números impares.
         * 
         * Datos salida: números impares
         * Datos entrada: rango de números 
         **/
        int i = 0;
        while (i <= 100) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
    
}
