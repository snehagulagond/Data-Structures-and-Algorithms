// This program prints a pattern of numbers in a square format based on the input size.
//approach: We can use two nested loops to iterate through the rows and columns of the pattern. For each position, we calculate the minimum distance from the edges of the square (top, left, right, bottom) and use that to determine the value to print. The value is calculated as n minus the minimum distance, which creates a concentric pattern of numbers.
//Time Complexity: O(n^2) because we are using two nested loops to print the pattern.
//Space Complexity: O(1) because we are not using any extra space to store the pattern, we are directly printing it.



import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the pattern:");
        int n=sc.nextInt();
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int left=j;
                int right=(2*n-2)-j;
                int bottom=(2*n-2)-i;
                int min=Math.min(Math.min(top, left), Math.min(right, bottom));
                System.out.print((n-min)+" ");

            }
                    System.out.println();

        }
    }

    
}
