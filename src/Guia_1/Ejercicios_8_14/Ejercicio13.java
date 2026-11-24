package Guia_1.Ejercicios_8_14;

import javax.swing.JOptionPane;

public class Ejercicio13 {
    public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                resultado.append(i).append('\n');
            }
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}