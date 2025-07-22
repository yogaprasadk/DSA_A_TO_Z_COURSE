public class PowerofExponentation {
   // leetcode 50-  https://leetcode.com/problems/powx-n/description/
    public static void main(String[] args) {
        int n = 3;
        int x = 5;
        System.out.println(optimal(n,x));
    }
    public static int brute(int n,int x){
        int power =1;
        for (int i = 1; i <= n; i++) {
            power = power * x;
        }
        return power;
    }

    public static int optimal(int n,int x){
        // n - power
        int m = n;
        int ans = 1; // if double change double ans =1.0;
        while(n>0){
            if(n%2==1){
                ans = ans * x;
                n = n-1;
            }
            else{
                n = n/2;
                x = x*x;
            }
        }
        if(m<0){
            ans = 1/ans;
        }
        return ans;
    }

}
// 5 * 1 = 5
// 5 * 5 = 25
// 25 * 5 = 125