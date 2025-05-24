public class Sorter {

    // Metodo público que inicia el ordenamiento Merge Sort
    public void mergeSort(int[] array) {
        // Si el arreglo es nulo o tiene menos de 2 elementos, no hay nada que ordenar
        if (array == null || array.length < 2) {
            return;
        }
        // Llama al metodo recursivo para dividir y ordenar el arreglo
        mergeSortRecursive(array, 0, array.length - 1);
    }

    // Metodo recursivo para dividir el arreglo y aplicar Merge Sort
    private void mergeSortRecursive(int[] array, int left, int right) {
        // Si la mitad izquierda es menor que la derecha, significa que hay más de un elemento
        if (left < right) {
            // Calcula el punto medio para evitar posibles desbordamientos con números grandes
            int mid = left + (right - left) / 2;

            // Ordena recursivamente la mitad izquierda
            mergeSortRecursive(array, left, mid);
            // Ordena recursivamente la mitad derecha
            mergeSortRecursive(array, mid + 1, right);

            // Fusiona las dos mitades ordenadas
            merge(array, left, mid, right);
        }
    }

    // Metodo que une (fusiona) dos mitades ordenadas en un solo arreglo ordenado
    private void merge(int[] array, int left, int mid, int right) {
        // Calcula los tamaños de los sub-arreglos temporales
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Crea sub-arreglos temporales para almacenar las mitades
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copia los datos de la mitad izquierda del arreglo original al leftArray temporal
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        // Copia los datos de la mitad derecha del arreglo original al rightArray temporal
        for (int i = 0; i < n2; i++) {
            rightArray[i] = array[mid + 1 + i];
        }

        // Índices para recorrer los sub-arreglos temporales y el arreglo original
        int i = 0, j = 0; // Índices para leftArray y rightArray
        int k = left;     // Índice para el arreglo original (donde se fusionarán los elementos)

        // Compara los elementos de ambos sub-arreglos y los coloca en el orden correcto
        // en el arreglo original
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        // Copia los elementos restantes de leftArray (si los hay)
        while (i < n1) {
            array[k++] = leftArray[i++];
        }

        // Copia los elementos restantes de rightArray (si los hay)
        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }
}