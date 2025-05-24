import java.util.Scanner;

public class InputValidator {
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
                scanner.next(); // Limpia el buffer
            }
        }
    }
}