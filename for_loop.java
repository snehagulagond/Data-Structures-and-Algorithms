import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower value:");
        int low=sc.nextInt();
        System.out.println("Enter the upper value:");
        int high=sc.nextInt();
        int sum=0;;
        for(int i=0; i<high;i++){
           sum=sum+i;
           
        }
        System.out.println(sum);
    }

    
}
