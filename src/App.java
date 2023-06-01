public class App {
    public static void main(String[] args){
        Semaforo s = new Semaforo(1);
        Box b = new Box();

        Macchina m1 = new Macchina(1,"Marco", s, b);
        Macchina m2 = new Macchina(2,"Valentino", s, b);
        //Macchina m3 = new Macchina(3,"Paolo", s, b);
        //Macchina m4 = new Macchina(4,"Lorenzo", s, b);
        //Macchina m5 = new Macchina(5,"Andrea", s, b);

        m1.start();
        m2.start();
        //m3.start();
        //m4.start();
        //m5.start();

        try {
            m1.join();
            m2.join();
            //m3.join();
            //m4.join();
            //m5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------TUTTI I PILOTI HANNO FINITO LA GARA--------------------");
    }
}
