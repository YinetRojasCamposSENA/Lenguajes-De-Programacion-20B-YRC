/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedionotas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author uestudiantes
 */
public class PromedioNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** 2) Crear un programa que permita leer n cantidad de notas sacar el
        * promedio de las notas 
        Datos entrada: notas, cantidad de notas
        Datos salida: promedio
        Rango de notas entre 0 y 5
        * **/
        
        long cantidadNotas;
        float promedio = 0;
        float acumuladorNotas = 0;
        float nota;
        long i = 0;
        
        // JOp una cajita que aparece visualmente, esa cajita capta datos como String
        
        // Casteo de datos: convertir un tipo de dato a otro (string a entero)
        cantidadNotas = Long.parseLong(JOptionPane.showInputDialog("Dame la cantidad de notas: "));
        
        while (i < cantidadNotas) {
            nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la nota #"+i));
            if ((nota >= 0) && (nota<=5)) {
                acumuladorNotas += nota;
            } else {
                i--;
            }
            i++;
        }
        promedio = acumuladorNotas/cantidadNotas;
        JOptionPane.showMessageDialog(null, "El promedio de notas es: "+promedio);
        
        // proxima clase: hoja de examen que es git, caracteristicas, ventajas
        // desventajas, que es github, que es gitlab (en parejas)
        // qué son funciones, que son procedimientos y que son métodos
        
        // Proyecto final: Grupos de 3 personas}
        // Calculadora de operaciones complejas: mínimo 10 operaciones
        // hecha en java, c# y en python (3 calculadoras con JOption (gráficamente)
        // traer después del parcial (en quince días)
        
        // semana después del parcial ejercicios de clase
        // mostrar los ejercicios de casa y hacer guías
        
    }
    
}
