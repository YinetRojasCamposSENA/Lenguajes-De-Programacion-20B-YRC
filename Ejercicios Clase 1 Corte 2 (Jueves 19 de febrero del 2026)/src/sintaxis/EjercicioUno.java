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
public class EjercicioUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** Crear un programa que calcule el área de un círculo
        / DS Area del circulo
        DE Radio, constante PI
        **/
        double area;
        double radio;
        final float PI = 3.1416f;
        // Leer por teclado
        Scanner read = new Scanner(System.in);
        System.out.println("Dame el radio del círculo: ");
        radio = read.nextDouble();
        // area = PI *(radio * radio);
        area = PI * Math.pow(radio, 2); // Librería Math de Java. Pow elevar a cualquier exponente. Pow (base, expoinente)
        System.out.println("El área del círculo es: "+area+" metros cuadrados");
        
    }
    
}
