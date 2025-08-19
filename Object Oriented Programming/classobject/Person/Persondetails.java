package Person;

public class Persondetails {
    public static void main(String[] args) {
        Persons person = new Persons("John", 30, "New York");
        Persons person2 = new Persons("Alice", 25, "Los Angeles");
        Persons person3 = new Persons("Bob", 28, "Chicago");
        Persons person4 = new Persons("Eve", 22, "Miami");
        Persons person5 = new Persons("Charlie", 35, "Seattle"); 
        person.displaydetails();
        person2.displaydetails();
        person3.displaydetails();
        person4.displaydetails();
        person5.displaydetails();
        person.repeat();
    }
}
