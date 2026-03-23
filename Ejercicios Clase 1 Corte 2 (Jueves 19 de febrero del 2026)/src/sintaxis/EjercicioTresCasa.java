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
public class EjercicioTresCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 3) Dado el monto de una compra calcular el monto del IVA. 
        // Imprimir el monto total a pagar por la compra
        double montoCompra;
        final double IVA=0.19;
        double montoTotal;
        double ivaMontoCompra;
        System.out.println("Ingrese el monto de la compra: ");
        Scanner read = new Scanner(System.in);
        montoCompra = read.nextDouble();
        ivaMontoCompra = montoCompra * IVA;
        montoTotal = montoCompra + ivaMontoCompra;
        System.out.println("El monto de compra total a pagar es: "+montoTotal);
    }
}
