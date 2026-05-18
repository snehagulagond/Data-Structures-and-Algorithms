
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class Selection_sort {
    public static void selection_sort(int arr[]){
        for(int i=0;i<=arr.length-2;i++){
            int min=i;
            for(int j=i;j<=arr.length-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println(Arrays.toString(arr)); 

    }
    public static void main(String[] args) {
        int arr[]={24,12,56,3,58,9};
        
        selection_sort(arr);

    }

    
}
