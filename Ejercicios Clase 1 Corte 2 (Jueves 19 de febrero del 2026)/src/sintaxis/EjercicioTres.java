/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sintaxis;

import java.util.Scanner;

/**
 *
 * @author uestudiantes
 */
public class EjercicioTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** Crear un programa que determine si un numero es par o impar
         DS mensaje si es par o impar
         DE numero**/
        int numero;
        System.out.println("Dame un número: ");
        Scanner read = new Scanner(System.in);
        numero = read.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número "+numero+" es par");
        } else {
            System.out.println("El número "+numero+" es impar");
        }
    }
    
}
