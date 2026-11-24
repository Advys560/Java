package Guia_1.Ejercicios_15_21;

import javax.swing.JOptionPane;

public class Factorial {
    public static void main(String[] args) {
        int numero = 5; // Puedes cambiar este valor para calcular el factorial de otro número
        long factorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        
        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
    }
}