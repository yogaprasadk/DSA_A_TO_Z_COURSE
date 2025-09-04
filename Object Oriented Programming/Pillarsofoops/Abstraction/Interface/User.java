
public class User {
    public static void main(String[] args) {
        Notfications user = new SMS();
        user.SendMessage("hi");

        Notfications user1 = new Email();
        user1.SendMessage("HI How are you mama");
    }
}
