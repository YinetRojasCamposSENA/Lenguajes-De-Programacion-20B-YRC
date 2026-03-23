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
public class EjemploCuatroCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 4) Pedir al usuario nombre y edad, imprimir el nombre del usuario
        // y determinar si es mayor o menor de edad
        String nombre;
        int edad;
        System.out.println("Ingrese su nombre");
        Scanner read = new Scanner (System.in);
        nombre = read.nextLine();
        System.out.println("Ingrese su edad");
        edad = read.nextInt();
        if ((edad<0) || (edad > 99)){
            System.out.println("Ingrese números entre 1 y 99");
        } else if(edad < 18) {
            System.out.println(nombre+", usted es menor de edad");
        } else {
            System.out.println(nombre+", usted es mayor de edad");
        }
        
    }
    
}
