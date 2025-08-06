import java.util.Arrays;
import java.util.Scanner;


public class Cyclicsort {
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
        csort(arr,size);
        System.out.println("After Sorting: "+Arrays.toString(arr));
    }
    public static void csort(int[] arr,int size){
        /* Cyclic sort is used when there is a range from 1 to n

           here checking the index is value is at correct or not
           if at correct position dont swap
           if it is not at correct position swap

           [2,4,5,1,3]

           2 -> position is 1 so arr[i] - 1
           it will n-1 comparisons

           [2,4,5,1,3] -> [4,2,5,1,3]
           [4,2,5,1,3] -> [1,2,5,4,3] -> [1,2,5,4,3]
           [1,2,5,4,3] -> [1,2,3,4,5]
         */
        int i = 0;
        while(i<size) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swapping(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }
    public static void swapping(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
