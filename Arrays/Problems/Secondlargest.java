// package Problems;

import java.util.Scanner;
// GFG - https://www.geeksforgeeks.org/problems/second-largest3735/1
public class Secondlargest {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Size: ");
        int size = S.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Array Elements: ");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = S.nextInt();
        }
        int ans = secondlargest(arr);
        System.out.println(ans);
    }

    private static int secondlargest(int[] arr) {
        int firstmax = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>firstmax){
                firstmax = arr[i];
            }
        }

        int second = -1;
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=firstmax && arr[index]>second){
                second = arr[index];
            }
        }
        return second;
    }
}
