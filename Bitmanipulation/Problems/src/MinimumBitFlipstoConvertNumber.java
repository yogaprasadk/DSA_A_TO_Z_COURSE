import java.util.Scanner;

public class MinimumBitFlipstoConvertNumber {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N:");
        int start = S.nextInt();
        System.out.print("Enter goal");
        int goal = S.nextInt();
        int ans  = start^goal;
        System.out.print(minBitFlips(start,goal));
    }


    // brute - O(Log N)
    public static int range(int decimalnumber){
        int ans = 0;
        int pow  = 1;
        int rem = 0,count=0;
        while(decimalnumber>0){
            rem = decimalnumber%2; //  if need to convert change(what base you need) to octal - 8,hexadecimal - 16,binary = 2;
            decimalnumber = decimalnumber/2; // if need to convert change(what base you need) to octal - 8,hexadecimal - 16,binary = 2;
            ans = ans + (rem*pow);
            pow = pow * 10;
        }
        
        int bicount = ans;
        while (bicount>0){
            if (bicount%10 == 1){
                count++;
            }
            bicount/=10;
        }
        int recount = 0;
        if(count<4)
            recount =  count;
        return recount;
    }

    // Brian Kernighan's algorithm
    public static int minBitFlips(int start, int goal){
        int xor = start ^ goal;
        int count = 0;
        while (xor>0){
            xor = xor&(xor-1);
            count++;
        }
        return count;
    }
}
