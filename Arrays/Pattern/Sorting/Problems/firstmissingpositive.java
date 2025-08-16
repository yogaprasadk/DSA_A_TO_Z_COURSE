
import java.util.*;
public class firstmissingpositive {
    // leetcode - https://leetcode.com/problems/first-missing-positive/
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        int ans = firstMissingPositive(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
        System.out.println("First Missing Positive: " + ans);
    }

    public static int firstMissingPositive(int[] arr)
        {
            // here while loop is because N ranges used in used
            int i = 0;
            while(i < arr.length){
                int correct =  arr[i] - 1;
                if(arr[i]>0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                    swap(arr,i,correct);
                }
                else {
                    i++;
                }
            }
            // search an element which is missing
            for(int index = 0;index<arr.length;index++){
                 if(arr[index] != index){
                    return index+1;
                 }
            }
            return arr.length+1;
        }  

        static void swap(int[] arr,int start,int end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
}
