/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplostresrango;

import javax.swing.JOptionPane;

/**
 *
 * @author uestudiantes
 */
public class MultiplosTresRango {

    /**
     * Crear un programa que me permita imprimir los numeros multiplos 
     * de tres contenidos en un  rango dado por el usuario 
    **/
    public static void main(String[] args) {
        long numeroInicial;
        long numeroFinal;
        int i = 0;
        numeroInicial = Long.parseLong(JOptionPane.showInputDialog("Ingrese el número inicial del rango: "));
        numeroFinal = Long.parseLong(JOptionPane.showInputDialog("Ingrese el numero final del rango: "));
        while (numeroInicial < numeroFinal) {
            if (numeroInicial % 3 == 0) {
                JOptionPane.showMessageDialog(null, numeroInicial);
            }
            numeroInicial++;
        }
    }
    
}
