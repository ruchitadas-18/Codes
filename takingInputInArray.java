import java.util.Scanner;
public class takingInputInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length of the array is : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("enter element at " + i + " th index: ");
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}