package excepciones;

import javax.swing.JOptionPane;

public class Ej2Temperatura {
    public static void main(String[] args) {
        try {
            String entrada = JOptionPane.showInputDialog(null, "Ingrese la temperatura en grados Celsius:");
            if (entrada == null) {
                return;
            }

            double celsius = Double.parseDouble(entrada.trim());
            double fahrenheit = (celsius * 9.0 / 5) + 32;
            JOptionPane.showMessageDialog(null, celsius + " °C equivalen a " + fahrenheit + " °F.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una temperatura válida.");
        }
    }
}
