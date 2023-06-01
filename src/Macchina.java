public class Macchina extends Thread{
    private int numero;
    private String pilota;
    Semaforo s;
    Box b;

    public Macchina(int numero, String pilota, Semaforo s, Box b) {
        super(pilota);
        this.numero = numero;
        this.pilota = pilota;
        this.s = s;
        this.b = b;
    }

    @Override
    public void run(){

        for(int i = 1; i <= 10; i++){
            int pausaGiro = (int)(Math.random()*4000+1000);
            int pausaBox = (int)(Math.random()*5000+1000);
            int randomRitiro = (int)(Math.random()*20+1);

            if(randomRitiro == 17){
                System.out.println("Il pilota:  "+Thread.currentThread().getName()+" !HA ROTTO IL MOTORE!");
                try {
                    join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Il pilota:  "+Thread.currentThread().getName()+" sta svolgendo il " +i+" giro");

            try {
                Thread.sleep(pausaGiro);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(i%3==0){
                System.out.println("Il pilota:  "+Thread.currentThread().getName()+" e' arrivato al " +i+" giro quindi si deve fermare");
                s.P();
                b.entrataBox();

                try {
                    Thread.sleep(pausaBox);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                s.V();
                b.uscitaBox();
                System.out.println("Il pilota:  "+Thread.currentThread().getName()+" e' tornato in pista");
            }
        }

        System.out.println("Il pilota:  "+Thread.currentThread().getName()+" HA FINITO I 10 GIRI");
    }

}
