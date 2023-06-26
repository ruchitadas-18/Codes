import java.util.*;

public class ParaCheck {

    /*public static boolean isValid(String s) {
        
        Stack<Character> leftSymbols = new Stack<>();
        
        for (char c : s.toCharArray()) {
            
            if (c == '(' || c == '{' || c == '[') {
                leftSymbols.push(c);
            }
            
            else if (c == ')' && !leftSymbols.isEmpty() && leftSymbols.peek() == '(') {
                leftSymbols.pop();
            } else if (c == '}' && !leftSymbols.isEmpty() && leftSymbols.peek() == '{') {
                leftSymbols.pop();
            } else if (c == ']' && !leftSymbols.isEmpty() && leftSymbols.peek() == '[') {
                leftSymbols.pop();
            }
            else {
                return false;
            }
        }
        return leftSymbols.isEmpty();
    }

    public static void main(String args){
        String str1="([)]";
        boolean a = isValid(str1);
        System.out.println("a="+a);
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String a = sc.nextLine();
        int count=1;
        for(int i=1; i<a.length();i++){
            count ++;
            if(a.charAt(i-1)!=a.charAt(i)){
                System.out.print(a.charAt(i-1));
                System.out.print(count);
                count=1;
            }
        }
        System.out.print(a.charAt(a.length()-1));
        System.out.print(count);
    }
*/
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b =0;
        for(int i=0; i<a.length(); i++){
            if(i%2!=0){
                char ch = a.charAt(i);

                int c =(int)ch;

                for(int j=0; j<c; j++)
                {
                    System.out.print(a.charAt(i-1));   
                }
            }
        }
    }
}
