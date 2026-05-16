public class pattern19 {
    public static void main(String[] args) {
        int start=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print("*");

            }
            for(int j=0;j<start;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5-i;j++){
                System.out.print("*");
            }
            start+=2;
            System.out.println();

        }
       start=8;
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");

            }
            for(int j=0;j<start;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            start-=2;
            System.out.println();
        }
    }
    
}
