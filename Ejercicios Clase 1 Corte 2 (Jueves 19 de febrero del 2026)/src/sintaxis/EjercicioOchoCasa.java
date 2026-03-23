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
public class EjercicioOchoCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 8) Dado la compra de gasolina en galones calcular el monto a 
        // pagar si el litro de gasolina cuesta 5 mil pesos
        double galonesAComprar;
        double galonesALitros;
        final double VALOR_LITRO_GASOLINA = 5000;
        double montoTotal;
        System.out.println("Ingrese cuantos galones de gasolina quiere comprar: ");
        Scanner read = new Scanner(System.in);
        galonesAComprar = read.nextDouble();
        galonesALitros = galonesAComprar * 3.78;
        montoTotal = galonesALitros * VALOR_LITRO_GASOLINA;
        System.out.println("El monto a pagar por " + galonesAComprar + " galones de gasolina es de: "
                + montoTotal + " pesos colombianos");
    }
}
