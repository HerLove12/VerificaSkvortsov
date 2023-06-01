public class Box {
    
    /**
     metodo stampa entrata nel box
     */
    public void entrataBox(){
        System.out.println("\n");
        System.out.println("Il pilota:  "+ Thread.currentThread().getName() +" è entrato nel box e sta effettuando il cambio gomme");
        System.out.println("\n");
    }

    /**
     metodo stampa uscita dal box 
     */
    public void uscitaBox(){
        System.out.println("\n");
        System.out.println("Il pilota:  "+ Thread.currentThread().getName() +" è uscito dal box e sta tornando in pista");
        System.out.println("\n");
    }
}
