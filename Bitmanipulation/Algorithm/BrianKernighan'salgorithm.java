public class Brian{
    public static void main(String[] args) {
        int start = 7;
        int goal = 3;
        int xor = start ^ goal;
        int count = 0;
        while (xor>0){
            xor = xor&(xor-1);
            count++;
        }
        System.out.println(count);
    }
}