package reto4.v1;

public class Main {

    public static void main(String args[]) {
        Nomina nomina = new Nomina();

        Trabajador t1 = new Trabajador("Mat", "1037681391", 67000.0, 80, 23, 1, 2000);
        Trabajador t2 = new Trabajador("Johan", "33277591", 20000.0, 96, 24, 5, 1970);
        Trabajador t3 = new Trabajador("Paulo", "1032678245", 40000.0, 96, 7, 3, 2001);

        nomina.agregarTrabajador(t1);
        nomina.agregarTrabajador(t2);
        nomina.agregarTrabajador(t3);

        //salario lo imprime en notacion cientifica
        System.out
                .println("Salario quincenal nomina:" + nomina.calcularSalarioQuincenalNomina());

        //calcular deviaccion estandar
        for (Trabajador t : nomina.getTrabajadores()) {
            System.out.println("Edad trabajador : " + t.calcularEdad());
        }

        System.out.println("Edad promedio: " +nomina.promedioEdadNomina() );
        /*
        
        Edad promedio: 30.666666666666668
        Edad trabajador : 21
        Edad trabajador : 51
        Edad trabajador : 20
         */
        
        //calculando la sumatoroa
        /*
                sqrt(1/3 (21 - 30.66)^2 + (51-30.66)^2 + (20-30.66)^2 ) 
                 sqrt(1/3        93.3156 +  413.7156 + 113.6356
                 sqrt(1/3  620.6668
                 sqrt(206.8896)
                 14.375
        
        */
        
        //Desviacion
        System.out.println("Desviacion: " + nomina.desviacionEstandarEdadNomina());
    }

}
