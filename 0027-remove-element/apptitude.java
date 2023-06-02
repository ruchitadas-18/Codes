public class apptitude {
    public static void main(String[] args){
      /*  int n=1;
       int m=99;
    
       for(int i=n; i<m; i++){
           if(i<10 && (m<=100 && m>10)){
               System.out.println("00"+i);
           }else if(i<100 && (m==1000 && m>100)){
               System.out.println("00"+i);
           }
           else{
               System.out.println("0"+i);
           }
       }

       String a ="facePrep";
       String d=" ";
       int b=3;
       for(int i=b; i<a.length(); i++){
        char c=a.charAt(i);
        System.out.print(c+d);
       }
       
       for(int i=0; i<b;i++){
        char c=a.charAt(i);
        System.out.print(c+d);
       }
       
       */
       int size=9;
       int [] arr = {20,1,6,8,13,20,17,20,13};
       int n = 20;
       int subSize = 3;
       int count=0;
       for(int i=0; i<size; i++){
        count++;
       }
       if(count== subSize){
        System.out.print(1);
       }else{
            System.out.print(0);
       }
       
    }
}
