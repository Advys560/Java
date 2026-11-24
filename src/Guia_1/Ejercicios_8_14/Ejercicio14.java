package Guia_1.Ejercicios_8_14;

import javax.swing.JOptionPane;

public class Ejercicio14 {
    public static void main(String[] args) {
        int i = 1;
        StringBuilder resultado = new StringBuilder();

        while (i <= 100) {
            if (i % 2 != 0) {
                resultado.append(i).append('\n');
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}