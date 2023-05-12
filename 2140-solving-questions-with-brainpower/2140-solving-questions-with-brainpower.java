class Solution {
  public long mostPoints(int[][] questions) {
      //length of array
    var n = questions.length;
      //declaring another array
    var dp = new long[n];
      //intializing the array with first index
    dp[n-1] = questions[n-1][0];
//started a for loop and started with length-2 as we need to skip 2 numbers after use.
    for (int i = n-2; i >= 0; i--) {
        // adding the value in the next element
      int nextQ = i + questions[i][1] + 1;
      // checking for the max number 
      dp[i] =
        Math.max(
          questions[i][0] + (nextQ >= n ? 0 : dp[nextQ]),
          dp[i+1]);
    }
    return dp[0];
  }
}