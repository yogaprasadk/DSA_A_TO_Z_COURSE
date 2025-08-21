import java.util.*;
public class Arraysorted {
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

            int[] arr = new int[arrSize]; 
            
            System.out.print("Enter Array Elements: ");
            
            for (int index = 0; index < arr.length; index++) {
                 arr[index] = S.nextInt();
            }

            boolean ans = checkArraySorted(arr);
            System.out.println(ans);
        
        }
        
        catch(InputMismatchException e){
            System.out.print("Enter Array Size Correctly");
        }

        finally{
            S.close();
        }
    }

    public static boolean checkArraySorted(int[] arr){
        boolean ans = true;
        int i = 0;
    
        if(i < arr.length){
            if(arr[i] > arr[i+1]){
                ans = false;
            }
            i++;
        }
        return ans;
    }
}
