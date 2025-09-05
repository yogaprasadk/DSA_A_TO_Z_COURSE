public class Algorithm{
    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,0,1,2,0,0};
        // we use three pointer approach
        /*
            i/p : 2 0 2 1 1 0 1 0 1 0 -> o/p :0 0 0 0 1 1 1 2 2 2
            
            s-start m-mid e-end

            m
            2 0 2 1 1 0 1 0 1 0
            s                 e             
               
            // swap
            m
            0 0 2 1 1 0 1 0 1 2
            s                 e

            // after swap reduce e
            m
            0 0 2 1 1 0 1 0 1 2
            s               e
            
            // if the element is at correct position move start and middle
                m
            0 0 2 1 1 0 1 0 1 2
                s           e

            // swap
            
                m
            0 0 1 1 1 0 1 0 2 2
                s           e

            // reduce e

            when m and s at 1 just move m to next elements no swapping to be performed.
                m
            0 0 1 1 1 0 1 0 2 2
                s         e

                  m
            0 0 1 1 1 0 1 0 2 2
                s         e

                    m
            0 0 1 1 1 0 1 0 2 2
                s         e
        
                      m  
            0 0 0 1 1 1 1 0 2 2    
                s         e


                        m  
            0 0 0 1 1 1 1 0 2 2    
                  s       e
                          m  
            0 0 0 1 1 1 1 0 2 2    
                  s       e

                  //swap
                          m  
            0 0 0 0 1 1 1 1 2 2
                    s     e

                    m>e - completed
                            m  
            0 0 0 0 1 1 1 1 2 2
                    s     e
 
         */
        int start = 0;
        int mid = 0;
        int end = arr.length -1;

        while(mid <= end){
            
            switch (arr[mid]) {
                case 0:
                    swap(arr,start,mid);
                    start++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr,mid,end);
                    end--;   
                    break;
            }
        }
     }

    private static void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}