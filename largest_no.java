//Brute force method

// import java.util.Scanner;
// import java.util.Arrays;
// public class largest_no {
//     public static void main(String[] args) {
//         // Scanner sc=new Scanner(System.in);
//         // int arr[]=new int[6];
//         // System.out.println("Enter the array");
//         int arr[]={2,5,10,3,8,9};
        
//         int n=arr.length;
//         Arrays.sort(arr);
//         System.out.println(arr[n-1]);


//     }
    
// }


//optimal solution
public class largest_no {
     public static void main(String[] args) {
      int arr[]={2,5,10,3,8,9};
      int largest=arr[0];
      int n=arr.length;
      for(int i=0;i<n;i++){
        if(arr[i]>largest){
            largest=arr[i];

        }
        
      }
      System.out.println(largest);  
     }
    
}