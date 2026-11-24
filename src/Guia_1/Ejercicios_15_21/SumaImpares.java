package Guia_1.Ejercicios_15_21;

import javax.swing.JOptionPane;

public class SumaImpares {
    public static void main(String[] args) {
        int suma = 0;
        
        for (int i = 1; i <= 50; i += 2) {
            suma += i;
        }
        
        JOptionPane.showMessageDialog(null, "La suma de los números impares del 1 al 50 es: " + suma);
    }
}