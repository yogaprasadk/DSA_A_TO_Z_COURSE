import java.util.Scanner;
public class Reversearray {
    // GFG - https://www.geeksforgeeks.org/problems/reverse-an-array/1
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N:");
        int N = S.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = S.nextInt();
        }
        reversearray(arr);
    }

    private static void reversearray(int[] arr) {
        swapping(arr,0,arr.length-1);
    }

    private static void swapping(int[] arr, int start, int end) {
            if(start >= end){
                return ;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            swapping(arr,start+1,end-1);
    }
}


/*

   without recursion
   1.Two Pointer Method

   int start =0;
   int end = arr.length -1;

   while(start<end){
   int temp = arr[start];
   arr[start] = arr[end];
   arr[end] = temp;
   }

   2. iterative method

   for(int i = 0;i<arr.length/2;i++){
   int temp = arr[i];
   arr[i] = arr[arr.length-1-i];
   arr[arr.length-1-i] = temp;
   }

 */