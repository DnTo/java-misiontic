package reto2v3;

public class Taxi extends Vehiculo {

    private double distanciaRecorrida;
    private boolean segurosActivados;

    public Taxi(String name) {
        super(name, 1);

        System.out.println("Distancia: " + distanciaRecorrida);
        System.out.println("segurosActivados: " + segurosActivados);
        System.out.println("");
    }

    public void reiniciarTaximetro() {
        distanciaRecorrida = 0;
        System.out.println("distanciaRecorrida: " + distanciaRecorrida);
    }
    boolean panico = false;

    public void presionarBotonPanico() {
        panico = true;
       // gestionarMarcha();
        setEnMarcha(false);
        segurosActivados = false;
        dejarPasajero();

    }

    @Override
    public void dejarPasajero() {
        if (getnPasajeros() == 1) {
            if (!isEnMarcha() && !segurosActivados) {
                setnPasajeros(0);
                //le cobro?
                if (!panico) {
                    super.setCantidadDinero(super.getCantidadDinero() + calcularPasaje());
                }
                System.out.println("acumulado: " + getCantidadDinero());
                reiniciarTaximetro();
            }
        }
        System.out.println("Pasajeros: " + getnPasajeros());
    }

    public void gestionarSeguros() {
        segurosActivados = isEnMarcha();
        System.out.println("Seguros: " + segurosActivados);
    }
    
    @Override
    public void gestionarMarcha() {
        if (isMotorEncendido()) {
            setEnMarcha(!isEnMarcha());
        }
        System.out.println("isEnMarcha: " + isEnMarcha());
    }

    public double calcularPasaje() {
        double carrera = 3000; //banderazo
        carrera += distanciaRecorrida * 2300;
        System.out.println("carrera: " + carrera);
        return carrera;
    }

    @Override
    public void moverAbajo(double d) {
        if (this.isEnMarcha()) {
            super.moverAbajo(d);
            if (getnPasajeros() != 0) {
                distanciaRecorrida += d;
            }
        }
    }

    @Override
    public void moverArriba(double d) {
        if (this.isEnMarcha()) {
            super.moverArriba(d);
            if (getnPasajeros() != 0) {
                distanciaRecorrida += d;
            }
        }
    }

    @Override
    public void moverIzquierda(double d) {
        if (this.isEnMarcha()) {
            super.moverIzquierda(d);
            if (getnPasajeros() != 0) {
                distanciaRecorrida += d;
            }
        }
    }

    @Override
    public void moverDerecha(double d) {
        if (this.isEnMarcha()) {
            super.moverDerecha(d); //To change body of generated methods, choose Tools | Templates.
            if (getnPasajeros() != 0) {
                distanciaRecorrida += d;
            }
        }
    }

   

    public void recogerPasajero() {
        if (!segurosActivados) {
            if (!isEnMarcha() && getnPasajeros() == 0) {
                setnPasajeros(1);
            }
        }
        System.out.println("Pasajeros: " + getnPasajeros());
    }

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public boolean isSegurosActivados() {
        return segurosActivados;
    }

    public void setSegurosActivados(boolean segurosActivados) {
        this.segurosActivados = segurosActivados;
    }

}
