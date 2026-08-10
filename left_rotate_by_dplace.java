//Problem: Left rotate an array by d places
//Approach: Rotate the array by one place d times
//Time Complexity: O(n*d)
//Space Complexity: O(1)
import java.util.Arrays;
import java.util.Scanner;


public class left_rotate_by_dplace{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter d value");
        int d=sc.nextInt();
        int n=arr.length;
        for(int j=0;j<d;j++){
            int temp=arr[0];
            for(int i=1;i<n;i++){
                arr[i-1]=arr[i];

            }
            arr[n-1]=temp;
        }

        
        System.out.println(Arrays.toString(arr));
    }
}