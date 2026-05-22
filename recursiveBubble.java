//Problem: Sort an array using recursive bubble sort
//approach: The bubble sort algorithm works by repeatedly swapping adjacent elements if they are in the wrong order. The recursive version of bubble sort reduces the problem size by one in each recursive call until the base case is reached (when the array is of size 1).
//Time Complexity: O(n^2) in the worst and average cases, O(n) in the best case (when the array is already sorted).
//Space Complexity: O(n) due to the recursive call stack.
import java.util.*;


public class recursiveBubble {

    public static void bubbleSort(int arr[],int n){
        if(n==1) return;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        bubbleSort(arr,n-1);
    }
    public static void main(String[] args) {
        int arr[]={1,4,2,78,45,9};
        int n=arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}