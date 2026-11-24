package Guia_1.Ejercicios_8_14;

import javax.swing.JOptionPane;

public class Ejercicio8 {
    public static void main(String[] args) {
        double compra = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Ingrese el valor de la compra:"));

        double porcentajeDescuento = 0;

        if (compra > 500000) {
            porcentajeDescuento = 0.20;
        } else if (compra > 200000) {
            porcentajeDescuento = 0.15;
        } else if (compra > 100000) {
            porcentajeDescuento = 0.10;
        }

        double descuento = compra * porcentajeDescuento;
        double total = compra - descuento;

        JOptionPane.showMessageDialog(null,
                "--- RESUMEN DE LA COMPRA ---\n"
                        + "Valor original: $" + compra + "\n"
                        + "Descuento aplicado: $" + descuento + "\n"
                        + "Porcentaje de descuento: " + (porcentajeDescuento * 100) + "%\n"
                        + "Total a pagar: $" + total);
    }
}
