import java.util.Random;

public class NumberGenerator {

    private static final int MIN = 1000;
    private static final int MAX = 9999;
    private final Random rand = new Random();

    // Genera un array de tamaño personalizado
    public int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(MAX - MIN + 1) + MIN;
        }
        return array;
    }
}

