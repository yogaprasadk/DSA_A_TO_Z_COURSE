import java.util.Scanner;
public class Stringtodecimaltypes{
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a string to convert to decimal types: \n1.Float\n2.Double");
        int a = S.nextInt();

        if(a == 1){
            System.out.print("Float conversion\n"+"Enter a string: ");
            String str = S.next();
            floatconversion(str);       
        }

        if(a == 2){
            System.out.println("Double conversion\n"+"Enter a string: ");
            String str = S.next();
            doubleconversion(str);
        }       
    }
    private static void floatconversion(String str) {
        doubleconversion(str);
    }
    private static void doubleconversion(String str) {
        double result = 0.0;
        boolean isNegative = false;
        int index = 0;
        double divisor = 10;
        boolean afterDecimal = false;
        double fraction = 0;

        if(str.charAt(0)=='-'){
            isNegative = true;
            index = 1; // Start from the next character
        }

        while(index < str.length()){
            char ch = str.charAt(index);
            if(ch == '.'){
                afterDecimal = true;
                index++;
                continue;
            }
            if(afterDecimal){
                fraction += (ch - '0') / divisor;
                divisor *= 10;
            } else {
                result = result * 10 + (ch - '0');
            }
            index++;
        }
        System.out.println(result + fraction * (isNegative ? -1 : 1));
    }

}