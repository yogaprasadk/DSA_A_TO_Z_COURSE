
import java.util.*;

public class Mergesortedarraywithextraspace {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
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

        merge(arr, nums);
        S.close();
    }

    // brute
    private static void merge(int[] arr, int[] nums) {

        // create an temparray and store the array

        int[] ans = new int[arr.length + nums.length];
        int left = 0, right = 0;
        for (int index = 0; index < ans.length; index++) {

            if (left < arr.length) {
                ans[index] = arr[left];
                left++;
            }

            else if (right < nums.length) {
                ans[index] = nums[right];
                right++;
            }
        }

        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));
    }
}