import java.util.*;
public class Algorithm {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Array Size: ");
        int arrSize = S.nextInt();

        System.out.print("Enter Array Elements");
        int[] arr = new int[arrSize];


        for(int i = 0;i<arrSize;i++){
            arr[i] = S.nextInt();

        }

        int ans = KadaneAlgorithm(arr);
        System.out.println("Maximum SubArray Sum: "+ ans);
    }

    public static int KadaneAlgorithm(int[] arr){
        //current Sum
        int cs = 0;
        //Max Sum
        int ms = Integer.MIN_VALUE;
        /*
         Three Rules for Kadane Algorithm
         1.Add Values
         2.if currentsum is greater than max sum => maxsum = current sum
         3.if current sum < 0 => currentsum = 0
         4.return maxSum
         */

         for(int num: arr){
                cs += num;
                if(cs > ms){
                    ms = cs;
                }    
                if(cs < 0){
                    cs = 0;
                }
         }
         return ms;
    }
}
