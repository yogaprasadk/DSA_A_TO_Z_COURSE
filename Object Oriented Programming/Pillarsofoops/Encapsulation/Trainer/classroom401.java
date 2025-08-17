package Trainer;

public class classroom401{
    public String name;
    private String laptop;

    public classroom401(){
        name = "praburam";
        laptop = "Acer";
    }

    public classroom401(String name,String laptop){
        this.name    = name; 
        this.laptop  = laptop;
    }

    // getter
    public String laptop(){
        return laptop;
    }

    // setter
    public void changelaptop(String laptop){
        this.laptop = laptop;
    }
}