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
public class EjercicioCinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** Crear un programa que pida dos numeros al usuario
        y determine cual de los dos es mayor 
        DS: numero tal es mayor que tal
        * DE: dos numeros
        **/
        int numeroUno;
        int numeroDos;
        System.out.println("Ingrese un primer numero: ");
        Scanner read = new Scanner(System.in);
        numeroUno = read.nextInt();
        System.out.println("Ingrese un segundo numero: ");
        numeroDos = read.nextInt();
        if (numeroUno < numeroDos){
            System.out.println("El número "+numeroDos+" es mayor que "+numeroUno);
        } else if (numeroUno > numeroDos) {
            System.out.println("El número "+numeroUno+" es mayor que "+numeroDos);
        } else {
            System.out.println("Los dos numeros son iguales");
        }
        
    }
    
}
