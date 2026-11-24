package Guia_1.Ejercicios_15_21;

import javax.swing.JOptionPane;

public class Divisibles3Y5 {
    public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder(
                "Números del 1 al 100 divisibles entre 3 y 5 simultáneamente:\n");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultado.append(i).append('\n');
            }
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}