//print the following pattern
//E
//D E
//C D E     
//B C D E
//A B C D E
//approach: we can use two nested loops to print the pattern. The outer loop will run from 0 to n-1 and the inner loop will run from the starting character to 'E'. The starting character can be calculated by subtracting the value of the outer loop variable from 'E'. Finally, we can print the characters in the inner loop and move to the next line after each iteration of the outer loop.
//Time complexity: O(n^2) where n is the number of rows in the pattern.
//Space complexity: O(1) as we are not using any extra space to store the pattern.

public class pattern18 {
    public static void main(String[] args){

        int n=5;

        for(int i=0;i<n;i++){
            char start=(char)('E'-i);
            for(char ch=start;ch<='E';ch++){
                System.out.print(ch+" ");
            }   
            System.out.println();
        }
    }
    
}
