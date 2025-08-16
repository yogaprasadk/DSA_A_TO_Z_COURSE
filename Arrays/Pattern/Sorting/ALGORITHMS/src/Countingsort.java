import java.util.Arrays;
import java.util.Scanner;
// GFG - https://www.geeksforgeeks.org/problems/counting-sort/1
/*
it is non comparsion algorithm
When the input value is small You can use Counting sort
it is fast in small inputs when compared to comparison algorithms
It is a stable algorithm

disadvantages:
it doesnt work well for decimal values and large values.

   Example:
   [3,4,1,3,2,5,2,8]
   now here find the largest number = 8;

   now create an array with largest number + 1;
   and store the frequency number in them
   EX: [0,1,2,2,1,1,0,0,1]

    indexno = element number
   exclude zero
   store the frequency array value in original array
   [1,2,2,3,3,4,5,8]

    TC : O(M + N)
    SC : O(M)
*/

public class Countingsort {

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
        countsort(arr,size);
       System.out.println("After Sorting: "+Arrays.toString(arr));
    }

    private static void countsort(int[] arr, int size) {
        int max = arr[0];
        if(arr == null || arr.length <=1){
            return;
        }

        for(int num:arr){
            if(num>max){
                max = num;
            }
        }

        // count array
        int[] count = new int[max+1];
        // create frequency array 
        for (int num : arr) {
            count[num] +=  1;
//            count[num]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i]>0){
                // add it to original array so we have taken index=0;
                arr[index] = i;
                index++;
                count[i]--;
            }
        }


    }
}
