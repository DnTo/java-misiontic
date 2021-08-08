package reto1;

/**
 *
 * @author danto
 */
public class Main {

    public static void main(String args[]) {
        Autobus bus = new Autobus("Pepe", 30, false);

        bus.moverDerecha(5); //no esra encendido

        bus.gestionarWifi(); //no esra encendido
        bus.gestionarAireAcondicionado(); //no esra encendido
        bus.gestionarMarcha(); //no esra encendido

        bus.gestionarMotor(); // esra encendido
        bus.gestionarMarcha(); //se puede mover
        bus.moverDerecha(5); //se mueve a la derecha x = 5

        bus.recogerPasajero(2); //no puede, esta en movimiento
        bus.gestionarPuerta(); //no puede, esta en movimiento
        bus.moverArriba(10); // se mueve  y = 10

        bus.gestionarMarcha(); //paro
        bus.gestionarPuerta(); //abre la puerta 
        bus.recogerPasajero(1); //sube 1500
        bus.recogerPasajero(4); //sube 2600
        bus.recogerPasajero(6); //sube 3000

        bus.gestionarWifi(); //enciende wifi
        bus.gestionarAireAcondicionado(); //enciende aire
        bus.gestionarMarcha(); //no podria, esta la puerta abieraal arrancar cierra la puerta automaticamente?
        bus.moverIzquierda(2); // no podria porque esta la puerta abiera

        bus.dejarPasajero(); //si puede , esta la puerta abierta
        bus.gestionarMotor(); //apaga todo
        double distancia = bus.calcularDistanciaAcopio();
        System.out.println(distancia);

    }

}
