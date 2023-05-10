class Solution {
    public int[][] generateMatrix(int n) {
        if(n==0){
            return new int[0][0];
        }
        int[][] matrix = new int[n][n];
        int l=0, r=n-1, b= n-1, t=0, num=1;
        while(l<=r && t<=b){
            for(int i=l; i<=r; i++){
                matrix[t][i]= num++;
            }
            t++;
            for(int i=t; i<=b; i++){
                matrix[i][r]= num++;
            }
            r--;
            for(int i=r; i>=l;i--){
                matrix[b][i]= num++;
            }
            b--;
            for(int i=b; i>=t; i--){
                matrix[i][l]= num++;
            }
            l++;
        }
        return matrix;
    }
}
