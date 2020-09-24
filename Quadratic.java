public class Quadratic {
    public static void main(String [] args){

    double a = -5;
    double b = 6;
    double c = 3;

    double Output1;
    Output1 = Math.sqrt((b*b) - (4*a*c));
    Output1 = -b + Output1;
    Output1 = Output1/(2*a);
     System.out.println("X1 = " + Output1);

     double Output2;
    Output2 = Math.sqrt((b*b) - (4*a*c));
    Output2 = -b - Output1;
    Output2 = Output2/(2*a);
     System.out.println("X2 = " + Output2);





}
}