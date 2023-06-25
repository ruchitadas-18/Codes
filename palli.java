import java.util.*;
public class palli{
    /* 
    public static void main(String[] args){
        String b ="batman";
        int n = b.length();
        int count =0, frq =0;
        
        for(int i=0; i<n; i++){
            char a =Character.toLowerCase(b.charAt(i));
            for(int j=0; j<n; j++){
                if((j!=i) && b.charAt(j)==a){
                    count ++;
                }
            }
            if(count%2!=0){
                frq++;
            }
        }
        if(frq>1){
            System.out.print("Not possible");
        }else{
            System.out.print("Possible");
        }
    }

    public static void main(String[] args){
        int num1 =459;
        int num2 = 9999;
        int count =0, c=0;
        while(num2!=0 || num1!=0){
            int a = num1%10;
            int b = num2%10;
            if(c+a+b>9){
                count++;
                c = 1;
            }else{
                c=0;
            }
            num1 /=10;
            num2/=10;
        }
        System.out.println(count);
    }
    */
    public static void main(String[] args){
        String s = "egg";
        String f = "add";
        if(s.length()== f.length()){
            System.out.println("NO");
        }
        int count =0;
        for(int i=0; i<s.length()-1; i++){
            for(int j=0; j<f.length(); j++){
                if(i==j){
                    if(s.charAt(i)==s.charAt(i+1)){
                        count ++;
                    }
                }
            }
        }
    }
}