public class puzzle {
    /* 
    public static void main(String[] args){
        int a=7;

        for(int i=1; i<=a; i++){
            int b = 2*i;
            int c= (4*i)-1;
            System.out.println(b*c);
        }
        
    }
    */

    public static void main(String[] args){
        int a=-1;
        if(a<0){
            System.out.println("Wrong Input");
        }else{
            while(a!=0){
                int c= a%10;
                System.out.print(9-c);
                a=a/10;
            }
            
        }
    }
}
