// Problem: Find divisors of a number
// Approach: Check all numbers from 1 to n and store divisors

// Time Complexity: O(n)
// Reason: We loop from 1 to n

// Space Complexity: O(n)
// Reason: We store divisors in a list/array




// import java.util.Scanner;

// public class divisors_of_num{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             if(n%i==0){
//                 System.out.print(i+" ");
//             }
//         }
//     }
    
// }


//stores divisors in an array
import java.util.*;

public class divisors_of_num{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        List<Integer>list=new ArrayList<>();
        for(int i=1;i<n;i++){
            if(n%i==0){
                list.add(i);

            }
        }
        int[] divisors=new int [list.size()];
        for(int i=0;i<list.size();i++){
            divisors[i]=list.get(i);
        }
        System.out.println(Arrays.toString(divisors));
    }
}
