import java.util.Arrays;

public class Multiple {
    public static void main(String[] args){
        int a=150;
        int b[]= new int[9];
        int k=0;

        for(int i=9;i>1; i--){
            while(a%i==0){
                a= a/i;
                b[k]=i;
                k++;
            }
        }

        Arrays.sort(b);
        for(int i=0; i<b.length; i++){
            if(b[i]>0){
                System.out.print(" "+b[i]);
            }
        }

    }    
    
}
