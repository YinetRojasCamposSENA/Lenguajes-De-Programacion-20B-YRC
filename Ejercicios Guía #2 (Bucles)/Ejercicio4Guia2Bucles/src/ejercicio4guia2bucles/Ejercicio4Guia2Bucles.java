/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4guia2bucles;

import java.util.Scanner;

/**
 *
 * @author rojas
 */
public class Ejercicio4Guia2Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /** 4) Leer N cantidad precios de productos y calcular cuánto
        cuestan los 10 productos, imprimir el resultado
        * 
        * Datos salida: cuánto cuestan los 10 productos en total
        * Datos entrada: precios de los 10 productos
        **/
        double precio;
        double sumaPrecios = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el precio del producto # "+i);
            Scanner read = new Scanner(System.in);
            precio = read.nextDouble();
            sumaPrecios += precio;
        }
        System.out.println("La suma de los precios es equivalente a: "+sumaPrecios);
 } 
}    
        
        
    

