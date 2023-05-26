
package Model;
public class User {
    
    private String userName;
    private String password;
    private String email;
    private String Phone;

    public User(String userName, String password, String email, String Phone) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.Phone = Phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    @Override
    public String toString() {
        return this.userName +"\t" +this.password +"\t" +this.email +"\t" + this.Phone ; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
