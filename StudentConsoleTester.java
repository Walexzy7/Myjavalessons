import java.util.Scanner;

public class StudentConsoleTester {
    public static void main(String [] args){          

        //instantiate a new student object
        Student student = new Student();

        student.setNameOfSchool(args[0]);
        student.setFirstname(args[1]);
        student.setSurname(args[2]);
        student.setDepartment(args[3]);

        System.out.println(student.getFirstname());


    }
}