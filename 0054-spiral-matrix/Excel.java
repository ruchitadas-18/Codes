import java.util.*;

class Excel{
    
    public static String toAlphabetic(int i) {
        if( i<0 ) {
            return "Not Valid input";
        }

        int quot = i/26;
        int rem = i%26;
        char letter = (char)((int)'A' + rem);
        if( quot == 0 ) {
            return ""+letter;
        } else {
            return toAlphabetic(quot-1) + letter;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(toAlphabetic(a));
        
    }
}
