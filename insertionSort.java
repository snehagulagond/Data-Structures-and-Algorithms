//Problem: Write a program to sort an array using insertion sort algorithm.
//approach: The insertion sort algorithm works by dividing the array into a sorted and an unsorted part. It iteratively takes elements from the unsorted part and inserts them into the correct position in the sorted part until the entire array is sorted.
//Time complexity: O(n^2) in the worst case, O(n) in the best case (when the array is already sorted).
//Space complexity: O(1) as it is an in-place sorting algorithm.

import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
     }
     insertionsort(arr);
        System.out.println("Sorted array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
     
     public static void insertionsort(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
     }   
     

}