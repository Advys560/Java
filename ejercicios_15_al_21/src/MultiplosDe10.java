package ejercicios_15_al_21.src;

public class MultiplosDe10 {
    public static void main(String[] args) {
        int contador = 0;
        
        for (int i = 1; i <= 200; i++) {
            if (i % 10 == 0) {
                contador++;
            }
        }
        
        System.out.println("Cantidad de números múltiplos de 10 entre 1 y 200: " + contador);
    }
}