public class Findthenumberthatappearsoddnumberoftimes {
    // https://leetcode.com/problems/single-number/

    public static void main(String[] args) {
        int arr[] = {2,2,1};
        int x = 0;
        for (int i = 0; i <= arr.length-1 ; i++) {
            x = x^arr[i];
        }
        System.out.println(x);
    }
}
