package ejercicios_15_al_21;

public class SumaImpares {
    public static void main(String[] args) {
        int suma = 0;
        
        for (int i = 1; i <= 50; i += 2) {
            suma += i;
        }
        
        System.out.println("La suma de los números impares del 1 al 50 es: " + suma);
    }
}