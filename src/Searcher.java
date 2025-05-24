public class Searcher {
    //Realizamos busqueda binaria en el array ordenado

    public boolean binarySearch(int[] array, int target){
        //Variables para dividir y reducir el espacion de busqueda
        int left =0;
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
