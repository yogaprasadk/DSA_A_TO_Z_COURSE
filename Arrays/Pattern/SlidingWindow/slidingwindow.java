package Pattern.SlidingWindow;
import java.util.*;
public class slidingwindow {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter K SIze:");
        int kSize = S.nextInt();
        System.out.print("Enter Array Size:");
        int arrSize = S.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = S.nextInt();
        }
        
        System.out.println("Maximum subArray sum:"+ maxSum(arr,kSize));
    }

    public static int maxSum(int[] arr,int size){
        int windowSize = size;

        int maxSum = 0;
        int windowSum = 0;
        for(int i = 0;i<windowSize;i++){
            windowSum = windowSize + arr[i];
        }

        maxSum = windowSum;

        for (int i = windowSize; i < arr.length; i++) {
             windowSum += arr[i] - arr[i-windowSize];
             maxSum = Math.max(windowSum,maxSum);
        }

        return maxSum;

    }
}
