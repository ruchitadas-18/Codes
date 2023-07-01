public class recursion {
    /* 
    public static void main(String [] args){
        int n =5;
        int [] arr = {5,4,3,2,6};
        print(n, arr);
    }
    
    public static void print(int n, int []arr){
        int end = n-1;
        int start = 0;
        reserve(arr, start, end);

        for(int i=start; i<end;i++){
            System.out.print(" "+arr[i]);
        }
    }

    public static int[] reserve(int[] arr, int start, int end) {
        if(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start]=temp;
            reserve(arr, start+1, end-1);
        }
        return arr;
    }
    */

    public static void main(String[] args){
        String str = "Ruchita";
        int n = str.length();
        System.out.println(strPalli(str,n));
    }

    public static boolean strPalli(String str, int n){
        int i=0;
        return (reverse(str,i,n));

    }    

    
    public static boolean reverse(String str, int i, int n) {
        if(i>=n/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt(n-1)){
         Object st;
           return false;
        }
        return reverse(str, i+1, n-1);
    }
}
