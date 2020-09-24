import java.util.Scanner;
public class conditional {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int age;

        System.out.println("How old are you");
        age = input.nextInt();

        if (age < 10 ) {
            System.out.println("You are a child");

        }
    }
}