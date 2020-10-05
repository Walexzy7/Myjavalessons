import java.util.Scanner;
public class RectangleTester{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

    double lenght = 0;
    double width = 0;
    double area = 0;
    Rectangle rectangle = new Rectangle();
    Rectangle rectangle1 = new Rectangle(lenght);
    Rectangle rectangle2 = new Rectangle(lenght, width);

    System.out.println("Enter value for Length");
    lenght = input.nextDouble();
    System.out.println("Enter value for Width");
    width = input.nextDouble();

// set method.
    
    rectangle.setLenght(lenght);
    rectangle.setWidth(width);
// get method

 System.out.println("Lenght = " + rectangle.getLenght());
 System.out.println("width = " + rectangle.getWidth());
 System.out.println("The area of the rectangle (L * W) = " + rectangle.areaOfRectangle());
 

  }
}