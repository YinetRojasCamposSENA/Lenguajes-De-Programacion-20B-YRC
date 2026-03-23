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
public class EjercicioDosCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 2) Dado tres notas de un estudiante determinar la mayor nota 
        double notaUno;
        double notaDos;
        double notaTres;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el valor de la primera nota: ");
        notaUno = read.nextDouble();
        System.out.println("Ingrese el valor de la segunda nota: ");
        notaDos = read.nextDouble();
        System.out.println("Ingrese el valor de la tercera nota: ");
        notaTres = read.nextDouble();
        if ((notaUno > notaTres) && (notaUno > notaDos)) {
            System.out.println("La mayor nota es: " + notaUno);
        } else if ((notaDos > notaUno) && (notaDos > notaTres)) {
            System.out.println("La mayor nota es: " + notaDos);
        } else if ((notaTres > notaUno) && (notaTres > notaDos)) {
            System.out.println("La mayor nota es: " + notaTres);
        }
    }

}

