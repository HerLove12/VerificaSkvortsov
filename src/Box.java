public class Box {
    
    public void entrataBox(){
        System.out.println("\n");
        System.out.println("Il pilota:  "+ Thread.currentThread().getName() +" è entrato nel box e sta effettuando il cambio gomme");
        System.out.println("\n");
    }

    public void uscitaBox(){
        System.out.println("\n");
        System.out.println("Il pilota:  "+ Thread.currentThread().getName() +" è uscito dal box e sta tornando in pista");
        System.out.println("\n");
    }
}
