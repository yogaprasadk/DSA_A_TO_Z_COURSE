import java.util.Scanner;

public class threeoccurences {
    
    static Scanner S = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.print("Enter Array Size: ");
        int size = S.nextInt();
        System.out.print("Enter Array elements: ");
        int[] arr = new int[size];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = S.nextInt();
        }
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        int len = nums.length;
        int ones = 0,twos=0;
        for(int i : nums){
            ones = ~twos & (ones ^ i);
            twos = ~ones & (twos ^ i);
        }
        return ones;
    }}
