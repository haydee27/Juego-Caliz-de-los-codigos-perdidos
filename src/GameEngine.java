import java.util.Arrays;
import java.util.Scanner;

public class GameEngine {

    private final NumberGenerator generator = new NumberGenerator();
    private final Sorter sorter = new Sorter();
    private final Searcher searcher = new Searcher();
    private final Timer timer = new Timer();
    private final OracleMessage oracle = new OracleMessage();
    private final Scanner scanner = new Scanner(System.in);


    public void run() {
        int option;
        do {
            System.out.println("\n🎮 Menú Principal:");
            System.out.println("1. Iniciar juego");
            System.out.println("2. Historia: El Mensaje del Oráculo");
            System.out.println("3. Acerca del programa");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción (1-3): ");
            option = InputValidator.getValidInput(scanner, 1, 4); // Validador

            switch (option) {
                case 1:
                    startGame();
                    break;
                case 2:
                    history();
                    break;
                case 3:
                    showAbout();
                    break;
                case 4:
                    System.out.println("👋 ¡Gracias por jugar! Hasta pronto.");
                    break;
                default:
                    break;

            }
        } while (option != 4);
    }

    public void startGame() {
        int[] numbers = generator.generateArray(10);

        System.out.println("📦 Array generado (10 valores):");
        System.out.println(Arrays.toString(numbers));

        timer.start();
        sorter.mergeSort(numbers);
        timer.stop();
        long sortTime = timer.getElapsedTime();

        System.out.println("\n✅ Array ordenado:");
        System.out.println(Arrays.toString(numbers));

        oracle.selectMagicNumber(numbers);
        int magicNumber = oracle.getMagicNumber();

        System.out.println("🔑 Número mágico seleccionado (oculto al usuario): " + magicNumber);

        boolean guessedCorrectly = false;
        int attempts = 0;

        while (attempts < 3 && !guessedCorrectly) {
            System.out.println("\n🔎 Ingresa un número mágico para buscar (entre 1000 y 9999):");
            int userGuess = InputValidator.getValidInput(scanner, 1000, 9999);
            System.out.println("👁️ Número ingresado: " + userGuess);

            timer.start();
            boolean exists = searcher.binarySearch(numbers, userGuess);
            timer.stop();
            long searchTime = timer.getElapsedTime();

            attempts++;

            if (exists && userGuess == magicNumber) {
                System.out.println("\n🎉 FELICIDADES ENCONTRASTE EL NÚMERO MÁGICO EN EL INTENTO " + attempts + "!");
                ResultPresenter.showResults(oracle, true, userGuess, magicNumber, sortTime, searchTime);
                System.out.println("🔄 ESTAMOS VOLVIENDO AL MENÚ PRINCIPAL...\n");
                guessedCorrectly = true;
            } else if (exists) {
                System.out.println("\n✅ El número existe, pero no es el mágico. Sigue buscando...");
                ResultPresenter.showResults(oracle, false, userGuess, magicNumber, sortTime, searchTime);
                // El ciclo continuará automáticamente al siguiente intento
            } else {
                System.out.println("\n❌ El número no se encuentra en el arreglo.");
                ResultPresenter.showResults(oracle, false, userGuess, magicNumber, sortTime, searchTime);
                // El ciclo continuará automáticamente al siguiente intento
            }
        }

        if (!guessedCorrectly) {
            System.out.println("\n❌ MALA SUERTE... HAS PERDIDO.");
            System.out.println("🎯 El número mágico era: " + magicNumber);
            System.out.println("🔄 ESTAMOS VOLVIENDO AL MENÚ PRINCIPAL...\n");
        }
    }

    private void history(){
        System.out.println("Cuenta la leyenda que un antiguo oráculo dejó un mensaje escondido entre miles de números \n" +
                "mágicos. Solo aquellos que dominen los caminos del ordenamiento, la búsqueda eficiente y \n" +
                "el análisis del rendimiento podrán descifrarlo.\n" +
                "\nTu misión es adentrarte en el Cáliz de los Códigos Perdidos, un contenedor sagrado de claves \n" +
                "ocultas. Entre estos números, uno contiene el mensaje secreto del oráculo, revelador del misterio \n" +
                "final: el paradero de un tesoro ancestral, la verdad sobre el antiguo imperio o el desenlace de una \n" +
                "profecía olvidada");
    }

    private void showAbout() {
        System.out.println("\n🧠 Acerca del Programa:");

        System.out.println("Este juego genera 10 números mágicos (entre 1000 y 9999), los ordena, y luego selecciona uno al azar.");
        System.out.println("Tu misión es adivinar el número mágico usando búsqueda binaria.");
        System.out.println("DESARROLLADO POR: HAYDEE BONILLA ");
        System.out.println("^_^ KODIGO ^_^");
    }


}
