package M1.Reto2v1;

public class Personaje {

    //Inserte acá los atributos
    private double vida = 100;
    private String nombre;
    private char sexo;
    private double posicionX;
    private double posicionY;
    private double damage;

    //Inserte acá el método constructor
    public Personaje(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.damage = damage;
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void golpear2(Personaje p) {
        p.recibirImpacto(this.damage / this.calcularDistanciaRespectoPersonaje(p));
        p.setVida(p.getVida() - (this.damage / this.calcularDistanciaRespectoPersonaje(p)));

        p.recibirImpacto(p.damage / this.calcularDistanciaRespectoPersonaje(p));
    }

    /** ESTE CAMBIO
     * Resta 𝑑𝑎𝑚𝑎𝑔𝑒/𝑑 al atributo vida del personaje p, donde 𝑑 es la
     * distancia entre el personaje que invoca el método y el personaje p
     * @param p el Personaje a golpear
     */
    public void golpear(Personaje p) {

        double dano = this.damage / this.calcularDistanciaRespectoPersonaje(p);
        //p.recibirImpacto(this.damage / this.calcularDistanciaRespectoPersonaje(p));
        p.setVida(p.getVida() - dano);

      //  p.recibirImpacto(p.damage / this.calcularDistanciaRespectoPersonaje(p));
    }

    public void recibirImpacto(double d) {
        if (this.vida - d < 0) {
            this.vida = 0;
        } else {
            this.vida = this.vida - d;
        }
    }

    public double calcularDistanciaRespectoPersonaje(Personaje p) {

        //double X_personaje = p.getposicionX();
        //double Y_personaje = p.getPosicionY();
        //double distanciaX = x_personaje - posicionX;
        //double distanciaY = y_personaje - posicionY;
        //return  Math.sqrt((Math.pow(distanciaX, 2)) + Math.pow(distanciaY, 2));
        double distancia
                = Math.sqrt(Math
                        .pow(p.getPosicionX() - this.posicionX, 2)
                        + Math.pow(p.getPosicionY() - this.posicionY, 2));
        return distancia;
    }

    //Inserte acá los SETTERS Y GETTERS
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPosicionX() {
        return this.posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return this.posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public double getDamage() {
        return this.damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getVida() {
        return this.vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

}
