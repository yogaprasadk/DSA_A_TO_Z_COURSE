import java.util.Arrays;
import java.util.Scanner;

// https://leetcode.com/problems/find-the-duplicate-number/description/

public class Duplicatenumber {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Size: ");
        int size = S.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = S.nextInt();
        }
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        int ans = findDuplicate(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
        System.out.println(ans);
    }

    private static int findDuplicate(int[] nums) {
        int i = 0;
        int size = nums.length;
        while (i < size) 
        {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swapping(nums, i, correct);
                } else {
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        // If no duplicate found, return -1
        return -1;
    }

    public static void swapping(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}