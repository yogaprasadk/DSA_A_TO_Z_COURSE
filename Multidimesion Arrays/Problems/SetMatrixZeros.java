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

    /*
     better solution 
        public static void SetMatrixZeros (int[][] arr,int m,int n){
            int[m] row = {0};
            int[n] col = {0};
            Time Complexity: O(2*M*N)
            SC: O(M) + O(N)
            for(int i = 0;i<m;i++){
                for(int j = 0;j<n;j++){
                    if(arr[i][j] == 0){
                        row[i] = 1;
                        col[j] = 1;
                    }
                }
            }

            for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                    if(row[i] || col[j]){
                        arr[i][j] = 0;
                    }
                }
            }
        }
    */

    /*
     optimal solution  
      boolean firstrow = false, firstcol = false;
      for(int i = 0;i<arr.length;i++){
        for(int j = 0;jmarr.length;j++){
            if(arr[i][j]==0){
                if(i==0) firstrow = true;
                if(j==0) firstcol = true;
            }
            arr[o][i]  = 0;
            arr[j][0]  = 0;
        }

        for(int i = 1;i<arr.length;i++){
        for(int j = 1;j<arr[0].length;j++{})}{
        
            if(arr[i][0] == 0 || arr[0][j] == 0){
                arr[i][j] = 0;
            }
        }
         
        if(firstrow){
            arr[0][j] = 0;
        }
        
        if(firstcol){
            arr[j][]
        }
      }
     
     */
}
