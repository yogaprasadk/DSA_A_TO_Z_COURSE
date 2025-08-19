import java.util.Scanner;
import java.util.Arrays;

public class Rotationrightbyone {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter Array Size ");
        int arrSize = S.nextInt();
        if (arrSize <= 0) {
            System.out.println("Enter arrSize greater than 0");
            return;
        }

        // dynamic array
        int[] arr = new int[arrSize];

        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = S.nextInt();
        }

        int[] ans = rotateArrayByOne(arr);
        System.out.println(Arrays.toString(ans));

        S.close();
    }

    public static int[] rotateArrayByOne(int[] arr) {
        int last = arr[arr.length-1];
        for (int i = arr.length-1; i >0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        return arr;
    }
}
