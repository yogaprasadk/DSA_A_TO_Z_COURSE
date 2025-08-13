package classobject.Person;

public class Person {
    String name;
    int age;    
    static String Language = "English";
    String city; 

    public void eat(){
        System.out.println("I am Eat");
    }

    public void sleep(){
        System.out.println("I am Sleep");
    }

    public void code(){
        System.out.println("I am Code");
    }

    public void repeat(){
        eat();
        sleep();
        code();
    }

    public Person(String name,int age,String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public void displaydetails(){
        System.out.println("Person name: " + name);
        System.out.println("Person age: " + age);
        System.out.println("Person city: " + city);
        System.out.println("Person Language: " + Language);
    }
}
