package Guia_1.Ejercicios_15_21;

import javax.swing.JOptionPane;

public class TablasDel1Al10 {
    public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            resultado.append("\n--- Tabla del ").append(i).append(" ---\n");
            for (int j = 1; j <= 10; j++) {
                resultado.append(i).append(" x ").append(j).append(" = ").append(i * j).append('\n');
            }
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}