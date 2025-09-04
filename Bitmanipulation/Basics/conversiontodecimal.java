public class conversiontodecimal {
    public static void main(String[] args) {
        int binary = 101010;

        int rem = 0, pow = 1, ans = 0;

        while(binary >0)

        {
            rem = binary % 10;
            ans = ans + (rem * pow);
            binary = binary / 10;
            pow = pow * 2;  // change the divisor according to the base given if binary - 2 octal -8  hexadecimal -16
        }
        System.out.print(ans);
    }
}



// to convert int to string 
/*
public class ConversionToDecimal {

    public static void main(String[] args) {
        int binary = 101010;
        String result = convertBinaryToDecimalString(binary);
        System.out.println("Decimal value: " + result);
    }

    public static String convertBinaryToDecimalString(int binary) {
        int rem, pow = 1, ans = 0;

        // Convert binary (stored as int) to decimal (int)
        while (binary > 0) {
            rem = binary % 10;
            ans = ans + (rem * pow);
            binary = binary / 10;
            pow = pow * 2;
        }

        // Manually convert decimal number to string
        if (ans == 0) return "0";

        String result = "";
        while (ans > 0) {
            int digit = ans % 10;
            char digitChar = (char) ('0' + digit); // Convert digit to character
            result = digitChar + result;           // Prepend to build string
            ans = ans / 10;
        }

        return result;
    }
}

 */