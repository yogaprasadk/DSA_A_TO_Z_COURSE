public class Algorithm{
    // 
    public static void main(String[] args)
    {
        
        int[] arr = {1,2,3,6,5,4};
        //find pivot element
            //find pivot element
        int pivot = -1;
        for(int i = arr.length - 2;i>=0;i--){
            //     5  <  4 no
            //     6  <  4 no
            //     3  <  4 Yes 
            //     update the pivot element and break
            if(arr[i] < arr[i+1]){
                    pivot = i;
                    break;
            }
        }

        // check if there is no pivot changes reverse the array and print
        if(pivot == -1){
            reverse(arr,0,arr.length-1);
            return ;
        }

        // now check the rightmost element from the pivotwhich is greater than pivot and break;
        for(int i = arr.length - 1;i>pivot;i--){
            if(arr[i] > arr[pivot]){
                swap(arr,i,pivot);
                break;
            }
        }
        // after sort the element from next element of pivot to last.
       reverse(arr,pivot + 1,arr.length-1);
    }

    public void  reverse(int[] arr,int startIndex,int endIndex){
        int i = startIndex;
        int j = endIndex;        
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    public void swap(int[] arr,int i,int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
}