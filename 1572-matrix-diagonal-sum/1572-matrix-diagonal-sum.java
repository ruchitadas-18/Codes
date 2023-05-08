class Solution {
    public int diagonalSum(int[][] mat) {
        int m = mat.length, count=0;
        for(int i= 0; i<m; i++)
            count += mat[i][i] +mat[i][m-1-i];
        if(m%2 == 1)
            count -= mat[m/2][m/2];
            
        return count;
    }
}

