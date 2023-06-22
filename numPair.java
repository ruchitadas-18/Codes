public class numPair {
    public static void main(String[] args){
        int a[] = {9,4,18,3,2,6,18,15,7,15,6,4,15,14,7,4,15,4,3,17,9,13,13,12,2,14,12,17};
        int n = a.length;
        int b =countPairs(a,n);
        System.out.println(b);
        if(2*b == n){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
    public static int countPairs(int[] arr, int n) {
    int count = 0;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                count += 1;
            }
        }
    }
    return count;
}
}
