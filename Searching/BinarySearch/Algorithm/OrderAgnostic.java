package BinarySearch.Algorithm;

// orderagnostic binary search use where the array is arranged in ascending order or descending order..

/*
// descending order
 arr[90,75,18,12,6,3,2]
 target - 75
 
 target > mid
 end = mid - 1
 target < mid
 start = mid + 1
 
 how to find which order array is sorted?
 1 3 3 3 5 6 7 12 14 20 33
 take any two element and compare them 
 
 if 3 3 3 3 3 3 14 20 33
 means
 check first and last
 
 first check array isin ascending order or descending order

 then apply this 
 last > first -> increasing order
 first < last -> decreasing order

 */
public class OrderAgnostic {
    public static void main(String[] args) {
        // ascending order
        // int[] arr = {-18,-12,-1,7,8};

        // descending order
        int[] arr = {99,88,75,22,11,10,5,2,-3};
        int target = 22;
        int ans  = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    public static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // asc
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            // desc
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
