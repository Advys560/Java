package Guia_1.Ejercicios_22_29;

import javax.swing.JOptionPane;

public class Ejercicio22 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        StringBuilder resultado = new StringBuilder();
        for (int i : numeros) {
            resultado.append(i).append('\n');
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
