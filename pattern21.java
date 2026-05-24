//Program to print the following pattern
//* * * * *
//*       *
//*       *
//*       *
//* * * * *
//Approach: We can use two nested loops to print the pattern. The outer loop will iterate through the rows, and the inner loop will iterate through the columns. We will print a star (*) if we are on the first or last row, or if we are on the first or last column. Otherwise, we will print a space.
//Time Complexity: O(n^2) because we are using two nested loops to print the pattern.
//Space Complexity: O(1) because we are not using any extra space to store the pattern, we are directly printing it.

import java.util.Scanner;
public class pattern21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the pattern:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
