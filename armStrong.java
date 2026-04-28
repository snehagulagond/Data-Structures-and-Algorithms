import java.util.Scanner;
public class armStrong {
    public static void main (String[] args){
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = var1.nextInt();
        
        int sum=0;
        int original=n;
        
        
        
        while(n>0){
           int last_digit=n%10;  
           sum=sum+(last_digit*last_digit*last_digit);
           n=n/10;  

        }
        
       
        
        System.out.println(sum);
        if(sum==original){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
        
    }
}