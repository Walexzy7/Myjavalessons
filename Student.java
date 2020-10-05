 public class Student {
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

     Student(){
    }
     Student(String nameOfSchool){
         this.nameOfSchool = nameOfSchool;
     }
     Student(String nameOfSchool, String firstname){
         this.nameOfSchool = nameOfSchool;
         this.firstname = firstname;
     }
     Student(String nameOfSchool, String firstname, String surname){
         this.nameOfSchool = nameOfSchool;
         this.firstname = firstname;
         this.surname = surname;
     }
     Student(String nameOfSchool, String firstname, String surname, String department){
         this.nameOfSchool = nameOfSchool;
         this.firstname = firstname;
         this.surname = surname;
         this.department = department;
     }
     Student(String nameOfSchool, String firstname, String surname, String department, int level){
         this.nameOfSchool = nameOfSchool;
         this.firstname = firstname;
         this.surname = surname;
         this.department = department;
         this.level = level;
     }
     Student(String nameOfSchool, String firstname, String surname, String department, int level, String sex){
         this.nameOfSchool = nameOfSchool;
         this.firstname = firstname;
         this.surname = surname;
         this.department = department;
         this.level = level;
         this.sex = sex;
     }
     Student(String nameOfSchool, String firstname, String surname, String department, int level, String sex, int year){
         this.nameOfSchool = nameOfSchool;
         this.firstname = firstname;
         this.surname = surname;
         this.department = department;
         this.level = level;
         this.sex = sex;
         this.year = year;
     }
     Student(String nameOfSchool, String firstname, String surname, String department, int level, String sex, int year, int age){
         this.nameOfSchool = nameOfSchool;
         this.firstname = firstname;
         this.surname = surname;
         this.department = department;
         this.level = level;
         this.sex = sex;
         this.year = year;
         this.age = age;
     }
     Student(String nameOfSchool, String firstname, String surname, String department, int level, String sex, int year, int age, String matricNo){
         this.nameOfSchool = nameOfSchool;
         this.firstname = firstname;
         this.surname = surname;
         this.department = department;
         this.level = level;
         this.sex = sex;
         this.year = year;
         this.age = age;
         this.matricNo = matricNo;
     }
     Student(String nameOfSchool, String firstname, String surname, String department, int level, String sex, int year, int age, String matricNo, String address){
         this.nameOfSchool = nameOfSchool;
         this.firstname = firstname;
         this.surname = surname;
         this.department = department;
         this.level = level;
         this.sex = sex;
         this.year = year;
         this.age = age;
         this.matricNo = matricNo;
         this.address = address;
     }
     Student(String nameOfSchool, String firstname, String surname, String department, int level, String sex, int year, int age, String matricNo, String address, String faculty){
         this.nameOfSchool = nameOfSchool;
         this.firstname = firstname;
         this.surname = surname;
         this.department = department;
         this.level = level;
         this.sex = sex;
         this.year = year;
         this.age = age;
         this.matricNo = matricNo;
         this.address = address;
         this.faculty = faculty;
     }

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

