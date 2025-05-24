public class Timer {

    //Medira cuanto tarda en ejecutarse la busqueda y el ordenamiento
    private long starTime;
    private long endTime;

    //Inicia la medicion
    public void start(){
        starTime = System.nanoTime();
    }

    //Finaliza la medicion

    public void stop()
    {
        endTime = System.nanoTime();
    }

    //Retorna el tiempo transcurrido en milisegundos
    public long getElapsedTime()
    {
        return (endTime-starTime);
    }
}
