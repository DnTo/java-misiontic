package oop;

public class TV extends DispositivoElectronico {

    int tamanoPantalla;
    int resolucion;
    int capacidadMemoria;
    int puertosUsb;
    int puertoHDMI;
    int audioOptico;
    String os;

    String marca;
    String modelo;

    String versionHW;

    private String versionSW;

    public String getVersionSW() {
        return versionSW;
    }

    public boolean setVersionSW(String firmware) {
        //verificar si el firmware es corrende a este tv
       // if(esCorrecto)
        try {
               actualizarSWxUSB(firmware); 
               //reinicie
               //algun otro proceso
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    String sintonizador;
/*
    public void EncenderTV() {
            super.encender();
    }

    public void ApagarTV() {
            super.apagar();
    }*/

    /**
     * Me permite cambiar el canarl hacia arriba o hacia abajo,
     *
     * @param haciaArriba Si viene en true es hacia arriba y si viene en False
     * es hacia abajo
     */
    public void CambiarCanal(boolean haciaArriba) {
        //si el tv en esta encendido
    }


    public void CambiarCanal(int canalDeseado) {
        //estyo en que canal? si ya estyo en el canal deseado
    }

    public void AbrirAplicacion() {
    }

    private void cambiarCanal(boolean esArriba, boolean esAbajo, int canal) {
        ///interactuar con el sintonizador
    }

    private void actualizarSWxUSB(string firmware) {
    }

    private void actualizarSWxWifi(string firmware) {
    }

}
