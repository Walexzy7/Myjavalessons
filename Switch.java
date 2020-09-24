 import java.util.Scanner;
public class Switch{
    public static void main(String [] args){
       Scanner input = new Scanner(System.in); 
        int score;
       System.out.println("Enter score");
        score = input.nextInt();
        
        switch (score) {

            case 10:
            System.out.println(" F ");
            break;
            
        case 25: 
        System.out.println("E");
        break;
        
        case 40:
        System.out.println("D");
        break;

        case 50: 
        System.out.println("CD");
        break;

        case 60:
        System.out.println("C");
        break;

        case 70:
        System.out.println("BC");
        break;

        case 80:
        System.out.println("B");
        break;

        case 90:
        System.out.println("AB");
        break;

        case 100:
        System.out.println("A");
        

        

            
        }




    }
} 