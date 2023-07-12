public class SwapNibble {
    /* 
    public static void main(String[] args){
        float n = 100f;
        int nibble_one, nibble_two;
        //extracting the first and second nibbles of a given number using bitwise operators.
        nibble_one =  ((byte)n & 0x0F) <<4;
        nibble_two = ((byte)n & 0xF0)>>4;

        System.out.println((float)(nibble_one+nibble_two));
    }

    // rainbow number
    public static void main(String[] args){
        int l =100;
        int u = 200;

        while(l<200){
            int n = l;
            while(n>0){
                int i = n%10;
                if(i==1 || i==4|| i==9){
                    System.out.println(l);
                }
                n = n/10;
            }
            l++;
        }
    }
    */
    public static void main(String[] args){
        int a[] = {16,17,4,5,3,2};
        for (int num= a.length-1; num>0; num++ ) {
            if(a[num]>a[num-1]){
                System.out.println(a[num]);
            }
        }
    }
}
