package classobject.Person;

public class Persondetails {
    public static void main(String[] args) {
        Person person = new Person("John", 30, "New York");
        Person person2 = new Person("Alice", 25, "Los Angeles");
        Person person3 = new Person("Bob", 28, "Chicago");
        Person person4 = new Person("Eve", 22, "Miami");
        Person person5 = new Person("Charlie", 35, "Seattle"); 
        person.displaydetails();
        person2.displaydetails();
        person3.displaydetails();
        person4.displaydetails();
        person5.displaydetails();
        person.repeat();
    }
}
