import java.util.*;

public class Rearrangearrayelemtsbysign {
    static Scanner S = new Scanner(System.in);
        public static void main(String[] args) {
        System.out.print("Enter Size: ");
        int arrSize = S.nextInt();
        if (arrSize < 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        int[] arr = new int[arrSize];
        
        System.out.print("Enter Array1 Elements: ");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = S.nextInt();
        }
        
        int[] ans = rearrange(arr);
        System.out.println(Arrays.toString(ans));
        S.close();
    }

    private static int[] rearrange(int[] arr) {
        /*
            int[] pos = new int[arr.length/2];
            int[] neg = new int[arr.length/2];
            int posi = 0,nega=0;
            for(int i = 0;i<arr.length;i++){
            if(arr[i]<0){
            neg[nega] = arr[i];
            nega++;
            }
            else{
            
            pos[posi] = arr[i];
                posi++;
            }
            } 

            for(int i = 0;i<arr.length/2;i++){
            arr[2*i] = pos[i];
            arr[2*i+1] = neg[i];
            }
            
        return arr;
        */

        // optimal
        int[] ans = new int[arr.length];
        int pos = 0, neg = 1;
        for (int i = 0; i < ans.length; i++) {
            if(arr[i] < 0){
                ans[neg] = arr[i];
                neg += 2;
            }
            else {
                ans[pos] = arr[i];
                pos += 2;
            }
        }
        return ans;
    }
}