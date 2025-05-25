import java.util.Random;

/**
 * Clase responsable de generar arreglos de numeros enteros aleatorios
 * dentro de un rango definido.
 */
public class NumberGenerator {

    private static final int MIN = 1000; //Valor minimo
    private static final int MAX = 9999; //Valor maximo

    private final Random rand = new Random();

    //  Genera un arreglo de enteros aleatorios dentro del rango [MIN, MAX].
    public int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(MAX - MIN + 1) + MIN;
        }
        return array;
    }
}

