import java.util.*;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
public class findallduplicateorrepeatednumbers {
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
        List<Integer> ans = findDuplicate(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
        System.out.println(ans);
    
    }

    private static List<Integer> findDuplicate(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int size = nums.length;
        while (i < size) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swapping(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                ans.add(nums[j]);
            }
        }
        return ans;
    }

    public static void swapping(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
