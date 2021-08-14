package M1;

public class Condicionales  extends Object{

    //if
    //boolean: false verdero;
    boolean isTrue = true;
    int a = 1; //dato primitivo
    Integer a1 = 1; //objeto
    //contructor
    //publico siempre y lleva el mismo nombre de la clase, y se puede sobrecargar
    public Condicionales(){
    
    } 
    public Condicionales(boolean platoListo){
        PlatoListo = platoListo;
    } 
    
    

    private static boolean AguaHirviendo;

    private static boolean PlatoListo;

    //setter //cambia el estado de esa variable
    //getter // mi plato ya esta listo?? si ya esta listo, aun no , ya sale
    public static void setPlatoListo(boolean PlatoListo) {

        /*podrian cambiar*/
        Condicionales.PlatoListo = PlatoListo;
    }

    private static boolean Encendida;

    public boolean isIsEncendida() {
        return Encendida;
    }

    public void setIsEncendida(boolean isEncendida) {
        Encendida = isEncendida;
    }

    public static void main(String args[]) {

        // if (condicion: booleano ) 
        //si verdadero
        //   else    
        //si falso
        //<editor-fold defaultstate="collapsed" desc="Condicionales">
        Condicionales obj = new Condicionales();
        if (obj.isTrue) {
            //cuando es verdadero
            System.out.println("Es True");
        } else {
            //cuando la condicion no se cumplio
            System.out.println("Es False");
        }

        //mientras  este lloviendo me pongo a ver television mientras escampa
        //pero si no esta lloviendo salgo a comprar al tienda
        //si esta llovisnando , entonces use na chaqueta y slaga a la tienda
        boolean estaLloviendo = false;
        boolean estaLloviznando = false;

        // while( condicion"bolenano){
        //ejecute las acciones
        //    }
        if (estaLloviendo == true) {
            System.out.println("Ver Television");
        } else {
            System.out.println("salgo a la tienda");
        }
        //while

        //mientras  este lloviendo me pongo a ver television mientras escampa
        //pero si no esta lloviendo fuerte  salgo a comprar al tienda
        //USANDO una chaqueta
        while (estaLloviendo == true) { // estaLloviendo!=true | !estaLloviendo no esta lloviendo

            if (estaLloviendo) { //fuerte
                //obj.verTelevision();
                System.out.println("Ver Television");
            }
            if (estaLloviznando) { //lluvia leve
                System.out.println("usar chaqueta");
                System.out.println("salgo a la tienda");
                break; /// el break me permite salir del ciclo while a pesar
                //de la condicion siguen siendo verdadera
            }
        }

        //for  para
        //for (inicializador, condicion, incremento)
        for (int i = 0; i < 10; i++) { //va para adelante
            System.out.println(i);
        }
        //imprima los numero del 9 a la 0
        for (int i = 9; i >= 0; i--) { //va para adelante
            System.out.println(i);
            /*9
            8
            7
            6
            ....
             */
        }
        //do while  = haga esto, y luego evalue lo que estan while y si esta verdadero
        // siga haciendo esto

        //encuentre un valor que multiplicado por 5 me de 80
        int valor = 5;
        int resultado = 0;
        int contador = 1;

        do {
            //esto
            resultado = valor * contador;
            contador++;

        } while (resultado != 80);

        //switch( condicione:estado de una variable)
        //  case "1": break
        //  case "2": break
        // default: break;
        //un ascensor tiene unos comandos, de acuerdo al boton que presione
        //difirigirme al piso correspondiente
        int boton = -1;

        switch (boton) {
            case 1:
                /*ir la piso 1*/
                break;
            case 2:
                /*ir la piso 2*/
                break;
            case -1:/*sonaria la sirena*/
            default:
                break;
        }

        if (boton == 1) {/*ir la piso 1*/
            System.out.println(" ir al piso 1");
        } else if (boton == 2) {
            System.out.println(" ir al piso 2");
        } else if (boton == -1) {
            System.out.println("sonar la sirena");
        } else {
            System.out.println("no haga nada");
        }

//        AND && //los dos deben ser verdaderos para que el resultado sea verdadero
//        0   0  0
//        0   1  0
//        1   0  0
//        1   1  1
        //si esta lloviznando puedo salir pero debo ponerme la chaqueta 
        boolean puestaChaqueta = true;
        if (estaLloviznando == true && puestaChaqueta == true) {

            System.out.println("puedo salir");
        } else {
            if (!estaLloviznando) { //si no esta llovisnando esta aun lloviendo fuerte
                System.out.println("aún llueve fuerte");
            } else if (!puestaChaqueta) {
                System.out.println("ponte la chaqueta");
            }
        }
        //</editor-fold>

        //metodos 
        //receta
        //ingredientes
        //procesos
        //estados
        //ingredinete principal
        //ingredinetes secundarios
        //aliñós - 
        //procedimientos
        //persona prepara una receta
        //perosna es una obj de la clase Persona
        //receta es un obj de la clase Receta
        //ingrediente es un obj de la clase Ingrediente
        if (Condicionales.EncenderOrnilla(1, 5) == true) {
            //pasos siguienes
            //poner la ola
            //con la olla puesta poner el aguar
            //cuando el agua esta caliente - medimemos la tempaerura 
            //agreamos el ingrediente necesario

            //el plato esta listo
        }

    }

    //la estructura del metodo
    //modificador de acceso. quien puede ver este metodo public , protected, private ,
    //[tipoRetorno]  lo que devuelo, que puede voin (nada) o un objeto o un primitivo
    // [modificador] [instancia] [tipoRetorno]  nombreDelMetodo ( argumentos)  //firma 
    //suma(int,int) esta es la firma
    //suma(float,float)
    public static int Suma(int a, int b) {
        return a + b;
    }

    public static int Multiplicar(int a, int b) {
        return a * b;
    }

    public static float Multiplicar(int na, float nb) {
        return na * nb;
    }

    /**
     * Me devuelve la instensada de la flama en un float
     *
     * @param aire cantidad de aire en m3
     * @param combustible cantidad de combustible en m3
     * @return intensidad de la flama
     */
    /**
     * Inicia la combustion , con los parametros indicados
     *
     * @param aire
     * @param combustible
     * @return la flama
     */
    private static float Combustion(float aire, float combustible) {
        return aire * combustible;
    }

    static boolean[] estadoOrnillas = new boolean[4];

    /**
     * Enciende la ornilla con la intesidad deseada
     *
     * @param puesto
     * @param intensidad
     * @return si se encendio
     */
    public static boolean EncenderOrnilla(int puesto, int intensidad) {

        if (!Encendida) {
            Encendida = !Encendida; //si esta apagada enciendala
            double n = Math.sqrt(intensidad);
            float flama = Combustion((float) n, (float) n);
            if (flama > 0) {
                estadoOrnillas[puesto - 1] = true; //establesco el estado de la ornilla
                return true;
            } else {
                return false;
            }

        }
        return Encendida; //ya esta encendida no hago nada mas
    }

    @Override
    public String toString() {
        return "El valor del objeto es : "+this.toString();
    }
    //sobreesctura de metodos

}
