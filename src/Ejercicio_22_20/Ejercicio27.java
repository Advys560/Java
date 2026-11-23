package Ejercicio_22_20;

public class Ejercicio27 {
    public static void main(String[] args) {
        for (int fila = 0; fila < 6; fila++) {
            
            // Imprime seis símbolos en la misma línea.
            for (int col = 0; col < 6; col++) {
                System.out.print("# ");
            }
            
            // Salta de línea al terminar las seis columnas de la fila.
            System.out.println();
        }
    }
}
