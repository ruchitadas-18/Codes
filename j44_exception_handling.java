import java.util.Scanner;
public class j44_exception_handling {
    public static void main(String[] args) {
        int [] num = new int[3];
        num[0] = 50;
        num[1] =100;
        num[2] = 40;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array index: ");
        int ind = sc.nextInt();
        System.out.println("The value of array index entered is: " + num[ind]);
        System.out.println("Enter the number you want to divide the value with: ");
        int number =  sc.nextInt();
        sc.close();

        try {
            System.out.println("'The value of array-value/number: "+ num[ind]/number);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occured");
            
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
        }
        catch(Exception e){
            System.out.println(" some other Exception occured!");

        }

        
    }
    
}
