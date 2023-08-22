class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
       int min=Integer.MAX_VALUE;
       for(int i=0; i<n; i++){
           min = Math.min(nums[i], min);
       }
        
        int diff =0;
        for(int i=0; i<n; i++){
            diff += nums[i]-min;
        }
        return diff;
    }
}