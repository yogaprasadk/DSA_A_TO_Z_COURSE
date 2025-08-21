package Rotationalgorithm;

import java.util.*;

public class Rotation {

    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            
            System.out.print("Enter K Rotation: ");
            
            int K = S.nextInt();

            if (K <= 0) {
                System.out.println("Enter K greater than 0");
            return;
            }

            System.out.print("Enter Array Size: ");
            int arrSize = S.nextInt();

            if (arrSize <= 0) {
                System.out.println("Enter Array Size greater than Zero");
                return ;
            }
             
            int[] arr = new int[arrSize];
            System.out.print("Enter Array Elements: ");
            for(int i = 0;i<arr.length;i++){
                arr[i] = S.nextInt();
            }
            
            System.out.println("Enter Choice:\n1.Left\n2.Right");
            int choice = S.nextInt();
            System.out.println("Array Before Rotation: " + Arrays.toString(arr));
            switch (choice) {
                case 1:
                    // if left
                    rotationByLeft(arr,K);
                    break;
                case 2:
                    // right
                    rotationByRight(arr,K);
                    break;

                default:
                    System.out.print("Try again.....");
                    break;
            }
            System.out.print("Array After Rotation: " + Arrays.toString(arr));

        } catch (InputMismatchException e) {
            System.out.print("Try to Enter The Input Correctly");
        }

        finally{
            S.close();
        }
        
    }

    private static void rotationByLeft(int[] arr, int k) {
        int len = arr.length;
        //  base condition
        k = k % len;

        if( k == 0){
            return ;
        }
        rotation(arr,0,k-1);
        rotation(arr,k,len-1);
        rotation(arr,0,len-1);
    }

    private static void rotation(int[] arr, int start, int end) {
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void rotationByRight(int[] arr,int k) {
        int len = arr.length;
        //  base condition
        k = k % len;

        if( k == 0){
            return ;
        }

        rotation(arr,len-k,len-1);
        rotation(arr, 0, len-k-1);
        rotation(arr,0,len - 1);
    }
}
