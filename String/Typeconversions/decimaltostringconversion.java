import java.util.Scanner;

public class decimaltostringconversion {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a decimal number to convert to string: \n1.Float\n2.Double");
        int a = S.nextInt();

        if (a == 1) {
            System.out.print("Float conversion\n" + "Enter a number: ");
            float num = S.nextFloat();
            floatconversion(num);
        }

        if (a == 2) {
            System.out.println("Double conversion\n" + "Enter a number: ");
            double num = S.nextDouble();
            doubleconversion(num);
        }
    }

    private static void floatconversion(float num) {
        doubleconversion(num);
    }

    private static void doubleconversion(double num) {
        boolean isNegative = false;
        if (num < 0) {
            isNegative = true;
            num = -num;
        }

        int intPart = (int) num;
        double fracPart = num - intPart;

        String result = intconversion(intPart) + ".";

        for (int i = 0; i < 6; i++) {
            fracPart *= 10;
            int digit = (int) fracPart;
            result += (char)('0' + digit);
            fracPart -= digit;
        }

        if (isNegative) result = "-" + result;
        System.out.println(result);
    }

    private static String intconversion(int num) {
        if (num == 0)
            return "0";

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
        return result;
    }
}