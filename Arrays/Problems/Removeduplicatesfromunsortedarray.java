import java.util.Arrays;
import java.util.Scanner;
/// https://www.geeksforgeeks.org/problems/remove-duplicates-from-unsorted-array4141/1
public class Removeduplicatesfromunsortedarray {
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

        int[] ans = removeDuplicates(arr);
        System.out.println(Arrays.toString(ans));

        S.close();
    }

    private static int[] removeDuplicates(int[] arr) {
    
        // Better Solution TC - O(N) SC - O(N)

        int ans[] = new int[arr.length];
        int len = arr.length;
        int max = 1000001;
        boolean[] seen = new boolean[max];
    
        int k = 0;
        for(int i = 0;i<len;i++){
            if(seen[arr[i]]==false){
                seen[arr[i]] = true;
                ans[k] = arr[i];
            }
            k++;
        }
        return ans;
    }
}
