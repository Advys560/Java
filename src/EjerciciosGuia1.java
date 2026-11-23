import java.util.Scanner;

public class EjerciciosGuia1 {

    // Integrantes: [ESCRIBIR LOS NOMBRES]
    private static final Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n=== EJERCICIOS GUÍA 1 ===");
            System.out.println("1. Positivo, negativo o cero");
            System.out.println("2. Par o impar");
            System.out.println("3. Validar edad");
            System.out.println("4. Calculadora con switch");
            System.out.println("5. Año bisiesto");
            System.out.println("6. Clasificar nota");
            System.out.println("7. Mayor de tres números");
            System.out.println("0. Salir");
            System.out.print("Elige un ejercicio: ");

            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        entrada.close();
    }

    // Ejercicio 1: determinar si el número es positivo, negativo o cero.
    private static void ejercicio1() {
        System.out.print("Ingresa un número entero: ");
        int numero = leerEntero();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }

    // Ejercicio 2: determinar si el número es par o impar.
    private static void ejercicio2() {
        System.out.print("Ingresa un número entero: ");
        int numero = leerEntero();

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }

    // Ejercicio 3: validar la edad.
    private static void ejercicio3() {
        System.out.print("Ingresa tu edad: ");
        int edad = leerEntero();

        if (edad < 0) {
            System.out.println("Edad inválida.");
        } else if (edad >= 18) {
            System.out.println("Puede ingresar.");
        } else {
            System.out.println("Acceso denegado.");
        }
    }

    // Ejercicio 4: calculadora usando switch.
    private static void ejercicio4() {
        System.out.print("Ingresa el primer número: ");
        double primero = leerDecimal();

        System.out.print("Ingresa el segundo número: ");
        double segundo = leerDecimal();

        System.out.print("Ingresa la operación (+, -, *, /): ");
        String operador = entrada.nextLine().trim();

        switch (operador) {
            case "+":
                System.out.println("Resultado: " + (primero + segundo));
                break;
            case "-":
                System.out.println("Resultado: " + (primero - segundo));
                break;
            case "*":
                System.out.println("Resultado: " + (primero * segundo));
                break;
            case "/":
                if (segundo == 0) {
                    System.out.println("Error: no se puede dividir entre cero.");
                } else {
                    System.out.println("Resultado: " + (primero / segundo));
                }
                break;
            default:
                System.out.println("Operador no válido.");
        }
    }

    // Ejercicio 5: determinar si un año es bisiesto.
    private static void ejercicio5() {
        System.out.print("Ingresa un año: ");
        int anio = leerEntero();

        if (anio <= 0) {
            System.out.println("Ingresa un año válido.");
        } else if ((anio % 4 == 0 && anio % 100 != 0)
                || anio % 400 == 0) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }

    // Ejercicio 6: clasificar una nota entre 0 y 100.
    private static void ejercicio6() {
        System.out.print("Ingresa una nota entre 0 y 100: ");
        int nota = leerEntero();

        if (nota < 0 || nota > 100) {
            System.out.println("Nota inválida. Debe estar entre 0 y 100.");
        } else if (nota >= 90) {
            System.out.println("Excelente.");
        } else if (nota >= 80) {
            System.out.println("Bueno.");
        } else if (nota >= 70) {
            System.out.println("Aceptable.");
        } else if (nota >= 60) {
            System.out.println("Insuficiente.");
        } else {
            System.out.println("Reprobado.");
        }
    }

    // Ejercicio 7: encontrar el mayor e indicar si hay empate.
    private static void ejercicio7() {
        System.out.print("Ingresa el primer número: ");
        double primero = leerDecimal();

        System.out.print("Ingresa el segundo número: ");
        double segundo = leerDecimal();

        System.out.print("Ingresa el tercer número: ");
        double tercero = leerDecimal();

        double mayor = Math.max(primero, Math.max(segundo, tercero));

        System.out.println("El número mayor es: " + mayor);

        if (primero == segundo && segundo == tercero) {
            System.out.println("Los tres números son iguales.");
        } else if (primero == segundo && primero == mayor) {
            System.out.println("Hay empate entre el primero y el segundo número.");
        } else if (primero == tercero && primero == mayor) {
            System.out.println("Hay empate entre el primero y el tercer número.");
        } else if (segundo == tercero && segundo == mayor) {
            System.out.println("Hay empate entre el segundo y el tercer número.");
        } else {
            System.out.println("No hay empate por el número mayor.");
        }
    }

    // Lee un número entero desde la consola.
    private static int leerEntero() {
        while (!entrada.hasNextInt()) {
            System.out.print("Dato inválido. Ingresa un número entero: ");
            entrada.nextLine();
        }

        int numero = entrada.nextInt();
        entrada.nextLine(); // Consume el salto de línea pendiente.
        return numero;
    }

    // Lee un número decimal desde la consola.
    private static double leerDecimal() {
        while (!entrada.hasNextDouble()) {
            System.out.print("Dato inválido. Ingresa un número: ");
            entrada.nextLine();
        }

        double numero = entrada.nextDouble();
        entrada.nextLine(); // Consume el salto de línea pendiente.
        return numero;
    }
}