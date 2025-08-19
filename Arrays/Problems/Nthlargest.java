// package Problems;

import java.util.*;
// Leetcode - https://leetcode.com/problems/kth-largest-element-in-an-array/description/
public class Nthlargest {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter K Size: ");
        int k = S.nextInt();
        System.out.print("Enter Size: ");
        int arrSize = S.nextInt();

        if(arrSize <= 0){
            System.out.println("Array size must be greater than 0.");
                return;
        }

        int[] arr = new int[arrSize];
        System.out.print("Enter Array Elements: ");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = S.nextInt();
        }

        int ans = Klargest(arr,k);
        System.out.println(ans);
        S.close();
    }

    // TC - O(N LOGN) SC - O(1)
    private static int Klargest(int[] arr,int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

    // TC - O(N LogK) SC - O(N)
    /*
        PriorityQueue<Integer> minHeap = new PriorityHeap<>(k+1);
        for(int i : nums){
            minHeap.add(i);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        return minHeap.poll();
     */

     // TC - O(N) 
     // Quickselect ALgorithm
     /*
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
      */
       
}
