import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = s.nextInt();
        }

        int contador = 0, suma = 0;

        for (int i = vector.length; i >= 0; i--) {

            for (int j = 0; j < i; j++) {

                suma = 0;

                for (int k = j; k < i; k++) {
                    suma += vector[k];  
                }

                if(suma < 0) {

                    contador++; 
                }

            }
        }

        System.out.println(contador);


    }
}
