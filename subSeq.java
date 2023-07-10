import java.util.*;

public class subSeq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String ans = " ";
        sequence(s1,ans);
    }
    public static void sequence(String s1, String ans){
        if(s1.length()==0){
            System.out.println(ans);
            return;
        }
        sequence(s1.substring(1), ans+s1.charAt(0));
        sequence(s1.substring(1), ans);
    }
}
