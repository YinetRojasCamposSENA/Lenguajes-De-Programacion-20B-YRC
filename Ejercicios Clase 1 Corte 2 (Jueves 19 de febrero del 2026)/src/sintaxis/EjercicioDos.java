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
public class EjercicioDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** Crear un programa que me permita determinar si un número es positivo o negativo 
         DS mensaje si es poisitivo o negativo
         DE numero**/
        int numero;
        System.out.println("Dame un número: ");
        Scanner read = new Scanner(System.in);
        numero = read.nextInt();
        if (numero > 0) {
            System.out.println("El número "+numero+" es positivo");
        } else if (numero == 0){
            System.out.println("El número es cero");
        } else {
            System.out.println("El número "+numero+" es negativo");
        }
        
    }
    
}
