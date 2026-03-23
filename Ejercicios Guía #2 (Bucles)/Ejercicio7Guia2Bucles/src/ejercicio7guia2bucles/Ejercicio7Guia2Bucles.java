/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7guia2bucles;

import java.util.Scanner;

/**
 *
 * @author rojas
 */
public class Ejercicio7Guia2Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /** 7) Leer N cantidad de notas de un estudiante e imprimir por
       pantalla la nota más baja.

        * 
        * Datos salida: nota más baja
        * Datos entrada: n cantidad de notas
        * 
        **/
       int cantidadNotas;
       double notas;
       double menor = 5;
       System.out.println("¿Cuántas notas desea ingresar");
       Scanner read = new Scanner(System.in);
       cantidadNotas = read.nextInt();
       for (int i = 1; i <= cantidadNotas; i++) {
           System.out.println("Ingrese la nota #"+i);
           notas = read.nextDouble();
           if (menor > notas) {
               menor = notas;
           }
       } 
        System.out.println("La nota menor es: "+menor);
       
        
    }
    
}
