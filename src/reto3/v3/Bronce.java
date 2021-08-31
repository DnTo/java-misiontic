package reto3.v3;

public class Bronce extends Asiento {

    public Bronce(String ID) {
        super("ID", 'b');
    }
    
    @Override 
    public String imprimirMenuPantalla(){
        return "BRONCE";
    }
}
