package Guia_1.Ejercicios_22_29;

public class Ejercicio24 {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7 };
        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El mayor es: " + mayor);
    }
}
