//Problem: Remove Duplicates from Sorted Array

// Approach:
// Use two pointers to overwrite duplicates in same array

// Time Complexity: O(n)
// Reason: Single traversal

// Space Complexity: O(1)
// Reason: No extra space used (in-place)


public class delete_duplicate {
     public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4,4,7,7};
        int n=arr.length;
        
        int i=0;
        for (int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
          
            

        }
        System.out.println(i+1);
     }
    
}
