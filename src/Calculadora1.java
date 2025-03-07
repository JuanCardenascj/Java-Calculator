import java.util.Scanner;

public class Calculadora1 {

    /* Programa prueba de una calculadora */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Importamos y creamos el objeto Scanner.

        System.out.println(); // Separador al inicio
        System.out.println("=======!!!!Bienvenido a su Calculadora Virtual!!!!=======");
        System.out.println(); // Separador

        // Solicitar y leer el nombre del usuario
        String nombre;
        System.out.println("DIGITE SU NOMBRE");
        nombre = entrada.next(); // Guardamos el nombre
        System.out.println(); // Separador

        // Saludar al usuario
        System.out.println("Bienvenido: " + nombre + " ");
        System.out.println("¡¡¡Cuéntame, para qué soy buen@ el día de HOY!!!");
        System.out.println(); // Separador

        /** BUCLE - WHILE - MIENTRAS */
        while (true) {
            // Menú de opciones
            System.out.println("======= Calculadora =======");
            System.out.println(); // Separador
            System.out.println("Elige una opción:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            // Leer la opción elegida por el usuario
            int opcion = 0;
            boolean opcionValida = false;

            // Validar la entrada de la opción
            while (!opcionValida) {
                try {
                    opcion = entrada.nextInt();
                    if (opcion >= 1 && opcion <= 5) {
                        opcionValida = true;
                    } else {
                        System.out.println("Por favor, elige una opción válida del 1 al 5.");
                    }
                } catch (Exception e) {
                    System.out.println("Entrada no válida. Por favor ingresa un número entre 1 y 5.");
                    entrada.next(); // Limpiar el buffer del scanner
                }
            }

            /** CONDICIONAL - IF - SI */
            if (opcion == 5) {
                System.out.println("¡Hasta luego!");
                break; // Salir del bucle si elige la opción 5
            }

            // Leer los dos números para la operación después de la opción
            System.out.println(); // Separador
            double num1 = 0, num2 = 0;

            // Validar la entrada de los números
            boolean numerosValidos = false;
            while (!numerosValidos) {
                try {
                    System.out.print("Ingresa el primer número: ");
                    num1 = entrada.nextDouble(); // Leer el primer número
                    System.out.print("Ingresa el segundo número: ");
                    num2 = entrada.nextDouble(); // Leer el segundo número
                    numerosValidos = true;
                } catch (Exception e) {
                    System.out.println("Por favor ingresa números válidos.");
                    entrada.next(); // Limpiar el buffer del scanner
                }
            }

            double resultado = 0; // Variable para almacenar el resultado

            // Realizar la operación según la opción elegida
            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.printf("Resultado: %.2f\n", resultado); // Formatear a dos decimales
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.printf("Resultado: %.2f\n", resultado); // Formatear a dos decimales
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.printf("Resultado: %.2f\n", resultado); // Formatear a dos decimales
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.printf("Resultado: %.2f\n", resultado); // Formatear a dos decimales
                    } else {
                        System.out.println("¡Error! No se puede dividir entre cero.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5.");
                    break;
            }

            // Preguntar si el usuario quiere realizar otra operación
            System.out.println(); // Separador
            System.out.println("¿Quieres hacer otra operación? (S/N)");
            char continuar = entrada.next().charAt(0); // Leer la opción S/N
            if (continuar == 'N' || continuar == 'n') {
                System.out.println("¡Hasta luego!");
                break;
            }
        }

        // Cerrar el scanner al final
        entrada.close();
    }
}
