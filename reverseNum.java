import java.util.Scanner;

public class reverseNum {
    /*
    public static void main(String[] args){
        int a= 291;
        int b, c=0;
        while(a!=0){
            b= a%10;
            c= c*10+b;
            a=a/10;
        }
        System.out.print(c);
    }
    
    public static int SumOfnumber(int m, int n){
        int a=0;
        for(int i=m; i<=n; i++){
            a+=i%10;
            i/=10;
        }
        return a;
    }

    public static int productOfNumber(int m, int n){
        int a=1;
        for(int i=m; i<=n; i++){
            a*=i%10;
            i/=10;
        }
        return a;
    }
    /**
     * @param args
     
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt();
        int n= sc.nextInt();

        int a = productOfNumber( m, n);
        int b = SumOfnumber( m, n);
        
        for(int i=m; i<n; i++){
            if(a+b==i){
                System.out.println(i);
            }
        }
    }
    */

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        String b = Integer.toString(a);
        String c = "true";
        for(int i=1; i<b.length(); i++){
            if(b.charAt(i-1)<b.charAt(i)){
                c="false";
                break;
            }
        }
        System.out.println(c);
    }
}
