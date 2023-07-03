class Solution {
    public long minCost(int[] nums, int[] cost) {
    int b=0;
        for(int j=0; j<cost.length; j++){
            for(int i=0; i<nums.length; i++){
                if(nums[i]>=2 ){
                    nums[i]--;
                    b+=cost[j];
                    
                }
                else if(nums[i]<=2 ){
                    nums[i]++;
                    b+=cost[j];
                    
                }
                else if(nums[i]==2){
                    b = b;
                }
            }
        }
       return b;
    }
    public static void main(String[] args){
        int nums[] = {1,3,5,2};
        int cost[]={2,3,1,14};
        Solution s = new Solution();
        System.out.print(s.minCost(nums,cost));
    }
}
