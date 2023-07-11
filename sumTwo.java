import java.util.*;
public class sumTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        System.out.println(pairTwo(a,target));
    }
/* 
    private static boolean pairTwo(int[] a, int target) {
        boolean result = false;
        int n = a.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]+a[j]==target){
                    result = true;
                }
            }
        }
        return result;
    }
*/
// using Hashing
    private static boolean pairTwo(int[] a, int target) {
        boolean result = false;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0; i<a.length; i++){
            int need = target - a[i];
            if(hm.containsKey(need)){
                result = true;
            }
            hm.put(a[i],i);
        }
        return result;
    }
}
