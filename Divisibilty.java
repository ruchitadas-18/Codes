-----------------------------------------Question---------------------------------------------------------
You are provided an array A of size N that contains non-negative integers. Your task is to determine whether the number that is formed by selecting the last digit of all the N numbers is divisible by 10

Note: View the sample explanation section for more clarification.


--------------------------------------------------Answer----------------------------------------------------------
import java.util.*; 
public class TestClass{     
    public static void main(String[] args){       
        Scanner c = new Scanner(System.in);         
        int n = c.nextInt();        
        int[] a = new int[n];         
        for(int i=0;i<n;i++){            
            a[i]=c.nextInt();         
        }         
        if(a[n-1]%10==0){          
        System.out.print("Yes");         
        }else{             
        System.out.print("No");
        } 
    }
}
