//Problem: Find the missing number in an array of distinct integers in the range [0, n]
//approach: The sum of the first n natural numbers is given by the formula n*(n+1)/2. We can calculate the expected sum of numbers from 0 to n and subtract the actual sum of the array elements from it to find the missing number.
//Time Complexity: O(n) - We need to iterate through the array once to calculate the actual sum of its elements.
//Space Complexity: O(1) - We are using a constant amount of extra space for variables s1 and s2.

public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,5,6};
        int n=arr.length;
        int s1=(n)*((n+1))/2;
        int s2=0;
        for(int i=0;i<n;i++){
            s2=s2+arr[i];
            
        }
        
        System.out.println("The missing number is:"+(s1-s2));
        
        
    }
    
}
