//Problem: Sort an array using bubble sort
//Solution: The bubble sort algorithm works by repeatedly swapping adjacent elements if they are in the wrong   order. This process is repeated until the entire array is sorted.
//Time Complexity: O(n^2) where n is the number of elements in the array, as we need to compare each element with every other element to sort the array.
//Space Complexity: O(1) as we are sorting the array in place and not using any additional data structures to store the sorted array.

import java.util.Arrays;
import java.util.*;
public class bubbleSort {
    public static void bubble(int[] arr){
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int arr[]={2,4,2,78,21,7,87,98};
        bubble(arr);
    }
    
}
