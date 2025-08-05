import java.util.Arrays;
import java.util.Scanner;

public class bubblesortrecursion {
    static Scanner S = new Scanner(System.in);

    // bubble sort is a sorting algorithm
    // bubble sort is otherwise known as "Comparison sort or Sinking sort"
    public static void main(String[] args) {
        /*
         Smaller Values which are lighter gradually bubble up to the top of the list.
        Larger Values which are heavier gradually sink to the bottom of the list.

        Top - 2
              5
              8
              11
              12
              16
      bottom - 25

        Use cases:
        It is inefficient
        It takes a long time when data set is big
        It is not used in the real world
        It is used for only educational purposes
         */
        System.out.print("Enter Size: ");
        int size = S.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = S.nextInt();
        }
        System.out.println("Before Sorting: "+ Arrays.toString(arr));
        bubblesort(arr,size,0);
        System.out.println("After Sorting: "+Arrays.toString(arr));
}

    private static void bubblesort(int[] arr, int size,int i) {
        if(size == 1){
            return ;
        }

        if(i == size-1){
            bubblesort(arr,size-1,0);
        }

        if(arr[i]>arr[i+1]){
            swap(arr,i,i+1);
        }

        bubblesort(arr,size,i+1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
