package Guia_1;

import javax.swing.JOptionPane;

public class Ejercicios_1_7{

    // Integrantes: [ESCRIBIR LOS NOMBRES]

    public static void main(String[] args) {
        int opcion = -1;

        do {
            Integer seleccion = leerEntero(
                    "=== EJERCICIOS GUIA 1 ===\n"
                            + "1. Positivo, negativo o cero\n"
                            + "2. Par o impar\n"
                            + "3. Validar edad\n"
                            + "4. Calculadora con switch\n"
                            + "5. Año bisiesto\n"
                            + "6. Clasificar nota\n"
                            + "7. Mayor de tres números\n"
                            + "0. Salir\n\n"
                            + "Elige un ejercicio:");

            if (seleccion == null) {
                opcion = 0;
                break;
            }

            opcion = seleccion;
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
                    JOptionPane.showMessageDialog(
                            null, "Programa finalizado.", "Salida",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    mostrarError("Opción no válida.");
            }
        } while (opcion != 0);
    }

    // Determina si el número es positivo, negativo o cero.
    private static void ejercicio1() {
        Integer numero = leerEntero("Ingresa un número entero:");
        if (numero == null) {
            return;
        }

        if (numero > 0) {
            mostrarResultado("El número es positivo.");
        } else if (numero < 0) {
            mostrarResultado("El número es negativo.");
        } else {
            mostrarResultado("El número es cero.");
        }
    }

    // Determina si el número es par o impar.
    private static void ejercicio2() {
        Integer numero = leerEntero("Ingresa un número entero:");
        if (numero == null) {
            return;
        }

        if (numero % 2 == 0) {
            mostrarResultado("El número es par.");
        } else {
            mostrarResultado("El número es impar.");
        }
    }

    // Valida la edad para determinar si puede ingresar.
    private static void ejercicio3() {
        Integer edad = leerEntero("Ingresa tu edad:");
        if (edad == null) {
            return;
        }

        if (edad < 0) {
            mostrarError("Edad inválida.");
        } else if (edad >= 18) {
            mostrarResultado("Puede ingresar.");
        } else {
            mostrarResultado("Acceso denegado.");
        }
    }

    // Realiza una operación aritmética usando switch.
    private static void ejercicio4() {
        Double primero = leerDecimal("Ingresa el primer número:");
        if (primero == null) {
            return;
        }

        Double segundo = leerDecimal("Ingresa el segundo número:");
        if (segundo == null) {
            return;
        }

        String operador = leerOperador();
        if (operador == null) {
            return;
        }

        switch (operador) {
            case "+":
                mostrarResultado("Resultado: " + (primero + segundo));
                break;
            case "-":
                mostrarResultado("Resultado: " + (primero - segundo));
                break;
            case "*":
                mostrarResultado("Resultado: " + (primero * segundo));
                break;
            case "/":
                if (segundo == 0) {
                    mostrarError("No se puede dividir entre cero.");
                } else {
                    mostrarResultado("Resultado: " + (primero / segundo));
                }
                break;
            default:
                mostrarError("Operador no válido.");
        }
    }

    // Determina si un año es bisiesto.
    private static void ejercicio5() {
        Integer anio = leerEntero("Ingresa un año:");
        if (anio == null) {
            return;
        }

        if (anio <= 0) {
            mostrarError("Ingresa un año válido.");
        } else if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            mostrarResultado("El año " + anio + " es bisiesto.");
        } else {
            mostrarResultado("El año " + anio + " no es bisiesto.");
        }
    }

    // Clasifica una nota entre 0 y 100.
    private static void ejercicio6() {
        Integer nota = leerEntero("Ingresa una nota entre 0 y 100:");
        if (nota == null) {
            return;
        }

        if (nota < 0 || nota > 100) {
            mostrarError("La nota debe estar entre 0 y 100.");
        } else if (nota >= 90) {
            mostrarResultado("Excelente.");
        } else if (nota >= 80) {
            mostrarResultado("Bueno.");
        } else if (nota >= 70) {
            mostrarResultado("Aceptable.");
        } else if (nota >= 60) {
            mostrarResultado("Insuficiente.");
        } else {
            mostrarResultado("Reprobado.");
        }
    }

    // Encuentra el mayor de tres números e indica si hay empate.
    private static void ejercicio7() {
        Double primero = leerDecimal("Ingresa el primer número:");
        if (primero == null) {
            return;
        }

        Double segundo = leerDecimal("Ingresa el segundo número:");
        if (segundo == null) {
            return;
        }

        Double tercero = leerDecimal("Ingresa el tercer número:");
        if (tercero == null) {
            return;
        }

        double mayor = Math.max(primero, Math.max(segundo, tercero));
        StringBuilder resultado = new StringBuilder("El número mayor es: ")
                .append(mayor).append('\n');

        if (primero == segundo && segundo == tercero) {
            resultado.append("Los tres números son iguales.");
        } else if (primero == segundo && primero == mayor) {
            resultado.append("Hay empate entre el primero y el segundo número.");
        } else if (primero == tercero && primero == mayor) {
            resultado.append("Hay empate entre el primero y el tercer número.");
        } else if (segundo == tercero && segundo == mayor) {
            resultado.append("Hay empate entre el segundo y el tercer número.");
        } else {
            resultado.append("No hay empate por el número mayor.");
        }

        mostrarResultado(resultado.toString());
    }

    // Repite la solicitud hasta recibir un entero válido o cancelar.
    private static Integer leerEntero(String mensaje) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(
                    null, mensaje, "Ejercicios Guía 1", JOptionPane.QUESTION_MESSAGE);
            if (entrada == null) {
                return null;
            }

            try {
                return Integer.parseInt(entrada.trim());
            } catch (NumberFormatException e) {
                mostrarError("Dato inválido. Ingresa un número entero.");
            }
        }
    }

    // Repite la solicitud hasta recibir un decimal finito válido o cancelar.
    private static Double leerDecimal(String mensaje) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(
                    null, mensaje, "Ejercicios Guía 1", JOptionPane.QUESTION_MESSAGE);
            if (entrada == null) {
                return null;
            }

            try {
                double numero = Double.parseDouble(entrada.trim());
                if (Double.isFinite(numero)) {
                    return numero;
                }
            } catch (NumberFormatException e) {
                // El mensaje de error se muestra al final del ciclo.
            }
            mostrarError("Dato inválido. Ingresa un número válido.");
        }
    }

    // Solicita una de las operaciones admitidas por la calculadora.
    private static String leerOperador() {
        while (true) {
            String operador = JOptionPane.showInputDialog(
                    null, "Ingresa la operación (+, -, *, /):",
                    "Calculadora", JOptionPane.QUESTION_MESSAGE);
            if (operador == null) {
                return null;
            }

            operador = operador.trim();
            if (operador.equals("+") || operador.equals("-")
                    || operador.equals("*") || operador.equals("/")) {
                return operador;
            }
            mostrarError("Operador no válido. Usa +, -, * o /.");
        }
    }

    private static void mostrarResultado(String mensaje) {
        JOptionPane.showMessageDialog(
                null, mensaje, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(
                null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
