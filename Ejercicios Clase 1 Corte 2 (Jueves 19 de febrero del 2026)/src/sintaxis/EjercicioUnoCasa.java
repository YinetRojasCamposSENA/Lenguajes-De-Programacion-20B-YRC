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
public class EjercicioUnoCasa {

    /**
     * @param args the command line arguments
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1) Crear un programa que calcule el area de un triángulo rectángulo
        double baseTriangulo;
        double alturaTriangulo;
        double areaTriangulo;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el valor de la base del triángulo: ");
        baseTriangulo = read.nextDouble();
        System.out.println("Ingrese el valor de la altura del triángulo: ");
        alturaTriangulo = read.nextDouble();
        areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        System.out.println("El área de un triángulo de base " + baseTriangulo + " y de altura " + alturaTriangulo + " es: " + areaTriangulo);
    }
}
