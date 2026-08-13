//Problem Statement: Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
//Approach: We can use the XOR operation to find the missing number. The idea is to XOR all the numbers from 0 to n and then XOR the result with all the numbers in the array. The final result will be the missing number.
//Time Complexity: O(n) - We need to iterate through the array once to calculate the XOR of its elements.
//Space Complexity: O(1) - We are using a constant amount of extra space for variables xor1 and xor2.
//The XOR operation has the property that a ^ a = 0 and a ^ 0 = a. Therefore, when we XOR all the numbers from 0 to n and then XOR the result with all the numbers in the array, the numbers that are present in both will cancel each other out, leaving us with the missing number.
//The XOR approach is better than the summation approach because it avoids potential integer overflow issues that can arise when calculating the sum of a large number of integers. Additionally, the XOR approach is more efficient in terms of time complexity, as it only requires a single pass through the array, while the summation approach requires two passes (one to calculate the expected sum and another to calculate the actual sum).

public class MissingNumber {
    public static void main(String[] args) {
        //XOR APPROACH
        int arr[]={0,1,2,3,4,5};
        int n=arr.length;
        int xor1=0;
        int xor2=0;
        
        for(int i=0;i<n;i++){
            xor2=xor2 ^arr[i] ;
            xor1=xor1 ^(i+1);

            

        }
        xor1=xor1 ^0;
        
        System.out.println(xor1^xor2);

        //SUMMATION APPROACH
        //Time Complexity: O(n) - We need to iterate through the array once to calculate the actual sum of its elements.
        //Space Complexity: O(1) - We are using a constant amount of extra space for variables s1 and s2.


        // int s1=(n)*((n+1))/2;
        // int s2=0;
        // for(int i=0;i<n;i++){
        //     s2=s2+arr[i];
            
        // }
        
        // System.out.println("The missing number is:"+(s1-s2));
        
        
    }
    
}



        
    }
