public class MajorityElementnby2 {
// Leetcode - https://leetcode.com/problems/majority-element/description/
    //brute
    public static void brute(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int count  = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count>arr.length/2){
                System.out.println(arr[i]);
            }
        
        }
        // TC - O(N2) Sc-O(1)
    }

    public static void better(int[] arr){

    }

    //Optimal -Moore Voting ALgorithm - TC O(N) SC O(1)
    // another solution using bit masking - TC O(N) SC o(1)
    /*
     * import java.util.Arrays;

public class MajorityElement {
    public static void findMajority(int[] arr, int n) {
        // Number of bits in the integer
        int len = Integer.SIZE;

        // Variable to calculate majority element
        int number = 0;

        // Loop to iterate through all the bits of number
        for (int i = 0; i < len; i++) {
            int count = 0;
            // Loop to iterate through all elements in array
            // to count the total set bit
            // at position i from right
            for (int j = 0; j < n; j++) {
                if ((arr[j] & (1 << i)) != 0)
                    count++;
            }
            // If the total set bits exceeds n/2,
            // this bit should be present in majority Element.
            if (count > (n / 2))
                number += (1 << i);
        }

        int count = 0;

        // iterate through array get
        // the count of candidate majority element
        for (int i = 0; i < n; i++)
            if (arr[i] == number)
                count++;

        // Verify if the count exceeds n/2
        if (count > (n / 2))
            System.out.println(number);
        else
            System.out.println("Majority Element Not Present");
    }

    // Driver Program
    public static void main(String[] args) {
        int[] arr = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
        int n = arr.length;
        findMajority(arr, n);
    }
}
     */
}