package Problems;
//Leetcode - https://leetcode.com/problems/set-matrix-zeroes/description/
import java.util.Scanner;

public class SetMatrixZeros {

    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(arr);// TC:O(N*M)*(N+M) + (N*m)

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void setZeroes(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 0){
                    markByrow(arr,i);
                    markBycol(arr,j);
                }
            }
        }

        for(int i = 0;i<arr.length;i++){
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == -1){
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void markByrow(int[][] arr,int i){
        for(int j = 0;j<arr.length;j++){
            if(arr[i][j] != 0){
                arr[i][j] = -1;
            }
        }
    }

       public static void markBycol(int[][] arr,int j){
        for(int i = 0;i<arr.length;i++){
            if(arr[i][j] != 0){
                arr[i][j] = -1;
            }
        }
    }
}
