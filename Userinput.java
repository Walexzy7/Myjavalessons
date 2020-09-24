import java.util.Scanner;


public class Userinput {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("Enter a number");
        a = input.nextInt();
         System.out.println("Enter a number");
        b = input.nextInt();
        System.out.println("The two are " + a + " and " + b);
    } 

}