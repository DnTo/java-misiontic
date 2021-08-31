package reto2.v3;

/**
 *
 * @author danto
 */
public class Reto2V3 {

    public static void main(String args[]) {

        //ejemplo
        /*  Autobus a = new Autobus("Pepe", 30); //1
        a.recogerPasajero(2); //2 

        a.gestionarPuerta(); //3
        a.gestionarMarcha();

        a.recogerPasajero(2);//4
        a.gestionarMarcha();
        a.gestionarPuerta();

        a.moverArriba(2);//5
        a.moverDerecha(5);
        a.gestionarWifi();
        a.gestionarAireAcondicionado();

        a.gestionarMotor();//6
        a.moverIzquierda(2);

        System.out.println("\nFin pepe Bus hojas");
       
        Taxi b = new Taxi("Pepe"); //1

        b.gestionarMotor(); //2
        b.gestionarMarcha();
        b.recogerPasajero();

        b.gestionarMarcha();//3
        b.recogerPasajero();
        b.moverArriba(10);
        b.moverIzquierda(12);
        b.gestionarSeguros();
        b.moverAbajo(10);
        b.moverIzquierda(13);

        b.gestionarAireAcondicionado();//4
        b.gestionarWifi();
        b.gestionarMotor();
        b.presionarBotonPanico();

        System.out.println("\nFin pepe Taxi hojas");
       
        System.out.println("FILOMENO BUS");
        Autobus v = new Autobus("Filomeno", 2);
        v.gestionarPuerta();
        v.recogerPasajero(1);
        v.recogerPasajero(3);
        v.recogerPasajero(6);
        v.gestionarMarcha();
        v.gestionarPuerta();
        v.gestionarMarcha();
        v.gestionarMotor();
        v.gestionarMarcha();
        v.moverArriba(1.0);
        v.moverIzquierda(2.0);
        v.moverAbajo(3.0);
        v.recogerPasajero(6);
        v.gestionarMarcha();
        v.gestionarPuerta();
        v.recogerPasajero(4);
         */
        //caso de prueba taxi pepe
        /*
        Taxi t = new Taxi("Pepe");
        t.gestionarMotor();
        t.recogerPasajero();
        t.gestionarSeguros();
        t.gestionarMarcha();
        t.moverAbajo(5);
        t.moverDerecha(6);
        t.moverIzquierda(2);
        t.gestionarSeguros();
        t.gestionarMarcha();
        t.dejarPasajero();
        t.dejarPasajero();
        t.gestionarSeguros();
        t.dejarPasajero();
        t.recogerPasajero();
        t.gestionarSeguros();
        t.moverArriba(1);
        t.gestionarMarcha();
        t.gestionarSeguros();
        t.dejarPasajero();
      //  
        
        Taxi t = new Taxi("Pepe");
        t.gestionarMotor();
        t.gestionarMarcha();
        t.recogerPasajero();
        t.gestionarMarcha();
        t.recogerPasajero();
        t.moverArriba(10);
        t.moverDerecha(12);
        t.gestionarSeguros();
        t.moverAbajo(10);
        t.moverIzquierda(13);
        t.gestionarAireAcondicionado();
        t.gestionarWifi();
        t.gestionarMotor();
        t.presionarBotonPanico();
        t.dejarPasajero();
        
     
        Taxi t = new Taxi("Filomeno");
        t.gestionarMotor();
        t.recogerPasajero();
        t.gestionarSeguros();
        t.gestionarMarcha();
        t.moverAbajo(5);
        t.moverDerecha(6);
        t.moverIzquierda(2);
        t.gestionarSeguros();
        t.gestionarMarcha();
        t.dejarPasajero();
        t.dejarPasajero();
        t.gestionarSeguros();
        t.dejarPasajero();
        t.recogerPasajero();
        t.gestionarSeguros();
        t.moverArriba(1);
        t.gestionarMarcha();
        t.gestionarSeguros(); 
        t.dejarPasajero();
         */
        
        
        System.out.println("FILOMENO BUS");
        Autobus v = new Autobus("Filomeno", 2);
        v.gestionarPuerta();
        v.recogerPasajero(1);
        v.recogerPasajero(3);
        v.recogerPasajero(6);
        v.gestionarMarcha();
        v.gestionarPuerta();
        v.gestionarMarcha();
        v.gestionarMotor();
        v.gestionarMarcha();
        v.moverArriba(1);
        v.moverIzquierda(2);
        v.moverAbajo(3);
        v.recogerPasajero( 6);
        v.gestionarMarcha();
        v.gestionarPuerta();
        v.recogerPasajero(4);
        System.out.println(v.calcularDistanciaAcopio());
          

    }

}
