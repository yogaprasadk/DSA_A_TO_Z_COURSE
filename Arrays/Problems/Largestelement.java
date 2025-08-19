public class Largestelement {
    // GFG = https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1
    public static void main(String args[]){
        int arr[] = {5,1,5,3,10,2};
        int max = arr[0];

        for(int i = 0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        
        System.out.println("Maximum Element: "+max);
    }
}
