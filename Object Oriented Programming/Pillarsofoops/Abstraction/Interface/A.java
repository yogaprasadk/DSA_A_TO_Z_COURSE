public interface A {
    //x can be accessible  nad print the value because it is a non static method.
    int x = 10;
    public static void main(String[] args) {
        System.out.println(x);
    }
}
