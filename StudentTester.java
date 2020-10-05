import java.util.Scanner;
public class StudentTester {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
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

        // accepts input from users
        System.out.println("Enter name of School");
        nameOfSchool = input.nextLine();

        System.out.println("Enter name of first name");
        firstname = input.nextLine();
        System.out.println("Enter name of Surname");
        surname = input.nextLine();
        System.out.println("Enter name of Department");
        department = input.nextLine();
        System.out.println("Enter your sex");
        sex = input.nextLine();
        System.out.println("Enter your matric No");
        matricNo = input.nextLine();
        System.out.println("Enter your Address");
        address = input.nextLine();
        System.out.println("Enter your Faculty");
        faculty = input.nextLine();
        System.out.println("Enter your Level");
        level = input.nextInt();
         System.out.println("Enter year");
        year = input.nextInt();
        System.out.println("Enter your  age");
        age = input.nextInt();





        Student student1 = new Student();
        Student student2 = new Student(nameOfSchool);
        Student student3 = new Student(nameOfSchool, firstname);
        Student student4 = new Student(nameOfSchool, firstname, surname);
        Student student5 = new Student(nameOfSchool, firstname, surname, department);
        Student student6 = new Student(nameOfSchool, firstname, surname, department, level);
        Student student7 = new Student(nameOfSchool, firstname, surname, department, level, sex);
        Student student8 = new Student(nameOfSchool, firstname, surname, department, level, sex, year); 
        Student student9 = new Student(nameOfSchool, firstname, surname, department, level, sex, year, age);
        Student student10 = new Student(nameOfSchool, firstname, surname, department, level, sex, year, age, matricNo);
        Student student11 = new Student(nameOfSchool, firstname, surname, department, level, sex, year, age, matricNo, address);
        Student student12 = new Student(nameOfSchool, firstname, surname, department, level, sex, year, age, matricNo, address, faculty);


        // instantiating a new student object
    
        Student student = new Student();

        // set method.

        student.setNameOfSchool(nameOfSchool);
        student.setFirstname(firstname);
        student.setSurname(surname);
        student.setDepartment(department);
        student.setAddress(address);
        student.setFaculty(faculty);
        student.setMatricNo(matricNo);
        student.setSex(sex);
        student.setLevel(level);
        student.setYear(year);
        student.setAge(age);

        // get methods.

        System.out.println(student.getNameOfSchool());
        System.out.println(student.getFirstname());
        System.out.println(student.getSurname());
        System.out.println(student.getDepartment());
        System.out.println(student.getAddress());
        System.out.println(student.getFaculty());
        System.out.println(student.getMatricNo());
        System.out.println(student.getSex());
        System.out.println(student.getLevel());
        System.out.println(student.getYear());
        System.out.println(student.getAge());

    }
}
