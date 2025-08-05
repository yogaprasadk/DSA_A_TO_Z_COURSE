import java.util.Arrays;
import java.util.Scanner;

public class Selectionsort {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Size: ");
        int size = S.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = S.nextInt();
        }
        System.out.println("Before Sorting: "+ Arrays.toString(arr));
        sort(arr,size);
        System.out.println("After Sorting: "+Arrays.toString(arr));
    }
    public static void sort(int[] arr,int size){
        /*
        // Selection sort is otherwise called as "In Place Comparison-Based Algorithm"
        Selection Sort is not suitable for Large data sets.
        It gives average performance.

        //Divide the array into two parts
        sorted on left
        unsorted on right
        it works repeatedly finding the lowest element from unsorted array and putting in the sorted part
         */
    }
}
