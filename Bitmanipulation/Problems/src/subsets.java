import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Leetcode - https://leetcode.com/problems/subsets/

public class subsets {
    static Scanner S =  new Scanner(System.in);
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] nums = {0};
        int len = nums.length;
        int subset = 1<<len;
        for (int i = 0; i <=subset-1 ; i++) {
            List<Integer> S = new ArrayList<>();
            for (int j = 0; j <= len - 1 ; j++) {
                if((i&(1<<j))!=0){
                    S.add(nums[j]);
                }
            }
            ans.add(S);
        }
        System.out.println(ans);
    }
}
