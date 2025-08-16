import java.util.Arrays;
import java.util.Scanner;
// GFG - https://www.geeksforgeeks.org/problems/selection-sort/1
// TC: O(N2)
// AS OR SC: O(1)
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

        //Dividing the array into two parts
        sorted on the left
        unsorted on right
        it works repeatedly finding the lowest element from an unsorted array and putting in the sorted part
         */


        /*
        Sorted Array [11,6,23,8,2,14] unSorted Array
        first minimum is 11; // 0 is the index value
        min = 0;
        11 > 6 - true [11,6,23,8,2,14]
        update min = 1 // 1 is the index value
         6 > 23 - false [11,6,23,8,2,14]
        min = 1
         6 > 8 - false [11,6,23,8,2,14]
        min = 1
         6 > 2 - true [11,6,23,8,2,14]
         min = 4;
         so it update to first minimum and get swapped
         [2,6,23,8,11,14]
         Pass 1 - [2,6,23,8,11,14]

         // min = 1; sorting start from [6,23,8,11,14]
         here 6 lowest so it not swapped
         Pass 2 - [2,6,23,8,11,14]

         //min = 2; sorted start from [23,8,11,14]
         23
         min = 3
         8 > 11 8 > 14 - false
         so swapped
         Pass 3 - [2,6,8,23,11,14]

         // min = 3 sorted start from [23,11,14]
         23
         min = 4
         11 < 14 - true
         so swapped
         Pass 4 - [2,6,8,11,23,14]

         // min = 4 sorting start from [23,14]
         min = 5
         no elements to compare
         so swapped
         Pass 5 - [2,6,8,11,14,23]
         */
        for(int i = 0;i<size-1;i++){
            int min = i;
            for (int j = i+1; j <= size-1; j++) {
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            swap(arr,i,min);
        }
    }

    private static void swap(int[] arr, int i, int min) {
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
}
