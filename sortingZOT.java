public class sortingZOT{
    public static void main(String[] args){
        int n = 6;
        int b[] = {2,0,2,1,1,0};

        sortArray(b,n);
    }

    private static void sortArray(int[] b, int n) {
        int start = 0;
        int end = n-1;
        int mid =0;

        while(mid<=end){
            if(b[mid]==0){
                swap(b,mid,start);
                mid++;
                start++;
            }
            else if(b[mid]==1){
                mid++;
            }
            else{
                swap(b, mid, end);
                end--;
            }
        }

        for(int i=0; i<n; i++){
            System.out.println(b[i]);
        }

    }

    private static void swap(int[] b, int mid, int value) {
        int temp = b[mid];
        b[mid] = b[value];
        b[value]=temp;
    }
}