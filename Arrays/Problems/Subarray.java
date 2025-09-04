import java.util.Scanner;

public class Subarray{
     static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Size: ");
        int arrSize = S.nextInt();
        System.out.print("Enter Array Elements: ");
        int[] arr = new int[arrSize];
        for(int i = 0;i<arr.length;i++){
            arr[i] = S.nextInt();
        }
        subarray(arr);
    }

    public static void subarray(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}