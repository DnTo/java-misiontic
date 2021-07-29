
package oop;

import oop.prestamos.Prestamo;


public class Main {
    
    public static void main(String args[]){
        
        TV minuevoTV = new TV();
        ControlGenerico miControl = new ControlGenerico();
        //boton de encendi es el 1. subir canal es 2 y bajar canal el 3
        miControl.PresionarBoton(1,minuevoTV); //polimorfismo
        minuevoTV.apagar();
        
        
        //prestamos
        Prestamo miPrestamo = new Prestamo(0.01f,0.02f,12,1000000);
        System.out.println(miPrestamo.ObtenerCuota()); 
        System.out.println(miPrestamo.TablaAmortizacion());
                
    /*
        public class Persona extends IEmpleado,IDesarrolladorWeb,IAdministrativo
        
        
        */
    
    
    /*public void Reunion (IEmpleado[] empleados)*/
    }
    
}
