import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class JavaApplication1 {

    public static void main(String[] args) {
        int[] vector = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        Integer[] arr = new Integer[vector.length];
        
              
        Arrays.setAll(vector, (int i) -> arr[i] = vector[i]);

        int len = vector.length; 
        int middle = (len % 2 == 0) ? len / 2 : len / 2 - 1;
        Arrays.sort(arr, 0, middle); //
        Arrays.sort(arr, middle, len, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));

        Arrays.setAll(arr, i -> vector[i] = arr[i]);
        //  System.out.println(Arrays.toString(vectorEntrada));
        //    return vector;

        char[] vector6 = {' ', 'P', 'r', 'o', ' ', 'g', 'r', 'a', ' ', 'm', 'a', 'r'};
  
        System.out.println(new String(vector6));
      
        String result= new String();
        for (char c : vector6) {
            result+=c;
        }
        System.out.println(result);

        result = "";
        for (char c : vector6) {
            result += c;
        }
               
        System.out.println();
        System.out.println(result);
        result = "";
        for (int i = 0; i < vector6.length; i++) {
            result = result + vector6[i];
        }
        System.out.println(new String(result));

        int[] v1 = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};

        int[] v2 = {0, -2, 1, 9, 4, 78, 12, 11, 90, 13};
        
      
                

        int[] s = new int[v2.length];

        for (int i = 0; i < v1.length; i++) {
            s[i] = v1[i] + v2[i];
        }

        Arrays.setAll(v1, i -> s[i] = v1[i] + v2[i]);

        //mean
        int[] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};
        float mean = 0f;
        for (int n : vectorEntrada) {
            mean += n;
        }
        mean /= vector.length;

        //sumaPares
        int[] vectorEntradaPares = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};
        int suma = 0;
        for (int n : vectorEntradaPares) {
            suma += n % 2 == 0 && n > 0 ? n : 0;
        }

        //factorial
        Scanner sc = new Scanner(System.in);
        try {
            long fact = 1l;
            long num = sc.nextInt();
            while (num != 1) {
                fact *= num;
                num--;
            }
            System.out.println(fact);
        } catch (Exception e) {
            System.out.println(e);
        }
        //   System.out.println(num);

    }
}
