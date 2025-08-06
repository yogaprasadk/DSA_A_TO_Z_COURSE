import java.util.Arrays;
import java.util.Scanner;

// GFG  - https://www.geeksforgeeks.org/problems/insertion-sort/1
public class insertionsort {
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
        Inssort(arr,size);
        System.out.println("After Sorting: "+Arrays.toString(arr));
    }

    private static void Inssort(int[] arr, int size) {
        // Insertion Sort is otherwise known as In Place comparison - Based Algorithm
        // it divides the array in to two parts,sorted part and an unsorted part.
        // it works by sequentially picking up unsorted items and inserting them into right position in sorted array.

        /*
        Example array:
        Sorted array [9,6,8,2,7,1] unsorted array

        Pass 1:
        key = [6] => arr next element copy
        if(arr[0] > arr[i+1]) change values => [6,9,8,2,7,1]

        Pass 2:
        key = [8] -> arr next element copy
        if(arr[0] > arr[i+1]) change values => [6,8,9,2,7,1]

        Pass 3:
        key = [2] -> arr next element copy
        if(arr[0] > arr[i+1] changes values No
        now check back-wise -> [arr[i] < arr[key]] -> [6,8,9,2,7,1] -> [6,8,2,9,7,1] -> [6,2,8,9,7,1] -> [2,6,8,9,7,1]

        Pass 4:
        key = [7] -> arr next element copy
        if(arr[i] > arr[i+1])  no
        now check back wise -> [arr[i] < arr[key]] -> [2,6,8,9,7,1] -> [2,6,8,7,9,1] -> [2,6,7,8,9,1]

        Pass 4:
        key = [1] -> arr next element copy
        if(arr[i] > arr[i+1]] no
        now check back wise -> [arr[i] < arr[key]] -> [2,6,7,8,9,1] -> [2,6,8,7,1,9] -> [2,6,7,1,8,9] -> [2,6,1,7,8,
        9] -> [2,1,6,7,8,9] -> [1,2,6,7,8,9]
         */

        for (int i = 1; i <size ; i++) {
                int key = arr[i];
                int j = i-1;
                while((j>=0) && (arr[j] > key)){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = key;
        }
    }
}
