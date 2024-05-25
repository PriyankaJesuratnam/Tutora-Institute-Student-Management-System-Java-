 
package models;

 
public class Employee {
    
    
      private String employeeid;
      private String password;
    private String accounttype;
    
     public Employee(String employeeid, String password, String accounttype) {
         
        this.employeeid = employeeid;
        this.password = password;
        this.accounttype = accounttype;
    }
     
     
    public String getEmployeeid() {
        return employeeid;
    }

    public String getPassword() {
        return password;
    }

    public String getAccounttype() {
        return accounttype;
    }
    
    

    
}
