// Multimdimesion arrays aret used o the data in rows and columns.
// where each row can represents another individual arrays,
// 1d arrays is other wise knowna s linear array or vector
// 2D ARRAYS IS OTHERWISE KNOWN AS TABLES OR MATRIX ...
// 

// refer this article - https://www.geeksforgeeks.org/java/multidimensional-arrays-in-java/
class TwodArrays {
    public static void main(String[] args) {
        // static array
        int[][] arr = { { 1, 2 }, { 3, 5 } };
        
        // dynamic array
        int[][] ar; // multidimension array declaration
        ar = new int[2][2]; 
        //initialization
        ar[0][0] = 1;
        ar[0][1] = 1;
        ar[1][0] = 2;
        ar[1][1] = 3;

        System.out.println("arr[0][0] =  " + arr[0][0]);
        System.out.println("arr[0][1] =  " + arr[0][1]);
        System.out.println("arr[1][0] =  " + arr[1][0]);
        System.out.println("arr[1][1] =  " + arr[1][1]);

        // syntax data_type[1st dimension][2nd dimension][]..[Nth dimension] array_name = new data_type[size1][size2]....[sizeN]

        // print the multi dimension array in for loop
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // update the value while executing works can be accepted by user or some variable
        int  n = 2;
        int  m = 2;

        int[][] arrr = new int[n][m];
        int it = 1;

        for(int i = 0;i<n;i++){
            for (int j = 0; j < m; j++) {
                arrr[i][j] = it;
                it++;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrr[i][j] +" ");
            }
            System.out.println();
        }

        //accessing row and columns by accessing index value
        System.out.println("arrr[0][0]: "+ arrr[0][0]);

    }
}