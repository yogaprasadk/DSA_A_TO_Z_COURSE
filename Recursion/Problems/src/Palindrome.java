import java.util.Scanner;
// Leetcode - https://leetcode.com/problems/valid-palindrome/description/
public class Palindrome {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter: ");
        String s = S.nextLine();
        s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        //base condition
        return reverse(s,0,s.length()-1);
    }

    private static boolean reverse(String s, int start, int end) {
        if(start>=end){
            return true;
        }

        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }

        return reverse(s,start=start+1,end=end-1);
    }
}
