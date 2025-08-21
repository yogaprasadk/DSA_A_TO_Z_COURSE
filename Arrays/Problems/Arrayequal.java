import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrayequal {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args)
    {
        try{
            System.out.print("Enter Array Size: ");
            int arrSize = S.nextInt();
            
            if(arrSize<=0){
                System.out.print("Enter Array Size > 0");
                return;
            }

            int[] arr1 = new int[arrSize]; 
            int[] arr2 = new int[arrSize];

            System.out.print("Enter Array 1 Elements: ");
            
            for (int index = 0; index < arr1.length; index++) {
                 arr1[index] = S.nextInt();
            }

            System.out.print("Enter Array 2 Elements: ");
            
            for (int index = 0; index < arr2.length; index++) {
                arr2[index] = S.nextInt();
            }

            boolean ans = checkArrayEqual(arr1,arr2);
            System.out.println(ans);
        
        }
        
        catch(InputMismatchException e){
            System.out.print("Enter Array Size Correctly");
        }

        finally{
            S.close();
        }
    }    

    public static boolean checkArrayEqual(int[] arr1,int[] arr2){
        boolean ans = true;

        // check length 
        if(arr1.length != arr2.length){
            return false;
        }

        for(int i = 0;i<arr1.length && i<arr2.length;i++){
            if(arr1[i] != arr2.length){
                return false;
            }
        }
        return ans;
    }
}
