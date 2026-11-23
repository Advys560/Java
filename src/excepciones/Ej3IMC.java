package excepciones;

import java.util.Locale;
import javax.swing.JOptionPane;

public class Ej3IMC {
    public static void main(String[] args) {
        try {
            String entradaPeso = JOptionPane.showInputDialog(
                    null, "Ingrese su peso en kilogramos:", "Cálculo de IMC",
                    JOptionPane.QUESTION_MESSAGE);
            if (entradaPeso == null) {
                return;
            }

            String entradaEstatura = JOptionPane.showInputDialog(
                    null, "Ingrese su estatura en metros:", "Cálculo de IMC",
                    JOptionPane.QUESTION_MESSAGE);
            if (entradaEstatura == null) {
                return;
            }

            double peso = Double.parseDouble(entradaPeso.trim());
            double estatura = Double.parseDouble(entradaEstatura.trim());
            // Evita dividir por una estatura inválida.
            if (estatura <= 0) {
                throw new ArithmeticException("La estatura debe ser mayor a 0");
            }
            if (peso <= 0) {
                throw new ArithmeticException("El peso debe ser mayor a 0");
            }

            double imc = peso / (estatura * estatura);
            String resultado = String.format(Locale.US, "%.2f", imc);
            JOptionPane.showMessageDialog(
                    null, "Su índice de masa corporal es: " + resultado,
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null, "Ingrese valores numéricos válidos.",
                    "Dato inválido", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(
                    null, e.getMessage(), "Valor inválido", JOptionPane.ERROR_MESSAGE);
        }
    }
}
