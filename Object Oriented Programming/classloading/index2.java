package classloading;

public class index2 {
    public static void main(String[] args) {
        System.out.println("This is index2 class in classloading package.");
    }

    static{
        System.out.println("Static block in index2 class executed");
        solve();
        System.err.println(index2.a);
    }

    public static void solve() {
        System.out.println("Solve method called");
    }

    static boolean a = true;

    static{
        System.out.println("I am multiline");
        solve();
        System.out.println("Static block in index2 class executed again");
    }
    
}
