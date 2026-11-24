package Guia_1.Ejercicios_22_29;

public class Ejercicio26 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 1, 5, 1, 1, 1};
        int repetido = 0;

        for (int i : n) {
            System.out.println(i);
            if (i == 1) {
                repetido++;
            }
        }
        System.out.println("La cantidad de veces que se repite el 1 es: " + repetido);
    }
}
