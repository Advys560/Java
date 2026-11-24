package Guia_1.Ejercicios_22_29;

import javax.swing.JOptionPane;

public class Ejercicio29 {
    public static void main(String[] args) {
        String frase = "Gemini es una IA potente";

        String resultado = String.join(" ", frase.split(""));
        JOptionPane.showMessageDialog(null, resultado);
    }
}
