package instagram.industrylevelcode;

public class User 
{
    private String userName;
    private String emailId;
    private String password;

    // default constructor
    public User() {
        this.userName = "yogaprasad";
        this.password = "w3@3$typ3";
        this.emailId = "yogaprasadinsta@gmail.com";
    }

    // parameterized constructor
    public User(String userName, String emailId, String password) {
        this.userName = userName;
        this.emailId = emailId;
        this.password = password;
    }

    // getter UserName
    public String getUserName() {
        return userName;
    }

    // getter emailId
    public String getEmailId() {
        return emailId;
    }

    // Setter for emailId with validation
    public void setEmailId(String emailId) {
        if (emailId == null || !emailId.contains("@")) {
            throw new IllegalArgumentException("Email must contain '@'");
        }
        this.emailId = emailId;
    }

    // Change Password Method - requires old password
    public boolean changePassword(String oldPassword,String newPassword){
        if(this.password.equals(newPassword)){
            this.password = newPassword;
            return true;
        }
        return false;
    }
        // for UI get Masked Password
    public String getMaskedPassword() {
        return "*".repeat(password.length());
    }
}