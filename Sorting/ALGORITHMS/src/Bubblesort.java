import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {
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
        System.out.println("Before Sorting: "+Arrays.toString(arr));
        bubblesort(arr,size);
        System.out.println("After Sorting: "+Arrays.toString(arr));
    }

    private static void bubblesort(int[] arr,int n) {
            /*
            // bubble sort works by repeatedly comparing adjacent elements and swapping them if they are in wrong order
            Example:[11,6,23,8,14,2]
            pass1:[11,6,23,8,14,2] -> [6,11,23,8,14,2] -> [6,11,8,23,14,2] -> [6,11,8,14,23,2] -> [6,11,8,14,2,23]
            pass2:[6,11,8,14,2,23] -> [6,8,11,14,2,23] -> [6,8,11,2,14,23]
            pass3:[6,8,11,2,14,23] -> [6,8,2,11,14,23]
            pass4:[6,8,2,11,14,23] -> [6,2,8,11,14,23]
            pass5:[6,2,8,11,14,23] -> [2,6,8,11,14,23]
             */
        
        for (int i = 0; i <n-1 ; i++) {
            // pass
            for (int j = 0; j < n - 1 - i ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
