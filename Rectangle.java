public class Rectangle{
  private double lenght;
  private double width;


    Rectangle(){
 }
    
    Rectangle(double lenght){
        this.lenght = lenght;
    }
   
    Rectangle(double lenght, double width){
        this.lenght = lenght;
        this.width = width;
    }

   
    public void setLenght(double lenght){
        this.lenght = lenght;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLenght(){
        return this.lenght;
    }

    public double getWidth(){
        return this.width;
    }

    public double areaOfRectangle(){
        return lenght*width;
    }
}