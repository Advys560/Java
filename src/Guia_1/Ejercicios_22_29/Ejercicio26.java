package Guia_1.Ejercicios_22_29;

import javax.swing.JOptionPane;

public class Ejercicio26 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 1, 5, 1, 1, 1};
        int repetido = 0;
        StringBuilder resultado = new StringBuilder();

        for (int i : n) {
            resultado.append(i).append('\n');
            if (i == 1) {
                repetido++;
            }
        }
        resultado.append("La cantidad de veces que se repite el 1 es: ").append(repetido);
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
