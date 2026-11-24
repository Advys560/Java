package Guia_1.Ejercicios_22_29;

public class Ejercicio23 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        System.out.println("Suma: " + suma);
    }
}