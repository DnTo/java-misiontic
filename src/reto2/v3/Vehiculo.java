package reto2.v3;

public abstract class Vehiculo {

    //<editor-fold defaultstate="collapsed" desc="getter setter">
    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public int getnMaximoPasajeros() {
        return nMaximoPasajeros;
    }

    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public double getLocalizacionX() {
        return localizacionX;
    }

    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }

    public double getLocalizacionY() {
        return localizacionY;
    }

    public void setLocalizacionY(double localizacionY) {
        this.localizacionY = localizacionY;
    }

    public boolean isAireAcondicionadoActivado() {
        return aireAcondicionadoActivado;
    }

    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public boolean isWifiEncendido() {
        return wifiEncendido;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this.wifiEncendido = wifiEncendido;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="properties">
    private String nombreConductor;
    private int nPasajeros;
    private int nMaximoPasajeros;
    private double cantidadDinero;

    private double localizacionX;
    private double localizacionY;
    private boolean aireAcondicionadoActivado;
    private boolean motorEncendido;
    private boolean wifiEncendido;
    private boolean enMarcha;
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="methods">
    /**
     * Decrementa el numero de pasajeros, solo si no esta en marcha y esta la
     * puerta abierta
     */
    public void dejarPasajero() {
        if (!enMarcha) {
            if (nPasajeros != 0) {
                nPasajeros--;
            }
        }
    }

    /**
     * Calcula y devuelvela distancia al centro de acopio (0,0)
     *
     * @return la distancia en double
     */
    public double calcularDistanciaAcopio() {
       // System.out.println("calcularDistanciaAcopio();");
        double distancia = Math
                .sqrt(Math.pow(localizacionX, 2) + Math.pow(localizacionY, 2));
        return distancia;
    }

    /**
     * Si el motor esta encendido cambia el estado del aire
     */
    public void gestionarAireAcondicionado() {
        System.out.println("gestionarAireAcondicionado();");
        if (motorEncendido) {
            aireAcondicionadoActivado = !aireAcondicionadoActivado;
        }
        System.out.println("Esatdo Aire: " + aireAcondicionadoActivado);
    }

    /**
     * si el motor esta encendido lo apagaga junto con el wifi e aire si esta
     * apagado lo enciende
     */
    public void gestionarMotor() {
        System.out.println("gestionarMotor();");
        if (!motorEncendido) {
            motorEncendido = true;

        } else {
            motorEncendido = false;
            wifiEncendido = aireAcondicionadoActivado = false;
            enMarcha = false;
        }
        System.out.println("Esatdo Motor: " + motorEncendido);
    }

    /**
     * Si el motor esta encendido cambia el estado del wifi
     */
    public void gestionarWifi() {
        System.out.println("gestionarWifi();");
        if (motorEncendido) {
            wifiEncendido = !wifiEncendido;
        }
        System.out.println("Esatdo Wifi: " + wifiEncendido);
    }

    /**
     * Si el motor esta encendido puede iniciar o detener la marcha
     */
    public abstract void gestionarMarcha();

    /**
     * Se mueve en la direccion en Kms
     *
     * @param d los kms que se mueve
     */
    public void moverDerecha(double d) {
        if (enMarcha) {
            localizacionX += d;
        }
        System.out.println("Pos x: " + localizacionX);
    }

    /**
     * Se mueve en la direccion en Kms
     *
     * @param d los kms que se mueve
     */
    public void moverIzquierda(double d) {
        System.out.println("moverIzquierda(" + d + ");");
        if (enMarcha) {
            localizacionX -= d;
        }
        System.out.println("Pos x: " + localizacionX);
    }

    /**
     * Se mueve en la direccion en Kms
     *
     * @param d los kms que se mueve
     */
    public void moverArriba(double d) {
        System.out.println("moverArriba(" + d + ");");
        if (enMarcha) {
            localizacionY += d;
        }
        System.out.println("Pos y: " + localizacionY);
    }

    /**
     * Se mueve en la direccion en Kms
     *
     * @param d los kms que se mueve
     */
    public void moverAbajo(double d) {
        System.out.println("moverAbajo(" + d + ");");
        if (enMarcha) {
            localizacionY -= d;
        }
        System.out.println("Pos y: " + localizacionY);
    }
//</editor-fold>

    //ctor
    public Vehiculo(String name, int nMaxPasajeros) {

        this.nombreConductor = name;
        this.nMaximoPasajeros = nMaxPasajeros;
        System.out.println("\n" +getClass().getName()+"(" + name + "," + nMaxPasajeros + ");");

        System.out.println("\nEstado inicial:");

        System.out.println("Esatdo Wifi: " + wifiEncendido);
        System.out.println("Esatdo Aire: " + aireAcondicionadoActivado);
        System.out.println("Pos x: " + localizacionX);
        System.out.println("Pos y: " + localizacionY);
        System.out.println("Esatdo Motor: " + motorEncendido);
        System.out.println("En marcha " + isEnMarcha());
        System.out.println("Cantidad Pasajeros: " + nPasajeros);
        System.out.println("Cantidad Max Pasajeros: " + nMaximoPasajeros);

        System.out.println("\nEstado del hijo:");
    }
}
