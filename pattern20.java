public class pattern20 {
    public static void main(String[] args) {

        int n = 5;
        int spaces = 2 * n - 2;

        for (int i = 1; i <= 2 * n - 1; i++) {

            int stars = i;

            if (i > n) {
                stars = 2 * n - i;
            }

            // Left stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }

            // Middle spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // Right stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }

            System.out.println();

            // Update spaces
            if (i < n) {
                spaces -= 2;
            } else {
                spaces += 2;
            }
        }
    }
}