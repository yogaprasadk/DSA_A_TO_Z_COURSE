
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class Arrayisascendingordescending {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Enter Array Size: ");
            int arrSize = S.nextInt();

            if (arrSize <= 0) {
                System.out.print("Enter Array Size > 0");
                return;
            }

            int[] arr1 = new int[arrSize];

            System.out.print("Enter Array Elements: ");

            for (int index = 0; index < arr1.length; index++) {
                arr1[index] = S.nextInt();
            }

            System.out.println(Arrays.toString(arr1));
            checkArrayAscendingorDescending(arr1);
        }

        catch (InputMismatchException e) {
            System.out.print("Enter Array Size Correctly");
        }

        finally {
            S.close();
        }
    }

    public static void checkArrayAscendingorDescending(int[] arr){
            boolean isAscending = true;
            boolean isDescending = true;
            
                for(int i = 0;i<arr.length-1;i++){
                    if(arr[i] > arr[i+1]){
                        isAscending = false;
                    }

                    if(arr[i] < arr[i+1]){
                        isDescending = false;
                    }
                }
        
            if(isAscending){
                System.out.println("Array is Ascending");
            }

            else if(isDescending){
                System.out.println("Array is Descending");
            }

            else{
                System.out.println("Array is not in Ascending and Descending");
            }
        }
}
