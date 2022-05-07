package pattern_2;

import java.util.Scanner;

public class triangleOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // Loop
        int p = 1;
        int i = 1;
        while (i <= n) {
            // Spaces
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces++;
            }

            // Numbers Increment
            int j = 1;
            p = i;
            while (j <= i) {
                System.out.print(p);
                p++;
                j++;
            }

            // Number decrement
            int dec = p - 2;
            while (dec >= i) {
                System.out.print(dec);
                dec--;
            }

            System.out.println();
            i++;

        }
    }
}
