import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b[] = new int[a];
        for(int i=0; i<a; i++){
            b[i]=sc.nextInt();
        }
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i=0;i<a;i++){
            sum += b[i];
            max = Math.max(sum,max);
            
            if(sum<0) sum = 0;
        }
        
        System.out.println(max);
    }
}
