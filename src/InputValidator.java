import java.util.Scanner;

/**
 * Clase que valida la entrada del usuario asegurando que sea un numero enter
 * dentro de un rango especifico.
 */
public class InputValidator {
    /**
     * Solicita y valida una entrada numérica dentro de un rango determinado.
     * Reintenta hasta que el usuario proporcione una entrada válida.
     */
    public static int getValidInput(Scanner scanner, int min, int max) {
        while (true) {
            try {
                int input = scanner.nextInt();
                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.out.println("⚠️ Ingresa un número entre " + min + " y " + max + ":");
                }
            } catch (Exception e) {
                System.out.println("⚠️ Entrada inválida. Ingresa un número entero:");
                scanner.next(); // Limpia el buffer del scanner para evitar bucles infinitos
            }
        }
    }
}