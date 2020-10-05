import java.util.Scanner;

public class StudentTester {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        //create new variables to holder Student properties
        String nameOfSchool;
        String firstname;
        String surname;
        String department;
        int level;
        String sex;
        int year;     
        int age;
        String matricNo;
        String address;
        String faculty;

        //accept inputs from user
        System.out.println("Enter name of your school");
        nameOfSchool = input.nextLine();
        System.out.println("Enter Firstname");
        firstname = input.nextLine();
        System.out.println("Enter Surname");
        surname = input.nextLine();
        System.out.println("Enter Department");
        department = input.nextLine();
        System.out.println("Enter Address");
        address = input.nextLine();
        System.out.println("Enter Faculty");
        faculty = input.nextLine();
        System.out.println("Enter Matriculation Number");
        matricNo = input.nextLine();
        System.out.println("Enter Sex");
        sex = input.nextLine();
        System.out.println("Enter Level");
        level = input.nextInt();
        System.out.println("Enter Year");
        year = input.nextInt();
        System.out.println("Enter Age");
        age = input.nextInt();

        //instantiate a new student object
        Student student = new Student();
        Student student2 = new Student(firstname, surname);

        student.setNameOfSchool(nameOfSchool);
        student.setFirstname(firstname);
        student.setSurname(surname);
        student.setDepartment(department);

        System.out.println(student.getFirstname());
        System.out.println(student2.getFirstname());


    }
}