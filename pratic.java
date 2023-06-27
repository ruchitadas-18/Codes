
/* 
public class pratic {
    public static void main ( String []args ){
        String s = "HiHello";

        for(int i=0; i<s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                System.out.print(Character.toLowerCase(s.charAt(i)));
            }
            else{
                System.out.print(Character.toUpperCase(s.charAt(i)));
            }
        }

        for(int i=0; i<s.length(); i++){
            
        }
    }

}
*/
// You are using Java
/*import java.util.Scanner;
import java.util.Arrays;

class pratic{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int [] arr= new int[n];
        
        for(int i=0; i<n; i++){
          arr[i] = sc.nextInt();
        }
        
        subArray(n,s,arr);
    }
    
    public static void subArray(int n, int s, int[] arr){
        int count =0;
        for(int i=0; i<n; i++){
            count = arr[i];
            for(int j= i+1; j<n; j++){
                count += arr[j];
                if(count == s){
                    System.out.println(i+1+" "+j+1);
                    return;
                }
            }
        }
        
    }
}

import java.util.Scanner;
public class pratic {
	static int maxDiff(int []arr, int n)
	{
		int SubsetSum_1 = 0, SubsetSum_2 = 0;
		for (int i = 0; i <= n - 1; i++)
		{
			boolean isSingleOccurrence = true;
			for (int j = i + 1; j <= n - 1; j++)
			{
				if (arr[i] == arr[j])
				{
					isSingleOccurrence = false;
					arr[i] = arr[j] = 0;
					break;
				}
			}
			if (isSingleOccurrence)
			{
				if (arr[i] > 0)
					SubsetSum_1 += arr[i];
				else
					SubsetSum_2 += arr[i];
			}
		}
		
		return Math.abs(SubsetSum_1 - SubsetSum_2);
	}
	static public void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) 
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Maximum Difference = "
							+ maxDiff(arr, n));
	}
}

import java.util.Scanner;

// pattern matching
public class pratic {
    static boolean match(String first, String second) {
        if (first.isEmpty() && second.isEmpty())
            return true;

        if (first.charAt(0) == '*') {
            while (first.length() > 1 && first.charAt(1) == '*')
                first = first.substring(1);
        }

        if (first.charAt(0) == '*' && first.length() > 1 && second.isEmpty())
            return false;

        if (first.charAt(0) == '?' || first.charAt(0) == second.charAt(0))
            return match(first.substring(1), second.substring(1));

        if (first.charAt(0) == '*')
            return match(first.substring(1), second) || match(first, second.substring(1));

        return false;
    }

    static void test(String first, String second) {
        if (match(first, second))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();
        test(first, second);
    }
}
*/
