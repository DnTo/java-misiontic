package M1.Reto2v1;

public class Enemigo extends Personaje {

    //              ^ (Enemigo hereda de Personaje)
    //Inserte acá los atributos
    private int evolucionesAplicadas = 0;
    private int resistencia = 1;

    //Inserte acá el método constructor
    public Enemigo(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void evolucionar() {
        if (this.getVida() <= 30 && this.evolucionesAplicadas == 0) {
            this.setDamage(this.getDamage() + 20);
            this.evolucionesAplicadas = this.evolucionesAplicadas + 1;
        }
        if (this.getVida() <= 10 && this.evolucionesAplicadas == 1) {
            this.resistencia = this.resistencia + 1;
            this.evolucionesAplicadas = this.evolucionesAplicadas + 1;
        }
    }

    /* original
        @Override
    public void recibirImpacto(double d) {
        if (this.getVida() - d / this.resistencia < 0) {
            this.setVida(0);
        } else {
            this.setVida(this.getVida() - d / this.resistencia);
        }
    }
     */
    @Override
    public void recibirImpacto(double d) {
        double dano = d / resistencia;
        if (getVida() > dano) {
            setVida(getVida() - dano);
        } else {
            setVida(0);
        }
    }

    //Inserte acá los SETTERS Y GETTERS
    public int getEvolucionesAplicadas() {
        return this.evolucionesAplicadas;
    }

    public void setEvolucionesAplicadas(int evolucionesAplicadas) {
        this.evolucionesAplicadas = evolucionesAplicadas;
    }

    public int getResistencia() {
        return this.resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

}
