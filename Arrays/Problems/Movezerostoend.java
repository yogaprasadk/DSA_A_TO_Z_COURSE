import java.util.*;

/// https://leetcode.com/problems/move-zeroes/description/
public class Movezerostoend {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Enter Size: ");
            int arrSize = S.nextInt();

            if (arrSize < 0) {
                System.out.println("Array size must be greater than 0.");
                return;
            }

            int[] arr = new int[arrSize];
            System.out.print("Enter Array1 Elements: ");

            for (int index = 0; index < arr.length; index++) {
                arr[index] = S.nextInt();
            }
            movezeroes(arr);
        } catch (InputMismatchException e) {
            System.out.println("Enter input correctly");
        }

        finally {
            S.close();
        }
    }

    // brute force TC - O(N) SC = O(N);
    private static void movezeroes(int[] arr) {
        int countOfZeros = 0;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == 0) {
                countOfZeros++;
            }
        }
        int[] zero = new int[countOfZeros];
        System.out.println(Arrays.toString(zero));
        merge(arr, zero);
    }

    private static void merge(int[] arr, int[] nums) {

        // create an temparray and store the array

        int[] ans = new int[arr.length];
        int left = 0;
        for (int index = 0; index < arr.length; index++) {

            if (arr[index] != 0) {
                ans[left] = arr[index];
                left++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            ans[left] = nums[index];
            left++;
        }
        System.out.println(Arrays.toString(ans));
    }

    // optimal - TC -  O(N) SC - O(1)
    /*
     public static void moveZeros(int[] nums){
        int left = 0;
        for(int i = 0;i<nums.length;i++){
        if(nums[i] != 0){
            nums[left] = nums[i];
            left++;    
        }
        }
        while(left<nums.length){
            nums[left++] = 0;
        }
     } 
     */

     // another approach using snow ball method - https://leetcode.com/problems/move-zeroes/solutions/172432/the-easiest-but-unusual-snowball-java-solution-beats-100-o-n-clear-explanation/
}