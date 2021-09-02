package M1.Reto2v1;

public class Jugador extends Personaje {

    //              ^ (Jugador hereda de Personaje)
    //Inserte acá los atributos
    private int numeroBotiquines = 0;

    //Inserte acá el método constructor
    public Jugador(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void usarBotiquin() {
        if (this.getNumeroBotiquines() > 0) {
            if (this.getVida() + 5 > 100) {
                this.setNumeroBotiquines(this.getNumeroBotiquines() - 1);
                //this.setVida(100);
            } else {
                this.setNumeroBotiquines(this.getNumeroBotiquines() - 1);
            }
            this.setVida(this.getVida() + 5);
        }
    }

    public void recogerBotiquin() {
        this.numeroBotiquines = this.numeroBotiquines + 1;
    }

    public void moverDerecha(double d) {
        this.setPosicionX(this.getPosicionX() + d);
    }

    public void moverIzquierda(double d) {
        this.setPosicionX(this.getPosicionX() - d);
    }

    public void moverArriba(double d) {
        this.setPosicionY(this.getPosicionY() + d);
    }

    public void moverAbajo(double d) {
        this.setPosicionY(this.getPosicionY() - d);
    }

    public void golpear(Enemigo p) {
        p.recibirImpacto(this.getDamage() / this.calcularDistanciaRespectoPersonaje(p));

        p.evolucionar();
    }

    public int getNumeroBotiquines() {
        return this.numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }

}
