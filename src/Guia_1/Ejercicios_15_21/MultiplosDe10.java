package Guia_1.Ejercicios_15_21;

import javax.swing.JOptionPane;

public class MultiplosDe10 {
    public static void main(String[] args) {
        int contador = 0;
        
        for (int i = 1; i <= 200; i++) {
            if (i % 10 == 0) {
                contador++;
            }
        }
        
        JOptionPane.showMessageDialog(null,
                "Cantidad de números múltiplos de 10 entre 1 y 200: " + contador);
    }
}