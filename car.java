class car extends vehicle{
    public String brandName = "Camry";
    public static void main(String[] args){
        car myCar = new car();  // a new object of the car class
        myCar.horn();

        System.out.println(myCar.brand+" "+myCar.brandName);
    }
}//demonstreation of inheritance