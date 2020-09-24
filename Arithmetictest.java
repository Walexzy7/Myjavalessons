import java.util.Scanner;
public class Arithmetictest {
    public static void main(String [] args){
        int x, y;
        Scanner input = new Scanner(System.in);
        double plus, minus, divide, times, modulus;
        System.out.println("Enter an integer number");
        x = input.nextInt();

        System.out.println("Enter an integer number");
        y = input.nextInt();

        plus = x + y;
        minus = x - y;
        divide = x/y;
        times = x * y;
        modulus = x%y;

        System.out.println("==========================");
        System.out.println(x + " + " + y + " = " + plus);
        System.out.println(x + " - " + y + " = " + minus);
        System.out.println(x + " / " + y + " = " + divide);
        System.out.println(x + " * " + y + " = " +  times);
        System.out.println(x + " % " + y + " = " + modulus); 


    }
}