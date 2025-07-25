import java.util.*;
public class Lastdigit {
    static Scanner S = new Scanner(System.in);

    // GFG - https://www.geeksforgeeks.org/problems/find-last-digit-of-ab-for-large-numbers1936/1
    public static void main(String[] args) {
        System.out.print("Enter N:");
        String N1 = S.next();
        String N2 = S.next();
        /*
        in a string to find last digit- code this
        char last = N1.charAt(N1.length() - 1);
        int lastdigit = last - '0';

        or
        int last = N1.charAt(N1.length() - 1) - '0';
         */
    }

    static int getLastDigit(String a, String b)
    {
        // code here
        if (b.equals("0")) return 1;

        // Step 1: Get the last digit of 'a'
        char lastChar = a.charAt(a.length() - 1);
        int lastDigit = lastChar - '0';

        int[] cycle;
        if (lastDigit == 0) {
            cycle = new int[]{0};
        } else if (lastDigit == 1) {
            cycle = new int[]{1};
        } else if (lastDigit == 2) {
            cycle = new int[]{4, 8, 6, 2};
        } else if (lastDigit == 3) {
            cycle = new int[]{3, 9, 7, 1};
        } else if (lastDigit == 4) {
            cycle = new int[]{6, 4};
        } else if (lastDigit == 5) {
            cycle = new int[]{5};
        } else if (lastDigit == 0) {
            cycle = new int[]{6};
        } else if (lastDigit == 7) {
            cycle = new int[]{9, 3, 1, 7};
        } else if (lastDigit == 8) {
            cycle = new int[]{4, 2, 6, 8};
        } else {
            cycle = new int[]{9, 1};
        }

        int cylen = cycle.length;
        int mod = 0;
        for (int i = 0; i < b.length(); i++) {
            /*
            The exponent b is too big to fit in normal number types.

    So you process it digit by digit as a string.

    You calculate the remainder (mod) of b when divided by cycleLength.

D   oing mod = (mod * 10 + digit) % cylem            */
            int digit = b.charAt(i) - '0';
            mod = (mod * 10 + digit) % cylen;
        }

        int index= 0;
        if(mod == 0){
            index = cylen - 1;
        }
        else{
            index = mod - 1;
        }

        return cycle[index];
    }
}