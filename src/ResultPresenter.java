/**
 * Clase que presenta los resultados de la busqueda y
 * y las metricas de rendimiento del algoritmo
 */
public class ResultPresenter {
    /**
     * Metodo para condicionar y mostrar los resultados de la búsqueda.
     *
     * @param oracle El objeto que contiene el mensaje secreto.
     * @param found Indica si el número fue encontrado en el arreglo.
     * @param userGuess El número que el usuario adivinó.
     * @param magicNumber El número mágico que se busca.
     * @param sortTime El tiempo que tomó ordenar el arreglo, en nanosegundos.
     * @param searchTime El tiempo que tomó realizar la búsqueda, en nanosegundos.
     */
    public static void showResults(OracleMessage oracle, boolean found,
                                   int userGuess, int magicNumber,
                                   long sortTime, long searchTime) {
        if (found && userGuess == magicNumber) {
            System.out.println("\n🎉 ¡Correcto! Has descubierto el mensaje secreto:");
            System.out.println(oracle.revealSecret());
        } else if (found) {
            System.out.println("\n✅ El número existe, pero no es el mágico. Sigue buscando...");
        } else {
            System.out.println("\n❌ El número no está entre los códigos mágicos.");
        }

        System.out.println("\n📊 Métricas de rendimiento:");
        System.out.printf("• Tiempo de ordenamiento: %,d ns%n", sortTime);
        System.out.printf("• Tiempo de búsqueda binaria: %,d ns%n", searchTime);

        System.out.println("\n📊 Análisis Big O:");
        System.out.println("- Ordenamiento (MergeSort): O(n log n)");
        System.out.println("- Búsqueda binaria: O(log n)");
    }

}
