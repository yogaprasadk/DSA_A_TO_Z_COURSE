public class MajorityElementnby2 {
    //brute
    public static void brute(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int count  = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count>arr.length/2){
                System.out.println(arr[i]);
            }
        
        }
        // TC - O(N2) Sc-O(1)
    }

    public static void better(int[] arr){
        
    }
}