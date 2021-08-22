/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1.v2;

/**
 *
 * @author danto
 */
public class Main {
      public static void main(String args[]){

    SimCard sim = new SimCard("dsdas");
    sim.recargarSaldo(50000);
    sim.comprarDatos(12);
    sim.consumirDatos(3); //no funciona porque no esta encendido
    sim.gestionarEncendidoCelular(); //lo enciende
    sim.llamar(120); //los primeros 60 a 1 y los siguines a 0.5
    //60 + 30;

    sim.gestionarModoAvion(); //se enciende modo avion no puedo llamar ni consumir datos
    sim.gestionarDatos();//no puedo encenderlos xk estoy en modo avion

    sim.gestionarModoAvion();//7
    sim.gestionarDatos(); //enciendo los datos
    sim.consumirDatos(3);//8 los consumo porque tengo disponibles
    sim.gestionarEncendidoCelular();//apago el telefono


    System.out.println(sim.getEmpresaTelefonia());
    System.out.println(sim.getSaldo());
    System.out.println(sim.getNumeroTelefono());
    //System.out.println(sim.isCelularApagado());
     System.out.println(sim.isCelularApagado());
    //System.out.println(sim.isDatosActivados());
     System.out.println(sim.isModoAvionActivado());//pilas con el nombre de estos, debe ser isXXXX
    System.out.println(sim.isDatosApagados());
    System.out.println(sim.getSaldoDatos());
    }
}
