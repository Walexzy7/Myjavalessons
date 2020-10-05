public class Dog {

    private String dogName;
    private String colour;
    private String breed;
    private String size;
    private String foodType;
    private String gender;

    // set methods
    public void setDogName(String dogname){
        this.dogName = dogname;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void setSize(String size){
        this.size = size;
    }
    public void setFoodType(String foodType){
        this.foodType = foodType;
    }
    public void setGender(String gender){
        this.gender = gender;
    }


    // Get metthods.

    public String getDogName(){
        return this.dogName;
    }
    public String getColour(){
        return this.colour;
    }
    public String getBreed(){
        return this.breed;
    }
    public String getSize(){
        return this.size;
    }
    public String getFoodType(){
        return this.foodType;
    }
    public String getGender(){
        return this.gender;
    }

}