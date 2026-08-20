//Problem: Given an array of integers, every element appears twice except for one. Find that single one.
//Approach: We can use the XOR operation to solve this problem. The XOR of a number with itself is 0, and the XOR of a number with 0 is the number itself. Therefore, if we XOR all the numbers in the array, the numbers that appear twice will cancel each other out, leaving us with the single number that appears only once.
//Time Complexity: O(n), where n is the number of elements in the array.
//Space Complexity: O(1), as we are using a constant amount of space.

public class NumberAppearsOnce {
    
    public static void main(String[] args) {
        int nums[]={1,1,2,2,3,3,4,4,5};
        int n=nums.length;
        int XOR=0;
        for(int arr:nums){
            XOR=XOR^arr;

            }

            System.out.println(XOR);
        
    
    }
}
    

