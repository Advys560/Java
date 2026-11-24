package Guia_1.Ejercicios_15_21;

import javax.swing.JOptionPane;

public class TablaDel7 {
    public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder("Tabla de multiplicar del 7:\n");
        for (int i = 1; i <= 10; i++) {
            resultado.append("7 x ").append(i).append(" = ").append(7 * i).append('\n');
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}