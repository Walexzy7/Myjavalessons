import java.util.Scanner;

public class Evensum {
    private static Scanner sc;
    public static void main(String [] args){

        int number, i, evensum = 0;
        sc = new Scanner(System.in);

        System.out.println(" Enter number: ");
        number = sc.nextInt();
        for (i = 1; i <= number; i++ ) {
            if(i % 2 == 0)
            {
                evensum = evensum + i;
            }
       
     }
        System.out.println(" \n The sum of Even number upto " + number + " = " + evensum);
    }
}