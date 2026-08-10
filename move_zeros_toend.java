//Problem: Move all zeros to the end of the array
//Approach: Two pointer approach
//Time Complexity: O(n)
//Space Complexity: O(1)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class move_zeros_toend {
    public static void main(String[] args) {
       

        int arr[]={1,2,0,0,3,9,0,0};
        int n=arr.length;
        int j=-1;
        for(int i=0;i<n-1;i++){
            if(arr[i]==0){
                j=i;break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
