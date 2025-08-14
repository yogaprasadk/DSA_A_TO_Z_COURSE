package Problems;

public class Smallestelement {
    public static void main(String args[]){
        int arr[] = {5,1,5,3,10,2};
        int min = arr[0];

        for(int i = 0;i<=arr.length-1;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimum Element: "+min);
    }
}
