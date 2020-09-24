import java.util.Scanner;

public class UserIntegerInput {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int a, b, c;
       
        System.out.println("Enter a number");
        a = input.nextInt();
       
        System.out.println("Enter a number");
        b = input.nextInt();
       
        System.out.println("Enter a number");
        c = input.nextInt();
       
        System.out.println("The sum of the numbers " + a + " , " + b + " and " + c + " is 20 " );
    }

}