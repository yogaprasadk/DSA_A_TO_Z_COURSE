public class Disariumnumber {

    // gfg -->
    public static void main(String[] args) {
        int N = 89;
        int dup = N;
        int count  = 0;
        while(N!=0){
            count++;
            N/=10;
        }
        int ans = 0;
        int temp = dup;
        int co = count;
        while(dup!=0){
            ans = ans + (int) Math.pow(dup%10,co);
            co = co - 1;
            dup = dup/10;
        }
        if(temp == ans){
            System.out.println("Disarium");
        }
        else{
            System.out.println("Not Disarium");
        }
    }
}
