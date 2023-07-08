public class StringArrangement {
   
    /**
     * @param args
     */
    public static void main(String[] args){
        String a= "101";
        String b = "110";

        int c=0,f=0;
        int c1=0,f1=0;

        if(a.length()==b.length()){
            for (int i = 0 ;i<a.length();i++){
                char d = a.charAt(i);
                char e = b.charAt(i);
                if(e=='1'){
                    c++;
                }else{
                    f++;
                }
                if(d=='1'){
                    c1++;
                }else{
                    f1++;
                }
            }if(c==c1 && f==f1){
                System.out.println("Possible");
            }else{
                System.out.println("Impossible");
            }
        }
        else{
            System.out.print("Imposible");
        }
    }
    
}
