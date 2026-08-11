import java.util.ArrayList;
import java.util.List;

public class FindTheIntersectionOfTwoArrays {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,4,5,5,9};
        int n1=arr1.length;
        int arr2[]={1,2,4,6,6,7,9};
        int n2=arr2.length;
        List<Integer>Arr=new ArrayList<>();
        int i=0;
        int j=0;
        while (i<n1&&j<n2) {
         if(arr1[i]==arr2[j]){
            
            if(Arr.size()==0||Arr.get(Arr.size()-1)!=arr1[i]){
                Arr.add(arr1[i]);
            }

         }
         i++;
         j++;
         if(arr1[i]<arr2[j]){
            i++;
         }
         else{
            j++;
         }
        }
        System.out.println(Arr);

    }
    
}
