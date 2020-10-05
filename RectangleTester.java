import java.util.Scanner;

public class RectangleTester{

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        double length;
        double width;
        double area;
        
        System.out.println("Enter value for Length");
        length = input.nextDouble();  
        System.out.println("Enter value for Width");
        width = input.nextDouble();

        //Create a new Rectangle object using empty constructor
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(length);
        rectangle.setWidth(width);

        //Create another Rectangle object using constructor with length value
        Rectangle rectangle1 = new Rectangle(length);

        //Create another Rectangle object using constructor with length and width values
        Rectangle rectangle2 = new Rectangle(length, width);


        //Test Rectangles
        System.out.println("Length = " + rectangle.getLength());
        System.out.println("Width = " + rectangle.getWidth());
        System.out.println("Area = " + rectangle.areaOfRectangle());           
       

  }
}