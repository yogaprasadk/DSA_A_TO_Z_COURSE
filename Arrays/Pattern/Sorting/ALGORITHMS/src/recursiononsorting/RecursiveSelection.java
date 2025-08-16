import java.util.Arrays;
import java.util.Scanner;

public class RecursiveSelection {
   static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Size: ");
        int n = S.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = S.nextInt();
        }
        System.out.print("Array Before Sorting: " + Arrays.toString(arr));
        System.out.println();
        recursivselection(arr, arr.length-1, 0,0);
        System.out.println("Arrays After Sorting: " + Arrays.toString(arr));
    }

    private static void recursivselection(int[] arr, int i, int j,int max) {
        if(i==0){
            return;
        }

        if(j <= i){ // i-arr.length j = 0
            if(arr[j]>arr[max]){
                recursivselection(arr, i, j+1, j);
            }
            else{
                recursivselection(arr, i, j+1, max);
            }
        }
        else{
            swap(arr,i,max);
            recursivselection(arr, i-1, 0, 0);
        }
    }

    private static void swap(int[] arr, int i, int max) {
        int temp = arr[i];
        arr[i] = arr[max];
        arr[max]  = temp;
    } 

}

// TC: O(N2) SC:O(N2)