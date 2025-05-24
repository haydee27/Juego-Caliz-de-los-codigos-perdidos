public class ResultPresenter {

    //Metodo para condicionar y mostrar los resultados
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
