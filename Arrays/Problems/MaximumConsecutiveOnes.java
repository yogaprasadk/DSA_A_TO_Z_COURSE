import java.util.Scanner;
//https://leetcode.com/problems/max-consecutive-ones/description/
public class MaximumConsecutiveOnes {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Size: ");
        int size = S.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Array Elements: ");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = S.nextInt();
        }
        int ans = ConsecutiveOne(arr);
        System.out.println(ans);
    }

    private static int ConsecutiveOne(int[] arr) {
         int count = 0;
         int max = 0;

         for(int i = 0;i<arr.length;i++){
            if(arr[i] == 1){
                count++;
                max = Math.max(count,max);
            }
            else{
                count = 0;
            }
         }
         return max;
    }
}
