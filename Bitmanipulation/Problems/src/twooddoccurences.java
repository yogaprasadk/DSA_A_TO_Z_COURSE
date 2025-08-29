import java.util.ArrayList;
import java.util.Scanner;
// GFG => https://www.geeksforgeeks.org/problems/two-numbers-with-odd-occurrences5846/1
public class twooddoccurences {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Array Size: ");
        int size = S.nextInt();
        System.out.print("Enter Array elements: ");
        int[] arr = new int[size];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = S.nextInt();
        }
        ArrayList<Integer> ans = twoOddNum(arr);
        System.out.print(ans+" ");
    }

    private static ArrayList<Integer> twoOddNum(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        // for (int i = 0; i <= arr.length-1 ; i++) {
            
        // }

        return ans;
    }

}
