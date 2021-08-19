package reto2v3;

public class Autobus extends Vehiculo {

    private boolean puertaAbierta;

    public Autobus(String name, int nPasajeros) {
        super(name, nPasajeros);
       
        System.out.println("Esatdo Puerta: " + puertaAbierta);
        System.out.println("");
    }

    public void recogerPasajero(int n) {
        System.out.println("recogerPasajero(" + n + ");");

        if (puertaAbierta && getnPasajeros() != getnMaximoPasajeros()) {
            setnPasajeros(getnPasajeros() + 1);
            double tarifa = calcularPasaje(n);
            System.out.println("Tarifa cobrada:" + tarifa);
            super.setCantidadDinero(super.getCantidadDinero() + tarifa);
        }

        System.out.println("Pasajeros Actuales:" + getnPasajeros());
        System.out.println("Dinero Actual:" + getCantidadDinero());
    }

    @Override
    public void gestionarMarcha() {
        System.out.println("gestionarMarcha();");

        if (/*super.isMotorEncendido() && */!puertaAbierta) {
            super.setEnMarcha(!super.isEnMarcha());
        }
        System.out.println("Esatdo Marcha: " + isEnMarcha());
    }

    public void gestionarPuerta() {
        System.out.println("gestionarPuerta();");
        if (!puertaAbierta && !isEnMarcha()) {
            puertaAbierta = true;
        }else
            puertaAbierta = false;
        
        System.out.println("Esatdo Puerta: " + puertaAbierta);
    }

    public static double calcularPasaje(int estrato) {
        double carrera = 0;
        carrera = (double) estrato < 3 ? 1500 : estrato < 5 ? 2600 : 3000;
        return carrera;
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

}
