import java.util.Scanner;
public class helen{
    public static void main(String [] args){
     Scanner input = new Scanner(System.in);
     String Name, Surname;
      System.out.println("Enter your name");
      Name = input.nextLine();
      System.out.println("Enter surname");
      Surname = input.nextLine();
      System.out.println("My name is " + Name + " " + Surname);

    }
}