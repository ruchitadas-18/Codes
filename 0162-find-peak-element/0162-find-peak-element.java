class Solution {
    public int findPeakElement(int[] arr) {
        int x = 0;
        int y = arr.length -1;

        while(x < y){
            int mid = x + (y - x) / 2;

            if(arr[mid] > arr[mid + 1]){
                y = mid;
            }
            else{
                x = mid + 1;
            }
        }
        return x;
    }
}