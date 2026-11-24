package Guia_1.Ejercicios_22_29;

import javax.swing.JOptionPane;

public class Ejercicio27 {
    public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder();
        for (int fila = 0; fila < 6; fila++) {
            for (int col = 0; col < 6; col++) {
                resultado.append("# ");
            }
            resultado.append('\n');
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
