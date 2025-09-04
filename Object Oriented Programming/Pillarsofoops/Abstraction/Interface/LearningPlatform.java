public interface LearningPlatform {
    public  void login();
    public  void logout();
    public  void course();
}

class Udemy implements LearningPlatform{
    public  void login(){
        System.out.println("Login Done");
    }

    public void logout(){
        System.out.println("logout done");
    }

    public void course(){
        System.out.println("");
    }
}