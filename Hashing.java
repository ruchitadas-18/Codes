import java.util.*;

public class Hashing {
    // counting the frequency of element
    public static void countFrequency(int[] arr, int  n){
        Map <Integer,Integer> hm = new HashMap<>();
        for(int i =0; i<n; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        
        for(Map.Entry<Integer, Integer> m : hm.entrySet()){
            System.out.println("Key: "+m.getKey()+" Value:"+m.getValue());
        }
    }
    public static void main(String[] args){
        int[] arr = {10,5,2,3,10,2,10,5,5,7,6,3,2,2,3};
        int n = arr.length;
        countFrequency(arr,n);
    }
}
