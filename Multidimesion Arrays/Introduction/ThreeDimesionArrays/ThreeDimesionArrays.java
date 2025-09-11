package Introduction.ThreeDimesionArrays;
// 3d arrays is otherwise known as multidimesion arrays or arrays of arrays.
// it can be visualized as cube or cuboid.
public class ThreeDimesionArrays {
    public static void main(String[] args) {
        // creation of three-d arrays 
        int[][][] arr = {{{1,2,3},{1,4,5}}};

        int m = arr.length;
        int n = arr[0].length;
        int o = arr[0][0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    System.out.print("arr[" + i + "][" + j + "]["+ k + "] = "+ arr[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }

        int it  = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    arr[i][j][k] = it++;
                }
                System.out.println();
            }
            System.out.println();
        }

                for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    System.out.println("arr[" + i + "][" + j + "]["+ k + "] = "+ arr[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }

        // accessing element 
        System.out.println("arr[0][0][1]" + arr[0][0][1]);

    }
}
