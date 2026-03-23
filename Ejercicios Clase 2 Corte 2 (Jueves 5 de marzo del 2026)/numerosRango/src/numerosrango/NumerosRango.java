/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosrango;

import javax.swing.JOptionPane;

/**
 *
 * @author uestudiantes
 */
public class NumerosRango {

    /**
     *  2) Crear un programa que pida un numero inicial y un numero final, 
        validar que el numero final sea mayor al inicial. Imprimir los números del rango.
     */
    public static void main(String[] args) {
        
        long numeroInicial;
        long numeroFinal;
        numeroInicial = Long.parseLong(JOptionPane.showInputDialog("Ingrese el número inicial: "));
        numeroFinal = Long.parseLong(JOptionPane.showInputDialog("Ingrese el numero final: "));
        
        while (numeroFinal <= numeroInicial) {
            JOptionPane.showMessageDialog(null, "El número final debe ser mayor al inicial");
            numeroFinal = Long.parseLong(JOptionPane.showInputDialog("Ingrese el numero final: "));
        }
        
        for (long i = numeroInicial; i <= numeroFinal; i++) {
            JOptionPane.showMessageDialog(null, i);
        }

    }
    
}
