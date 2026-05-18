//Problem: Given an array of integers, sort the array in ascending order using the selection sort algorithm.
//Solution: The selection sort algorithm works by repeatedly selecting the minimum element from the unsorted portion    of the array and swapping it with the first element of the unsorted portion. This process is repeated until the entire array is sorted.
//Time Complexity: O(n^2) where n is the number of elements in the array, as we need to compare each element with every other element to find the minimum.
//Space Complexity: O(1) as we are sorting the array in place and not using any additional data structures to store the sorted array.   
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class Selection_sort {
    public static void selection_sort(int arr[]){
        for(int i=0;i<=arr.length-2;i++){
            int min=i;
            for(int j=i;j<=arr.length-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println(Arrays.toString(arr)); 

    }
    public static void main(String[] args) {
        int arr[]={24,12,56,3,58,9};
        
        selection_sort(arr);

    }

    
}
