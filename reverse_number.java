import java.util.Scanner;

public class reverse_number {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
      
        int reverse=0;
        int digit;
        
        
        while(n!=0){
            
            digit=n%10;

            reverse=reverse*10+digit;
            n=n/10;
            
        }
       
        System.out.println(reverse);        

    }

    
}
