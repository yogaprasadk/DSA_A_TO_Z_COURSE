public class Floor {
    //Floor - Upper Bound
    // https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 5;
        System.out.println(findFloor(arr,x));
    }
    public static int findFloor(int[] arr, int x) {
        // code here
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] <= x){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
}
