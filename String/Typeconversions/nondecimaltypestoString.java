import java.util.Scanner;

public class nondecimaltypestoString {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Choose a non-decimal - \n1.Byte\n2.Short\n3.Integer\n4.Long\n5.Char\n6.Boolean");
        System.out.print("Enter your choice: ");
        int a = S.nextInt();
        System.out.println("You chose: " + a);

        if (a == 1) {
            System.out.print("Byte -> String\n" + "Enter a Num: ");
            byte str = S.nextByte();
            byteconversion(str);
        }

        if (a == 2) {
            System.out.print("short -> String\n" + "Enter a Num: ");
            Short str = S.nextShort();
            shortconversion(str);
        }

        if (a == 3) {
            System.out.print("Integer -> String \n" + "Enter a Num: ");
            int str = S.nextInt();
            intconversion(str);
        }

        if (a == 4) {
            System.out.print("Long -> String " + "\nEnter a Num: ");
            long num = S.nextLong();
            longconversion(num);
        }

        if (a == 5) {
            System.out.print("Char -> String " + "\nEnter a char: ");
            char num = S.next().charAt(0);
            charconversion(num);
        }

        if(a == 6){
            System.out.print("Boolean -> String " + "\nEnter a Num: ");
            boolean num = S.nextBoolean();
            booleanconversion(num);
        }
    }

    private static void charconversion(char num) {
        System.out.println("" + num);
    }

    private static void booleanconversion(boolean num) {
        if(num){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    private static void intconversion(int num) {
        if (num == 0)
            System.out.println("0");

        boolean isNegative = false;
        if (num < 0) {
            isNegative = true;
            num = -num;
        }

        String result = "";
        while (num > 0) {
            int digit = num % 10;
            result = (char) ('0' + digit) + result;
            num /= 10;
        }

        if (isNegative)
            result = "-" + result;
        System.out.println(result);
    }

    private static void shortconversion(int num) {
        intconversion(num);
    }

    private static void longconversion(long num) {
        if (num == 0)
            System.out.println("0");

        boolean isNegative = false;
        if (num < 0) {
            isNegative = true;
            num = -num;
        }

        String result = "";
        while (num > 0) {
            long digit = num % 10;
            result = (char) ('0' + digit) + result;
            num /= 10;
        }

        if (isNegative)
            result = "-" + result;
        System.out.println(result);
    }

    private static void byteconversion(byte num) {
        intconversion(num);
    }
}
