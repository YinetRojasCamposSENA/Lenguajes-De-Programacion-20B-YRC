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
public class EjercicioDiezCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 10) Dado la temperatura en grados centigrados, 
        // expresar en grados farenheit
        double gradosCentigrados;
        double gradosFahrenheit;
        System.out.println("Ingrese el valor de la temperatura en grados Celsius (C°)");
        Scanner read = new Scanner(System.in);
        gradosCentigrados = read.nextDouble();
        if (gradosCentigrados < -273) {
            System.out.println("No se puede calcular una temperatura menor a 273 °C");
        } else {
            gradosFahrenheit = (gradosCentigrados*9/5)+32;
            System.out.println("La temperatura en Fahrenheit de "+gradosCentigrados+"°C es igual a: "+gradosFahrenheit+" grados Fahrenheit");
        }
        
    }
    
}
