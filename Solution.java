// import java.util.Scanner;
// public class Solution{
//     public static void main (String[] args){
//         Scanner sc=new Scanner(System.in);
        
//         System.out.println("Enter Day:");
//         int day=sc.nextInt();
//         switch(day)
//         {
//             case 1:{
//                 System.out.println("Monday");
//                 break;
//             }
//             case 2:{
//                 System.out.println("Tueday");
//                 break;
//             }
//             case 3:{
//                 System.out.println("wednesday");
//                 break;
//             }
//             case 4:{
//                 System.out.println("Thrusday");
//                 break;
//             }
//             case 5:{
//                 System.out.println("Friday");
//                 break;
//             }
//             case 6:{
//                 System.out.println("Satuarday");
//                 break;
//             }
//             case 7:{
//                 System.out.println("Sunday");
//                 break;
//             }
//             default:{
//                  System.out.println("invalid");   
//             }
            
            
            
//         }
//     }
// }

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day:");
        int day = sc.nextInt();
        switch(day){
            
            case 1 ->System.out.println("Monday");
            case 2 ->System.out.println("Tuesday");
            case 3 ->System.out.println("Wednesday");
            case 4 ->System.out.println("Thursday");
            case 5 ->System.out.println("Friday");
            case 6 ->System.out.println("Saturday");
            case 7 ->System.out.println("Sunday");
            default -> System.out.println("Invalid");

        }

    }
}