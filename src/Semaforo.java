public class Semaforo {
    private int valore;

    /**
     * @param valore
     * costruttore semaforo con valore 
     */
    public Semaforo(int valore) {
        this.valore = valore;
    }

    /**
     *metodo P del semaforo
     */
    public synchronized void P(){
        while(valore == 0){
            System.out.println("\n");
            System.out.println("|Il pilota:  "+Thread.currentThread().getName()+" sta aspettando per entrare nel box|");
            System.out.println("\n");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valore--;
    }

    /**
     * metodo V semaforo
     */
    public synchronized void V(){
        notify();
        valore++;
    }

}
