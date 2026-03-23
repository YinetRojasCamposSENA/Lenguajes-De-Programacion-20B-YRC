/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosbucles;

/**
 *
 * @author uestudiantes
 */
public class EjerciciosBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIOS
        /** 1) Dado los numeros del 0 al 100, contar cantidad de pares, cantidades 
        impares y cantidad de múltiplos de 7 *
        * Datos salida: cantidad pares, impares, multiplos de 7
        * Datos entrada: números del 0 al 100
        *  2) Crear un programa que permita leer n cantidad de notas sacar el
        * promedio de las notas
        */
        short i = 0;
        short contadorPares = 0;
        short contadorImpares = 0;
        short contadorMultiplosSiete = 0;
        while (i <= 100) // Para valores que ya conocemos, usar una variable  
            // que almacene al 100
                {
            if (i % 2 == 0) {
                contadorPares += 1;
            } else if (i % 2 != 0) {
                contadorImpares += 1;
            } 
            if (i % 7 == 0) {
                contadorMultiplosSiete += 1;
            }
            i++; 
        }
        System.out.println("Contador de impares: "+contadorImpares);
        System.out.println("Contador de pares: "+contadorPares);
        System.out.println("Múltiplos de siete: "+contadorMultiplosSiete);
        
    }
    
}
