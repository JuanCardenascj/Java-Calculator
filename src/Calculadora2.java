import javax.swing.JOptionPane;

/**
 * Esta segunda calculadora es realizada con JoptioPane - Para los datos sean
 * solicitados en modo ventana
 * y así mismo se muestren en ventana
 */

public class Calculadora2 {

    public static void main(String[] args) {
        // Saludo y bienvenida con JOptionPane
        JOptionPane.showMessageDialog(null, "=======!!!!Bienvenido a su Calculadora Virtual!!!!=======");

        // Solicitar el nombre del usuario
        String nombre = JOptionPane.showInputDialog("DIGITE SU NOMBRE");

        // Saludar al usuario
        JOptionPane.showMessageDialog(null,
                "Bienvenido: " + nombre + "\n¡¡¡Cuéntame, para qué soy buen@ el día de HOY!!!");

        while (true) {
            // Menú de opciones con JOptionPane
            String menu = "======= Calculadora =======\n" +
                    "1. Sumar\n" +
                    "2. Restar\n" +
                    "3. Multiplicar\n" +
                    "4. Dividir\n" +
                    "5. Salir";

            // Pedir la opción al usuario
            String opcionStr = JOptionPane.showInputDialog(menu);
            int opcion = 0;

            // Validación de la opción
            try {
                opcion = Integer.parseInt(opcionStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa una opción válida.");
                continue;
            }

            // Condicional para salir si elige la opción 5
            if (opcion == 5) {
                JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                break; // Salir del bucle
            }

            // Leer los dos números para la operación
            double num1 = 0, num2 = 0;
            try {
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer número:"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo número:"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa números válidos.");
                continue;
            }

            double resultado = 0; // Variable para almacenar el resultado

            // Realizar la operación según la opción elegida
            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    JOptionPane.showMessageDialog(null, "Resultado: " + String.format("%.2f", resultado));
                    break;
                case 2:
                    resultado = num1 - num2;
                    JOptionPane.showMessageDialog(null, "Resultado: " + String.format("%.2f", resultado));
                    break;
                case 3:
                    resultado = num1 * num2;
                    JOptionPane.showMessageDialog(null, "Resultado: " + String.format("%.2f", resultado));
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        JOptionPane.showMessageDialog(null, "Resultado: " + String.format("%.2f", resultado));
                    } else {
                        JOptionPane.showMessageDialog(null, "¡Error! No se puede dividir entre cero.");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, elige una opción del 1 al 5.");
                    break;
            }

            // Preguntar si el usuario quiere hacer otra operación
            int continuar = JOptionPane.showConfirmDialog(null, "¿Quieres hacer otra operación?", "Confirmación",
                    JOptionPane.YES_NO_OPTION);
            if (continuar == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                break; // Salir del bucle
            }
        }
    }
}
