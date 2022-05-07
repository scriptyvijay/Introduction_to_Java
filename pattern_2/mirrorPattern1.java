package pattern_2;

import java.util.Scanner;

/**
 * mirrorPattern1
 * *
 * **
 * ***
 * ****
 */

public class mirrorPattern1 {

    public static void main(String[] args) {
        // take input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // Loop
        int i = 1;
        while (i <= n) {
            // Spaces
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces++;
            }

            // stars
            int stars = 1;
            while (stars <= i) {
                System.out.print("*");
                stars++;
            }
            System.out.println();
            i++;
        }
    }
}