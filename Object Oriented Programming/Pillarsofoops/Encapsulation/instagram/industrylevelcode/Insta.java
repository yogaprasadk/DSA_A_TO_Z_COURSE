package instagram.industrylevelcode;
import java.util.*;
public class Insta 
{
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        User yoga = new User();
        // username
        System.out.println("Username: " + yoga.getUserName());

        // masked password instead of plain password
        System.out.println("Password: " + yoga.getMaskedPassword());

        // email id
        System.out.println("Email Id: " + yoga.getEmailId());

        // secure password change
        System.out.print("Enter old password to change it: ");
        String oldPwd = S.nextLine();

        System.out.print("Enter new password: ");
        String newPwd = S.nextLine();
        
        if(yoga.changePassword(oldPwd, newPwd)){
            System.out.println("Password Changed Successfully!");
        } else {
            System.out.println("Incorrect old password. Password not changed");
        }

        System.out.println("Current (masked) password: " + yoga.getMaskedPassword()); 
        
        // change email id with validation
        System.out.print("Enter new email id: ");
        String newEmail = S.nextLine();
        try {
            yoga.setEmailId(newEmail);
            System.out.println("New Email Id: " + yoga.getEmailId());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid email! " + e.getMessage());
        }

        S.close();
    }
}
