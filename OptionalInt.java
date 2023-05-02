import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr1 = new int[num];
        int [] arr2 = new int[num];

        for(int i=0; i<num; i++){
            arr1[i]= sc.nextInt();
        }
        for(int j=0; j<num; j++){
            arr2[j]= sc.nextInt();
        }
        //OptionalInt help us to create an object which may or may not contain a int value. The getAsInt() method returns value If a value is present in OptionalInt object, otherwise throws NoSuchElementException.
        int aMin=Arrays.stream(arr1).min().getAsInt();
        int sum=0;
        for( int i=0; i<num; i++){
            while(arr1[i]>aMin && arr1[i]>=arr2[i]){
                arr1[i] = arr1[i] - arr2[i];
                ++sum;
            }
            if(arr1[i]<aMin && arr1[i]>0){
                sum = -1;
                break;
            }
        } 
        System.out.println(sum);
    }
}
