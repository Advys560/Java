package ejercicios_15_al_21;

public class Factorial {
    public static void main(String[] args) {
        int numero = 5; // Puedes cambiar este valor para calcular el factorial de otro número
        long factorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}