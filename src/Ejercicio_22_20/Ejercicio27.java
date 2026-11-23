package Ejercicio_22_20;

public class Ejercicio27 {
    public static void main(String[] args) {
        for (int fila = 0; fila < 6; fila++) {
            
            // Ciclo interno: imprime 5 símbolos en la misma línea
            for (int col = 0; col < 6; col++) {
                System.out.print("# ");
            }
            
            // Salto de línea al terminar las 5 columnas de esa fila
            System.out.println();
        }
    }
}
