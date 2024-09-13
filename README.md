<h1> Basic Recursion</h1>

<h3>Video 1</h3>
<a href="https://youtu.be/yVdKa8dnKiE"><img src="https://github.com/yogaprasadk/DSA_A_TO_Z_COURSE/assets/174566721/d2111cca-c62c-4b29-a132-041933f9bbbc"/></a>
<h4>Problem 1 Answer </h4>

<a href="https://bit.ly/3K2epHv">Problem</a>

```js
class Solution
{
    
  public void printNos(int N)
    {
        //Your code 
        if(N==0) return;
        printNos(N-1);
        System.out.print(N+" ");
    }
}
```
<h3>Video 2</h3>
<a href="https://youtu.be/un6PLygfXrA"><img src="https://github.com/yogaprasadk/DSA_A_TO_Z_COURSE/assets/174566721/3031a7d4-4381-4448-98b3-7c0eb8d6cdc0"/></a>
<br/>

<h4>Problem 2 Answer</h4>

<a href="https://bit.ly/3y2BiWz"/>Problem</a>

```js
class Solution {

    void printGfg(int N) {
        for(int i = 0;i<N;i++){
            System.out.print("GFG"+" ");
        }
        
    }
}
```
<h3>Video 3</h3>
<a href="https://youtu.be/un6PLygfXrA"><img src="https://github.com/yogaprasadk/DSA_A_TO_Z_COURSE/assets/174566721/3031a7d4-4381-4448-98b3-7c0eb8d6cdc0"/></a>
<br/>
<h4>Problem 3 answer</h4>

<a href="https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1">Problem </a>

```js

class Solution {

    void printNos(int N) {
        // code here
        if(N ==0){
            return;
        }
        printNos(N -1);
        System.out.print(N+" ");
        
    }
}
```

<h3>Video 4</h3>
<a href="https://youtu.be/un6PLygfXrA"><img src="https://github.com/yogaprasadk/DSA_A_TO_Z_COURSE/assets/174566721/3031a7d4-4381-4448-98b3-7c0eb8d6cdc0"/></a>
<br/>
<h4>Problem 4</h4>
<a href="https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-n-to-1-without-loop">Problem</a>

```js

class Solution {

    void printNos(int N) {
        // code here
        if(N ==0){
            return;
        }
        System.out.print(N+" ");
        printNos(N -1);   
    }
}
```

<h3>Video 5</h3>
<a href="https://youtu.be/69ZCDFy-OUo"><img src="https://github.com/user-attachments/assets/00c24832-44bc-475e-b03b-c5ae054d0ce4"/></a>
<br/>
<h4>Problem 5</h4>
<a href="https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1">Problem</a>

```js
class Solution {
    long sumOfSeries(long n) {
        // code here
        if(n == 0){
            return 0;
        }
        return (long) Math.pow(n,3) + sumOfSeries(n-1);
    }
}
```
<h3>Video 5</h3>
<a href="https://youtu.be/69ZCDFy-OUo"><img src="https://github.com/user-attachments/assets/00c24832-44bc-475e-b03b-c5ae054d0ce4"/></a>
<br/>
<h4>Problem 5</h4>
<a href="https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%255B%255D=-1&page=1&query=problemTypefunctionaldifficulty%255B%255D-1page1">Problem</a>


```js

class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
            
            ArrayList<Long> list = new ArrayList<>();
            long fact = 1;
            for(long i = 1;i<=n;i++){
                fact = fact * i;
                if(fact<=n){
                    list.add(fact);
                }
                else {
                    break;
                }
            }
            return list;
            
    }
}

```
<h3>Video 6</h3>
<a href="https://youtu.be/twuC1F6gLI8"><img src="https://github.com/user-attachments/assets/c2050ca3-674e-4e0f-a416-041cadf89e57"/></a>
<h3>Problem 6</h3>
<!-- <a href="">Problem</a> -->
1.Using an extra array

```js 
public class Main{
    
    public static void printarray(int ans[],int size){
        System.out.println("Array:");
        for(int i = 0;i<size;i++){
            System.out.print(ans[i]+" ");
        }
    } 
    
    public static void reversearr(int arr[],int size){
        int ans[] = new int[size];{
            for(int i = size - 1;i>=0;i--){
                ans[size - i - 1] = arr[i];
            }
            printarray(ans,size);
        }  
    }
    public static void main (String[] args) {
        int arr[] = {2,3,4,5,6};
        int n = 5;
        reversearr(arr,n);
        
    }
}

```
2.recursive Method

```js
public class Main{
    public static void main (String[] args) {
        int arr[] = {1,2,3,4,6,7};
        int n = 5;
        revarrusingrec(arr,0,n - 1);
        printarray(arr,n);
    }
    // reverse array using recursion method

    public static void revarrusingrec(int arr[],int startindex,int endindex){
        if(startindex<endindex){
            // use swap method
            int temporary = arr[startindex];
            arr[startindex] = arr[endindex];
            arr[endindex] = temporary;
            revarrusingrec(arr,startindex + 1,endindex - 1);
        }
    }
    
    // print it
    public static void printarray(int arr[],int size){
        System.out.println("Reverse Array:");
        for(int i = 0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
```
<h3>Video 7</h3>
<a href="https://youtu.be/twuC1F6gLI8"><img src="https://github.com/user-attachments/assets/05b8554c-b119-4fac-b1e9-5336888cc5e1"/></a>
<br/>
<a href="https://leetcode.com/problems/valid-palindrome/">Problem</a>

```js

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int fwd = 0;
        int bwd= s.length()-1;
        while(fwd<=bwd)
        {
            if(s.charAt(fwd) != s.charAt(bwd))
            {
                return false;
            }
            fwd = fwd + 1;
            bwd = bwd - 1;
        }
        return true;
    }
}

```
<br/>

<h3>Video 8</h3>
<a href=""><img src="https://github.com/user-attachments/assets/72c135ff-007e-410c-815c-e28d383b1f08"/></a>
<br/>
<a href="https://leetcode.com/problems/fibonacci-number/description/">Problem</a>

```js

class Solution {
    public int fib(int n) {
        int sum = 0;
        int sum1 = 1;
        for(int i = 0;i<n;i++){
            int sum2 = sum1 + sum;
            sum = sum1;
            sum1 = sum2; 
        }
        return sum;
    }
}

```
<h1>Bit Manipulation</h1>
<h3>Power Of 4</h3>

<a href="https://youtu.be/3tQ6iEU50oQ"><img src="https://github.com/user-attachments/assets/308fab56-f43d-4d7a-895c-c09d387fe6b1"></a>
<br/>
<h3><a href="https://leetcode.com/problems/power-of-four/solutions/5471830/power-of-4/">Problem</a></h3>
<p>Algorithm: Brian's Kernighans</p>

```js
class Solution {
    public boolean isPowerOfFour(int n) 
    {
        if(n==1){
            return true;
        }
        else if(n>1){
            boolean containssinglebit = (n &(n-1))==0;
            boolean fourorsixinzerobit = (n%10==4 || n%10==6);
            return containssinglebit && fourorsixinzerobit;
        }
        else{
            return false;
        }
    }
}

```
<br/>
<h3>Power Of 3</h3>

<a href="https://youtu.be/GNb8vSyw-WE"><img src="https://github.com/user-attachments/assets/e7de6d32-2af6-4fa0-be9d-0d434df53eed"></a>
<br/>
<h3><a href="https://leetcode.com/problems/power-of-three/">Problem</a></h3>

```js

class Solution {
    public boolean isPowerOfThree(int n) {
    if( n < 1) return false;
    while(n % 3 == 0){
        n = n / 3;
        }
    return n == 1;

    }
}

```

<h3>Single Number</h3>
<a href="https://youtu.be/dUmaWUPRcLQ"><img src="https://github.com/user-attachments/assets/e818dd13-f3cb-4cba-8db1-6f967ea0d1e4"/></a>
<h3><a href="https://leetcode.com/problems/single-number/description/">Problem</a></h3>
<h3>Solution</h3>

```js
class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        int value = 0;
        for(int i = 0;i<len;i++){
            value = value^nums[i];
        }
        return value;
    }
}
			       
```			       
<h3>Time complexity: O(N) Space Complexity:O(1)</h3>

<h1>Sorting</h1>
<br/>
<h3>Selection Sort</h3>
<a href="https://youtu.be/HGk_ypEuS24"><img src="https://github.com/user-attachments/assets/04ff910d-2ab1-4b0d-a2e0-a49514b33fc5"/></a>
<br/>
<a href="https://www.geeksforgeeks.org/problems/selection-sort/1">Problem</a>

<h3>Solution</h3>

```js
import java.util.*;
public class index{
          public static void main(String[] args) {
               Scanner S = new Scanner(System.in);
                int n = 5;
                int arr[]  = new int[n];
                for(int i = 0;i<arr.length;i++)
                {
                    arr[i] = S.nextInt();
                }
                selection_sort(arr,n);
                for(int i = 0;i<arr.length;i++){
                    System.out.println(arr[i]+" ");
                }
          S.close();
          }

          public static void selection_sort(int arr[],int n)
          {
                    // int i,j,min_index,temp;
                    for(int i = 0;i<=n-1;i++){
                              int min_index = i;
                              for (int j = i+1;j<n;j++) {
                                       if (arr[j]<arr[min_index]) 
                                       {
                                        min_index = j;
                                       } 
                              }
                     int temp = arr[min_index];
                     arr[min_index] = arr[i];
                     arr[i] = temp;         
                    }
          }
}
```

<h3>Simple solution Using Sort Method</h3>

```js
class solution
{
	int select(int arr[], int n)
	{
        // code here such that selectionSort() sorts arr[]
        return arr[n];
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    Arrays.sort(arr);
	    for(int i = 0;i<n;i++){
	        select(arr,i);
	    }
	}
}
```
<br/>
<h3>Time Complexity for Selection Sort Is O(n2)</h3>

<h3>Bubble Sort</h3>

<a href="https://youtu.be/HGk_ypEuS24"><img src="https://github.com/user-attachments/assets/28978649-fa2f-428c-b5af-72e9c3b4c194"/></a>
<br/>
<a href="https://www.geeksforgeeks.org/problems/bubble-sort/1">Problem</a>
<h3>Solution</h3>

```js
import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int size = S.nextInt();
        int arr[] = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = S.nextInt();
        }
        bubblesort(arr,size);
        for(int j = 0;j<arr.length;j++)
        {
        System.out.print(arr[j] +" ");
        }
    }
        static void bubblesort(int arr[],int n){
        for(int i = n - 1;i>=1;i--)
        {
            int didswap = 0;
            for(int j = 0;j<=i - 1;j++)
            {
                if(arr[j]>arr[j+ 1]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                didswap = 1;
                }
            }
            if(didswap == 0){
            break;
            }

        }     

    }

}

```
<h3>Bubble Sort - Time Complexity: O(n)</h3>

<h3>Simplest Solution using Sort method</h3>

```js
class solution
{
	int bubble(int arr[], int n)
	{
        // code here such that bubbleSort() sorts arr[]
        return arr[n];
	}
	
	void bubbleSort(int arr[], int n)
	{
	    //code here
	    Arrays.sort(arr);
	    for(int i = 0;i<n;i++){
	        select(arr,i);
	    }
	}
}
```
<h3>Bubble Sort - Time Complexity:O(n2)</h3>
<br/>
<h3>Insertion Sort</h3>
<a href="https://youtu.be/HGk_ypEuS24"><img src="https://github.com/user-attachments/assets/ed45f0f2-5908-4336-b5e7-a64a5a59adc8"/></a><br/>
<a href="https://www.geeksforgeeks.org/problems/insertion-sort/0?category%5B%5D=Algorithms&page=1&query=category%5B%5DAlgorithmspage1">Problem</a>
<h3>Solution</h3>

```js
import java.util.*;
class solution
{
    public static void main(String args[])
    {    
        Scanner S = new Scanner(System.in);
        int size = S.nextInt();
        int arr[] = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = S.nextInt();
        }
        insertionsort(arr,size);
    }
    static void insertionsort(int arr[],int size){
        for(int i = 0;i<arr.length;i++)
        {
            int j = i;
            while(j>0 && arr[j - 1] > arr[j])
            {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
                System.out.print("ret"+" ");
            }
        }
    }
}
```
<h3> Time COmplexity: O(n) </h3>

<h3>Simplest Solution using Sort method</h3>

```js
class solution
{
	int insert(int arr[], int n)
	{
        // code here such that InsertionSort sorts arr[]
        return arr[n];
	}
	
	void Insertionsort(int arr[], int n)
	{
	    //code here
	    Arrays.sort(arr);
	    for(int i = 0;i<n;i++){
	        insert(arr,i);
	    }
	}
}
```
<h3>Insertion Sort - Time Complexity:O(n2)</h3>
<br/>
<h3>Merge Sort</h3>
<a href="https://youtu.be/ogjf7ORKfd8"><img src="https://github.com/user-attachments/assets/e14469c2-57e9-44c6-a3a6-ce313276f4de"/></a>
<h3><a href="https://www.geeksforgeeks.org/problems/merge-sort/1">Problem</a></h3>
<h3>SOlution</h3>

```js
 public static void mergeSort(int[] arr, int numberOfElements) {
    if (numberOfElements < 2) {
      return;
    }

    // Find the middle position and create left and right partitions
    int mid = numberOfElements/2;
    int[] leftArr = new int[mid];
    int[] rightArr = new int[numberOfElements - mid];

    // Fill up the partitions
    for (int i = 0; i < mid; i++) {
      leftArr[i] = arr[i];
    }
    
    for (int i = mid; i < numberOfElements; i++) {
      rightArr[i- mid] = arr[i];
    }

    // Apply merge sort on the left parition
    mergeSort(leftArr, mid);

    // Apply merge sort on the right partition
    mergeSort(rightArr, numberOfElements  - mid);

    // Finally merge the partitions
    merge(arr, leftArr, rightArr, mid, numberOfElements - mid);
  }

  private static void merge(int[] arr, int[] leftArr, int[] rightArr, int left, int right) {
    int i = 0, j = 0, k = 0;

    // Merge arrays based on the smaller values
    while (i < left && j < right) {
      if (leftArr[i] <= rightArr[j]) {
        arr[k++] = leftArr[i++];
      }
      else {
        arr[k++] = rightArr[j++];
      }
    }

    // Fill out remaining values if any
    while (i < left) {
      arr[k++] = leftArr[i++];
    }
    while (j < right) {
      arr[k++] = rightArr[j++];
    }
  }
```
<br/>
<h3>Quick Sort</h3>
<a href="https://youtu.be/WIrA4YexLRQ"><img src="https://github.com/user-attachments/assets/a82360b9-961f-4fbe-a9e1-c2e99f00e33f"/></a>
<h3><a href="https://www.geeksforgeeks.org/problems/quick-sort/1">Problem</a></h3>
<h3>Solution</h3>

```js
 public static void quickSort(int[] arr, int begin, int end) {

    if (begin < end) {
      // Find the partition
      int partition = findPartition(arr, begin, end);

      // Do quick sort on the left part
      quickSort(arr, begin, partition - 1);

      // Do quick sort on the right part
      quickSort(arr, partition + 1, end);
    }
  }

  private static int findPartition(int[] arr, int begin, int end) {

    // Taking last element as pivot element
    int pivot = arr[end];

    int i = (begin - 1); // index of smaller element

    for (int j = begin; j < end; j++) {
      // If current element is smaller than the pivot
      if (arr[j] < pivot) {
        i++;

        // swap arr[i] and arr[j]
        swap(arr, i, j);
      }
    }

    // swap arr[i+1] and arr[high] (or pivot)
    swap(arr, i + 1, end);

    return i + 1;
  }

  private static void swap(int[] arr, int i, int j) {
    int swapTemp = arr[i];
    arr[i] = arr[j];
    arr[j] = swapTemp;
  }
```

<br/>
<h1>Arrays</h1>
<h3>Largest element In an array</h3>
<a href="https://youtu.be/2SRzQEOaLYw?si=ISJm3Acvv8qRRR_6"><img src="https://github.com/user-attachments/assets/5bf4d176-fdee-4673-a98a-9a10a2399b5b"/></a>
<a href="https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0">Problem</a>

<h3>Solution</h3>

```js
class Solution {
    public static int largest(int n, int[] arr) {
        // code here
        int larg = arr[0];
        for(int i = 0;i<n;i++){
            if(arr[i]>larg){
                larg = arr[i];
            }
        }
        return larg;
    }
}
```
<h3>Second Largest element in an array (Very Important Interview Question) </h3>
<a href="https://youtu.be/37E9ckMDdTk"><img src="https://github.com/user-attachments/assets/a3d434d4-7b21-48e8-9e9b-c9f597307c32"></a><br/>
<a href="https://bit.ly/3pFvBcN">Problem</a><br/>
<h3>Solution</h3>

<h6>using java Collections</h6>

```js
class Solution {
    public int print2largest(List<Integer> arr) {
        // Code Here
        Collections.sort(arr);
        int n = arr.size();
        if(n<2){
            return -1;
        }
        
        int x = arr.get(n - 1);
        for(int i = n - 2;i>=0;i--){
            if(arr.get(i) != x){
                return arr.get(i);
            }
        }
        return -1;
        
    }
}
```
<h6>Brute Solution</h6>
1.

```js
import java.util.*;
class solution{
public static int secondlargest(int arr[],int n){
int n = arr.length;
if(n == 0 || n==1){
return -1;
}
Arrays.sort(arr);
int largest = arr[n - 2];
System.out.println(largest);
}
```
2.

```js
import java.util.*;
public class solution{
public static int secondlargest(int arr[],int n){
int firstlargest  = arr[n - 1];
int seconlrgt = 0;
for(int i = n - 2;i>=0;i--){
if(arr[i] != firstlargest){
      secondlrgt = arr[i];
      break;
    }
 }
System.out.println(secondlrgt);
}
}
```

<h3>Pseudocode</h3><br/>
* Brute Force Pseudocode<br/>
<img src="https://github.com/user-attachments/assets/b91fde51-a61a-4fd9-921a-c37cfdd030fd"/><br/>
* Better Approach pseudocode <br/>
<img src="https://github.com/user-attachments/assets/43ea6f23-9a18-4bc4-b2e2-094eb2137e5c"/><br/>
<h3>Arrays Is Sorted</h3>
<a href="https://youtu.be/37E9ckMDdTk"><img src="https://github.com/user-attachments/assets/07501111-bbf7-47a3-877f-079b9476c828"/></a>
<h3><a href="https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/">Problem</a></h3>
<h3>Answer</h3>
<h6>If Array is sorted and rotated</h6>
<a href="https://youtu.be/e22ns5G0qKY"><img src="https://github.com/user-attachments/assets/eb8c1bcb-139e-4fa7-9263-5f778ae4e51a" width=800 height=400/></a>

```js
class Solution {
    public boolean check(int[] nums) {

     int count  = 0;
     for(int i = 0;i<nums.length;i++){
            if(nums[i] > nums[(i+1) % nums.length]){
                count++;
            }
        } 
        if(count > 1){
            return false;
        }  
        return true;
    }
}
```
<br/>
<h6>If array is sorted</h6>

```js
class Solution {
    public boolean check(int[] nums) {

     int count  = 0;
     for(int i = 1;i<nums.length;i++){
            if(nums[i] > nums[(i+1)])
		return false; 
    }
	return true;
}
```

<h3>Remove Duplicate Element From Sorted Array</h3>
<a href="https://youtu.be/37E9ckMDdTk"><img src="https://github.com/user-attachments/assets/e8b3b1ab-c5a1-4738-ba68-11ee38132034"/></a>
<h3><a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/">Problem</a></h3>
<h3>Solution</h3>

```js

class Solution {
    public int removeDuplicates(int[] nums) {
         int len = nums.length;
         int i = 0;
            for(int j = 0;j<len;j++){
                if(nums[j] != nums[i]){
                    i++;
                    nums[i] = nums[j];
                }
            }
            return i + 1;
    }
}
```
<h3>Pseudocode</h3>
<img src="https://github.com/user-attachments/assets/21c9eb21-8fc5-4b21-bc2b-71c94f8160dd" width=800 height=600/>
<h5>Time Complexity: O(n) Space Complexity: O(1)</h5>
<h3>Rotate an Array by 1 place</h3>
<a href="https://youtu.be/wvcQg43_V8U"><img src="https://github.com/user-attachments/assets/cb06c428-2ed0-4627-852a-c762bf2fa822"/></a><br/>

```js
class solution{
public void rotatesinglearray(int arr[],int k){
int temp  = arr[0];
for(int i = 1;i<k;i++){
arr[i - 1] = arr[i];
	}
int lastindex = temp;
return arr;
}
```
<h5>Time Complexity: O(n) Space Complexity: O(1)</h5>
<h3>Rotate an array by d places</h3>
<h3><a href="https://youtu.be/wvcQg43_V8U"><img src="https://github.com/user-attachments/assets/75beddf9-efcd-4ebe-9a27-965a01201ded"/></a></h3>
<h3> <a href="https://leetcode.com/problems/rotate-array/description/">Problem</a></h3>
<h3>Solution</h3>

```js
class Solution {
    public void rotate(int[] nums, int k) {
    k = k%nums.length;    
    // reverse an array
    reverse(nums,0,nums.length - 1);
    // reverse an array up to the index k;
    reverse(nums,0,k - 1);
    //reverse an array after k up to endindex;
    reverse(nums,k,nums.length - 1);
    }
    public void reverse(int[] nums,int startindex,int endindex){
        while(startindex<endindex){
            int temp = nums[startindex];
            nums[startindex] = nums[endindex];
            nums[endindex] = temp;
            startindex++;
            endindex--;
        }
    }
}
```
<h5>Time Complexity: O(n) Space Complexity: O(1)</h5>
<a href="https://youtu.be/XJzVC9R5q8Y?si=SYMqRPN463yP2vow"><img src="https://github.com/user-attachments/assets/8623d735-d564-4c8d-8260-fac6d8d9bc98"/></a>
<br/>
<h3>Moves Zero To end</h3>
<a href="https://www.youtube.com/watch?v=_OYdPBPOz7U"><img src="https://github.com/user-attachments/assets/32a3d44d-5bd2-461e-8e6c-b53ff95434cd"/></a>
<h3><a href="https://leetcode.com/problems/move-zeroes/description/">Problem</a></h3>
<h3>Solution</h3>

```js
class Solution {
    public void moveZeroes(int[] nums) {
        //array length
        int len = nums.length;
        // array check for base case;
        if(len<2){
            return;
        }
        int slow = 0;
        int fast = 0;
        while(fast < len){
            if(nums[fast] != 0){
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
                fast++;
            }
            else{
                fast++;
            }
        }
    }
}
```
<h3>Time Complexity: O(n) and Space Complexity:O(1)</h3>
<h3>Linear Search</h3>
<a href="https://youtu.be/wvcQg43_V8U"><img src="https://github.com/user-attachments/assets/0ecd6014-901b-40c1-8da2-6015cad80cf0"/></a>
<h3><a href="https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1">Problem</a></h3>
<h3>Solution</h3>

```js

class Solution {
    static int searchInSorted(int arr[], int N, int K) {
        for(int i = 0;i<N;i++){
            if(arr[i] == K){
                return 1;
            }
        }
        return -1;
        // Your code here
    }
}
```
<h3>Time Complexity: O(Log N) and Space Complexity:O(1)</h3>
<br/>
<h3>Union of Sorted Array</h3>
<a href="https://youtu.be/wvcQg43_V8U"><img src="https://github.com/user-attachments/assets/b04c2e0d-16fa-4d10-b35c-b61a79035f22"/></a>
<h3><a href="https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1">Problem</a></h3>
<h3>Solution</h3>

```js
class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        Set<Integer> result = new TreeSet<>();
        for(int i : arr1){
            result.add(i);
        }
        for(int j : arr2){
            result.add(j);
        }
        return new ArrayList<>(result);
    }
}
```
<h3>Time Complexity: O(n + m) and Space Complexity:O(n + m)</h3>
<h3>Find Missing Number in an array</h3>
<a href="https://youtu.be/bYWLJb3vCWY"><img src="https://github.com/user-attachments/assets/c723caf6-207a-4117-a793-346fe4eb002a"/></a>
<h3><a href="https://leetcode.com/problems/missing-number/">Problem</a></h3>
<h3>Solution</h3>

```js
class Solution {
    public int missingNumber(int[] nums) {
       int sums = 0;
       for(int i = 0;i<nums.length;i++){
        sums = sums + nums[i];
       }
       int actualsum = (nums.length * (nums.length + 1))/2;
       int res = actualsum - sums;
       return res; 
    }
}
```
<h3>Time Complexity: O(N) and Space Complexity:O(1)</h3>
<h3>Max Consecutive Ones</h3>
<a href="https://youtu.be/bYWLJb3vCWY"><img src="https://github.com/user-attachments/assets/3e2c464e-afe7-4cb2-967e-81cbb39c9ee5"/></a>
<h3><a href="https://leetcode.com/problems/max-consecutive-ones/description/">Problem</a></h3>

C++

```js
class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int maxi = 0;
        int count  = 0;
        for(int i = 0;i<nums.size();i++){
            if(nums[i] == 1){
                count++;
                maxi = max(maxi,count); 
            }
            else{
                count  =  0;
            }
        }
        return maxi;
    }
};
```
Java

```js
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int maxi = 0;
     int count = 0;
     for(int i = 0;i<nums.length;i++){
        if(nums[i] == 1){
            count++;
            maxi = Math.max(count,maxi); 
        }
        else{
            count = 0;
        }
     } 
     return maxi;  
    }
}
```
<h3>Time Complexity:O(N) and Space complexity: O(1)</h3>
<h3>Longest Subarray With Sum K(Positive and negative)</h3>
<a href="https://youtu.be/frf7qxiN2qU"><img src="https://github.com/user-attachments/assets/01f4512b-0a66-4e6e-9b30-183baaf7a035"/></a>
<h3><a href="https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1">Problem</a></h3>

```js
class Solution {
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr(int A[], int N, int K) {
        // Complete the function
        HashMap<Integer,Integer> prevsum = new HashMap<>();
        int sum = 0,maxlen = 0;
        for(int i = 0;i<N;i++){
            sum = sum + A[i];
            if(sum == K){
                maxlen = i + 1;
            }
            if(!prevsum.containsKey(sum)){
               prevsum.put(sum, i);
            }
            if(prevsum.containsKey(sum - K)){
              maxlen = Math.max(maxlen, i - prevsum.get(sum - K));
            }
        }
        return maxlen;
        
    }
}
```
<h3>Two Sum</h3>
<a href="https://youtu.be/UXDSeD9mN-k"><img src="https://github.com/user-attachments/assets/d54b8ea9-b45f-4fa7-b134-a17ccc6b31da"/></a>
<h3><a href="https://leetcode.com/problems/two-sum/description/">Problem</a></h3>

```js
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int res = 0;
        for(int row = 0;row<len;row++){
            for(int col = row + 1;col<len;col++){
                if(nums[row] + nums[col] == target){
                        return new int[]{row,col};
                }
            }
        }
        return new int[]{};
    }
}
```			   
<h3>Time Complexity: O(N2) and Space Complexity: O(1)</h3>
<h3>Sort 0 1 2</h3>
<a href="https://youtu.be/tp8JIuCXBaU"><img src="https://github.com/user-attachments/assets/342f8ae2-0037-4254-a06b-a6821219c721"/></a>
<h3><a href="https://leetcode.com/problems/sort-colors/description/">Problem</a></h3>
<h3>Solution</h3>

```js
class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i<len;i++){
            System.out.println(nums[i]);
        }
    }
}
```
<h3>Time Complexity: O(NLogN) and Space Complexity: O(1)</h3>
<h3>majority element</h3>
<a href="https://youtu.be/bg6r_fgtpMQ"><img src="https://github.com/user-attachments/assets/1209a44b-9ecf-483f-b6e2-b26860511351"/></a>
<h3><a href="https://leetcode.com/problems/majority-element/description/">Problem</a></h3>
<h3>Solution</h3>

```js
class Solution {
    public int majorityElement(int[] nums) {
        //arraylength
        int len = nums.length;
        //count 
        int count  = 1;
        //majority element
        int majority = nums[0];
        // check majority
        for(int i = 0;i<len;i++){
            if(nums[i] == majority){
                count = count + 1;
            }
            else{
                count = count - 1;
                if(count == 0){
                    majority = nums[i];
                    count = 1;
                }
            }
        }
        return majority;
    }
}
```
<h3>Time Complexity: O(N) and Space Complexity: O(1)</h3>
<h3>Maximum Subarray</h3>
<a href="https://youtu.be/c-wuQj44st4?si=CSnQRFtDNBbGfYZi"><img src="https://github.com/user-attachments/assets/ca1ff950-93cd-4243-908f-1509701ce21c"></a>
<h3><a href="https://leetcode.com/problems/maximum-subarray/solutions/">Problem</a></h3>
<h3>Solution</h3>

 ```js
 class Solution {
    public int maxSubArray(int[] nums) {
        // length
        int len = nums.length;
        // sum
        int sum = 0;
        // max sum
        int max_sum = nums[0];
        // check using kadane Algorithm
        for(int i = 0;i<len;i++){
            sum = sum + nums[i];
            max_sum = Math.max(max_sum,sum); 
            if(sum<0){
                sum = 0;
            }
        }
        return max_sum;
    }
}
```
<h3>Time Complexity: O(N) and Space COmplexity: O(1)</h3>
<h3>Plus ONe</h3>
<a href="https://www.youtube.com/watch?v=Tcxob-LyBTo"><img src="https://github.com/user-attachments/assets/ae35578d-47c2-4305-88eb-517063762e5c"></a>
<h3><a href="https://leetcode.com/problems/plus-one/description/">Problem</a></h3>
<h3>Solution</h3>

```js
class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        for(int i = digits.size() - 1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i] = 0;
            }
        }
        digits.push_back(0);
        digits[0] = 1;
        return digits;
    }
};
```
<h3>Time Complexity: O(N) and Space COmplexity: O(1)</h3>
<h1>Maximum Score in Subarray</h1>
<h3><a href="https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0?category">Problem</a></h3>
<h3>Solution</h3>

```js
class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(List<Integer> arr) {
        // Your code goes here
        int max = 0;
        int sum = 0;
        for(int i = 0;i<arr.size() - 1;i++){
            sum = arr.get(i) + arr.get(i + 1);
            max = Math.max(sum,max);
        }
        return max;
    }
}
```
<h3>Time Complexity: O(N) and Space COmplexity: O(1)</h3>
<h3>Buy Stock and Sell - I</h3>
<a href="https://youtu.be/E2-heUEnZKU?si=o4sdQ5XUYZB1CKSv"><img src="https://github.com/user-attachments/assets/d510163d-244f-4824-ad60-249a852977f0"></a>
<h3><a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/">Problem</a></h3>
<h3>Solution</h3>

```js
class Solution {
    public int maxProfit(int[] prices) {
        //at the beginning the minimum is the first place
        int buy_price = prices[0];
        
        // profit
        int profit = 0;
        
    
        for(int  i = 1;i<prices.length;i++){

           // if current price is less than buy_price
            if(prices[i]<buy_price){
                buy_price = prices[i];
            }
            
            else{
                // else check if we can get better profit
                int current_profit = prices[i] - buy_price;
                profit = Math.max(current_profit,profit);
            }
            
        }
        return profit;
    }
}
```
<h3>Time Complexity: O(N) and Space COmplexity: O(1)</h3>
<h3> Rearrange Array Elements by Sign</h3>
<a href="https://youtu.be/h4aBagy4Uok"><img src="https://github.com/user-attachments/assets/8b851bd3-bc95-45b2-8193-c7f42dc90229"/></a>
<h3><a href="https://leetcode.com/problems/rearrange-array-elements-by-sign/description/">Problem</a></h3>
<h3>Solution</h3>

```js
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int positive = 0;
        int negative = 1;
        int[] fin = new int[len];
        for(int i = 0;i<len;i++){
            if(nums[i] < 0){
                fin[negative] = nums[i];
                negative = negative + 2;   
            }
            else{
                fin[positive] = nums[i];
                positive = positive + 2;
            }
        }
        return fin;
    }
}
```
<h3>Time Complexity: O(N) and Space COmplexity: O(1)</h3>
<h3>Subarray sums equals k</h3>
<h3><a href="https://leetcode.com/problems/subarray-sum-equals-k/">Problem</a></h3>

```js
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=0;
        for(int i=0; i<nums.length; i++)
        {
            int s=0;
            for(int j=i; j<nums.length; j++)
            {
                s+=nums[j];
                if(s==k)
                n++;
                
            }
        }
        return n;
    }
}

```
<h3>Time Complexity: O(N2) and Space COmplexity: O(1)</h3>
<h3>Array Leaders</h3>
<h3><a href="https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1">Problem</a></h3>
<h3>Solution</h3>

```js
class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        // new arraylist
        ArrayList<Integer> list = new ArrayList<>();
        // max
        int max = arr[n - 1];
        // the value from reverse to check max
        for(int first = n - 1;first>=0;first--)
        {
            
            if(arr[first] >= max) 
            {
                list.add(0,arr[first]);
                max = arr[first];
            }
        }
        return list;
    }
}
```
<h3>Time Complexity: O(N) and Space COmplexity: O(1)</h3>
<h3>Longest Consecutive Sequence</h3>
<h3><a href="https://leetcode.com/problems/longest-consecutive-sequence/description/">Problem</a></h3>
<a href="https://youtu.be/oO5uLE7EUlM"><img src="https://github.com/user-attachments/assets/3f6f0d32-3a84-4654-882a-4823b2ad1545"/></a>
<h3>Solution</h3>

 ```js
class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
	int longest = 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        for (int i : set) {
                if (!set.contains(i - 1)) {//check if 'i' is a starting number
                int cnt = 1;
                int tempIndex = i;
                while (set.contains(tempIndex + 1)) {
                    tempIndex++;
                    cnt++;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
}
```
<h3>Time Complexity: O(Log N) and Space COmplexity: O(1)</h3>
<h3>Rotate Mtrix by 90 degree</h3>
<a href="https://youtu.be/Z0R2u6gd3GU"><img src="https://github.com/user-attachments/assets/fdd92184-b1ed-41b9-b3eb-27c9a530084c"/>
<h3><a href="https://leetcode.com/problems/rotate-image/">Problem</a></h3>
<h3>Solution</h3>
	
```js
	class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<i;j++){
                // swap the values using two pointer
                int temporary = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temporary;
            }
        }

        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix.length/2;j++){
                 // swap the values using two pointer with last value of row 
                int temporary = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temporary;
            }
        }
    }
    }
```
<h3>Time Complexity: O(N*N) and Space COmplexity: O(1)</h3>
<h3>Spiral Matrix</h3>
<a href="https://youtu.be/3Zv-s9UUrFM"  target="_blank"><img src="https://github.com/user-attachments/assets/3da5faaa-2443-4205-b344-c28159fe9de6"/></a>
<h3><a href="https://leetcode.com/problems/spiral-matrix/description/">Problem</a></h3>
<h3>Solution</h3>

```js
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowlen  = matrix.length;//row length
        int collen = matrix[0].length; //col length
        int left = 0;
        int right = collen - 1;
        int top = 0;
        int bottom = rowlen -1;
        List<Integer> list  = new ArrayList<>();
        while(top<=bottom && left<=right)
        {
            // left to right
            for(int i = left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;

            // top to bottom
            for(int i = top;i<=bottom;i++){
                list.add(matrix[i][right]);
            } 
            right--;


            // right to left (if still top is need to be less than bottom)
            if(top <= bottom){
                for(int i = right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
            }
            bottom--;
            // bottom to top
            if(left<= right){
                for(int i = bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
            }
            left++;
        }
        return list;
    }
} 

```
<h3>Time Complexity:O(M * N) and space Complexity: O(1)</h3>

<h3>Set Matrix Zeros</h3>
<a href="https://youtu.be/N0MgLvceX7M"><img src="![image](https://github.com/user-attachments/assets/a047421e-e541-4f8c-b5cd-a94aa9117a65)"></a>
<h3><a href="https://leetcode.com/problems/set-matrix-zeroes/">Problem</a></h3>
<h3>Solution</h3>

```js
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstrow = false,firstcolumn = false;

        // set markers in first row and first column
        for(int i = 0;i<matrix.length;i++)
        {
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    if(i == 0){
                       firstrow =  true;
                    }
                    if(j == 0){
                        firstcolumn = true;
                    }
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // replace inner matrix
        for(int i = 1;i<matrix.length;i++){
            for(int j = 1;j<matrix[0].length;j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(firstrow){
            for(int j = 0;j<matrix[0].length;j++){
                    matrix[0][j] = 0;
            }
        }
        if(firstcolumn){
            for(int i = 0;i<matrix.length;i++){
                    matrix[i][0] = 0;
            }
        }
    }
}
```
<h3>Time Complexity:O(M * N) and space Complexity: O(1)</h3>
<h3>Next Permutation</h3>
<a href="https://youtu.be/PdNKI82hHKk?si=bktsS0_HAs5iFph0"><img src="https://github.com/user-attachments/assets/63f94f3c-da2e-4759-b169-e9c33a13b946"></a>
<h3><a href="https://leetcode.com/problems/next-permutation/">Problem</a>
<h3>Solution</h3>

```js
class Solution {
    public void nextPermutation(int[] nums) {
        int ind1=-1;
        int ind2=-1;
        // step 1 find breaking point 
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind1=i;
                break;
            }
        }
        // if there is no breaking  point 
        if(ind1==-1){
            reverse(nums,0);
        }
        
        else{
            // step 2 find next greater element and swap with ind2
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[ind1]){
                    ind2=i;
                    break;
                }
            }

            swap(nums,ind1,ind2);
            // step 3 reverse the rest right half
            reverse(nums,ind1+1);
        }
    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}

```
<h3>Time Complexity:O(N) and space Complexity: O(1)</h3>
<h3>Pascal Triangle</h3>
<a href="https://youtu.be/bR7mQgwQ_o8"><img src="https://github.com/user-attachments/assets/12f52449-a2f8-4997-98c5-f87cf7363c9d"/></a>
<h3><a href="https://leetcode.com/problems/pascals-triangle/">Problem</a></h3>
<h3>Solution</h3>

```js
function pascalTriangle(n) {
    let ans = 1;
    console.log(ans + " "); // printing 1st element
  
    //Printing the rest of the part:
    for (let i = 1; i < n; i++) {
      ans = ans * (n - i);
      ans = ans / i;
      console.log(ans + " ");
    }
    console.log("n");
}
const n = 5;
pascalTriangle(n);
```
<h3>Time Complexity:O(N) and space Complexity: O(1)</h3>

<h3>Majority element n/3 times</h3>
<a href="https://youtu.be/vwZj1K0e9U8"><img src="https://github.com/user-attachments/assets/556f0f36-623d-4c4c-89d4-f1ebac60c127"/></a>
<h3><a href="https://leetcode.com/problems/majority-element-ii/description/">Problem</a></h3>
<h3>Solution</h3>

```js
public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums) {
            uniqueNums.add(num);
        }
        for (int num : uniqueNums) {
            int count = 0;
            for (int n : nums) {
                if (n == num) {
                    count++;
                }
            }
            if (count > nums.length / 3) {
                result.add(num);
            }
        }
        return result;
    }
}
```
<h3>Time Complexity:O(N2) and space Complexity: O(N)
<h3>Three Sum (Most Asked interview Problem)</h3>
<a href="https://www.youtube.com/watch?v=cRBSOz49fQk"><img src="https://github.com/user-attachments/assets/5bc5bd6a-568b-49d9-a78d-5261c60b19f6"/></a>
<h3><a href="https://leetcode.com/problems/3sum/description/">Problem</a></h3>
<h3>Solution</h3>

```js
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        // check list length or null
        if(nums == null || nums.length < 3){
            return new ArrayList<>();
        }

        // sort
        Arrays.sort(nums);
        // set 
        Set<List<Integer>> result = new HashSet<>();
        
        // using two pointers 
        for(int i = 0;i<nums.length - 2;i++)
        {
            int left  = i + 1;
            int right = nums.length - 1;
            while(left <  right)
            {
                // sum nums values

                int sum = nums[i] + nums[left] + nums[right];

                //if sum is equal to zero
                if(sum == 0)
                {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }

                else if(sum < 0)
                {
                    left++;
                }

                else
                {
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
```
<h3>Time Complexity:O(N2) and O(N)</h3>
<h3>Four SUm</h3>
<h3><a href="https://leetcode.com/problems/4sum/">Problem</a></h3>
<h3>Solution</h3>

```js

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int size = nums.length;
        if (nums == null || size < 4) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < size - 3; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            for (int j = i + 1; j < size - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j-1]) continue;
                int left = j + 1, right = size - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        List<Integer> res = new ArrayList<>();
                        res.add(nums[i]); res.add(nums[j]); res.add(nums[left]); res.add(nums[right]);
                        result.add(res);
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left-1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right+1]) {
                            right--;
                        }
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
```
<h3>Maximum Product SubArray</h3>
<a href="https://youtu.be/Y6B-7ZctiW8?si=-jLQfsLLwQQ7aGUf"><img src="https://github.com/user-attachments/assets/4a5124fa-304d-41a2-97d4-f1805fd49ed6"/></a>
<h3><a href="https://leetcode.com/problems/maximum-product-subarray/description/">Problem</a></h3>
<h3>Solution</h3>

```js
class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int leftproduct = 1;
        int rightproduct = 1;
        int ans = nums[0];
        for(int i = 0;i<len;i++){
            if(leftproduct == 0){
                leftproduct = 1;   
            }
            if(rightproduct == 0){
                rightproduct = 1;
            }

            //leftproduct
            leftproduct = leftproduct * nums[i];

            //rightproduct
            rightproduct = rightproduct * nums[len - 1 - i];

            ans = Math.max(ans,Math.max(leftproduct,rightproduct)); 
        }
        return ans;
    }
}
```
<h3>Time Complexity:O(N) and Space COmplexity: O(1)</h3>
<h3>Merge Two SOrted Array</h3>
<a href="https://youtu.be/0H6038ldSyg?si=-UleC8dOHm1KzjvH"><img src="https://github.com/user-attachments/assets/bf2edf0b-2c36-43d4-8a6a-94e2f95ab9fe"/></a>
<h3><a href="https://leetcode.com/problems/merge-sorted-array/description/">Problem</a></h3>
<h3>Solution</h3>

```js
 for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
```
<h3>Time Complexity:O(N lOgN) and SpaceCOmplexity: O(1)</h3>
<h3>Longest subarray with 0 sum </h3>
<a href="https://youtu.be/Bne92MpRieE?si=N43m-QtsKZbsMu69"><img src="https://github.com/user-attachments/assets/9d652e00-0933-4d27-b1a1-e155a3182935"/></a>
<h3><a href="https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1?category[]=Hash&company[]=Amazon&page=1&query=category[]Hashcompany[]Amazonpage1company[]Amazoncategory[]Hash">Problem</a></h3>
<h3>Solution</h3>

```js
import java.util.HashMap;

class Solution {
    public int maxLen(int[] arr, int n) {
        // Your code here
        HashMap<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        int ans = 0;
        mp.put(0, -1);
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (mp.containsKey(sum)) {
                ans = Math.max(ans, i - mp.get(sum));
            } else {
                mp.put(sum, i);
            }
        }
        return ans;
    }
}
```
<h3>Time Complexity: O(n) and Space Complexity: o(n)</h3>
<h1>Binary Search</h1>
<h3>Introduction</h3>
<a href="https://youtu.be/MHf6awe89xw"><img src="https://github.com/user-attachments/assets/02410bb3-8cd9-428c-81dd-dc6d47abe6c5"/></a>
<h3><a href="">Problem</a></h3>
<h3>Solution</h3>
<h3>TIme Complexit:O(Log N) and Space Complexity: O(1)</h3>
<h1>String</h1>
<h3>Find the Difference</h3>
<h3><a href="https://leetcode.com/problems/find-the-difference/description/">Problem</a></h3>
<h4>Solution</h4>

```js
class Solution {
    public char findTheDifference(String s, String t) {
        int total = 0;
        for(int i = 0;i<t.length();i++){
            total = total + t.charAt(i);
        }

        for(int i = 0;i<s.length();i++){
            total = total - s.charAt(i);
        }

        return (char)total;
    }
}
```
<h3>Merge String Alternatively</h3>
<h3><a href="https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=programming-skills">Problem</a></h3>
<h4>Solution</h4>

```js
class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        //two pointers
        int i = 0;
        int j = 0;
        // empty string
        string res = "";
        // size
        while(i<word1.size() && j<word2.size()){ // size from 0 to length of word
            res += word1[i++];
            res += word2[j++];
        }
        // i
        while(i<word1.size()){
            res += word1[i++];
        }
        // j
        while(j<word2.size()){
            res += word2[j++];
        }
        return res;
    }
};
```
<h3>Complexity</h3>
<li>Time complexity:O(N + M)</li>
<li>Space complexity:O(N + M)</li>
<h3>Find-the-index-of-the-first-occurrence-in-a-string</h3>
<h3><a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/">Problem</a></h3>
<h4>Solution</h4>

```js
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0;i<haystack.length() - needle.length() + 1;i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i,needle.length() + i).equals(needle)){
                    return i;
                }
            }
        }
        return -1; 
    }
}

```

<h3>Valid Anagram</h3>
<h3><a href="https://leetcode.com/problems/valid-anagram/description/?envType=study-plan-v2&envId=programming-skills">Problem</a></h3>
<h4>Solution</h4>

```js
class Solution {
    public boolean isAnagram(String s, String t) {
        // length
        if(s.length() != t.length())return false;

        //change to charArray
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();

        // sort
        Arrays.sort(a);
        Arrays.sort(b);

        // check value 
        for(int i = 0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}
```
