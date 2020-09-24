import java.util.Scanner;
public class Scores {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int scores;
        System.out.println("Enter score");
        scores = input.nextInt();

        if (scores < 10) {
            System.out.println(" F ");
           
            System.out.println("Enter score");
             scores = input.nextInt();
      if (scores > 10 && scores < 25) {
                System.out.println("E");
             
              System.out.println("Enter score");   
                scores = input.nextInt();
            if (scores > 25 && scores < 40) {
                System.out.println("D");

                System.out.println("Enter score"); 
                        scores = input.nextInt();
                if (scores > 40 && scores < 50) {
                    System.out.println("CD");

                  System.out.println("Enter score");
                  scores = input.nextInt();
                  if (scores > 50 && scores < 60){
                      System.out.println("C");

                       System.out.println("Enter score");
                  scores = input.nextInt();
                  if (scores > 60 && scores < 70){
                      System.out.println("BC");

                   System.out.println("Enter score");
                  scores = input.nextInt();
                  if (scores > 70 && scores < 80){
                      System.out.println("B");

                       System.out.println("Enter score");
                  scores = input.nextInt();
                  if (scores > 80 && scores < 90){
                      System.out.println("AB");

                       System.out.println("Enter score");
                  scores = input.nextInt();
                  if (scores > 90 && scores <= 100){
                      System.out.println("A");

                       System.out.println("Enter score");
                  scores = input.nextInt();
                  if (scores > 100){
                      System.out.println("Invalid");

                  }

                  }


                  }


                  }

                  }


                  }  
                }
               
            }


            }

             }
        }
}