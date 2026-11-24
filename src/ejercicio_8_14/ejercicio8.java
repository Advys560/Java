
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de la compra: ");
        double compra = sc.nextDouble();

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

        System.out.println("\n--- RESUMEN DE LA COMPRA ---");
        System.out.println("Valor original: $" + compra);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Porcentaje de descuento: " + (porcentajeDescuento * 100) + "%");
        System.out.println("Total a pagar: $" + total);

        sc.close();
    }
}
