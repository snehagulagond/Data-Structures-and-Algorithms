//Problem: Sort an array using quick sort algorithm
//approach: The quick sort algorithm works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. The sub-arrays are then sorted recursively.
//Time Complexity: O(n log n) on average and O(n^2) in the worst case (when the smallest or largest element is always chosen as the pivot).
//Space Complexity: O(1) for the in-place version, but O(log n) on average and O(n) in the worst case due to recursive call stack.  
import java.util.Arrays;
import java.util.Scanner;

public class quicSort {

    public static int partition(int arr[],int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while (arr[j]>=pivot && j>=low+1) {
                j--;
                
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }

    public static void qs(int arr[],int low,int high){
        if(low<high){
            int PIndex=partition(arr,low,high);
            qs(arr,low,PIndex-1);
            qs(arr,PIndex+1,high);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        System.out.println("Enter elements of an array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        qs(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    
}
