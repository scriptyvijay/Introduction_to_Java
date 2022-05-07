package pattern_2;

import java.util.Scanner;

public class isoscelesTrianglePattern {
    public static void main(String[] args) {
        // Take input
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
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }

            // Decrement
            int d = i - 1;
            while (d >= 1) {
                System.out.print(d);
                d--;
            }

            System.out.println();
            i++;
        }

    }
}
