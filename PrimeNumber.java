import java.util.Arrays;

public class PrimeNumber {
      
    public static void main(String[] args){
        int n=14;
        boolean [] arr = new boolean[n+1];
        Arrays.fill(arr, true);
        for(int i=2; i*i<n; i++ ){
            if (arr[i] == true) {
                for (int j= i * i; j <=n; j= j+i){
                    arr[j] = false;
                }
            }
        } 
        int a=0;    
        for(int k=2; k<n; k++){
            for(int j =2; j<n; j++){
                if(arr[k]==true && arr[j]==true){ 
                    if (k-j==6){
                        System.out.print(k+" ");
                        System.out.print(j +" "); 
                        a++; 
                    }
                }  
            }
        }
        System.out.println(" ");
        System.out.println(a);    
    }

}
