import java.util.Scanner;

public class sumofprime1ton {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter N:");
        int N = S.nextInt();
        System.out.println(sumofprime(N));
    }

    // TC: O(n2)
    /*
    private static int sumofprime(int n){

        int count = 0;
        for (int i = 1; i <=n ; i++) {
            int primecount = 0;
            for (int j = 1; j <= i; j++) {
                if(i%j==0){
                    primecount++;
                }
            }
            if (primecount==2){
                count = count + i;
            }
        }
        return count;
    }
    */

    // TC - O(N SQRTN)
    /*
    public static boolean isPrime(int num) {
        if (num <= 1) { // Numbers less than or equal to 1 are not prime
            return false;
        }
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false; // Not prime if divisible by any number other than 1 and itself
            }
        }
        return true; // If no divisors found, it's prime
    }

    public static int primeSum(int n) {
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) { // Call the helper function
                sum += i;
            }
        }
        return sum;
    }

    */

    // optimal using sieve of eratothenesis - O(N Log Log N)
    private static int sumofprime(int n) {
        if(n<=1){
            return 0;
        }
        boolean[] composite = new boolean[n+1]; // increasing n value to n+1
        for(int i = 2;i*i<=n;i++)
        {
            if(!composite[i]){
                for (int j = i*i; j <=n; j=j+i) { // check upto N
                    composite[j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i <=n; i++) {  // check upto N
            if(!composite[i]){ // false
                count = count+ i;
            }
        }
        return count;
    }
}
