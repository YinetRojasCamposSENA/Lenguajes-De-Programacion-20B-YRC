/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10guia2bucles;

import java.util.Scanner;

/**
 *
 * @author rojas
 */
public class Ejercicio10Guia2Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** 10) Realizar un programa que pida la base, el exponente
        y se ejecute el cálculo
        * 
        * Datos salida: potencia
        * Datos entrada: base y el exponente
        * 
        **/
        int base;
        int exponente;
        int potencia = 1;

        System.out.println("Ingrese la base: ");
        Scanner read = new Scanner(System.in);
        base = read.nextInt();
        
        System.out.println("Ingrese el exponente: ");
        exponente = read.nextInt();
       
        for (int i = 1; i <= exponente; i++) {
            potencia *= base;
        }
        System.out.println("La potencia de "+base+ " a la "+exponente+" es: "+potencia);
    }
    
}
