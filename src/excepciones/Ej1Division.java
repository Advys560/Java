package excepciones;

import javax.swing.JOptionPane;

public class Ej1Division {
    public static void main(String[] args) {
        try {
            String entradaDividendo = JOptionPane.showInputDialog(
                    null, "Ingrese el dividendo (entero):", "División", JOptionPane.QUESTION_MESSAGE);
            // Cancelar termina el ejercicio antes de convertir la entrada.
            if (entradaDividendo == null) {
                return;
            }

            String entradaDivisor = JOptionPane.showInputDialog(
                    null, "Ingrese el divisor (entero):", "División", JOptionPane.QUESTION_MESSAGE);
            if (entradaDivisor == null) {
                return;
            }

            int dividendo = Integer.parseInt(entradaDividendo.trim());
            int divisor = Integer.parseInt(entradaDivisor.trim());
            int resultado = dividendo / divisor;

            JOptionPane.showMessageDialog(
                    null, "El resultado de la división entera es: " + resultado,
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null, "Ingrese únicamente números enteros válidos.",
                    "Dato inválido", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(
                    null, "No es posible dividir entre cero.",
                    "Error aritmético", JOptionPane.ERROR_MESSAGE);
        }
    }
}
