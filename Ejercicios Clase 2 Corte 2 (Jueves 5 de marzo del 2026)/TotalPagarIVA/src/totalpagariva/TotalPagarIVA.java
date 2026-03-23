/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package totalpagariva;

import javax.swing.JOptionPane;

/**
 *
 * @author uestudiantes
 */
public class TotalPagarIVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
        * 1) Crear un programa que permita leer n cantidad de precios de productos. 
        * Calcular total a pagar sin IVA, monto del IVA y totls a pagar mas IVA
        **/
        
        // Declaración de variables y constantes
        long i = 0;
        long cantidadPrecios;
        double precioProducto;
        double totalPagar;
        double acumuladorPrecios = 0;
        double montoIVA;
        final float IVA = 0.19f;
        
        // Leer la cantidad de precios de productos
        cantidadPrecios = Long.parseLong(JOptionPane.showInputDialog("Ingrese la cantidad de precios que desea ingresar: "));
        
        // Mientras el iterador sea menor a la cantidad de productos...
        while (i < cantidadPrecios) {
            
            // Solicitar al usuario que ingrese el precio del produto en la posición n
            precioProducto = Long.parseLong(JOptionPane.showInputDialog("Ingrese el precio del producto #: "+(i+1)));
            
            // El acumulador de precios irá sumando los precios de los productos
            acumuladorPrecios += precioProducto;
            
            // Incrementar el iterador en 1
            i++;
        }
        
        // Cálculo del monto del IVA, multiplicando el acumulador de precios por el IVA
        montoIVA = acumuladorPrecios * IVA;
        
        // Cálculo del total a pagar, sumando el acumulador de precios mas el monto del IVA
        totalPagar = acumuladorPrecios + montoIVA;
        
        // Imprimir los resultados de cada operación (acumuladorPrecios, totalPagar, montoIVA)
        JOptionPane.showMessageDialog(null, "El total a pagar sin el IVA es igual a: "+acumuladorPrecios);
        JOptionPane.showMessageDialog(null, "El total a pagar mas el IVA es igual a: "+totalPagar);
        JOptionPane.showMessageDialog(null, "El monto del IVA es igual a: "+montoIVA);
        
        
      
        
        
    }
    
}
