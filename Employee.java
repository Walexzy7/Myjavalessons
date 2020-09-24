public class Employee {

    private String firstname;
    private String surname;
    private String sex;
    private int Dob;
    private int PhoneNo;
    private String Email;
     private String Address;
     private String Employlevel;
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

    

    public void setDob(int Dob) {
        this.Dob = Dob;
}
    public void setPhoneNo(int PhoneNo){
        this.PhoneNo = PhoneNo;
    }
   
    public Integer getPhoneNo(){
        return this.PhoneNo;
    }
   
    public Integer getDob() {
        return this.Dob;
    }
     
     

     public void setEmail(String Email) {
         this.Email = Email;

     }
     public void setAddress(String Address) {
        this.Address = Address;
     }
      
      public void setEmploylevel(String Employlevel) {
          this.Employlevel = Employlevel;
      }

      public String getEmail() {
            return this.Email;
      }

      public String getAddress(){
          return this.Address;
      }

      public String getEmploylevel(){
          return this.Employlevel;
      }
    
    

     public void setPayment(int payment){
         this.Payment = Payment;
     }

     public Integer getPayment(){
         return this.Payment;
     }

        


    }
