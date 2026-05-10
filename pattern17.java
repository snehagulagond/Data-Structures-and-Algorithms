//Problem: Print the following pattern for n=5
//approach: To print the pattern, we can use nested loops. The outer loop will iterate through each row, while the inner loops will handle the spaces and characters for each row. We will calculate the number of spaces and characters needed for each row based on the current row index. The characters will be printed in a way that they increase until the midpoint of the row and then decrease symmetrically.
//Time Complexity: O(n^2) where n is the number of rows, as we
// need to print characters for each row, and the number of characters increases with each row.
//Space Complexity: O(1) as we are using a constant amount of space for variables

public class pattern17 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char ch='A';
            int breakPoint=(2*i+1)/2;

            for(int j=0;j<2*i+1;j++){
                System.out.print(ch);
                if(j<breakPoint){
                    ch++;
                }
                else
                    ch--;
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
             System.out.println();
        }
    }
    
}
