package excepciones;

import java.util.Locale;
import javax.swing.JOptionPane;

public class Ej6Null {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(
                null, "¿Cuál es su nombre?", "Saludo", JOptionPane.QUESTION_MESSAGE);
        // Cancelar devuelve null; se valida antes de llamar métodos de String.
        if (nombre == null) {
            return;
        }

        nombre = nombre.trim();
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null, "El nombre no puede estar vacío.",
                    "Dato inválido", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(
                null, "Hola, " + nombre.toUpperCase(Locale.ROOT) + ".",
                "Saludo", JOptionPane.INFORMATION_MESSAGE);
    }
}
