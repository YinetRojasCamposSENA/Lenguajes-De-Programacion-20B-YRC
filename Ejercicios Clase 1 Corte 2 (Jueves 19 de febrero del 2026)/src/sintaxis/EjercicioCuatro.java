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
public class EjercicioCuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** 
         * Realizar un pseudocódigo que determine si un número es par o impar, 
        si el número es impar determinar si es múltiplo de 3
        **/
        int numero;
        System.out.println("Dame un número: ");
        Scanner read = new Scanner(System.in);
        numero = read.nextInt();
        if (numero % 2 == 0){
            System.out.println("El número "+numero+ " es par");
        } else {
            System.out.println("El número "+numero+ " es impar");
            if (numero % 3 == 0) {
                System.out.println("El número "+numero+ " es múltiplo de tres");
            }
        }
        
    }
    
}
