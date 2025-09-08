import java.util.*;

public class AlternateNumbers {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Size: ");
        int arrSize = S.nextInt();
        if (arrSize < 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        int[] arr = new int[arrSize];

        System.out.print("Enter Array1 Elements: ");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = S.nextInt();
        }

        int[] ans = alternate(arr);
        System.out.println(Arrays.toString(ans));
        S.close();
    }

    private static int[] alternate(int[] arr) {
        int[] pos = new int[arr.length];
        int[] neg = new int[arr.length];
        int posi = 0, nega = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                neg[nega++] = arr[i];
            } else {
                pos[posi++] = arr[i];
            }
        }

        int index = 0, i = 0;

        // Alternate until one of them runs out
        while (i < posi && i < nega) {
            arr[index++] = pos[i];
            arr[index++] = neg[i];
            i++;
        }

        // Add remaining positives
        while (i < posi) {
            arr[index++] = pos[i++];
        }

        // Add remaining negatives
        while (i < nega) {
            arr[index++] = neg[i++];
        }

        return arr;
    }
}