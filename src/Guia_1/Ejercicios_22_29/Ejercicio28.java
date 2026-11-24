package Guia_1.Ejercicios_22_29;

import javax.swing.JOptionPane;

public class Ejercicio28 {
    public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            resultado.append(i).append(" El resultado de n^3 es: ").append(i * i * i).append('\n');
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
