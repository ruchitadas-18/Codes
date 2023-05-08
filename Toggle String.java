Problem
You have been given a String S consisting of uppercase and lowercase English alphabets. You need to change the case of each alphabet in this String. That is, all the uppercase letters should be converted to lowercase and all the lowercase letters should be converted to uppercase. You need to then print the resultant String to output.

Input Format
The first and only line of input contains the String S

Output Format
Print the resultant String on a single line.
  
  ======================
  SOLUTION
  ======================
  import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char a, b;
        String r=" ";
        for(int i=0; i<s.length(); i++){
            a= s.charAt(i);
            if(Character.isLowerCase(a) == true){
                b = Character.toUpperCase(a);
                r=r+b;
            }
            else{
                b = Character.toLowerCase(a);
                r=r+b;
            }
        }
        System.out.println(r);
    }
}
