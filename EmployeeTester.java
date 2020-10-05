import java.util.Scanner;
public class EmployeeTester {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
     String firstname;
     String surname;
     String sex;
     String email;
     String address;
     String employlevel;
     String dob;
     int phoneNo;
     int payment;

     System.out.println("Enter Firstname");
     firstname = input.nextLine();
     System.out.println("Enter Surname");
     surname = input.nextLine();
     System.out.println("Enteryour Gender");
     sex = input.nextLine();
     System.out.println("Enter your Email address");
     email = input.nextLine();
     System.out.println("Enter your Address");
     address = input.nextLine();
     System.out.println("Enter Employee level");
     employlevel = input.nextLine();
     System.out.println("Enter date of birth");
     dob = input.nextLine();
     System.out.println("Enter your phone number");
     phoneNo = input.nextInt();
     System.out.println("Enter employee payment");
     payment = input.nextInt();


     // set methods.
        Employee employee = new Employee();


        employee.setFirstname(firstname);
        employee.setSurname(surname);
        employee.setSex(sex);
        employee.setEmail(email);
        employee.setAddress(address);
        employee.setEmployeelevel(employlevel);
        employee.setDob(dob);
        employee.setPhoneNo(phoneNo);
        employee.setPayment(payment);

        // get methods.


        System.out.println(employee.getFirstname());
        System.out.println(employee.getSurname());
        System.out.println(employee.getSex());
        System.out.println(employee.getEmail());
        System.out.println(employee.getAddress());
        System.out.println(employee.getEmployeelevel());
        System.out.println(employee.getDob());
        System.out.println(employee.getPhoneNo());
        System.out.println(employee.getPayment());

        // The end.

     
    }
}