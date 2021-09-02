
package M1.Reto3v1;


public class BotonHeredado extends Boton {
    
    private String diagonal;

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }
    
    @Override
    public void hacerClick(){
        super.setTexto("Hello World!");
//        System.out
//       .println("posiciono donde quiero");
//       this.hacerClickComoPadre();
    }
    
    @Override
    public void hacerClickComoPadre(){
        System.out.println("ya mi papa no sabe hacer click");
    }
    
    
    
}
