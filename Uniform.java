public class Uniform {

    public static boolean EvenMatrix(int[][]arr){
        boolean ch=true;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length;j++){
                int c = arr[i][j];
                if(c%2!=0){
                    ch = false;
                }

            }
        }
        return ch;
    }

    public static boolean OddMatrix(int [][]arr){
        boolean ch = true;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length;j++){
                int c = arr[i][j];
                if(c%2==0){
                    ch = false;
                }
            }
        }
        return ch;
    }
    public static void main(String[] args){
        int [][] a = new int[][]{{2,2,4,4},{8,2,4,10}};

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if(a[i][j]%2==0){
                    EvenMatrix(a);
                }
                else{
                    OddMatrix(a);
                }
            }
        }
        
        if(EvenMatrix(a)==true || OddMatrix(a)==true){
            System.out.println("Uniform");
        }else{
            System.out.println("Non-Uniform");
        }
    }
}
