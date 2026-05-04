
//brute force approach
// import java.util.Arrays;
// public class sLargest {
//     public static void main(String[] args) {
//         int arr[]={3,6,3,7,7,5};
//         int n=arr.length;
//         Arrays.sort(arr);
//         int largest=arr[n-1];
//         int slargest=-1;
//         for(int i=n-2;i>=0;i--){
//             if(arr[i]!=largest){
//                 slargest=arr[i];
//                 break;

//             }
//         }
//         System.out.println(slargest);
//     }
    
// }

//optimal approach
import java.util.Arrays;
public class sLargest {
    public static void main(String[]args){
       int arr[]={3,6,3,7,7,5};
        int n=arr.length;
        Arrays.sort(arr);
        int largest=arr[0];
        int slargest=-1; 
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            
            }
            else if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
        System.out.println(slargest);

    }
}