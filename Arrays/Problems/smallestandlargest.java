// package Problems;
// GFG - https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1

public class smallestandlargest {

    static class Pair<U,V>{
        public final U min;
        public final V max;

        public Pair(U min,V max){
            this.min = min;
            this.max = max;
        }
    }

    public static Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        
        int min = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        
        return new Pair<>(min, max);   
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 56, 10000, 167};
        Pair<Integer,Integer> result = getMinMax(arr);
        System.out.println("Min: "+result.min);
        System.out.println("Max: "+result.max);       
    }
}
