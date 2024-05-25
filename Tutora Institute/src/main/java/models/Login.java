 
package models;

 
public class Login {
    
      private String userid;
      private String password;
    private String accounttype;

    public Login(String userid, String password, String accounttype) {
        this.userid = userid;
        this.password = password;
        this.accounttype = accounttype;
    }

    public String getUserid() {
        return userid;
    }

    public String getPassword() {
        return password;
    }

    public String getAccounttype() {
        return accounttype;
    }
    
}
