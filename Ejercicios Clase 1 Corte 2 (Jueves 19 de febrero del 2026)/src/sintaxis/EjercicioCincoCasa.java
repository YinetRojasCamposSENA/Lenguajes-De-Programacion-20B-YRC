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
public class EjercicioCincoCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 5) Dado cinco notas de un estudiante, imprimir el promedio 
        // del estudiante.
        double notaUno;
        double notaDos;
        double notaTres;
        double notaCuatro;
        double notaCinco;
        double promedioNotas;
        final int NUMERO_NOTAS = 5;
        System.out.println("Ingrese la primera nota: ");
        Scanner read = new Scanner(System.in);
        notaUno = read.nextDouble();
        System.out.println("Ingrese la segunda nota: ");
        notaDos = read.nextDouble();
        System.out.println("Ingrese la tercera nota: ");
        notaTres = read.nextDouble();
        System.out.println("Ingrese la cuarta nota: ");
        notaCuatro = read.nextDouble();
        System.out.println("Ingrese la quinta nota: ");
        notaCinco = read.nextDouble();
        if ((notaUno < 0 || notaUno > 5) || (notaDos < 0 || notaDos > 5) ||
        (notaTres < 0 || notaTres > 5) || (notaCuatro < 0 || notaCuatro > 5) || 
        (notaCinco < 0 || notaCinco > 5)){
            System.out.println("Solo se´pueden ingresar notas entre 1 y 5");
        } else {
            promedioNotas = (notaUno+notaDos+notaTres+notaCuatro+notaCinco)/NUMERO_NOTAS;
            System.out.println("El promedio de todas las notas es igual a: "+promedioNotas);
        }

        
        
        
    }
    
}
