import java.util.Scanner;

public class rotatenumber {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N:");
        int n = S.nextInt();
        /*
        rotate concept
        EX: 25398
        rotate - 2times
        98253
        rotate - -2times
         */
        System.out.print("Enter K rotation: ");
        int k = S.nextInt();
        int temp = n,count = 0;
        while(temp!=0){
            count++;
            temp/=10;
        }

         // if k > count
        k = k%10; // 10>5 // 10%10 = 0 rotation

        // if k < 0
        if(k<0){ // if rotation is -2 means count+k = 5-2 = 3 it means 3 rotation
            k  = k + count;
        }

        int div = 1,mul = 1;
        for (int i = 1; i <= count ; i++) {
            if(i<=k){
                div = div * 10;
            }
            else{
                mul = mul * 10;
            }
        }

        int quiotent = n/div;
        int remainder = n%div;
        int res =  quiotent+(remainder*mul);
        System.out.println(res);
    }
}
