import java.util.Scanner;
import java.util.Arrays;

public class Rotationleftbyone {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter Array Size");
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
        int last = arr[0];
        for (int i = 1; i <arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length] = last;
        return arr;
    }
}
