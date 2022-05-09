package pattern_2;

import java.util.Scanner;
//Pattern idea
//    1
//   12
//  123
// 1234

public class mirrorPattern2 {
    public static void main(String[] args) {
        // Taking input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // Loop
        int i = 1;
        while (i <= n) {
            // Spaces Loop
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces++;
            }

            // Numbers
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }

            System.out.println();
            i++;
        }
    }
}
