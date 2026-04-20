

import java.util.Arrays;
import java.util.Scanner;


public class pass_by_ref {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array:");
        int arr[]=new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int rev[]=new int[arr.length];
        int n=arr.length;
        int i;
        for(i=0;i<n;i++){
            rev[i]=arr[n-1-i];

        }
        System.out.println(Arrays.toString(rev));
        
    
    }
}


