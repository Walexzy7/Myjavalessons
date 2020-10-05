public class Rectangle{
  private double length;
  private double width;


    Rectangle(){
 }
    
    Rectangle(double length){
        this.length = length;
    }
   
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

   
    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

    public double areaOfRectangle(){
        /**
         * Use this method when no external value
         * is provided.
         */
        return this.length * this.width;
    }


    public double areaOfRectangle(int width){
        /**
         * Use this method if only the width of the Rectangle is 
         * provided. This will return area based on original length of 
         * rectangle
         */
        return this.length * width;
    }


    public double areaOfRectangle(int length, int width){
        /**
         * Use this method if both the length and width of the Rectangle are 
         * provided. This will return area based on newly supplied values for
         * length and width of rectangle
         */
        return length * width;
    }
}