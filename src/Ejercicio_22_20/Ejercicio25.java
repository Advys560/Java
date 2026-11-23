package Ejercicio_22_20;

public class Ejercicio25 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7};
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El menor es: " + menor);
    }
}
