/**
 * A new student class
 * Author: Wale
 * Date: 25th September 2020
 */

public class Student {

    //class properties
     private String nameOfSchool;
     private String firstname;
     private String surname;
     private String department;
     private int level;
     private String sex;
     private int year;     
     private int age;
     private String matricNo;
     private String address;
     private String faculty;

     public Student(){

     }
     
     public Student(String firstname, String surname){
         this.firstname = firstname;
         this.surname = surname;

     }

     //set methods
     public void setNameOfSchool(String nameOfSchool){
         this.nameOfSchool = nameOfSchool;
     }
     public void setFirstname(String firstname) {
         this.firstname = firstname;
     }

     public void setSurname(String surname) {
         this.surname = surname;
     }
     public void setDepartment(String department) {
         this.department = department;
     }
     public void setLevel(int level) {
         this.level = level;
     }
     public void setSex(String sex) {
         this.sex = sex;
     }
     public void setYear(int year) {
         this.year = year;
     }
    
     public void setAge(int age) {
         this.age = age;
     }
     public void setMatricNo(String matricNo) {
         this.matricNo = matricNo;
     }
     public void setAddress(String address) {
         this.address = address;
     }
     public void setFaculty(String faculty) {
         this.faculty = faculty;
     }


    //get methods
    public String getNameOfSchool(){
        return this.nameOfSchool;                
     }
     public String getFirstname() {
         return this.firstname;
     }
     public String getSurname() {
         return this.surname;
     }
     public String getDepartment(){
         return this.department;
     }
     public int getLevel() {
         return this.level;
     }
     public String getSex(){
         return this.sex;
     }
     public int getYear() {
         return this.year;
     }
     
     public int getAge(){
         return this.age;
     }
     public String getMatricNo() {
         return this.matricNo;
     }
     public String getAddress(){
         return this.address;
     }
     public String getFaculty(){
         return this.faculty;
     }
 }

