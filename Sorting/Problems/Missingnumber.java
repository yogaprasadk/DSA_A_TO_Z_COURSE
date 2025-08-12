// Missing Number in an array
import java.util.Arrays;
import java.util.Scanner; 
// Leetcode - https://leetcode.com/problems/missing-number/description/
public class Missingnumber {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = { 4, 0, 2, 1 };
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        missingNumber(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    public static int missingNumber(int[] nums) {
        // The Number is from range 0 to n so we need to use sorting algorithm here
        // The Sorting ALgorithm that i used here is Cyclic sort
        // Here every element will be at it is own index

        
        // how to find the cor rect answer: Start searching from the start index and the element that is not present in that correct index.that is your answer

        int ans = Cyclicsort(nums);
        return ans; 
    }

        public static int Cyclicsort(int[] arr)
        {
            // here while loop is because N ranges used in used
            int i = 0;
            while(i < arr.length){
                int correct =  arr[i];
                if(arr[i] < arr.length && arr[i] != arr[correct]){
                    swap(arr,i,correct);
                }
                else {
                    i++;
                }
            }
            // search an element which is missing
            for(int index = 0;index<arr.length;index++){
                 if(arr[index] != index){
                    return index;
                 }
            }
            return arr.length;
        }  

        static void swap(int[] arr,int start,int end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
}