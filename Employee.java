public class Employee {

    private String firstname;
    private String surname;
    private String sex;
    private String Email;
    private String Address;
    private String Employeelevel;
    private String Dob;
    private int PhoneNo;
    private int Payment;

    //set methods
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }


    //get methods
    public String getFirstname(){
        return this.firstname;
    }


    public String getSurname(){
        return this.surname;
    }

    

    public void setSex(String sex){
        this.sex = sex;
    }
    public String getSex() {
        return this.sex;
    }

    

    public void setDob(String Dob) {
        this.Dob = Dob;
}
    
   
    public String getDob() {
        return this.Dob;
    }
     
     public void setEmail(String Email) {
         this.Email = Email;

     }
     public void setAddress(String Address) {
        this.Address = Address;
     }
      
      public void setEmployeelevel(String Employlevel) {
          this.Employeelevel = Employeelevel;
      }

      public String getEmail() {
            return this.Email;
      }

      public String getAddress(){
          return this.Address;
      }

      public String getEmployeelevel(){
          return this.Employeelevel;
      }
      public void setPhoneNo(int PhoneNo){
        this.PhoneNo = PhoneNo;
    }
   
    public Integer getPhoneNo(){
        return this.PhoneNo;
    }
    
    

     public void setPayment(int payment){
         this.Payment = Payment;
     }

     public Integer getPayment(){
         return this.Payment;
     }
 }
