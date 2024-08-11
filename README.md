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
<a href="https://youtu.be/ogjf7ORKfd8"><img src="https://github.com/user-attachments/assets/e14469c2-57e9-44c6-a3a6-ce313276f4de"/></a><br/>
<a href="https://www.geeksforgeeks.org/problems/merge-sort/1">Problem</a>
<br/>
<h3>Quick Sort</h3>
<a href="https://youtu.be/WIrA4YexLRQ"><img src="https://github.com/user-attachments/assets/96da6672-7491-45dd-8138-3e41a23f4bc2"/></a><br/>
<a href="https://www.geeksforgeeks.org/problems/quick-sort/1">Problem</a>

<br/>
<h1>Arrays</h1>
<h3>Largest element In an array</h3>
<a href="https://youtu.be/37E9ckMDdTk"><img src="https://github.com/user-attachments/assets/5bf4d176-fdee-4673-a98a-9a10a2399b5b"/></a><br/>
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
