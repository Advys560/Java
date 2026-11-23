package ejercicios_15_al_21.src;

public class Divisibles3Y5 {
    public static void main(String[] args) {
        System.out.println("Números del 1 al 100 divisibles entre 3 y 5 simultáneamente:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}