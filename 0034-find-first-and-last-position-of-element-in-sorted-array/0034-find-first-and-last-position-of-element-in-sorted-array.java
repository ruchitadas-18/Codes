class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                if(arr[0] == -1){
                    arr[0] = i;
                }
            }
        }

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i] == target){
                if(arr[1] == -1){
                    arr[1] = i;
                }
            }
        }

        if(arr[0] != -1 && arr[1] == -1){
            arr[1] = arr[0];
        }
        return arr;
    }
}