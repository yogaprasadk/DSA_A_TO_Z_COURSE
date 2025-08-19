package Singletonclass;
// A CLASS FOR ONLY ONE OBJECT is called Singleton class.
public class Singletonclass {
    // non primitive
    private String database = "Oracle";

    // class Datatypes created like this
    private static Singletonclass ref;

    // constructor
    private Singletonclass() {

    }

    // getter
    public String getDatabase() {
        return database;
    }

    // setter
    public void setDatabase(String database) {
        this.database = database;
    }

    // constructor is private so we cant able to access methods present here in
    // another class

    // so we create a static method to return the constructor method
    public static Singletonclass createDatabase() {
        if (ref == null) {
            Singletonclass sc = new Singletonclass();
            ref = sc;
        }
        return ref;
    }
}
