public class Algorithm{

    public static void main(String[] args){
        int[] arr = {2,3,3};
        int len = arr.length;

        int majority = arr[0];
        int count = 1;

        for(int i = 0;i<len;i++){
            if(arr[i] == majority){
                count = count + 1;
            }
            else{
                count = count - 1;
                if(count == 0){
                    majority = arr[i];
                    count = 1;
                }
            }
        }
    }
}