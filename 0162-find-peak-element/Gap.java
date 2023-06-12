import java.util.*;

public class Gap {
    //bring the - in front
    /* 
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String a=sc.nextLine();

        String gap_str = " ";
        String letter = " ";

        for(int i=0; i<a.length(); i++){
            char ch = a.charAt(i);
            if(ch == '-'){
                gap_str += String.valueOf(ch);
            }else{
                letter += Character.toString(ch);
            }
        }
        System.out.print(gap_str + letter);
    }

    public static void main(String[] args){
        int a[] = {1,2,3,4,5};
        int n = a.length;
        int d= 2, k=0;
        int b[]=new int[n];

        for(int i=d; i<n ; i++){
            b[k++]=a[i];
        }

        for(int i=0; i<d; i++){
            b[k++]=a[i];
        }

        for(int i=0; i<n; i++){
            System.out.println(b[i]);
        }
    }
    */
    public static void subArray(int [] a,int start, int end){
        for(int i=start; i<=end; i++){
            int temp = a[i];
            a[i] = a[end-1];
            a[end]=temp;
            end--;
        }
    }
    public static void main(String[] args){
        int a [] ={1,2,3,4,5};
        int d = 2;
        int n = a.length;
        rotate(a,d,n);
    }
    public static void rotate(int [] a, int d, int n){
        int diff = n-d;
        subArray(a,0,d-1);
        subArray(a,diff-1,n-1);
        subArray(a,0, n-1);
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }

}
