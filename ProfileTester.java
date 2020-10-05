import java.util.Scanner;
public class ProfileTester {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
     String nameOfCompany;
     String firstname;
     String lastname;
     String position;
     String gender;
     String address;
     String state;
     String companyAddress;
     String status;
     String nationality;
     String education;
     String sex;
     String dob;
     String startDate;
     int phoneNo;
     

     System.out.println("Enter name of Company");
     nameOfCompany = input.nextLine();
     System.out.println("Enter your Firstname");
     firstname = input.nextLine();
     System.out.println("Enter your Lastname");
     lastname = input.nextLine();
     System.out.println("Enter your Position");
     position = input.nextLine();
     System.out.println("Enter your Gender");
     gender = input.nextLine();
     System.out.println("Enter your Address");
     address = input.nextLine();
     System.out.println("Enter your State of Origin");
     state = input.nextLine();
     System.out.println("Enter the company's Address");
     companyAddress = input.nextLine();
     System.out.println("Enter your marital status");
     status = input.nextLine();
     System.out.println("Enter your Nationality");
     nationality = input.nextLine();
     System.out.println("Enter your highest qualification");
     education = input.nextLine();
     System.out.println("Enter your sex");
     sex = input.nextLine();
     System.out.println("Enter your date of birth");
     dob = input.nextLine();
     System.out.println("Enter date of resumption");
     startDate = input.nextLine();
     System.out.println("Enter your Phone number");
     phoneNo = input.nextInt();
    

     // Instantiating a new profile onject.

     Profile profile = new Profile();

     profile.setNameOfCompany(nameOfCompany);
     profile.setFirstname(firstname);
     profile.setLastname(lastname);
     profile.setPosition(position);
     profile.setGender(gender);
     profile.setAddress(address);
     profile.setState(state);
     profile.setCompanyAddress(companyAddress);
     profile.setStatus(status);
     profile.setNationality(nationality);
     profile.setEducation(education);
     profile.setSex(sex);
     profile.setDob(dob);
     profile.setStartDate(startDate);
     profile.setPhoneNo(phoneNo);


     System.out.println(profile.getNameOfCompany());
     System.out.println(profile.getFirstname());
     System.out.println(profile.getLastname());
     System.out.println(profile.getPosition());
     System.out.println(profile.getGender());
     System.out.println(profile.getAddress());
     System.out.println(profile.getState());
     System.out.println(profile.getCompanyAddress());
     System.out.println(profile.getStatus());
     System.out.println(profile.getNationality());
     System.out.println(profile.getEducation());
     System.out.println(profile.getSex());
     System.out.println(profile.getDob());
     System.out.println(profile.getStartDate());
     System.out.println(profile.getPhoneNo());
}
}