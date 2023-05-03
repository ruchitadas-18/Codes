-----------------------------------------------------------Question-----------------------------------------------------------------------
You are required to enter a word that consists of and that denote the number of Zs and Os respectively. The input word is considered similar to word zoo if 2*x=y
Determine if the entered word is similar to word zoo.
For example, words such as zzoooo and zzzoooooo are similar to word zoo but not the words such as zzooo and zzzooooo.

-----------------------------------------------------------Answer------------------------------------------------------------------------
mport java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int zno=0, ono=0;
        for(int i =0; i<a.length(); i++){
            if(a.charAt(i) == 'z'){
                zno+=1;
            }else{
                ono+=1;
            }
        }

        if(2*zno == ono){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
