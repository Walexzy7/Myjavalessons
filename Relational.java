import java.util.Scanner;
public class Relational {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int x, y;

        System.out.println("Enter an integer");
        x = input.nextInt();
        System.out.println("Enter an integer");
        y = input.nextInt();


        System.out.println(x + " is less than " + y + " " + (x < y));
        System.out.println(x + " is greater than " + y + " " + (x > y));
        System.out.println(x + " is less than or equal to " + y + " " + (x <= y));
        System.out.println(x + " is greater than or equal to " + y + " " + (x >= y));
        System.out.println(x + " is equal to " + y + " " + (x == y));
        System.out.println(x + " is not equal to " + y + " " + (x != y));
    }
}