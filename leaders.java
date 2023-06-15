import java.util.*;

public class leaders {
    public static void main(String[] args){
        int a[] = {1,2,6,4,5,7,6,3,4};
        int x=3, k=4;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<a.length; i++){
            int b = a[i]-x;
            map.put(b,a[i]);
        }
        
        int j=0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getValue());
            j++;
            if(j==k){
                break;
            }
        }
    }
    
} 