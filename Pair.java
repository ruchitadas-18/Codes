import java.util.Arrays;

public class Pair {
    static int[] insertSort(int a[], int n){
        if (n <= 1)                             
        {
            return a; 
        }

        insertSort( a, n-1 );        
       
        int last = a[n-1];                        
        int j = n-2;                          
       
        while (j >= 0 && a[j] > last){                 
            a[j+1] = a[j];                         
            j--; 
        }
        a[j+1] = last;   
        return a;
    }
    static int[][] evenPair(int a[], int n){
        int b[][] = new int[n/2][2];
        for(int i=0; i<n/2; i++){
            b[i][0]=a[i];
            b[i][1]=a[(n-i)-1];
            
        }
        return b;
    }
    static int[][] oddPair(int a[], int n){
       int b[][] = new int[n/2][2];
       int m = n/2;
        for(int i=0; i<n/2+1; i++){
            b[i][0]=a[i];
            b[i][1]=a[(n-i)-1];

            if(i==m){
                b[i][0]=a[i];
                b[i][1]=0;
            }
        }
        return b;
    }
    public static void main(String[] args){
        int a[]={1,4,5,7,3,15,9};
        int n= a.length;
        insertSort(a,n);
        int c[][]= new int [n][2];

        if(n%2==0){
            c=evenPair(a,n);
            // System.out.println(c);
             for(int[] row : c){
                System.out.println(Arrays.toString(row));
            }
        }else{

            c=oddPair(a,n);
            // System.out.println(Arrays.toString(c));
            for(int[] row : c){
                System.out.println(Arrays.toString(row));
            }
        }
    }
}
