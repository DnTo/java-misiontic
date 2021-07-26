
import java.util.Arrays;
import java.util.Collections;

public class Vectores {

    public static void main(String args[]) {
        int[] arregloEnteros = new int[5];

        arregloEnteros[0] = 1; //2
        arregloEnteros[1] = 2; //4
        arregloEnteros[2] = 3; //6
        arregloEnteros[3] = 4; //8
        arregloEnteros[4] = 5; //10

        for (int i = 0; i < arregloEnteros.length; i++) {
            //      System.out.println( arregloEnteros[i]);
        }

        for (int i = arregloEnteros.length - 1; i >= 0; i--) {
            //    System.out.println(arregloEnteros[i]);
        }

        for (int i = arregloEnteros.length - 1; i >= 0; i--) {
            //    arregloEnteros[i] = arregloEnteros[i]*2;
            //    System.out.println(arregloEnteros[i] );
        }

        //ej2
        /*
         ejercicio 2
        La función sumaPares recibe c
         omo parámetro un vector de números enteros,
         su trabajo será retornar la suma de los números 
         PARES POSITIVOS que hay en el vector dado.
        
         */
        int suma = 0;
        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] >= 0 && arregloEnteros[i] % 2 == 0) {
                suma = suma + arregloEnteros[i];
            }

        }
        //  System.out.println(suma);
        /*
        e4
         La primera mitad de los valores deben estar ordenados ascendentemente
            La segunda mitad de los valores deben estar ordenados descendentemente
             int [] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
         */
        int[] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};

        for (int i = 0; i < vectorEntrada.length; i++) {
            //  System.out.println(vectorEntrada[i]);
        }
        //    System.out.println("Vector original");
        //   System.out.println(Arrays.toString(vectorEntrada));
        //          System.out.println("Vector ordendo");
            Arrays.sort(vectorEntrada,0,4);

        //vamos a recorrerlo de atras hacia adelante
        int[] arregloAuxiliar = new int[vectorEntrada.length / 2];

        int i = vectorEntrada.length - 1;
        for (int j = 0; j < arregloAuxiliar.length; j++) {
            arregloAuxiliar[j] = vectorEntrada[i];
            i--;
        }

        Arrays.sort(arregloAuxiliar);

      //  System.out.println(Arrays.toString(arregloAuxiliar));

      //  System.out.println(Arrays.toString(vectorEntrada));
        int k = arregloAuxiliar.length - 1;
        for (int j = vectorEntrada.length / 2; j < vectorEntrada.length; j++) {
            vectorEntrada[j] = arregloAuxiliar[k];
            k--;
        }

      //  System.out.println(Arrays.toString(arregloAuxiliar));
      //  System.out.println(Arrays.toString(vectorEntrada));
        
        
        int[] vectorEntrada2 = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        Arrays.sort(vectorEntrada2,0,4);
        
        Integer[] auxiliar = new Integer[vectorEntrada2.length];
        
        for (int j = 0; j < vectorEntrada2.length; j++) {
            auxiliar[j] = vectorEntrada2[j];
        }
        
        System.out.println(Arrays.toString(auxiliar));
        Arrays.sort(auxiliar,5,10,Collections.reverseOrder());
        System.out.println(Arrays.toString(auxiliar));
        
        

        //  System.out.println(Arrays.toString(vectorEntrada));
      //  int[] vector2 = new int[]{1, 2, 3, 4, 5, 6, 7};
        //  System.out.println(Arrays.toString(vector2));
    }

    public static int Algo(int a) {
        return a;
    }

}
