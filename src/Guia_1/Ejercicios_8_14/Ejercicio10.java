
package Guia_1.Ejercicios_8_14;

import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {
        double peso = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Ingrese su peso en kg:"));
        double altura = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Ingrese su altura en metros:"));

        if (peso <= 0 || altura <= 0) {
            JOptionPane.showMessageDialog(null, "El peso y la altura deben ser mayores que cero.");
        } else {
            double imc = peso / (altura * altura);
            String clasificacion;

            if (imc < 18.5) {
                clasificacion = "Bajo peso";
            } else if (imc < 25) {
                clasificacion = "Normal";
            } else if (imc < 30) {
                clasificacion = "Sobrepeso";
            } else {
                clasificacion = "Obesidad";
            }

            JOptionPane.showMessageDialog(null,
                    "Su IMC es: " + imc + "\nClasificacion: " + clasificacion);
        }
    }
}
