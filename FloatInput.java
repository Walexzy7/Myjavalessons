import java.util.Scanner;
public class FloatInput {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Float x, y, z;
        System.out.println("Enter a float number");
        x = input.nextFloat();
        System.out.println("Enter a float number");
        y = input.nextFloat();
        System.out.println("Enter a float number");
        z = input.nextFloat();
        System.out.println("The sum of the float numbers " + x + " , " + y + " and " + z + " is 15.99");


    }
}