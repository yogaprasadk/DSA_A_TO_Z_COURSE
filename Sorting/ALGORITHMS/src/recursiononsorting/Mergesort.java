import java.util.Arrays;
import java.util.Scanner;

public class Mergesort {
    // GFG - https://www.geeksforgeeks.org/problems/merge-sort/1
    /*
           It is a divide and conquer method
           Merge sort can be applied on Unsorted arrays
           Unsorted arrays can be divided into sub arrays until it have one element
           after sorting these subarrays can be merged until it have one element..

           EXAMPLE: [9,6,8,2,7,1]
           NOW IT BE DIVIDED INTO TWO SUB ARRAYS
           [9,6,8] [2,7,1]
           NOW AGAIN IT REPEATS UNTIL 1 SINGLE ELEMENT
           [9,6] [8] [2,7] [1]
           [9] [6] [8] [2] [7] [1]

           no of recursive calls = 2*n-1
           n = 6 -> 2*6 - 1 = 11 recursive calls

           first 9 and 6 will get selected
           [9] [6]
           now sort and merge
           [6,9]

           then 8
           [6,8,9]

           now it move on right and select 2 and 7
           it will be sorted position

           now it move to 1

           1 is get compared with 2 and 7
           which is smallest now swap and merge
           it becomes [1,2,7]

           now we need to merge two sorted arrays into a single sorted array
           when merging we need to compare thevalues and then place it at correct position

           [6,8,9] [1,2,7]
           [1,2,6,7,8,9]
     */
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
        mersort(arr,0,arr.length-1);
        System.out.println("After Sorting: "+Arrays.toString(arr));
    }
    public static void mersort(int[] arr,int start,int end){
        if(start == end){
            return;
        }

        // mid value
        int mid = (start+end)/2;
        // divide array into two subarrays
        mersort(arr,start,mid);
        mersort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }

    public static void merge(int[] arr,int start,int mid,int end){
        // copy left new array created
        int[] leftarray = new int[mid-start+1]; // 2-0+1 = 3
        // copy right new array created
        int[] rightarray = new int[end - mid]; // 5 - 2 = 3

        // now copy
        for (int i = 0; i < leftarray.length; i++) {
            leftarray[i] = arr[start+i];
        }
        for (int j = 0;j < rightarray.length; j++) {
            rightarray[j] = arr[mid+j+1];
        }

        int i = 0,j=0;
        while(i< leftarray.length && j<rightarray.length){
            if(leftarray[i]<rightarray[j]){
                arr[start++] = leftarray[i++];
            }
            else{
                arr[start++] = rightarray[j++];
            }
        }

        while(i<leftarray.length){
            arr[start++] = leftarray[i++];
        }

        while (i<rightarray.length){
            arr[start++] = rightarray[j++];
        }
    }
}
