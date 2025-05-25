import java.util.Random;

/**
 * Clase encargada de seleccionar un numero magico de un arreglo
 * y revela un mensaje secreto si se adivina correctamente.
 */
public class OracleMessage {
    private int magicNumber;

    //Conjunto de mensajes secretos que se pueden revelar
    private final String[] secretMessages = {
            "✨ El portal al reino sumergido se abrirá cuando el sol cruce la cima del monte hueco.",
            "📜 Bajo la tercera luna de piedra, encontrarás la biblioteca olvidada del conocimiento prohibido.",
            "🗺️ El mapa del tesoro está oculto en la última página del códice rojo, sellado por el sabio Alerion."
    };

    //Selecciona aleatoriamente un numero del arreglo y lo asigna como numero magico.
    public void selectMagicNumber(int[] array) {
        Random rand = new Random();
        this.magicNumber = array[rand.nextInt(array.length)]; // Solo lectura
    }


    //Devuelve el mensaje secreto

    public int getMagicNumber(){
        return magicNumber;
    }

    //Devuelve el mensaje secreto
    public String revealSecret(){
        Random rand = new Random();
        return secretMessages[rand.nextInt(secretMessages.length)];
    }

}
