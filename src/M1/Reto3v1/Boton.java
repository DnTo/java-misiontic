

package M1.Reto3v1;

public abstract class Boton {
    
    //<editor-fold defaultstate="collapsed" desc="properties">
    public double ancho;
    private double alto;
    
    private String colorFondo;
    private String colorTexto;
    private String texto;
//</editor-fold>

   
    public Boton(){
        this.alto = 10;
        this.ancho = 20;
    }
    public Boton(double ancho){
    }
    
    //contructor
    public Boton(double ancho
            ,double alto
            , String colorFondo
            ,String colorTexto
            ,String texto){
    }
            
    
    public abstract void hacerClick();
    
    public void hacerClickComoPadre(){
        System.out
    .println("soy el padre haciendo lcik");
    }
    
    public static void Saludar()
    {
        System.out.println("Hola");
    }
    
    
     //<editor-fold defaultstate="collapsed" desc="g&s">
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
//</editor-fold>
    
}
