
// GFG - https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
import java.util.*;
import java.util.InputMismatchException;

public class UnionOfTwoArrays {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        try {
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

            int arrSize2 = S.nextInt();
            if (arrSize2 <= 0) {
                System.out.println("Enter arrSize greater than 0");
                return;
            }

            // dynamic array
            int[] arr2 = new int[arrSize2];

            System.out.print("Enter Array2 Elements: ");
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = S.nextInt();
            }
            ArrayList<Integer> ans = findUnion(arr, arr2);
            System.out.println(ans);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integers only.");
        }

        finally {
            S.close();
        }
    }

    private static ArrayList<Integer> findUnion(int[] arr, int[] arr2) {
        // using two pointers
        ArrayList<Integer> Union = new ArrayList<>();

        int len1 = arr.length;
        int len2 = arr2.length;
        int i = 0, j = 0;
        while (i < len1 && j < len2) {
            if (arr[i] <= arr2[j]) {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr[i]) {
                    Union.add(arr[i]);
                }
                i++;
            }

            else {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j]) {
                    Union.add(arr2[j]);
                }
                j++;
            }
        }

        while(i<len1)
        {
            if (Union.size() == 0 || Union.get(Union.size() - 1) != arr[i]) {
                    Union.add(arr[i]);
                }
                i++;
        }

        while(j<len2)
        {
            if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j]) {
                    Union.add(arr2[j]);
                }
                j++;
        }
        return Union;
    }
}