package excepciones;

import javax.swing.JOptionPane;

public class Ej3IMC {
    public static void main(String[] args) {
        try {
            String entradaPeso = JOptionPane.showInputDialog(null, "Ingrese su peso en kilogramos:");
            if (entradaPeso == null) {
                return;
            }

            String entradaEstatura = JOptionPane.showInputDialog(null, "Ingrese su estatura en metros:");
            if (entradaEstatura == null) {
                return;
            }

            double peso = Double.parseDouble(entradaPeso.trim());
            double altura = Double.parseDouble(entradaEstatura.trim());
            if (altura <= 0) {
                throw new ArithmeticException("La estatura no puede ser 0");
            }

            double imc = peso / (altura * altura);
            JOptionPane.showMessageDialog(null, "Su índice de masa corporal es: "
                    + String.format("%.2f", imc));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese valores numéricos válidos.");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
