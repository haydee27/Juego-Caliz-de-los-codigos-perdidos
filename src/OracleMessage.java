import java.lang.reflect.Array;
import java.util.Random;

public class OracleMessage {
    //Esta clase se encarga de escoger el numero magico y mostrar el mensaje si se encuentra

    private int magicNumber;
    private final String[] secretMessages = {
            "✨ El portal al reino sumergido se abrirá cuando el sol cruce la cima del monte hueco.",
            "📜 Bajo la tercera luna de piedra, encontrarás la biblioteca olvidada del conocimiento prohibido.",
            "🗺️ El mapa del tesoro está oculto en la última página del códice rojo, sellado por el sabio Alerion."
    };
    //Escoge un numero aleatorio del array como el numero magico
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
