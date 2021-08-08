package reto1;

/**
 *
 * @author danto
 */
public class Autobus {

    //<editor-fold defaultstate="collapsed" desc="Properties">
    private String nombreConductor;
    private int nPasajeros;
    private double cantidadDinero;
    private int nMaximoPasajeros;
    private double localizacionX;
    private double localizacionY;
    private boolean puertaAbierta;
    private boolean aireAcondicionadoActivado;

    private boolean motorEncendido;
    private boolean wifiEncendido;
    private boolean enMarcha;
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Ctor">
    public Autobus(String nomConducor, int nMaxPasajeros, boolean puertaAbierta) {
        this.nombreConductor = nomConducor;
        this.nMaximoPasajeros = nMaxPasajeros;
        this.puertaAbierta = puertaAbierta;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Methods">
    
    /**
     * Recoge un pasajero, y le cobra segun si estrato, ademas no puede hacerlo
     * si la puerta esta cerrada o el autobus esta en movimiento. No puede
     * recoger mas del maximo de pasajeros que tiene definidos.
     *
     * @param estrato de 1 a 6, consultar tabla de tarifas
     */
    public void recogerPasajero(int estrato) {
        if (puertaAbierta && !enMarcha) {
            if (nPasajeros == nMaximoPasajeros) {
                return;
            }
            cantidadDinero += (double) estrato < 3 ? 1500 : estrato < 5 ? 2600 : 3000;
            nPasajeros++;
        }
    }

    /**
     * Decrementa el numero de pasajeros, solo si no esta en marcha y esta la
     * puerta abierta
     */
    public void dejarPasajero() {
        if (puertaAbierta && !enMarcha) {
            nPasajeros--;
        }
    }

    /**
     * Calcula y devuelvela distancia al centro de acopio (0,0)
     *
     * @return la distancia en double
     */
    public double calcularDistanciaAcopio() {
        double distancia = Math
                .sqrt(Math.pow(localizacionX, 2) + Math.pow(localizacionY, 2));
        return distancia;
    }

    /**
     * Si el autobus esta parado cambia el estado de la puerta
     */
    public void gestionarPuerta() {
        if (!enMarcha) {
            puertaAbierta = !puertaAbierta;
        }
    }

    /**
     * Si el motor esta encendido cambia el estado del aire
     */
    public void gestionarAireAcondicionado() {
        if (motorEncendido) {
            aireAcondicionadoActivado = !aireAcondicionadoActivado;
        }
    }

    /**
     * si el motor esta encendido lo apagaga junto con el wifi e aire si esta
     * apagado lo enciende
     */
    public void gestionarMotor() {
        if (!motorEncendido) {
            motorEncendido = true;

        } else {
            motorEncendido = false;
            wifiEncendido = aireAcondicionadoActivado = false;
            enMarcha = false;
        }

    }

    /**
     * Si el motor esta encendido cambia el estado del wifi
     */
    public void gestionarWifi() {
        if (motorEncendido) {
            wifiEncendido = !wifiEncendido;
        }
    }

    /**
     * Si el motor esta encendido puede iniciar o detener la marcha
     */
    public void gestionarMarcha() {
        if (motorEncendido && !puertaAbierta) {
            enMarcha = !enMarcha;
        }
    }

    /**
     * Se mueve en la direccion en Kms
     *
     * @param d los kms que se mueve
     */
    public void moverDerecha(double d) {
        if (enMarcha) {
            localizacionX += d;
        }
    }

    /**
     * Se mueve en la direccion en Kms
     *
     * @param d los kms que se mueve
     */
    public void moverIzquierda(double d) {
        if (enMarcha) {
            localizacionX -= d;
        }
    }

    /**
     * Se mueve en la direccion en Kms
     *
     * @param d los kms que se mueve
     */
    public void moverArriba(double d) {
        if (enMarcha) {
            localizacionY += d;
        }
    }

    /**
     * Se mueve en la direccion en Kms
     *
     * @param d los kms que se mueve
     */
    public void moverAbajo(double d) {
        if (enMarcha) {
            localizacionY -= d;
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getters y setters">
    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }

    public void setLocalizacionY(double localizacionY) {
        this.localizacionY = localizacionY;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

    public void setAireAcondicionadoActivado(boolean aireAcondicionadoEncendido) {
        this.aireAcondicionadoActivado = aireAcondicionadoEncendido;
    }

    public boolean isAireAcondicionadoActivado() {
        return aireAcondicionadoActivado;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this.wifiEncendido = wifiEncendido;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public int getnMaximoPasajeros() {
        return nMaximoPasajeros;
    }

    public double getLocalizacionX() {
        return localizacionX;
    }

    public double getLocalizacionY() {
        return localizacionY;
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public boolean isWifiEncendido() {
        return wifiEncendido;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    //</editor-fold>
}
