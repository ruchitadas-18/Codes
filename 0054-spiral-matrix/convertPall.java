import java.util.LinkedList;
public class convertPall {
    public static void main(String[] agrs){
        int a [] ={9};
        convertPall cp = new convertPall();
        cp.plusOne(a);
    }

    public void plusOne(int[] digits) {
        for(int i=(digits.length)-1;i >= 0;i--){
            if(digits[i]<9){
                digits[i]=digits[i]+1;
                System.out.print(digits[i]+" ");
            }else if(digits[i]==9){
                digits[i]=0;
            }   
        }
        int[] newarr=new int[digits.length+1];
        newarr[0]=1;
        for(int i=0; i<digits.length+1; i++){
            System.out.print(newarr[i]);
        }
    }
}

