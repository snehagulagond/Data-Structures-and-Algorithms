import java.util.Arrays;
public class largestno {
    public static void main(String[]args){
        int arr[]={10,20,30,40,50,50};
        Arrays.sort(arr);
        System.out.println("Largest number in the array is: "+arr[arr.length-2]);
    }
}
// public class largestno {
//     public static void main(String[]args){
//         int arr[]={10,20,30,40,50,50};
//         int largest=arr[0];
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]>largest){
//                 largest=arr[i];
//                 if(largest>2largest){
                    
//                 }
                
//             }
//         }
//         System.out.println("Largest number in the array is: "+largest);
//     }
// }


