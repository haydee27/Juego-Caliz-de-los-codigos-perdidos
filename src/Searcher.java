/**
 * Clase que implementa la busqueda binaria en un arreglo ordenado.
 */
public class Searcher {
    /**
     * Realiza una búsqueda binaria en el arreglo ordenado.
     *
     * @param array El arreglo ordenado en el que se busca.
     * @param target El valor que se desea encontrar.
     * @return true si el valor se encuentra en el arreglo, false en caso contrario.
     */
    public boolean binarySearch(int[] array, int target){
        //Variables para dividir y reducir el espacion de busqueda
        int left =0;  //Indice Inicial
        int rigth = array.length-1;

        while(left<= rigth)
        {
            int mid = left+(rigth-left) / 2;

            if(array[mid] == target){
                return true; //Encuentra

            }else if( array[mid] <target){
                left = mid +1; //Busca a la derecha
            }else{
                rigth = mid -1; //Busca a la izquierda
            }
        }
        return false; //No encontrado

    }
}
