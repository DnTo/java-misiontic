package reto3.v1;

/**
 *
 * @author danto
 */
public abstract class Boton {

//<editor-fold defaultstate="collapsed" desc="properties">
    private double ancho;
    private double alto;
    private String colorFondo;
    private String colorTexto;
    private String texto;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="geeter setters">
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public String getColorTexto() {
        return colorTexto;
    }

    public void setColorTexto(String colorTexto) {
        this.colorTexto = colorTexto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public abstract void hacerClick();

//</editor-fold>
    public Boton(double ancho, double alto, String cf, String ct, String t) {
        this.alto = alto;
        this.ancho= ancho;
        this.colorFondo = cf;
        this.colorTexto = ct;
        this.texto = t;
        
        this.toString();
    }

    @Override
    public String toString() {
        return "Boton{" + "ancho=" + ancho + ", alto=" + alto + ", colorFondo=" + colorFondo + ", colorTexto=" + colorTexto + ", texto=" + texto + '}';
    }

}
