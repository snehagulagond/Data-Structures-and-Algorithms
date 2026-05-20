//Problem: Implement merge sort algorithm to sort an array of integers in ascending order.
//Solution: The merge sort algorithm works by dividing the array into two halves, sorting each half recursively, and then merging the sorted halves back together. The merge step involves comparing the elements of the two halves and combining them in sorted order.
//Time Complexity: O(n log n) where n is the number of elements in the array, as we need to divide the array into halves log n times and merge each half takes O(n) time.
//Space Complexity: O(n) as we need to create a temporary array to store the merged elements during the merge step.

import java.util.*;
public class mergeSort {

    public static void mergesort(int[] arr,int low,int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr, mid+1, high);
        merge(arr,low,mid,high);

    }
    public static void merge(int[] arr,int low,int mid,int high){
        int[] list=new int[high-low+1]; // temporary array to store merged elements
        int left=low;
        int right=mid+1;
        int k=0;
        while (left<=mid && right<=high) {
            if(arr[left]<=arr[right]){
            list[k++]=arr[left++]; // add the smaller element to the list and move the pointer to the next element in the left subarray 
        }
        else{
            list[k++]=arr[right++]; // add the smaller element to the list and move the pointer to the next element in the right subarray

        }
        }
        while (left<=mid) {
            list[k++]=arr[left++];
            
        }
        while (right<=high) {
            list[k++]=arr[right++];
            
            
        }
        for(int i=low;i<=high;i++){
            arr[i]=list[i-low];
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergesort(arr, 0, n-1);
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}