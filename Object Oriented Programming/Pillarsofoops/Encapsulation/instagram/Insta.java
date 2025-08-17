package instagram;

public class Insta {
    public static void main(String[] args) {
        User yoga = new User();
        // username
        System.out.println("Username: "+yoga.userName);
        // password
        System.out.println("Old Password: "+ yoga.getPassword());
        // emailid
        System.out.println("Old Email Id: "+ yoga.getEmailId());
        // change password
        yoga.setPassword("23456");
        System.out.println("New Password: "+ yoga.getPassword());

        // change email_id
        yoga.setEmailId("yoga@gmail.com");
        System.out.println("New Email Id: "+ yoga.getEmailId());
    }
}
