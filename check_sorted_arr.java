//problem: check if the given array is sorted in non-decreasing order or not
//approach: we will compare each element with the previous one, if we find any element that is less than the previous one, we will return false, otherwise we will return true at the end
//time complexity: O(n) where n is the number of elements in the array
//space complexity: O(1) because we are not using any extra space

import java.util.*;
import java.util.Scanner;
public class check_sorted_arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array:");

        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=1;i<n;i++){
            if(arr[i] < arr[i-1]){
                System.out.println(false);
                return; // stop here
            }
        }

        System.out.println(true);
    }
}