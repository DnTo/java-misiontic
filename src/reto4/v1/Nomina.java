package reto4.v1;

import java.util.ArrayList;

public class Nomina {

    private ArrayList<Trabajador> trabajadores;

    public Nomina() {
        this.trabajadores = new ArrayList<>();
    }

    public void agregarTrabajador(Trabajador t) {
        trabajadores.add(t);
    }

    public void eliminarTrabajador(String id) {
        for (Trabajador t : trabajadores) {
            if (t.getCC().equals(id)) {
                //si lo encuentro en la lista lo borro
                trabajadores.remove(t);
                break;
            }
        }
    }

    public double calcularSalarioQuincenalNomina() {
        double acumu = 0.0d;
        for (Trabajador t : trabajadores) {
            acumu += t.salarioQuincenal();
        }
        //   trabajadores.forEach(t -> acumu+=t.salarioQuincenal());
        return acumu;
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public double promedioEdadNomina() {
        double acumu = 0.0;
        for (Trabajador t : trabajadores) {
            acumu += t.calcularEdad();
        }
        return acumu / (double) trabajadores.size();
    }

    public double desviacionEstandarEdadNomina() {

        // sqrt(1/n *Sumatoria (( edad - promedio)^2) 
        //n numero de elementos
        //ej
        /*
        Edad trabajador : 21
        Edad trabajador : 51
        Edad trabajador : 20
     
        Edad promedio: 30.666666666666668
        
        //calculando la sumatoroa
        /*
                sqrt(1/3 (21 - 30.66)^2 + (51-30.66)^2 + (20-30.66)^2 ) 
                 sqrt(1/3        93.3156 +  413.7156 + 113.6356
                 sqrt(1/3  620.6668
                 sqrt(206.8896)
                 14.375
         */
        double promedioEdad = this.promedioEdadNomina();
        double acum = 0; //donde vo ya guardar la sumatoria

        for (Trabajador t : trabajadores) {
            acum //la sumatoria
                    += Math.pow((t.calcularEdad() - promedioEdad), 2);
        }

        double desviacion = 0.0;
        desviacion = Math.sqrt(acum / trabajadores.size());

        return desviacion;
    }

    public double salarioQuincenalTrabajador(String id) {
        for (Trabajador t : trabajadores) {
            if (t.getCC().equals(id)) {
                return t.salarioQuincenal();
            }
        }
        return -1.0;
    }

}
