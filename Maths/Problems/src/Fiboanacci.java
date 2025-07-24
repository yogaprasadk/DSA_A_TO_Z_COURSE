public class Fiboanacci {
    // https://leetcode.com/problems/fibonacci-number/description/
    public static void main(String[] args) {
            int n = 6;
                int sum = 0;
                int sum1 = 1;
                for(int i = 0;i<n;i++) {
                    int sum2 = sum1 + sum;
                    sum = sum1;
                    sum1 = sum2;
                }
        System.out.println(sum);
    }
}
