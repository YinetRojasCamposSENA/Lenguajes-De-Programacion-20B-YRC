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
public class EjercicioSieteCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 7) Crear un programa que calcule el area de una esfera 3D 
        // (libreria Math)
        double radioEsfera;
        double areaEsfera;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio de la esfera: "); 
        radioEsfera = read.nextDouble();
        areaEsfera = 4 * Math.PI * Math.pow(radioEsfera, 2);
        System.out.println("El área de una esfera de radio "+radioEsfera+" es igual a: "+areaEsfera);
        
    }
    
}
