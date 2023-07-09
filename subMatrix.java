import java.util.Stack;
public class subMatrix{
    public static void main(String[] args) {
        int A[][] = {
            { 0, 1, 1},
            { 1, 1, 1},
            { 1, 1, 1},
            { 0, 1, 1},
        };
        System.out.print("Area of maximum rectangle is "
                         + maxRectangle(A));
    }

    
    public static int maxRectangle(int[][] matrix) {
       int col = matrix[0].length;
       int row = matrix.length;
       int a = maxHist(row,col,matrix[0]);

       for(int i=1; i<row; i++){
        for(int j=0; j<col; j++){
            if (matrix[i][j] == 1){
                matrix[i][j] +=matrix[i-1][j];
            }

            a= maxHist(row,col,matrix[i]);
        }
       }
       return a;
    }

    public static int maxHist(int r, int c, int a[]){
        Stack <Integer> s = new Stack<>();
        int max_area=0, area=0;
        int top, i=0;

        while(i<c){
            if(s.empty() || a[s.peek()]<=a[i]){
                s.push(i++);
            }else{
                top=s.peek();
                s.pop();
                area=(s.isEmpty())?a[top]*i:a[top]*(i-s.peek()-1);

                if(max_area<area){
                    max_area=area;
                }
            }
        }

        while(!s.empty()){
            top=s.peek();
            s.pop();
            area=(s.isEmpty())?a[top]*i:a[top]*(i-s.peek()-1);

            if(max_area < area){
                max_area=area;
            }
        }

        return max_area;
    }
}