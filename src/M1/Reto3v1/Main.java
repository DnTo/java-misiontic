
package M1.Reto3v1;


public class Main {
    public static void main(String args[]){
        
        Boton.Saludar();
        Boton b = new BotonHeredado();
        BotonHeredado b1 = (BotonHeredado)b;
        
        
        //la clase hijo es de tmb de tipo padre
         
        b1.hacerClick();
        
       
    
    }
    
}
