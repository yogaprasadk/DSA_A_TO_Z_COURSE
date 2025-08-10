// GFG - https://www.geeksforgeeks.org/problems/typecast-and-double-it--153103/1?page=2&category=Java&sortBy=submissions

import java.util.*;
public class Stringtonondecimaltypes{
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a string to convert to non-decimal types: \n1.Byte\n2.Short\n3.Integer\n4.Long");
        int a = S.nextInt();

        if(a == 1){
            System.out.print("Byte conversion\n"+"Enter a string: ");
            String str = S.next();
            byteconversion(str);       
        }

        if(a== 2){
            System.out.println("short conversion\n"+"Enter a string: ");
            String str = S.next();
            shortconversion(str);
        }

        if(a == 3){
            System.out.println("Integer conversion\n"+"Enter a string: ");
            String str = S.next();
            intconversion(str);
        }

        if(a == 4){
            System.out.print("Long conversion"+"\n Enter a string: ");
            String str = S.next();
            longconversion(str);
        }
    }
    
    private static void intconversion(String str) {
        int result = 0;
        boolean isNegative = false;
        int index = 0;
        if(str.charAt(0)=='-'){
            isNegative = true;
            index = 1; // Start from the next character
        }

        while(index < str.length()){
            result = result * 10 + str.charAt(index) - '0';
            index++;
        }

        if(isNegative){
            System.out.println(-1*result);
        }
        else{
            System.out.println(result);
        }
    }
    private static void shortconversion(String str) {
        intconversion(str);
    }
    private static void longconversion(String str) {
      long result = 0;
        boolean isNegative = false;
        int index = 0;
        if(str.charAt(0)=='-'){
            isNegative = true;
            index = 1; // Start from the next character
        }

        while(index < str.length()){
            result = result * 10 + str.charAt(index) - '0';
            index++;
        }

        if(isNegative){
            System.out.println(-1*result);
        }
        else{
            System.out.println(result);
        }
    }
    private static void byteconversion(String str) {
       intconversion(str);
    }
}