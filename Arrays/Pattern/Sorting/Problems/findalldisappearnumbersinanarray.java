import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class findalldisappearnumbersinanarray {
    
    static Scanner S = new Scanner(System.in);
    
    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> ans = finddisappear(arr);
        System.out.println("Disappeared Numbers: " + ans);
    }
    
    private static List<Integer> finddisappear(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
     
        int size = nums.length;
        while(i<size) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swapping(nums, i, correct);
            }
            else{
                i++;
            }
        }

        for(int j = 0;j<nums.length;j++){
            if(nums[j] != j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }

    public static void swapping(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}