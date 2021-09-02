package M1.Reto2v1;

public class Main {

    public static void main(String[] args) {

        Jugador j = new Jugador("Explorador", 'm', 0.0, 5.0, 100.0);
        Enemigo e = new Enemigo("Bitter", 'f', 0, 0, 80);
        System.out.println("1");
        imprimir(j, e);
        //2
        System.out.println("2");
        j.golpear(e);
        j.golpear(e);
        j.moverDerecha(10);
        j.moverAbajo(5);

        imprimir(j, e);
        /*3El enemigo golpea al jugador 2 veces, por lo que la vida del jugador sería 
 el jugador recoge un botiquin:*/
        System.out.println("3");
        e.golpear(j);
        e.golpear(j);
        j.recogerBotiquin();

        imprimir(j, e);
        //4
        System.out.println("4");
        j.usarBotiquin();
        j.usarBotiquin();
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
        imprimir(j, e);
        //5
        System.out.println("5");
        e.golpear(j);
        e.golpear(j);
        imprimir(j, e);
        //6
        System.out.println("6");
        j.golpear(e);
        j.golpear(e);
        imprimir(j, e);
        //7
        System.out.println("7");
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
        imprimir(j, e);
        imprimir(j, e);

    }

    public static void imprimirJugador(Jugador p) {
        System.out.println("Nombre " + p.getNombre());
        System.out.println("sexo " + p.getSexo());
        System.out.println("posicionX " + p.getPosicionX());
        System.out.println("posicionY " + p.getPosicionY());
        System.out.println("damage " + p.getDamage());
        System.out.println("vida " + p.getVida());
        System.out.println("botiquines " + p.getNumeroBotiquines());
    }

    public static void imprimirEnemigo(Enemigo p) {
        System.out.println("Nombre " + p.getNombre());
        System.out.println("sexo " + p.getSexo());
        System.out.println("posicionX " + p.getPosicionX());
        System.out.println("posicionY " + p.getPosicionY());
        System.out.println("damage " + p.getDamage());
        System.out.println("vida " + p.getVida());
        System.out.println("evolucones " + p.getEvolucionesAplicadas());
        System.out.println("resittencia " + p.getResistencia());
    }

    public static void imprimir(Jugador j, Enemigo e) {
        imprimirJugador(j);
        System.out.println("");
        imprimirEnemigo(e);
        System.out.println("_________________________________");
    }
}
