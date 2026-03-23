/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3guia2bucles;

/**
 *
 * @author rojas
 */
public class Ejercicio3Guia2Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         3) Realizar un pseudocódigo que permita sumar los 150
        primeros números, partiendo del 0.
        * 
        * Datos salida: resultado de la suma 150 primeros números
        * Datos entrada: 150 primeros números
         **/
        int i = 0;
        int suma = 0;
        while (i <=150) {
            suma += i;
            i++;
        }
        System.out.println(suma);
    }
    
}
