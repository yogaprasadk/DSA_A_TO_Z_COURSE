package Problems;

// Leetcode - https://leetcode.com/problems/rotate-image/
public class Rotatematrixby90degrees {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        rotateMatrix(arr);

    }

    public static void rotateMatrix(int[][] arr) {
        int[][] ans = new int[arr.length][arr[0].length];

        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                ans[j][n - i - 1] = arr[i][j];
            }
        }

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        // TC - O(M*N)
        // SC - O(M*N);

        /*
         * optimal approach - TC(O(M*N))
         * Sc - O(1) 
         * // Transpose
          int n = matrix.length;
         
         * // Step 1: **Transpose** the matrix
          // Swap elements across the main diagonal
          for (int i = 0; i < n; i++) {
          for (int j = i + 1; j < n; j++) {
          int temp = matrix[i][j];
          matrix[i][j] = matrix[j][i];
          matrix[j][i] = temp;
          }
          }
         * // reverse
          
         for (int i = 0; i < n; i++) {
         int left = 0;
          int right = n - 1;
          while (left < right) {
          int temp = matrix[i][left];
          matrix[i][left] = matrix[i][right];
          matrix[i][right] = temp;
          left++;
         * right--;
         * }
         * }
         */
    }
}
