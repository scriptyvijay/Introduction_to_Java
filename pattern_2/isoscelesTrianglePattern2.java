package pattern_2;

import java.util.Scanner;

public class isoscelesTrianglePattern2 {
    public static void main(String[] args) {
        // Take Input
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

            // Increment
            int stars = 1;
            while (stars <= i) {
                System.out.print("*");
                stars++;
            }

            // decrement
            int dec = i - 1;
            while (dec >= 1) {
                System.out.print("*");
                dec--;
            }
            System.out.println();
            i++;
        }
    }
}
