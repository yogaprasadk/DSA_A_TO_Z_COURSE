import java.util.InputMismatchException;
import java.util.Scanner;
// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
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

            boolean ans = check(arr1);
            System.out.println(ans);
        
        }
        
        catch(InputMismatchException e){
            System.out.print("Enter Array Size Correctly");
        }

        finally{
            S.close();
        }
    }
     
    public static boolean check(int[] nums) {
            int count  = 0;
    for(int i = 0;i<nums.length;i++){
            if(nums[i] > nums[(i+1) % nums.length]){
                count++;
            }
        } 
        if(count > 1){
            return false;
        }  
        return true;
    }

}   
