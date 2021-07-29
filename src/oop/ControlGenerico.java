
package oop;


public class ControlGenerico {
    
    //botones 
    
    public boolean PresionarBoton(int posicion, DispositivoElectronico dis ){
        
        if(posicion == 1) dis.encender();
        return true;//haz de luz
    }
    
    
    
}
