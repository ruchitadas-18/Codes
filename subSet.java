public class subSet {
    
    public static void main(String[] args){
        int a[] = {1,2,4,4,5,4,6,4,4};
        int n = a.length;
        int count = 0, freq =0;
        for (int i=0 ;i<n-1;i++){ 
             if(a[i]==a[i+1] || a[i]==count){
                count = a[i];
                freq++;
            }
        }
        if(count == a[n-1])
            freq++;

        if(freq > n/2){
            System.out.print(count);
            System.out.print(freq);
        }else{
            System.out.print("None");
        } 
    }
    /*
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the subset size: ");
        int s = sc.nextInt();

        int maxP = findMaxSubsetProduct(arr, s);
        System.out.println( maxP);
    }

    public static int findMaxSubsetProduct(int[] arr, int s) {
        int maxP = Integer.MIN_VALUE;
        int n = arr.length;
        int p = 0;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<s; j++){
                p = arr[i]*arr[j];
            }
            maxP = Math.max(maxP, p);
        }
        return maxP;

    }

     */
    
}
