public interface Notfications {
    public void SendMessage(String msg);
}

class SMS implements Notfications{
     public void SendMessage(String msg){
        System.out.println("SMS");
        System.out.println(msg);
     }      
}

class Email implements Notfications {
     public void SendMessage(String msg){
        System.out.println("SMS");
        System.out.println(msg);
     }   
}