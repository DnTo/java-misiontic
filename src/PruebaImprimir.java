
import java.util.Arrays;
import java.util.Scanner;

public class PruebaImprimir {

    public static void main(String args[]) {

        char[][] triqui = new char[3][3];

        //llenar el triqui con los numeros
        int posicion = 49;
        for (int i = 0; i < triqui.length; i++) {
            for (int j = 0; j < triqui.length; j++) {
                triqui[i][j] = (char) posicion;
                posicion++;
            }
        }

        //aca muestro como imprimir el tablero y como se puede usar Array
        //para simplificarlo
        /*
            for (char[] cs : tablero) {
            System.out.println(Arrays.toString(cs));
        }*/
        //Veamos como quedo la matriz
        imprimirTablero(triqui);

        System.out.println("Quien arranca? [X] o [O[");
        Scanner in = new Scanner(System.in);
        char turno = in.next().toUpperCase().charAt(0);

        System.out.println("   Arrancan las " + turno);

        while (esJuegoEnLinea(triqui) == false) {

            //debo verificar si la posicion esta ocupada, y sino
            //entonces marco la casilla con el turno de lo contrario debo volver
            //a perdi una casilla hasta que sea correcta y se pueda asignar
            boolean casillaDisponible = true;

            while (casillaDisponible == true) { //osea que ya la pude ocupar

                System.out
                        .println("  Es tu turno ["
                                + turno + "].\nElige tu posicion en el tablero");

                imprimirTablero(triqui);
                char posicionElegida = in.next().charAt(0);

                for (int i = 0; i < triqui.length; i++) {
                    for (int j = 0; j < triqui.length; j++) {

                        if (triqui[i][j] == posicionElegida) {
                            triqui[i][j] = turno;
                            casillaDisponible = false;
                            break; // con esto salimos del ciclo for
                        }
                    }
                }
                if (casillaDisponible == true) {
                    System.out.println("Esa casilla no esta disponible, elige otra por favor...");
                }

            }

            //con esto cambiamos el turno
            if (Character.toUpperCase(turno) == 'X') {
                turno = 'O';
            } else {
                turno = 'X';
            }

        }

        System.out.println("Ganaste");
    }

    /**
     * Determina si en el tablero ya se dio un tres en linea
     *
     * @param tablero
     * @return
     */
    public static boolean esJuegoEnLinea(char[][] tablero) {

        //evaluamos los casos
        if (caso3(tablero)) {
            return true;
        }
        return false;
    }

    public static boolean caso1(char[][] tablero) {
        /*
      caso 1:
      | X |   |  | 
      |   | X |  |
      |   |   | X|
        
              
      | (0,0) |(0,1) |(0,2) | 
      | (1,0) |(1,1) |(1,2) |
      | (2,0) |(2,1) |(2,2) |
         */
        char anterior = tablero[0][0];
        for (int i = 0; i < tablero.length; i++) {
            if (anterior != tablero[i][i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean caso3(char[][] tablero) {
        /*
      caso 3:
      | X |   |  | 
      | X |   |  |
      | X  |  |  |
        
              
      | (0,0) |(0,1) |(0,2) | 
      | (1,0) |(1,1) |(1,2) |
      | (2,0) |(2,1) |(2,2) |
         */
        char anterior = tablero[0][0];
        for (int i = 0; i < tablero.length; i++) {
            if (anterior != tablero[i][0]) {
                return false;
            }
        }
        return true;
    }

    public static void imprimirTablero(char[][] tablero) {

        for (char[] cs : tablero) {
            System.out.println(Arrays.toString(cs));
        }
    }
}
