package oop;

public class DispositivoElectronico {

    private boolean estado;
    private boolean sePuedeEncender = true;

    public boolean getEstado() {
        return estado;
    }

    public void encender() {
           //encender    
    }

    public void apagar() {
            //apagar
    }
    
    private boolean _encender(){
        
        
        if(sePuedeEncender)
            //verificar si se pueden encender
            return true;
        return false;
        
      //  sePuedeEncender?return true:return false;
            
            
    
    }

}
