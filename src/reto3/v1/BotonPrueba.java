
package reto3.v1;

/**
 *
 * @author danto
 */
public class BotonPrueba extends Boton {

    public BotonPrueba(double ancho, double alto, String cf, String ct, String t) {
        super(ancho, alto, cf, ct, t);
    }
    
    @Override
    public void hacerClick() {
        super.setTexto("Hello World!");
    }
    
}
