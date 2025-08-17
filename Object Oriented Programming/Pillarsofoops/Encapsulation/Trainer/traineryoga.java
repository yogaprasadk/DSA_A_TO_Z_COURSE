package Trainer;

public class traineryoga {
    public static void main(String[] args) {
        classroom401 trainer = new classroom401();
        // trainer name
        System.out.println("Trainer: "+trainer.name);
        // trainer laptop
        System.out.println("Trainer Laptop: "+trainer.laptop());
        // trainer laptop change
        System.out.print("Trainer changed laptop: ");
        trainer.changelaptop("Dell");
        System.out.println(trainer.laptop());

    }
}
