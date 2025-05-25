/**
 * Clase Timer para medir el tiempo de ejecucion de procesos
 */
public class Timer {

    //Medira cuanto tarda en ejecutarse la busqueda y el ordenamiento
    private long starTime;
    private long endTime;

    //Inicia la medicion del tiempo
    public void start(){
        //Captura el tiempo actual  en nanosegundos
        starTime = System.nanoTime();
    }

    //Finaliza la medicion del tiempo

    public void stop()
    {
        endTime = System.nanoTime();
    }

    /**
     * Retorna el tiempo transcurrido en nanosegundos
     * @return Tiempo transcurrido entre start() y stop()
     */
    public long getElapsedTime()
    {
        //calcula el retorno la diferencia entre
        return (endTime-starTime);
    }
}
