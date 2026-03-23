/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;

/**
 *
 * @author uestudiantes
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /** ------------------WHILE--------------------
        // variables iteradoras son siempre enteras 
        el nombre es una letra (i, j, k) **/
        System.out.println("******************WHILE********************");
        System.out.println("Primero verifica y después ejecuta");
        
        int i = 0; // Controla las veces que se repite el ciclo
        while (i<10) {
            System.out.println(i);
            i++; // Se inceementa la variable de uno en uno
        }
        System.out.println("****************DO-WHILE**********************");
        System.out.println("Ejecuta el bloque de código al menos UNA VEZ");
        // ------------------DO-WHILE-------------------
        // Iterar antes del cierre
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 15);
        
        System.out.println("******************FOR********************");
        System.out.println("Ejecuta el código las veces que tú desees");
        for (int k = 0; k < 5; k++) {
            System.out.println("Valores de k: "+k);
        }
    }   
    // EJERCICIOS
    /** 1) Dado los numeros del 0 al 100, contar cantidad de pares, cantidades 
    impares y cantidad de múltiplos de 7 *
    *   
    */
    
    
}
