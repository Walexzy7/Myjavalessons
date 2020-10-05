import java.util.Scanner;
public class DogTester {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
     String dogName;
     String colour;
     String breed;
     String size;
     String foodType;
     String gender;


     // Accept inputs from user.

     System.out.println("Enter name of Dog");
     dogName = input.nextLine();
     System.out.println("Enter Dog colour");
     colour = input.nextLine();
     System.out.println("Enter the breed of the dog");
      breed = input.nextLine();
      System.out.println("Enter dog size");
     size = input.nextLine();
     System.out.println("Enter Dog's food type");
     foodType = input.nextLine();
     System.out.println("Enter dog's gender");
     gender = input.nextLine();

    // set method

    Dog dog = new Dog();

    dog.setDogName(dogName);
    dog.setColour(colour);
    dog.setBreed(breed);
    dog.setSize(size);
    dog.setFoodType(foodType);
    dog.setGender(gender);

    // get method

    System.out.println(dog.getDogName());
    System.out.println(dog.getColour());
    System.out.println(dog.getBreed());
    System.out.println(dog.getSize());
    System.out.println(dog.getFoodType());
    System.out.println(dog.getGender());




    }
}
