//Problem: Write a program to left rotate an array by one place.
//Approach: Store the first element in a temporary variable, shift all elements to the left by one position, and place the temporary variable at the end of the array.
//Time Complexity: O(n), where n is the number of elements in the array.
//Space Complexity: O(1), as we are using a constant amount of extra space for the temporary variable.



import java.util.Arrays;
import java.util.Scanner;

public class left_rotate_by_oneplace {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int temp=arr[0];
        for(int i=1;i<5;i++){
            arr[i-1]=arr[i];
        }
        arr[5-1]=temp;
        System.out.println(Arrays.toString(arr));
        
    }
    
}
