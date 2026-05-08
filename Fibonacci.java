//Problem: To print the nth Fibonacci number using recursion.
//Solution: The Fibonacci sequence is defined as follows:
//F(0) = 0
//F(1) = 1
//F(n) = F(n-1) + F(n-2) for n > 1
//To find the nth Fibonacci number, we can use a recursive approach where we call the function for the two preceding numbers until we reach the base cases (F(0) and F(1)). 
// The time complexity of this approach is O(2^n) due to the repeated calculations of the same Fibonacci numbers. However, it is a straightforward implementation to understand the concept of recursion.
//Space Complexity: O(n) due to the maximum depth of the recursion stack being n in the worst case.

public class Fibonacci {
    public static int printfibonacci(int n){
        if(n<=1){
            return n;
        }
        return printfibonacci(n-1)+printfibonacci(n-2);

    }
    public static void main(String[] args) {
        int n=8;
        System.out.println(printfibonacci(n));
    }
    
}


