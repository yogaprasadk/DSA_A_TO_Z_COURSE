package instagram;

public class User{
    public String userName;
    private String password;
    private String emailId;

    User(){
        userName = "Yoga_mk";
        password  = "12345";
        emailId  = "yogainsta@gmail.com"; 
    }

    User(String userName,String password,String emailId){
        this.userName = userName;
        this.password  = password;
        this.emailId  = emailId;
    }

    /*Getter */
    // password 
    public String getPassword(){
        return password;
    }

    // emailid
    public String getEmailId(){
        return emailId;
    }

    /* Setter */
    //password
    public void setPassword(String password){
        this.password = password;
    }

    // emailid
    public void setEmailId(String emailId){
        this.emailId = emailId;
    }
}