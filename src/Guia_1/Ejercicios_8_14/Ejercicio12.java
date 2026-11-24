package Guia_1.Ejercicios_8_14;

import javax.swing.JOptionPane;

public class Ejercicio12 {
    public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 50; i >= 1; i--) {
            resultado.append(i).append('\n');
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}