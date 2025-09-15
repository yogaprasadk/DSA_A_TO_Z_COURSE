package Problems;

//leetcode - 
public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int rowlen = matrix.length;
        int collen = matrix[0].length;
        int top = 0, bottom = rowlen - 1, left = 0, right = collen - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right]);

            }
            right--;

            if (top <= bottom) {
                for (int index = right; index >= left; index--) {
                    System.out.print(matrix[bottom][index]);

                }
            }
            bottom--;

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[left][i]);
                }

            }
            left++;
        }
    }
}
