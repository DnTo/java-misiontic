package reto3.v3;

public abstract class Asiento {

    //<editor-fold defaultstate="collapsed" desc="properties">
    private char tipo;
    private String ID;
    private boolean pantallaEncendida;
    private double inclinacionSilla = 90.0;
    private boolean luzLecturaEncendida;
    private boolean luzAsistenciaEncendida;
    private boolean aireAcondicionadoEncendido;
    
    private double maxInclinacion = 135.0;
    private double minInclinacion= 0.0;
//</editor-fold>

    //methods
    /**
     * Creamos un nuevo asiento, con su i dentificador y el tipo de asiento
     *
     * @param tipo
     * @param ID
     */
    public Asiento(String ID,char tipo ) {
        this.tipo = tipo;
        this.ID = ID;
    }

    public void gestionarAireAcondicionado() {
        this.aireAcondicionadoEncendido
                = !this.aireAcondicionadoEncendido;
    }

    /**
     * Si la pantalla está apagada, la enciende, y si la pantalla está
     * encendida, la apaga
     */
    public void gestionarPantalla() {
        this.pantallaEncendida = !this.pantallaEncendida;
    }

    /**
     * Si la luz de asistencia está apagada, 
     * la enciende, y si la luz de
     * asistencia está encendida, la apaga
     */
    public void gestionarLuzLectura() {
        this.luzLecturaEncendida = !this.luzLecturaEncendida;
    }

    public void gestionarLuzAsistencia() {
        luzAsistenciaEncendida=!luzAsistenciaEncendida;
    }

    public void aumentarInclinacion(double i) {
      // \_
      //inclinacionSilla = 90.0;
      this.inclinacionSilla +=i;
      if(inclinacionSilla>maxInclinacion) 
          this.inclinacionSilla = maxInclinacion;
      
    }

    public void disminuirInclinacion(double i) {
   //   /_
        this.inclinacionSilla-=i;
        //solo llega hasta 0
        if(inclinacionSilla<0)  inclinacionSilla = 0;
    }

    public abstract String imprimirMenuPantalla();

    //<editor-fold defaultstate="collapsed" desc="g&s">
    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public boolean isPantallaEncendida() {
        return pantallaEncendida;
    }

    public void setPantallaEncendida(boolean pantallaEncendida) {
        this.pantallaEncendida = pantallaEncendida;
    }

    public double isInclinacionSilla() {
        return inclinacionSilla;
    }

    public void setInclinacionSilla(double inclinacionSilla) {
        this.inclinacionSilla = inclinacionSilla;
    }

    public boolean isLuzLecturaEncendida() {
        return luzLecturaEncendida;
    }

    public void setLuzLecturaEncendida(boolean luzLecturaEncendida) {
        this.luzLecturaEncendida = luzLecturaEncendida;
    }

    public boolean isLuzAsistenciaEncendida() {
        return luzAsistenciaEncendida;
    }

    public void setLuzAsistenciaEncendida(boolean luzAsistenciaEncendida) {
        this.luzAsistenciaEncendida = luzAsistenciaEncendida;
    }

    public boolean isAireAcondicionadoEncendido() {
        return aireAcondicionadoEncendido;
    }

    public void setAireAcondicionadoEncendido(boolean aireAcondicionadoEncendido) {
        this.aireAcondicionadoEncendido = aireAcondicionadoEncendido;
    }
//</editor-fold>

}
