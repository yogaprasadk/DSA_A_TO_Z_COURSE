import java.util.Arrays;
import java.util.Scanner;

//  GFG - https://www.geeksforgeeks.org/problems/quick-sort/1
public class quicksort {
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
        quicsort(arr,0,arr.length-1);
        System.out.println("After Sorting: "+Arrays.toString(arr));
    }
    public static void quicsort(int[] arr,int low,int high){

        /* Theory Explanation:

       // Quick Sort is a divide and conquer method
        // This sorting algorithm is purposed by american scientist tony hor
        // it is so named as for large n
        // it is faster than merge sort and other sorting algorithms
        // This sorting algorithm is stable.
        // it is otherwise called as partition - exchange sort
        // Example: [5,9,2,7,3,1,8]
            1.selecting a pivot
            FIRST - 5
            MEDIAN - 7
            LAST - 8

            There are two parts in Quick Sort
            1.Partition()
            2.quicksort()

            [9,1,8,2,7,4,3]
            3 - PIVOT
           Step1.{ shift from left and right
            if the element present in array is greater than pivot just stop when the lowest element is found which is
             less than pivot and swap it}
            [9,1,8,2,7,4,3] -> [2,1,8,9,7,4,3]
            repeat step 1 from 2 and 3 => [2,1,3,9,7,4,8]
            now 3 is in it sorted Position
            now program partition left and right subarray
            left-[2,1] middle[3] right[9,7,4,3]
            now sort will happen on recursively
            on left - [2,1] repeat step 1 to get -> [1,2]
            now it get partitioned [1] [2] now the base case is reached and 1,2,3 are in their sorted position
            now it moves on right side [9,7,4,8]

            here 8 is pivot now repeat step1
            [9,7,4,8] -> [4,7,9,8] -> now shift will be happening on right now 9 is greater than 8 so no element are
            there so just swap it

            now split into partition
            [4,7] [8,9]

            [4] [7] [8] [9] now it is in sorted position

            now combine them -> [1,2,3,4,7,8,9]
         */
        // TC FOR QUICKSORT: O(N LOGN)
        // base case
        if(low>=high){
            return ;
        }
        else{
            // pivot position
            int pivotpos = partition(arr,low,high);
            quicsort(arr,low,pivotpos-1);  //  it divides so LOGN
            quicsort(arr,pivotpos+1,high);
        }
        return ;
    }

    private static int partition(int[] arr, int low, int high) { // O(N)
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}