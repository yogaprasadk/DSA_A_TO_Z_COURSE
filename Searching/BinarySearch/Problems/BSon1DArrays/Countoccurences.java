public class Countoccurences {
    // count - occurences or frequency
    // GFG - https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int target = 2;
        int ans = countFreq(arr,target);
        System.out.println(ans);
    }

    public static int countFreq(int[] arr,int target){
        // brute - TC - O(n) SC - O(1)
        int len = arr.length;
        int count = 0;
        int low = 0;
        int high = len - 1;
        for(int i = low;i<=high;i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count; 
    }

    // optimal solution Tc - O(log N) Sc - O(1)
    /*
        public static int countFreq(int[] arr,int target){
                int first = firstBS(nums, target);
        if (first == -1) {
            return 0;
        }
        int last = secondBS(nums, target);
        return last - first + 1;
    }

    public static int firstBS(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int first = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    public static int secondBS(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int last = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }        
     */
}
