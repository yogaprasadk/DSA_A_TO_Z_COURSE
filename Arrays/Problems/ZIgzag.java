import java.util.*;

public class ZIgzag {
    // Even and odd position - zigzag
    //gfg =>  https://www.geeksforgeeks.org/problems/even-and-odd-elements-at-even-and-odd-positions1342/1

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

            System.out.print("Enter Size: ");
            int numSize = S.nextInt();

            if (numSize < 0) {
                System.out.println("Array size must be greater than 0.");
                return;
            }

            int[] nums = new int[numSize];
            System.out.print("Enter Array2 Elements: ");
            for (int index = 0; index < nums.length; index++) {
                nums[index] = S.nextInt();
            }

            arrangeOddAndEven(arr, nums);

        } catch (InputMismatchException e) {
            System.out.println("Enter array correctly");
        } finally {
            S.close();
        }
    }

    private static void arrangeOddAndEven(int[] arr, int[] nums) {

        // create an temparray and store the array

        int[] ans = new int[arr.length + nums.length];
        int left = 0, right = 0;
        for (int index = 0; index < ans.length; index++) {

            if (index%2==0 && left < arr.length) {
                ans[index] = arr[left];
                left++;
            }

            else if (right < nums.length) {
                ans[index] = nums[right];
                right++;
            }
        }
        System.out.println(Arrays.toString(ans));    
    }
}
