import java.util.Arrays;
import java.util.Scanner;

public class Radixsort {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Size: ");
        int size = S.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = S.nextInt();
        }
        System.out.println("Before Sorting: "+Arrays.toString(arr));
        radsort(arr,size);
        System.out.println("After Sorting: "+Arrays.toString(arr));
    }

    private static void radsort(int[] arr, int size) {
        /*
        it is one of the easiest algorithm
        [29,83,471,36,91,8]

        find the largest and count the digits that time count the counting sort need to run

        sort the array using count sort
        digit by digit start from the least

        sort by base values
        <-  10000 <- 1000 <- 10 <- 1
        29 ,83, 471 , 36, 91 , 8
        all 1 place highlighted
        now sort according to base

        it is base 1 values sorted it becomes 471,91,83,36,8,29
        it is base 10 values sorted it becomes 08,29,36,471,83,91
        it is base 100 values sorted it becomes 08,029,036,083,091,471


         */

    }
}
