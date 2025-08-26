import java.util.*;
//https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1
public class Frequencies {
    public static List<Integer> FrequencyCount(int[] arr) {
        // code here
        int n = arr.length;
        int freq[] = new int[n];
        for(int num: arr){
            if(num>=1 && num<=n){
                freq[num-1]++;
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        for(int count:freq){
            ans.add(count);
        }
        
        return ans;
    }

    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Size: ");
        int size = S.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Array Elements: ");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = S.nextInt();
        }
        List<Integer> ans = FrequencyCount(arr);
        System.out.println(ans);
    }
}
