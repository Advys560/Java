package excepciones;

import javax.swing.JOptionPane;

public class Ej4Arreglo {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis", "Maria", "Pedro", "Sofia"};

        try {
            String entrada = JOptionPane.showInputDialog(null, "Ingrese una posición (0 a 4):");
            if (entrada == null) {
                return;
            }

            int posicion = Integer.parseInt(entrada.trim());
            JOptionPane.showMessageDialog(null, "Nombre en la posición " + posicion + ": " + nombres[posicion]);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una posición entera válida.");
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "La posición debe estar entre 0 y 4.");
        }
    }
}
