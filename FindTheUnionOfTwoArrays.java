//Problem: Find the union of two sorted arrays.
//Approach: Use two pointers to traverse both arrays and add unique elements to the union array.
//Time Complexity: O(n1+n2) where n1 and n2 are the lengths of the two arrays.
//Space Complexity: O(n1+n2) for the union array.

import java.util.ArrayList;
import java.util.List;

public class FindTheUnionOfTwoArrays {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,4,5,5};
        int n1=arr1.length;
        int arr2[]={1,2,6,6,7,9};
        int n2=arr2.length;
        List<Integer>UnionArr=new ArrayList<>();
        int i=0;
        int j=0;
        while (i<n1&&j<n2) {
            if(arr1[i]<arr2[j]){
                if(UnionArr.size()==0||UnionArr.get(UnionArr.size()-1)!=arr1[i]){
                    UnionArr.add(arr1[i]);
                }
                i++;
            }
            else{
                if(UnionArr.size()==0||UnionArr.get(UnionArr.size()-1)!=arr2[j]){
                    UnionArr.add(arr2[j]);
                }
                j++;
            }
            
        }
        while (i<n1) {
            if(UnionArr.size()==0||UnionArr.get(UnionArr.size()-1)!=arr1[i]){
                    UnionArr.add(arr1[i]);
                }
                i++;
            
        }
        while (j<n2) {

            if(UnionArr.size()==0||UnionArr.get(UnionArr.size()-1)!=arr2[j]){
                    UnionArr.add(arr2[j]);
                }
                j++;
        }
        System.out.println(UnionArr);

    }
    
}
