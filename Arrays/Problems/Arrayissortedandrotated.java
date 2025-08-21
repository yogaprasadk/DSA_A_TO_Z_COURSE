import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrayissortedandrotated {
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

            System.out.print("Enter Array Elements: ");
            
            for (int index = 0; index < arr1.length; index++) {
                 arr1[index] = S.nextInt();
            }

            // boolean ans = checkArrayEqual(arr1,arr2);
            // System.out.println(ans);
        
        }
        
        catch(InputMismatchException e){
            System.out.print("Enter Array Size Correctly");
        }

        finally{
            S.close();
        }
    }    
}   
