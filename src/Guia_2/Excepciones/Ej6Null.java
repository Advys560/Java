package Guia_2.Excepciones;

import javax.swing.JOptionPane;

public class Ej6Null {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null, "Escribe tu nombre:");

        try {
            JOptionPane.showMessageDialog(null, "Hola, " + nombre.toUpperCase() + "!");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "El usuario canceló la operación.");
        }
    }
}
