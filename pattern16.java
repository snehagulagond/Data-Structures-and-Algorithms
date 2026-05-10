//Problem: Print the following pattern for n=5
//approach: To print the pattern, we can use nested loops. The outer loop will
// iterate through each row, while the inner loop will handle the characters for each row. We will calculate the character to be printed based on the current row index and print it accordingly.
//Time Complexity: O(n^2) where n is the number of rows, as we
// need to print characters for each row, and the number of characters increases with each row.
//Space Complexity: O(1) as we are using a constant amount of space for variables
public class pattern16 {
    public static void main(String[] args) {
        int n=5;
        char ch='A';
        for(int i=0;i<n;i++){
            
            for(int j=0;j<=i;j++){
                System.out.print(ch);
                
            }
            ch++;
             System.out.println();
        }
        
    }
    
}
