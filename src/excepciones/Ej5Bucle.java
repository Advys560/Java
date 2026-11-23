package excepciones;

import javax.swing.JOptionPane;

public class Ej5Bucle {
    public static void main(String[] args) {
        boolean valido = false;

        while (!valido) {
            try {
                String entrada = JOptionPane.showInputDialog(null, "Ingrese un número entero entre 1 y 100:");
                if (entrada == null) {
                    return;
                }

                int numero = Integer.parseInt(entrada.trim());
                if (numero < 1 || numero > 100) {
                    throw new IllegalArgumentException("Fuera de rango");
                }

                JOptionPane.showMessageDialog(null, "Número válido: " + numero);
                valido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número entero válido.");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + ". El número debe estar entre 1 y 100.");
            }
        }
    }
}
