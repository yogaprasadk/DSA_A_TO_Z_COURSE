public class setmismatch {
    // 
     public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
       
        for(int index = 0;index<nums.length;index++){
            if(nums[index] != index+1){
                return new int[]{nums[index],index + 1};
            }
        }
        return new int[]{-1,-1};

    }

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
   
    public static void main(String[] args) {
        setmismatch sm = new setmismatch();
        int[] nums = {1, 2, 2, 4};
        int[] result = sm.findErrorNums(nums);
        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]);
    }
}
