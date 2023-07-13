public class Transpose {
    public static void main(String[] args){
        int[][] matrix = {{1,4,7},{9,2,3},{6,5,1}};
        int [][] new_matrix = new int[3][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                new_matrix[j][i] = matrix[i][j];
            }
        }
        
        System.out.println("Transpose of the given Matrix is : ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(new_matrix[j][i]);
                if(j==2){
                    System.out.print(" ");
                }
            }
        }
    }
}
