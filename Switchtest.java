import java.util.Scanner;

public class Switchtest {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

    System.out.println("Welcome to the installation package Robotext\n" +
                       "Select the appropriate action to begine installation\n" +
                       "1) Istall\n" +
                       "2) Upgrade an existing installation\n" +
                       "3) Obtain installation license\n" +
                       "4) Exit Installer");

      int choice = input.nextInt();
      String license = String.valueOf((int) Math.floor(Math.random() * 1000000));

      double rand = Math.random();
      System.out.println(rand);
      System.out.println(rand * 1000000);
      System.out.println(Math.floor(rand * 1000000));
      System.out.println((int) Math.floor (rand * 1000000));

      switch (choice) {
          case 1:
                System.out.println("Start installation of Robotext... Close all applications");
                break;
            case 2:
                System.out.println("Upgrading your Robotext installation from v1.4.5 to v2.1.9");
                break;
            case 3:
                System.out.println("Your new installation is " + license + "\n copy to your install location");
                break;
            case 4:
                System.out.println("Thanks for using Robotext. Bye!");
                break;
            default:
                System.out.println("Invalid menu option");
      }                 

    }
}