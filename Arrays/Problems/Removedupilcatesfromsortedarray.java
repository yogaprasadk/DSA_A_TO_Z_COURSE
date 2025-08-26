
// import java.util.Arrays;
import java.util.Scanner;


// Leetcode - https://leetcode.com/problems/remove-duplicates-from-sorted-array/description
public class Removedupilcatesfromsortedarray {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter Array Size ");
        int arrSize = S.nextInt();
        if (arrSize <= 0) {
            System.out.println("Enter arrSize greater than 0");
            return;
        }

        // dynamic array
        int[] arr = new int[arrSize];

        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = S.nextInt();
        }

        int ans = removeDuplicates(arr);
        System.out.println(ans);

        S.close();
    }

    private static int removeDuplicates(int[] arr) {
        
        // Hint: Remove dupilcates from array use Hashset SC:O(N) TC O(n Logn)

        // use two pointers
        // Better Solution TC - O(N) SC - O(1)

        int len = arr.length;
        int i = 0;
        for (int j = 1; j < len; j++) {
            // if arr first value must be not equal to the next element
            // if not equals means replace the element in the index place the notequalse
            // element

            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }

}