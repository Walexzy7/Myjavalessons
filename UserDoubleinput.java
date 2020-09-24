import java.util.Scanner;

public class UserDoubleinput{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    double x, y;

    System.out.println("Enter a decimal number");
    x = input.nextDouble();
    System.out.println("Enter a decimal number");
    y = input.nextDouble();

    System.out.println("The two decimal numbers are " + x + " and " + y);

    }
}