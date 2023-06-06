public class contest {
    public int sumOfSquares(int[] nums) {
        
        int n = nums.length;
        System.out.println(n);
        int sum =0;
        
        for(int i=1; i<n; i++){
            sum = nums[0]*nums[0];
            System.out.println("Num: "+ i);

            if(n%i==0){
                sum+= nums[i]*nums[i];
                System.out.println("sum: "+sum);
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int nums[] ={2,7,1,19,18,5};
        contest obj  = new contest();
        int c = obj.sumOfSquares(nums);
        System.out.println("Sum of squares: "+c );
    }
}
