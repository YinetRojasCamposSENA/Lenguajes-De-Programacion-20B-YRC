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
public class EjercicioSeisCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6) Crear un caluladora basica con las cuatro operaciones basicas
        // suma, resta multilplicacion division (con validacion)
        double numeroUno;
        double numeroDos;
        double suma;
        double resta;
        double multiplicacion;
        double division;
        Scanner read = new Scanner(System.in);
        System.out.println("--------CALCULADORA BÁSICA---------");
        System.out.println("Ingrese un primer número: ");
        numeroUno = read.nextDouble();
        System.out.println("Ingrese un segundo número: ");
        numeroDos = read.nextDouble();
        suma = numeroUno + numeroDos;
        resta = numeroUno - numeroDos;
        multiplicacion = numeroUno * numeroDos;
        if (numeroDos == 0) {
            System.out.println("No se puede dividir entre cero");
        } else {
            division = numeroUno / numeroDos;
            System.out.println("La división entre "+numeroUno+ " y "+numeroDos+" es: "+division);
        }
        System.out.println("La suma entre "+numeroUno+ " y "+numeroDos+" es: "+suma);
        System.out.println("La resta entre "+numeroUno+ " y "+numeroDos+" es: "+resta);
        System.out.println("La multiplicación entre "+numeroUno+ " y "+numeroDos+" es: "+multiplicacion);        
        
    }
    
}
