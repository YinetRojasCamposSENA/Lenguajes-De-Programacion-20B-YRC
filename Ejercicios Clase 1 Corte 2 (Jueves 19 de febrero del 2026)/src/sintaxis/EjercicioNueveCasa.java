/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sintaxis;

import java.util.Scanner;

/**
 *
 * @author rojas
 */
public class EjercicioNueveCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Determinar si un numero es multiplo de tres y cinco a la vez
        double numero;
        System.out.println("Ingrese un número: ");
        Scanner read = new Scanner(System.in);
        numero = read.nextDouble();
        if ((numero % 3 == 0) && (numero % 5 == 0)) {
            System.out.println("El número "+numero+" es múltiplo de 3 y de 5 a la vez");
        } else {
            System.out.println("El número "+numero+" NO es múltiplo de 3 y de 5 a la vez");
        }
    }
    
}
