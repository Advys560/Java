package Guia_2.Excepciones;

import javax.swing.JOptionPane;

public class Ej1Division {
    public static void main(String[] args) {
        try {
            String entradaDividendo = JOptionPane.showInputDialog(null, "Ingrese el dividendo (entero):");
            if (entradaDividendo == null) {
                return;
            }

            String entradaDivisor = JOptionPane.showInputDialog(null, "Ingrese el divisor (entero):");
            if (entradaDivisor == null) {
                return;
            }

            int dividendo = Integer.parseInt(entradaDividendo.trim());
            int divisor = Integer.parseInt(entradaDivisor.trim());
            int resultado = dividendo / divisor;
            JOptionPane.showMessageDialog(null, "El resultado de la división entera es: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese únicamente números enteros válidos.");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "No es posible dividir entre cero.");
        }
    }
}
