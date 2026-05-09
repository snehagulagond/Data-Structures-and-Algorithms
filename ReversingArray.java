//Problem: Reverse an array using recursion
//Solution: To reverse an array using recursion, we can use a two-pointer approach. We
//Time Complexity: O(n) where n is the number of elements in the array, as we need to visit each element once to reverse it.
//Space Complexity: O(n) due to the maximum depth of the recursion stack being n in the worst case.


import java.util.Arrays;
public class ReversingArray {
    public static void reverse(int arr[],int i,int n){
        if(i>=n){
            return ;
        }
        int temp=arr[i];
        arr[i]=arr[n-1];
        arr[n-1]=temp;
       
         reverse(arr,i+1,n-1);
        
    }
    public static void main(String[]args){
        int arr[]={4,2,3,4,5};
        int n=arr.length;
        reverse(arr,0,n);
        System.out.println(Arrays.toString(arr));

    }
}